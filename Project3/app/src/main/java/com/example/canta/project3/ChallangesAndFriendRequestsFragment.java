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

    final ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    final ArrayList<HashMap<String,String>> list2 = new ArrayList<HashMap<String,String>>();

    ListView challenges;
    ListView friendRequsts;
    SimpleAdapter adapter2;
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
    HashMap<String,String> holder2;

    @Override
    public void onStart(){
        super.onStart();

        database = FirebaseDatabase.getInstance();
        challenges = (ListView)getActivity().findViewById(R.id.list_view);
        friendRequsts = (ListView)getActivity().findViewById(R.id.list_view2);


        adapter = new SimpleAdapter(getActivity(),
                list,
                R.layout.list_item,
                new String[]{"First String", "Second String"},
                new int[]{R.id.text11,R.id.text22});

        adapter2 = new SimpleAdapter(getActivity(),
                list2,
                R.layout.list_viewer,
                new String[]{"First String", "Second String"},
                new int[]{R.id.text111,R.id.text222});

        challenges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                Button k = (Button)view.findViewById(R.id.list_item_accept);
                Button ka = (Button)view.findViewById(R.id.list_item_decline);

                final int kemal = position;

                k.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int kemal1 = kemal;

                        Log.d("FUCK", "onClick: YES" + kemal);
                    }
                });

                ka.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int kemal1 = kemal;
                        Log.d("FUCK", "onClick: NO" + kemal);

                    }
                });

            }
        });

        friendRequsts.setAdapter(adapter2);
        challenges.setAdapter(adapter);

        database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid() + "").child("challanges").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(final DataSnapshot dataSnapshot, String s) {
                // Toast.makeText(getActivity(),"Text: " + dataSnapshot.getValue(), Toast.LENGTH_SHORT).show();


                HoldTheDoor pencil = dataSnapshot.getValue(HoldTheDoor.class);


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

        database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid() + "").child("friendRequests").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                DeneryosTargeryos pencil = dataSnapshot.getValue(DeneryosTargeryos.class);

                    holder2 = new HashMap<String, String>();

                Log.d("BOK", "onChildAdded: "+ pencil.getUserID());
                Log.d("BOK", "onChildAdded123: "+ pencil.getUsername());

                    holder2.put("First String", pencil.getUsername());
                    holder2.put("Second String","");
                    list2.add(holder2);
                    adapter2.notifyDataSetChanged();
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
