package com.example.canta.project2;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class memBoardSelectionFragment extends Fragment implements View.OnClickListener {


    public memBoardSelectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mem_board_selection, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button play1 = (Button)getActivity().findViewById(R.id.playmemo4);
        Button play2 = (Button)getActivity().findViewById(R.id.playmemo5);
        Button play3 = (Button)getActivity().findViewById(R.id.playmemo6);
        Button challange1 = (Button)getActivity().findViewById(R.id.challangememo4);
        Button challange2 = (Button)getActivity().findViewById(R.id.challangememo5);
        Button challange3 = (Button)getActivity().findViewById(R.id.challangememo6);
        play1.setOnClickListener(this);
        play2.setOnClickListener(this);
        play3.setOnClickListener(this);
        challange1.setOnClickListener(this);
        challange2.setOnClickListener(this);
        challange3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playmemo4:
                System.out.println("1");
                levelOneFragment move1 = new levelOneFragment();
                android.app.FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                ft1.replace(R.id.fragment_container, move1);
                ft1.addToBackStack(null);
                ft1.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft1.commit();
                break;
            case R.id.playmemo5:
                System.out.println("2");
                levelTwoFragment move2 = new levelTwoFragment();
                android.app.FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                ft2.replace(R.id.fragment_container, move2);
                ft2.addToBackStack(null);
                ft2.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft2.commit();
                break;
            case R.id.playmemo6:
                System.out.println("3");
                levelThreeFragment move3 = new levelThreeFragment();
                android.app.FragmentTransaction ft3 = getFragmentManager().beginTransaction();
                ft3.replace(R.id.fragment_container, move3);
                ft3.addToBackStack(null);
                ft3.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft3.commit();
                break;
            case R.id.challangememo4:
                levelOneFragment move4 = new levelOneFragment();
                android.app.FragmentTransaction ft4 = getFragmentManager().beginTransaction();
                ft4.replace(R.id.fragment_container, move4);
                ft4.addToBackStack(null);
                ft4.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft4.commit();
                break;
            case R.id.challangememo5:
                levelTwoFragment move5 = new levelTwoFragment();
                android.app.FragmentTransaction ft5 = getFragmentManager().beginTransaction();
                ft5.replace(R.id.fragment_container, move5);
                ft5.addToBackStack(null);
                ft5.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft5.commit();
                break;
            case R.id.challangememo6:
                levelThreeFragment move6 = new levelThreeFragment();
                android.app.FragmentTransaction ft6 = getFragmentManager().beginTransaction();
                ft6.replace(R.id.fragment_container, move6);
                ft6.addToBackStack(null);
                ft6.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft6.commit();
                break;
        }
    }
}
