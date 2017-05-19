package com.example.canta.project3;

import android.app.ListFragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
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

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


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
            if(listOfUsername[(int) id].equals(Player.getInstance().getPlayerName())){
                Toast.makeText(getActivity(), "You cannot add yourself as a friend" , Toast.LENGTH_SHORT).show();
            }else if ( valid.contains(listOfUsername[(int)id])){
                Toast.makeText(getActivity(), "This user is already your friend" , Toast.LENGTH_SHORT).show();
            }


        }else{
            Toast.makeText(getActivity(), "This user is added as a friend: " + listOfUsername[(int) id], Toast.LENGTH_SHORT).show();
            database.getReference("users").child(listOfUserID[(int)id]).child("friendRequests").child(FirebaseAuth.getInstance().getCurrentUser().getUid().toString()).child("username").setValue(Player.getInstance().getPlayerName());
            database.getReference("users").child(listOfUserID[(int)id]).child("friendRequests").child(FirebaseAuth.getInstance().getCurrentUser().getUid().toString()).child("userID").setValue(FirebaseAuth.getInstance().getCurrentUser().getUid().toString());

            FirebaseDatabase.getInstance().getReference("users").child(listOfUserID[(int)id]).child("info").child("email").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String email = dataSnapshot.getValue().toString();
                    sendNotification(email, Player.getInstance().getPlayerName() + " added you as friend");
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }


    private void sendNotification(String emailtoSend, String mymessage)
    {
        Log.d("emailtoSend", "sendNotification: " + emailtoSend);
        final String email = emailtoSend;
        final String message = mymessage;
        final String send_email = emailtoSend;
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                int SDK_INT = android.os.Build.VERSION.SDK_INT;

                if (SDK_INT > 8) {
                    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                            .permitAll().build();
                    StrictMode.setThreadPolicy(policy);

                    try {
                        String jsonResponse;

                        URL url = new URL("https://onesignal.com/api/v1/notifications");
                        HttpURLConnection con = (HttpURLConnection) url.openConnection();
                        con.setUseCaches(false);
                        con.setDoOutput(true);
                        con.setDoInput(true);

                        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        con.setRequestProperty("Authorization", "Basic MmI2NGI5OGItZGQyNC00NjNkLTllMzgtZmFmZTVhMmI5ZTUx");
                        con.setRequestMethod("POST");

                        String strJsonBody = "{"
                                + "\"app_id\": \"830ade25-7966-4efa-b780-4e392ebf3d6f\","

                                + "\"filters\": [{\"field\": \"tag\", \"key\": \"User_ID\", \"relation\": \"=\", \"value\": \"" + send_email + "\"}],"

                                + "\"data\": {\"foo\": \"bar\"},"
                                + "\"contents\": {\"en\": \""+ message + "\"}"
                                + "}";


                        System.out.println("strJsonBody:\n" + strJsonBody);

                        byte[] sendBytes = strJsonBody.getBytes("UTF-8");
                        con.setFixedLengthStreamingMode(sendBytes.length);

                        OutputStream outputStream = con.getOutputStream();
                        outputStream.write(sendBytes);

                        int httpResponse = con.getResponseCode();
                        System.out.println("httpResponse: " + httpResponse);

                        if (httpResponse >= HttpURLConnection.HTTP_OK
                                && httpResponse < HttpURLConnection.HTTP_BAD_REQUEST) {
                            Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                            jsonResponse = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                        } else {
                            Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                            jsonResponse = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                        }
                        System.out.println("jsonResponse:\n" + jsonResponse);

                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                }
            }
        });
    }

}














