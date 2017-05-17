package com.example.canta.project3;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChallangesAndFriendRequestsFragment extends Fragment{
    Iterator it;
    final ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();

    ListView challenges;
    SimpleAdapter adapter;
    FirebaseDatabase database;

    public ChallangesAndFriendRequestsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friend_list, container, false);
    }

    static String username = "holder";
    static String gametype = "holder";

    HashMap<String,String> holder;

    @Override
    public void onStart(){
        super.onStart();



        database = FirebaseDatabase.getInstance();

        challenges = (ListView)getActivity().findViewById(R.id.list_view);

        adapter = new SimpleAdapter(getActivity(),
                list,
                R.layout.list_item,
                new String[]{"First String", "Second String"},
                new int[]{R.id.text11,R.id.text22});

        challenges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(getActivity(), position, Toast.LENGTH_SHORT).show();

            }
        });



        challenges.setAdapter(adapter);

        database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid() + "").child("challanges").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(final DataSnapshot dataSnapshot, String s) {
                // Toast.makeText(getActivity(),"Text: " + dataSnapshot.getValue(), Toast.LENGTH_SHORT).show();

                Log.d("baban",dataSnapshot.getKey().toString());

                HoldTheDoor pencil = dataSnapshot.getValue(HoldTheDoor.class);

                Log.d("HOOOOO", "onChildAdded FIREBASE: " + FirebaseAuth.getInstance().getCurrentUser().getUid().toString());
                Log.d("HOOOOO", "onChildAdded PENCIL  : " + pencil.getChallanger());

                    if(!FirebaseAuth.getInstance().getCurrentUser().getUid().toString().equals(pencil.getChallanger())) {

                        holder = new HashMap<String, String>();
                        holder.put("First String", pencil.getUsername());
                        holder.put("Second String", pencil.getGametype());
                        list.add(holder);
                        adapter.notifyDataSetChanged();

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
    }
}
