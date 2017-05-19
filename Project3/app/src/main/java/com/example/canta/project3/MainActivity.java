package com.example.canta.project3;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.onesignal.OneSignal;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef;
    FirebaseUser currentFirebaseUser;
    static String current_user_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        current_user_email = currentFirebaseUser.getEmail();

        FirebaseDatabase.getInstance().getReference("users").child(currentFirebaseUser.getUid().toString()).child("info").child("email").setValue(currentFirebaseUser.getEmail().toString());

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

        OneSignal.sendTag("User_ID", current_user_email);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        myRef = database.getReference("users").child(currentFirebaseUser.getUid().toString()).child("info").child("username");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) { Player.getInstance().setPlayerName(dataSnapshot.getValue(String.class)); }
            @Override public void onCancelled(DatabaseError error) {}
        });
        myRef = database.getReference("users").child(currentFirebaseUser.getUid().toString()).child("info").child("name");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) { Player.getInstance().setName(dataSnapshot.getValue(String.class)); }
            @Override public void onCancelled(DatabaseError error) {}
        });
        myRef = database.getReference("users").child(currentFirebaseUser.getUid().toString()).child("info").child("surname");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) { Player.getInstance().setSurname(dataSnapshot.getValue(String.class)); }
            @Override public void onCancelled(DatabaseError error) {}
        });
        myRef = database.getReference("users").child(currentFirebaseUser.getUid().toString()).child("info").child("city");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override public void onDataChange(DataSnapshot dataSnapshot) { Player.getInstance().setCity(dataSnapshot.getValue(String.class)); }
            @Override public void onCancelled(DatabaseError error) {}
        });

        final int[] counter = {0};
        database.getReference("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid() + "").child("friends").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if (dataSnapshot.getValue() != null){
                    Player.getInstance().addFriend(dataSnapshot.getValue() + "",dataSnapshot.getKey().toString());
                }
            }
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}
            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });

        database.getReference("users").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(final DataSnapshot dataSnapshot, String s) {
                // Toast.makeText(getActivity(),"Text: " + dataSnapshot.getValue(), Toast.LENGTH_SHORT).show();
                if (dataSnapshot.getKey() != null){
                    final String key = dataSnapshot.getKey().toString();
                    database.getReference("users").child(key).child("info").child("username").addValueEventListener(new ValueEventListener() {

                        @Override public void onDataChange(DataSnapshot dataSnapshot2) {
                            Player.getInstance().addUsertoList(dataSnapshot2.getValue().toString(),key);
                        }
                        @Override public void onCancelled(DatabaseError error) {}
                    });
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}
            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            userProfile game1 = new userProfile();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else if (id == R.id.nav_gallery) {
            challangeHandler.getInstance().setIsChallange(false);
            qqTopicSelectFragment game1 = new qqTopicSelectFragment();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else if (id == R.id.nav_slideshow) {
            challangeHandler.getInstance().setIsChallange(false);
            MemoryGameSelectionFragment game1 = new MemoryGameSelectionFragment();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else if (id == R.id.nav_share) {
            ListOfFriendsFragment game1 = new ListOfFriendsFragment();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else if (id == R.id.nav_send) {
            AllUserListFragment game1 = new AllUserListFragment();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }else if (id == R.id.nav_rank) {
            TopScoresFragment game1 = new TopScoresFragment();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }else if (id == R.id.nav_request) {
            ChallangesAndFriendRequestsFragment game1 = new ChallangesAndFriendRequestsFragment();
            android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, game1);
            ft.addToBackStack(null);
            ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else if (id == R.id.push){
            sendNotification();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void sendNotification()
    {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                int SDK_INT = android.os.Build.VERSION.SDK_INT;
                if (SDK_INT > 8) {
                    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                            .permitAll().build();
                    StrictMode.setThreadPolicy(policy);
                    String send_email;

                    //This is a Simple Logic to Send Notification different Device Programmatically....
                    if (MainActivity.current_user_email.equals("ccapraz@ku.edu.tr")) {
                        send_email = "aturgut@ku.edu.tr";
                    } else {
                        send_email = "ccapraz@ku.edu.tr";
                    }

                    try {
                        String jsonResponse;

                        URL url = new URL("https://onesignal.com/api/v1/notifications");
                        HttpURLConnection con = (HttpURLConnection) url.openConnection();
                        con.setUseCaches(false);
                        con.setDoOutput(true);
                        con.setDoInput(true);

                        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        con.setRequestProperty("Authorization", "Basic MmI2NGI5OGItZGQyNC00NjNkLTllMzgtZmFmZTVhMmI5ZTUx");
                        con.setRequestMethod("POST");

                        String strJsonBody = "{"
                                + "\"app_id\": \"830ade25-7966-4efa-b780-4e392ebf3d6f\","

                                + "\"filters\": [{\"field\": \"tag\", \"key\": \"User_ID\", \"relation\": \"=\", \"value\": \"" + send_email + "\"}],"

                                + "\"data\": {\"foo\": \"bar\"},"
                                + "\"contents\": {\"en\": \"English Message\"}"
                                + "}";


                        System.out.println("strJsonBody:\n" + strJsonBody);

                        byte[] sendBytes = strJsonBody.getBytes("UTF-8");
                        con.setFixedLengthStreamingMode(sendBytes.length);

                        OutputStream outputStream = con.getOutputStream();
                        outputStream.write(sendBytes);

                        int httpResponse = con.getResponseCode();
                        System.out.println("httpResponse: " + httpResponse);

                        if (httpResponse >= HttpURLConnection.HTTP_OK
                                && httpResponse < HttpURLConnection.HTTP_BAD_REQUEST) {
                            Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                            jsonResponse = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                        } else {
                            Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                            jsonResponse = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                        }
                        System.out.println("jsonResponse:\n" + jsonResponse);

                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                }
            }
        });
    }
}
