package com.example.canta.project2;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameOverFragment extends Fragment implements View.OnClickListener {
    Button playQ;
    public GameOverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // In
        // flate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_game_over, container, false);

        return inflater.inflate(R.layout.fragment_game_over, container, false);
    }
    public void onStart(){
        super.onStart();
        playQ = (Button)getActivity().findViewById(R.id.gameoverqbutton);
        playQ.setOnClickListener(this);
        TextView myScore = (TextView) getActivity().findViewById(R.id.overscore);
        String myText = "" + Player.getInstance().getPlayerScore();
        System.out.println(myText);
        myScore.setText(myText);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.gameoverqbutton:
                QuestionHolder.getInstance().questionListReset();
                Player.getInstance().setPlayerScore(0);
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
        }
    }
}
