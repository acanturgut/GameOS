package com.example.canta.project3;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendListFragment extends Fragment {
    Iterator it;
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    HashMap<String,String> holder = new HashMap<String,String>();
    ListView challenges;
    SimpleAdapter adapter;
    FirebaseDatabase database;

    public FriendListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friend_list, container, false);
    }

    String username;
    String gametype;

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

                it = holder.entrySet().iterator();

        while (it.hasNext()){

            HashMap<String,String> k = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            holder.put("First String", pair.getKey().toString());
            holder.put("Second String", pair.getKey().toString());
            list.add(holder);

        }

        challenges.setAdapter(adapter);

        database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid() + "").child("challanges").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(final DataSnapshot dataSnapshot, String s) {
                // Toast.makeText(getActivity(),"Text: " + dataSnapshot.getValue(), Toast.LENGTH_SHORT).show();

                Log.d("baban",dataSnapshot.getKey().toString());

                if (dataSnapshot.getKey() != null) {

                    database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid() + "").child("challanges").child(dataSnapshot.getKey().toString()).addChildEventListener(new ChildEventListener() {
                        @Override
                        public void onChildAdded(DataSnapshot dataSnapshot2, String s) {

                            if(dataSnapshot2.getKey().toString().equals("username")){

                                username = dataSnapshot2.getValue().toString();
                                Log.d("ANANAS", "onChildAdded: USERNAME:  " + dataSnapshot2.getValue().toString());


                            }else if(dataSnapshot2.getKey().toString().equals("gametype")){
                                Log.d("ANANAS", "onChildAdded: GAMETYPE: " + dataSnapshot2.getValue().toString());
                                gametype = dataSnapshot2.getValue().toString();

                            }else if(dataSnapshot2.getKey().toString().equals("challanger")){

                                dataSnapshot2.getValue();

                            }else if(dataSnapshot2.getKey().toString().equals("scoreed2")){

                                dataSnapshot2.getValue();

                            }else if(dataSnapshot2.getKey().toString().equals("scoreer1")){

                                dataSnapshot2.getValue();

                            }

                            holder.put(username,gametype);

                            while (it.hasNext()){

                                HashMap<String,String> k = new HashMap<>();
                                Map.Entry pair = (Map.Entry)it.next();
                                holder.put("First String", pair.getKey().toString());
                                holder.put("Second String", pair.getKey().toString());
                                list.add(holder);

                            }

                            adapter.notifyDataSetChanged();
                            //challenges.notify();
                            challenges.invalidateViews();

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
                    }
                    );
                }else{


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
