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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    private EditText username;
    private EditText email;
    private EditText password;

    private EditText city;
    private EditText name;
    private EditText surname;

    private Button signIn;
    private Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        username = (EditText) findViewById(R.id.l_user_name_text_box);
        email = (EditText) findViewById(R.id.l_user_email_text_box);
        password = (EditText) findViewById(R.id.l_user_password_text_box);

        city = (EditText) findViewById(R.id.sign_in_city);
        name = (EditText) findViewById(R.id.sign_in_name);
        surname = (EditText) findViewById(R.id.sign_in_surname);

        signIn = (Button) findViewById(R.id.l_sign_in_button);
        goBack = (Button) findViewById(R.id.l_go_back);

        signIn.setOnClickListener(this);
        goBack.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        //FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case  R.id.l_sign_in_button: {


                mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    FirebaseUser user = mAuth.getCurrentUser();

                                    CreatedUser cu = new CreatedUser(username.getText().toString(),name.getText().toString() ,surname.getText().toString() , city.getText().toString());

                                    mDatabase.child("users").child(user.getUid().toString()).child("info").setValue(cu);

                                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                                    startActivity(intent);

                                } else {

                                    Toast.makeText(SignInActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
                break;
            }
            case R.id.l_go_back: {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                break;
            }
        }


    }
}
