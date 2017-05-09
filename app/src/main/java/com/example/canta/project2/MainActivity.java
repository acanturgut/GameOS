package com.example.canta.project2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Boolean userNameFlag = true;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    private EditText emailText;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();



        emailText = (EditText) findViewById(R.id.player_name_edittext);
        passwordText = (EditText) findViewById(R.id.password_edit_text);
        Button logIn = (Button) findViewById(R.id.go_button);
        Button signIn = (Button) findViewById(R.id.sign_in_button);


        logIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case  R.id.go_button: {

                if (!emailText.getText().toString().equals("") && !emailText.getText().toString().equals("Enter Your Name")) {

                    mAuth.signInWithEmailAndPassword(emailText.getText().toString(), passwordText.getText().toString())
                            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information

                                        FirebaseUser user = mAuth.getCurrentUser();
                                        Player.getInstance().setPlayerName(user.toString());

                                        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                                        startActivity(intent);


                                    } else {

                                        Toast.makeText(getApplicationContext(), "Fail To Login!",
                                                Toast.LENGTH_LONG).show();

                                    }

                                    // ...
                                }
                            });
                }
                break;
            }


            case R.id.sign_in_button: {

                break;
            }


        }





    }
}