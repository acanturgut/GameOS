package com.example.canta.project3;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class MemoryGameSelectionFragment extends Fragment implements View.OnClickListener {

    public MemoryGameSelectionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_memory_game_selection, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button play1 = (Button)getActivity().findViewById(R.id.playmemo4);
        Button play2 = (Button)getActivity().findViewById(R.id.playmemo5);
        Button play3 = (Button)getActivity().findViewById(R.id.playmemo6);
        play1.setOnClickListener(this);
        play2.setOnClickListener(this);
        play3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playmemo4:
                challangeHandler.getInstance().setIsChallange(false);
                levelOneFragment move1 = new levelOneFragment();
                android.app.FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                ft1.replace(R.id.fragment_container, move1);
                ft1.addToBackStack(null);
                ft1.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft1.commit();
                break;
            case R.id.playmemo5:
                challangeHandler.getInstance().setIsChallange(false);
                levelTwoFragment move2 = new levelTwoFragment();
                android.app.FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                ft2.replace(R.id.fragment_container, move2);
                ft2.addToBackStack(null);
                ft2.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft2.commit();
                break;
            case R.id.playmemo6:
                challangeHandler.getInstance().setIsChallange(false);
                levelThreeFragment move3 = new levelThreeFragment();
                android.app.FragmentTransaction ft3 = getFragmentManager().beginTransaction();
                ft3.replace(R.id.fragment_container, move3);
                ft3.addToBackStack(null);
                ft3.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft3.commit();
                break;
        }
    }
}
