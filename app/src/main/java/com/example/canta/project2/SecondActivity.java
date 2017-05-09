package com.example.canta.project2;

import android.app.Activity;
import android.content.Intent;
import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity implements GameListFragment.GameListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                levelOneFragment game2 = new levelOneFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, game2);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        } else {
            if ((int) id == 0){
                TopicSelectFragment game2 = new TopicSelectFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.list_frag, game2);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            } else if ((int) id == 1){
                levelOneFragment game2 = new levelOneFragment();
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.list_frag, game2);
                ft.addToBackStack(null);
                ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }

        }
    }

}


