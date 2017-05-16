package com.example.canta.project3;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewUserProfileFragment extends Fragment implements View.OnClickListener{


    public ViewUserProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_user_profile, container, false);
    }
    TextView username, name, surname , city;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        username = (TextView) getActivity().findViewById(R.id.other_profile_username);
        name = (TextView) getActivity().findViewById(R.id.other_profile_name);
        surname = (TextView) getActivity().findViewById(R.id.other_profile_surname);
        city = (TextView) getActivity().findViewById(R.id.other_profile_city);
        username.setText("Username:    " + Player_Other.getInstance().getPlayerName());
        name.setText("Name:        " + Player_Other.getInstance().getName());
        surname.setText("Surname:     " + Player_Other.getInstance().getSurname());
        city.setText("City:        " + Player_Other.getInstance().getCity());

        Button qq = (Button) getActivity().findViewById(R.id.challange_qq_user);
        Button mem4 = (Button) getActivity().findViewById(R.id.challange_44_user);
        Button mem5 = (Button) getActivity().findViewById(R.id.challange_55_user);
        Button mem6 = (Button) getActivity().findViewById(R.id.challange_66_user);
        qq.setOnClickListener(this);
        mem4.setOnClickListener(this);
        mem5.setOnClickListener(this);
        mem6.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.challange_qq_user:
                System.out.println("1");
                qqTopicSelectFragment move1 = new qqTopicSelectFragment();
                android.app.FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                ft1.replace(R.id.fragment_container, move1);
                ft1.addToBackStack(null);
                ft1.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft1.commit();
                break;
            case R.id.challange_44_user:
                System.out.println("2");
                levelOneFragment move2 = new levelOneFragment();
                android.app.FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                ft2.replace(R.id.fragment_container, move2);
                ft2.addToBackStack(null);
                ft2.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft2.commit();
                break;
            case R.id.challange_55_user:
                System.out.println("3");
                levelTwoFragment move3 = new levelTwoFragment();
                android.app.FragmentTransaction ft3 = getFragmentManager().beginTransaction();
                ft3.replace(R.id.fragment_container, move3);
                ft3.addToBackStack(null);
                ft3.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft3.commit();
                break;
            case R.id.challange_66_user:
                levelThreeFragment move4 = new levelThreeFragment();
                android.app.FragmentTransaction ft4 = getFragmentManager().beginTransaction();
                ft4.replace(R.id.fragment_container, move4);
                ft4.addToBackStack(null);
                ft4.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft4.commit();
                break;
        }
    }
}
