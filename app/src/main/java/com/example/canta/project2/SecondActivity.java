package com.example.canta.project2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SecondActivity extends Activity implements GameListFragment.GameListListener {

    public String a1;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mDatabase;
    DatabaseReference ref2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabase = database.getReference().child("quickquiz").child("hist");
        mDatabase.addChildEventListener(new ChildEventListener(){
            @Override public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(mDatabase.getKey()=="q1"){ QuestionDataSet.setQ1_hist(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q2"){ QuestionDataSet.setQ2_hist(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q3"){ QuestionDataSet.setQ3_hist(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q4"){ QuestionDataSet.setQ4_hist(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q5"){ QuestionDataSet.setQ5_hist(dataSnapshot.getValue().toString());}
            }
            @Override public void onChildChanged(DataSnapshot dataSnapshot, String s) { }
            @Override public void onChildRemoved(DataSnapshot dataSnapshot) {}
            @Override public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override public void onCancelled(DatabaseError databaseError) {}
        });
        mDatabase = database.getReference().child("quickquiz").child("math");
        mDatabase.addChildEventListener(new ChildEventListener(){
            @Override public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(mDatabase.getKey()=="q1"){ QuestionDataSet.setQ1_math(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q2"){ QuestionDataSet.setQ2_math(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q3"){ QuestionDataSet.setQ3_math(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q4"){ QuestionDataSet.setQ4_math(dataSnapshot.getValue().toString());}
                if(mDatabase.getKey()=="q5"){ QuestionDataSet.setQ5_math(dataSnapshot.getValue().toString());}
            }
            @Override public void onChildChanged(DataSnapshot dataSnapshot, String s) { }
            @Override public void onChildRemoved(DataSnapshot dataSnapshot) {}
            @Override public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override public void onCancelled(DatabaseError databaseError) {}
        });
        ref2 = database.getReference().child("quickquiz").child("sport");
        ref2.addChildEventListener(new ChildEventListener(){
            @Override public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(ref2.getKey()=="q1"){ QuestionDataSet.setQ1_sport(dataSnapshot.getValue().toString());}
                if(ref2.getKey()=="q2"){ QuestionDataSet.setQ2_sport(dataSnapshot.getValue().toString());}
                if(ref2.getKey()=="q3"){ QuestionDataSet.setQ3_sport(dataSnapshot.getValue().toString());}
                if(ref2.getKey()=="q4"){ QuestionDataSet.setQ4_sport(dataSnapshot.getValue().toString());}
                if(ref2.getKey()=="q5"){ QuestionDataSet.setQ5_sport(dataSnapshot.getValue().toString());}
            }
            @Override public void onChildChanged(DataSnapshot dataSnapshot, String s) { }
            @Override public void onChildRemoved(DataSnapshot dataSnapshot) {}
            @Override public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override public void onCancelled(DatabaseError databaseError) {}
        });
    }



    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            if ((int) id == 0){
                TopicSelectFragment game1 = new TopicSelectFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, game1);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }else if ((int) id == 1){
                memBoardSelectionFragment game2 = new memBoardSelectionFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, game2);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        } else {
            if ((int) id == 0){
                TopicSelectFragment game1 = new TopicSelectFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.list_frag, game1);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            } else if ((int) id == 1){
                memBoardSelectionFragment game2 = new memBoardSelectionFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.list_frag, game2);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }
    }
}


