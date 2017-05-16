package com.example.canta.project3;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Arrays;
import java.util.List;


public class AllUserListFragment extends ListFragment {
    public static interface FriendsListener {
        void itemClicked(long id);
    }

    public AllUserListFragment listener;
    DatabaseReference myRef;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    String[] names = new String[100];
    public long numChild = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final int[] counter = {0};
        database.getReference("users").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(final DataSnapshot dataSnapshot, String s) {
                // Toast.makeText(getActivity(),"Text: " + dataSnapshot.getValue(), Toast.LENGTH_SHORT).show();
                if (dataSnapshot.getKey() != null) {
                    final String key = dataSnapshot.getKey().toString();
                    database.getReference("users").child(key).child("info").child("username").addValueEventListener(new ValueEventListener() {

                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot2) {
                            Player.getInstance().addUsertoList(dataSnapshot2.getValue().toString(), key);
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {
                        }
                    });
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        String[] listOfUsername = new String[Player.getInstance().getUserCount()];
        String[] listOfUserID = new String[Player.getInstance().getUserCount()];
        for (int i = 0; i < Player.getInstance().getUserCount(); i++) {
            listOfUsername[i] = Player.getInstance().getAllPlayer()[i];
            listOfUserID[i] = Player.getInstance().getAllPlayerID()[i];
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                listOfUsername);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "Click Username to Add Friend" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        String[] listOfUsername = new String[Player.getInstance().getUserCount()];
        String[] listOfUserID = new String[Player.getInstance().getUserCount()];
        for (int i = 0; i < Player.getInstance().getUserCount(); i++) {
            listOfUsername[i] = Player.getInstance().getAllPlayer()[i];
            listOfUserID[i] = Player.getInstance().getAllPlayerID()[i];
        }
        List valid = Arrays.asList(Player.getInstance().getFriends());

        if (listOfUsername[(int) id].equals(Player.getInstance().getPlayerName()) || valid.contains(listOfUsername[(int)id])){

            Toast.makeText(getActivity(), "You cannot add this user as a friend" , Toast.LENGTH_SHORT).show();

        }else{

            //Toast.makeText(getActivity(), "Text: " + listOfUserID[(int) id], Toast.LENGTH_SHORT).show();
            Toast.makeText(getActivity(), "This user is added as a friend: " + listOfUsername[(int) id], Toast.LENGTH_SHORT).show();
            database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid().toString()).child("friends").child(listOfUserID[(int)id]).setValue(listOfUsername[(int)id]);
            database.getReference("users").child(listOfUserID[(int)id]).child("friends").child(FirebaseAuth.getInstance().getCurrentUser().getUid().toString()).setValue(Player.getInstance().getPlayerName());



        }
    }

   /* @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }
    */
}














