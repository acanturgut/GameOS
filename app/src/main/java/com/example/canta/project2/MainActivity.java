package com.example.canta.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Boolean userNameFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText playerNameEditText = (EditText) findViewById(R.id.player_name_edittext);
        Button goButton = (Button) findViewById(R.id.go_button);

        playerNameEditText.setText(Player.getPlayerName());

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!playerNameEditText.getText().toString().equals("") && !playerNameEditText.getText().toString().equals("Enter Your Name")) {

                    Player.getInstance().setPlayerName(playerNameEditText.getText().toString());
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);

                }
            }
        });

        playerNameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if (userNameFlag) {

                    playerNameEditText.setText("");
                    userNameFlag = false;
                }
            }
        });
    }
}