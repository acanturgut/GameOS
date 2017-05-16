package com.example.canta.project3;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class levelTwoFragment extends Fragment implements View.OnClickListener {
    int num;
    int holder0;
    int holder1;
    int holderPic0;
    int holderPic1;
    int trueans;
    int[] a = new int[16];
    int id20,id21,id22,id23,id24,id25,id26,id27,id28,id29,id210,id211,id212,id213,id214,id215,id216,id217,id218,id219,id220,id221,id222,id223,id224,id225;
    int ac20,ac21,ac22,ac23,ac24,ac25,ac26,ac27,ac28,ac29,ac210,ac211,ac212,ac213,ac214,ac215,ac216,ac217,ac218,ac219,ac220,ac221,ac222,ac223,ac224,ac225;
    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageRef = storage.getReference().child("android.jpg");


    public levelTwoFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inf2late the layout f2or this f2ragment
        View layout2 = inflater.inflate(R.layout.fragment_two_level, container, false);

        ImageView im1 = (ImageView) layout2.findViewById(R.id.f211);
        im1.setOnClickListener(this);
        ImageView im2 = (ImageView) layout2.findViewById(R.id.f212);
        im2.setOnClickListener(this);
        ImageView im3 = (ImageView) layout2.findViewById(R.id.f213);
        im3.setOnClickListener(this);
        ImageView im4 = (ImageView) layout2.findViewById(R.id.f214);
        im4.setOnClickListener(this);
        ImageView im5 = (ImageView) layout2.findViewById(R.id.f215);
        im5.setOnClickListener(this);
        ImageView im6 = (ImageView) layout2.findViewById(R.id.f221);
        im6.setOnClickListener(this);
        ImageView im7 = (ImageView) layout2.findViewById(R.id.f222);
        im7.setOnClickListener(this);
        ImageView im8 = (ImageView) layout2.findViewById(R.id.f223);
        im8.setOnClickListener(this);
        ImageView im9 = (ImageView) layout2.findViewById(R.id.f224);
        im9.setOnClickListener(this);
        ImageView im10 = (ImageView) layout2.findViewById(R.id.f225);
        im10.setOnClickListener(this);
        ImageView im11 = (ImageView) layout2.findViewById(R.id.f231);
        im11.setOnClickListener(this);
        ImageView im12 = (ImageView) layout2.findViewById(R.id.f232);
        im12.setOnClickListener(this);
        ImageView im13 = (ImageView) layout2.findViewById(R.id.f233);
        im13.setOnClickListener(this);
        ImageView im14 = (ImageView) layout2.findViewById(R.id.f234);
        im14.setOnClickListener(this);
        ImageView im15 = (ImageView) layout2.findViewById(R.id.f235);
        im15.setOnClickListener(this);
        ImageView im16 = (ImageView) layout2.findViewById(R.id.f241);
        im16.setOnClickListener(this);
        ImageView im17 = (ImageView) layout2.findViewById(R.id.f242);
        im17.setOnClickListener(this);
        ImageView im18 = (ImageView) layout2.findViewById(R.id.f243);
        im18.setOnClickListener(this);
        ImageView im19 = (ImageView) layout2.findViewById(R.id.f244);
        im19.setOnClickListener(this);
        ImageView im20 = (ImageView) layout2.findViewById(R.id.f245);
        im20.setOnClickListener(this);
        ImageView im21 = (ImageView) layout2.findViewById(R.id.f251);
        im21.setOnClickListener(this);
        ImageView im22 = (ImageView) layout2.findViewById(R.id.f252);
        im22.setOnClickListener(this);
        ImageView im23 = (ImageView) layout2.findViewById(R.id.f253);
        im23.setOnClickListener(this);
        ImageView im24 = (ImageView) layout2.findViewById(R.id.f254);
        im24.setOnClickListener(this);
        ImageView im25 = (ImageView) layout2.findViewById(R.id.f255);
        im25.setOnClickListener(this);

        ImageView target21 = (ImageView) layout2.findViewById(R.id.newtarget2);
        target21.setOnClickListener(this);
        ImageView target22 = (ImageView) layout2.findViewById(R.id.newtarget3);
        target22.setOnClickListener(this);
        ImageView target23 = (ImageView) layout2.findViewById(R.id.newtarget4);
        target23.setOnClickListener(this);
        ImageView target24 = (ImageView) layout2.findViewById(R.id.newtarget1);
        target24.setOnClickListener(this);
        ImageView target25 = (ImageView) layout2.findViewById(R.id.newtarget5);
        target25.setOnClickListener(this);
        return layout2;
    }

    public void onStart() {
        super.onStart();
        num = 0;
        trueans = 0;
        ImageView myim1 = (ImageView) getActivity().findViewById(R.id.h21);
        myim1.setImageResource(R.drawable.kalp);
        ImageView myim2 = (ImageView) getActivity().findViewById(R.id.h22);
        myim2.setImageResource(R.drawable.kalp);
        ImageView myim3 = (ImageView) getActivity().findViewById(R.id.h23);
        myim3.setImageResource(R.drawable.kalp);
        ImageView myim4 = (ImageView) getActivity().findViewById(R.id.h24);
        myim4.setImageResource(R.drawable.kalp);
        int myid2;
        int b[] = flaglist.getInstance().getQuestionList2();
        id20 = b[0];
        id21 = b[1];
        id22 = b[2];
        id23 = b[3];
        id24 = b[4];
        id25 = b[5];
        id26 = b[6];
        id27 = b[7];
        id28 = b[8];
        id29 = b[9];
        id210 = b[10];
        id211 = b[11];
        id212 = b[12];
        id213 = b[13];
        id214 = b[14];
        id215 = b[15];
        id216 = b[16];
        id217 = b[17];
        id218 = b[18];
        id219 = b[19];
        id220 = b[20];
        id221 = b[21];
        id222 = b[22];
        id223 = b[23];
        id224 = b[24];
        final ImageView tar1 = (ImageView) getActivity().findViewById(R.id.newtarget1);
        final ImageView tar2 = (ImageView) getActivity().findViewById(R.id.newtarget2);
        final ImageView tar3 = (ImageView) getActivity().findViewById(R.id.newtarget3);
        final ImageView tar4 = (ImageView) getActivity().findViewById(R.id.newtarget4);
        final ImageView tar5 = (ImageView) getActivity().findViewById(R.id.newtarget5);
        tar1.setImageResource(R.drawable.card);
        tar2.setImageResource(R.drawable.card);
        tar3.setImageResource(R.drawable.card);
        tar4.setImageResource(R.drawable.card);
        tar5.setImageResource(R.drawable.card);
        TextView textScore = (TextView) getActivity().findViewById(R.id.myscore3);
        String scoree = "SCORE  " + Player.getInstance().getPlayerScore();
        textScore.setText(scoree);

        imagesetter(R.id.f211,1,1);
        imagesetter(R.id.f212,2,1);
        imagesetter(R.id.f213,3,1);
        imagesetter(R.id.f214,4,1);
        imagesetter(R.id.f215,5,1);
        imagesetter(R.id.f221,6,1);
        imagesetter(R.id.f222,7,1);
        imagesetter(R.id.f223,8,1);
        imagesetter(R.id.f224,9,1);
        imagesetter(R.id.f225,10,1);
        imagesetter(R.id.f231,11,1);
        imagesetter(R.id.f232,12,1);
        imagesetter(R.id.f233,13,1);
        imagesetter(R.id.f234,14,1);
        imagesetter(R.id.f235,15,1);
        imagesetter(R.id.f241,16,1);
        imagesetter(R.id.f242,17,1);
        imagesetter(R.id.f243,18,1);
        imagesetter(R.id.f244,19,1);
        imagesetter(R.id.f245,20,1);
        imagesetter(R.id.f251,21,1);
        imagesetter(R.id.f252,22,1);
        imagesetter(R.id.f253,23,1);
        imagesetter(R.id.f254,24,1);
        imagesetter(R.id.f255,25,1);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                closeAll();
                retrieveImage("flag" + flaglist.getInstance().getTarget21() + ".png",R.id.newtarget1);
                retrieveImage("flag" + flaglist.getInstance().getTarget22() + ".png",R.id.newtarget2);
                retrieveImage("flag" + flaglist.getInstance().getTarget23() + ".png",R.id.newtarget3);
                retrieveImage("flag" + flaglist.getInstance().getTarget24() + ".png",R.id.newtarget4);
                retrieveImage("flag" + flaglist.getInstance().getTarget25() + ".png",R.id.newtarget5);

            }
        }, 5000);
    }

    public void onResume(){
        super.onResume();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.f211:
                imagesetter(R.id.f211,1,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 1);
                num ++;
                break;
            case R.id.f212:
                imagesetter(R.id.f212,2,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 2);
                num ++;
                break;
            case R.id.f213:
                imagesetter(R.id.f213,3,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 3);
                num ++;
                break;
            case R.id.f214:
                imagesetter(R.id.f214,4,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num,4);
                num ++;
                break;
            case R.id.f215:
                imagesetter(R.id.f215,5,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 5);
                num ++;
                break;
            case R.id.f221:
                imagesetter(R.id.f221,6,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 6);
                num ++;
                break;
            case R.id.f222:
                imagesetter(R.id.f222,7,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 7);
                num ++;
                break;
            case R.id.f223:
                imagesetter(R.id.f223,8,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 8);
                num ++;
                break;
            case R.id.f224:
                imagesetter(R.id.f224,9,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 9);
                num ++;
                break;
            case R.id.f225:
                imagesetter(R.id.f225,10,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 10);
                num ++;
                break;

            case R.id.f231:
                imagesetter(R.id.f231,11,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 11);
                num ++;
                break;
            case R.id.f232:
                imagesetter(R.id.f232,12,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 12);
                num ++;
                break;
            case R.id.f233:
                imagesetter(R.id.f233,13,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 13);
                num ++;
                break;
            case R.id.f234:
                imagesetter(R.id.f234,14,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 14);
                num ++;
                break;
            case R.id.f235:
                imagesetter(R.id.f235,15,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 15);
                num ++;
                break;
            case R.id.f241:
                imagesetter(R.id.f241,16,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 16);
                num ++;
                break;
            case R.id.f242:
                imagesetter(R.id.f242,17,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 17);
                num ++;
                break;
            case R.id.f243:
                imagesetter(R.id.f243,18,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 18);
                num ++;
                break;
            case R.id.f244:
                imagesetter(R.id.f244,19,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 19);
                num ++;
                break;
            case R.id.f245:
                imagesetter(R.id.f245,20,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 20);
                num ++;
                break;
            case R.id.f251:
                imagesetter(R.id.f251,21,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 21);
                num ++;
                break;
            case R.id.f252:
                imagesetter(R.id.f252,22,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 22);
                num ++;
                break;
            case R.id.f253:
                imagesetter(R.id.f253,23,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 23);
                num ++;
                break;
            case R.id.f254:
                imagesetter(R.id.f254,24,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 24);
                num ++;
                break;
            case R.id.f255:
                imagesetter(R.id.f255,25,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 25);
                num ++;
                break;
        }

    }
    public void hold(int number, int k){
        int ref2;
        if (k==1) {
            ref2 = id21;
        }
        else if (k==2){
            ref2 = id22;
        }
        else if (k==3){
            ref2 = id23;
        }
        else if (k==4){
            ref2 = id24;
        }
        else if (k==5){
            ref2 = id25;
        }
        else if (k==6){
            ref2 = id26;
        }
        else if (k==7){
            ref2 = id27;
        }
        else if (k==8){
            ref2 = id28;
        }
        else if (k==9){
            ref2 = id29;
        }
        else if (k==10){
            ref2 = id210;
        }
        else if (k==11){
            ref2 = id211;
        }
        else if (k==12){
            ref2 = id212;
        }
        else if (k==13){
            ref2 = id213;
        }
        else if (k==14){
            ref2 = id214;
        }
        else if (k==15){
            ref2 = id215;
        }
        else if (k==16){
            ref2 = id216;
        }
        else if (k==17){
            ref2 = id217;
        }
        else if (k==18){
            ref2 = id218;
        }
        else if (k==19){
            ref2 = id219;
        }
        else if (k==20){
            ref2 = id220;
        }
        else if (k==21){
            ref2 = id221;
        }
        else if (k==22){
            ref2 = id222;
        }
        else if (k==23){
            ref2 = id223;
        }
        else if (k==24){
            ref2 = id224;
        }
        else if (k==25){
            ref2 = id20;
        }
        else ref2 = 0;
        number ++;
        if (number == 1){
            holderPic0 = k - 1;
            holder0 = ref2;
        }else if (number == 2){
            holderPic1 = k - 1;
            holder1 = ref2;
            System.out.println("Trial : " + holder0 + " at " + holderPic0 + "and " + holder1 + " at " + holderPic1);
            if ((holder0 == holder1) && (holderPic0 != holderPic1)) {
                updatePoint(true);
                trueans++;
                final ImageView tar1 = (ImageView) getActivity().findViewById(R.id.newtarget1);
                final ImageView tar2 = (ImageView) getActivity().findViewById(R.id.newtarget2);
                final ImageView tar3 = (ImageView) getActivity().findViewById(R.id.newtarget3);
                final ImageView tar4 = (ImageView) getActivity().findViewById(R.id.newtarget4);
                final ImageView tar5 = (ImageView) getActivity().findViewById(R.id.newtarget5);
                int t1 = flaglist.getInstance().getTarget21();
                int t2 = flaglist.getInstance().getTarget22();
                int t3 = flaglist.getInstance().getTarget23();
                int t4 = flaglist.getInstance().getTarget24();
                int t5 = flaglist.getInstance().getTarget25();
                if (t1 == holder1) tar1.setImageResource(R.drawable.trueans);
                else if (t1 == holder1) tar1.setImageResource(R.drawable.trueans);
                else if (t2 == holder1) tar2.setImageResource(R.drawable.trueans);
                else if (t3 == holder1) tar3.setImageResource(R.drawable.trueans);
                else if (t4 == holder1) tar4.setImageResource(R.drawable.trueans);
                else if (t5 == holder1) tar5.setImageResource(R.drawable.trueans);



                if (trueans == 5) {
                    Player.getInstance().setLife(4);
                    trueans = 0;
                    levelThreeFragment move = new levelThreeFragment();
                    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.fragment_container, move);
                    ft.addToBackStack(null);
                    ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.commit();
                }
                holderPic0 = -2;
                holderPic1 = -3;
                holder0 = -4;
                holder1 = -5;
            } else{
                Player.getInstance().setLife(Player.getInstance().getLife()-1);
                if(Player.getInstance().getLife() == 3){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h21);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 2){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h22);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 1){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h23);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 0){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h24);
                    myim.setImageResource(R.drawable.ekalp);
                }else{
                    MemoryGameSelectionFragment game1 = new MemoryGameSelectionFragment();
                    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.fragment_container, game1);
                    ft.addToBackStack(null);
                    ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.commit();
                }

            }
        }
    }

    public void imagesetter(final int id2, int k, int num) {
        int ref2;
        if (k==0)ref2 = id20;
        else if (k==1) ref2 = id21;
        else if (k==2) ref2 = id22;
        else if (k==3) ref2 = id23;
        else if (k==4) ref2 = id24;
        else if (k==5) ref2 = id25;
        else if (k==6) ref2 = id26;
        else if (k==7) ref2 = id27;
        else if (k==8) ref2 = id28;
        else if (k==9) ref2 = id29;
        else if (k==10) ref2 = id210;
        else if (k==11) ref2 = id211;
        else if (k==12) ref2 = id212;
        else if (k==13) ref2 = id213;
        else if (k==14) ref2 = id214;
        else if (k==15) ref2 = id215;
        else if (k==16) ref2 = id216;
        else if (k==17) ref2 = id217;
        else if (k==18) ref2 = id218;
        else if (k==19) ref2 = id219;
        else if (k==20) ref2 = id220;
        else if (k==21) ref2 = id221;
        else if (k==22) ref2 = id222;
        else if (k==23) ref2 = id223;
        else if (k==24) ref2 = id224;
        else if (k==25) ref2 = id20;
        else ref2 = 0;

        String flagname = "flag" + ref2 + ".png";
        retrieveImage(flagname,id2);
    }

    public void retrieveImage(String flagname, int id) {
        final ImageView image1 = (ImageView) getActivity().findViewById(id);
        try {
            final File localFile = File.createTempFile(flagname, "png");
            storageRef = storage.getReference().child(flagname);
            System.out.println("----------------" + storageRef + "    -    "  + flagname);
            storageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    image1.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {}
            });

        } catch (IOException e) {}
    }

    public void closeAll(){
        final ImageView im1 = (ImageView) getActivity().findViewById(R.id.f211);
        final ImageView im2 = (ImageView) getActivity().findViewById(R.id.f212);
        final ImageView im3 = (ImageView) getActivity().findViewById(R.id.f213);
        final ImageView im4 = (ImageView) getActivity().findViewById(R.id.f214);
        final ImageView im5 = (ImageView) getActivity().findViewById(R.id.f215);
        final ImageView im6 = (ImageView) getActivity().findViewById(R.id.f221);
        final ImageView im7 = (ImageView) getActivity().findViewById(R.id.f222);
        final ImageView im8 = (ImageView) getActivity().findViewById(R.id.f223);
        final ImageView im9 = (ImageView) getActivity().findViewById(R.id.f224);
        final ImageView im10 = (ImageView) getActivity().findViewById(R.id.f225);
        final ImageView im11 = (ImageView) getActivity().findViewById(R.id.f231);
        final ImageView im12 = (ImageView) getActivity().findViewById(R.id.f232);
        final ImageView im13 = (ImageView) getActivity().findViewById(R.id.f233);
        final ImageView im14 = (ImageView) getActivity().findViewById(R.id.f234);
        final ImageView im15 = (ImageView) getActivity().findViewById(R.id.f235);
        final ImageView im16 = (ImageView) getActivity().findViewById(R.id.f241);
        final ImageView im17 = (ImageView) getActivity().findViewById(R.id.f242);
        final ImageView im18 = (ImageView) getActivity().findViewById(R.id.f243);
        final ImageView im19 = (ImageView) getActivity().findViewById(R.id.f244);
        final ImageView im20 = (ImageView) getActivity().findViewById(R.id.f245);
        final ImageView im21 = (ImageView) getActivity().findViewById(R.id.f251);
        final ImageView im22 = (ImageView) getActivity().findViewById(R.id.f252);
        final ImageView im23 = (ImageView) getActivity().findViewById(R.id.f253);
        final ImageView im24 = (ImageView) getActivity().findViewById(R.id.f254);
        final ImageView im25 = (ImageView) getActivity().findViewById(R.id.f255);
        if (ac20 == 0) im1.setImageResource(R.drawable.card);
        if (ac21 == 0) im2.setImageResource(R.drawable.card);
        if (ac22 == 0) im3.setImageResource(R.drawable.card);
        if (ac23 == 0)im4.setImageResource(R.drawable.card);
        if (ac24 == 0)im5.setImageResource(R.drawable.card);
        if (ac25 == 0)im6.setImageResource(R.drawable.card);
        if (ac26 == 0)im7.setImageResource(R.drawable.card);
        if (ac27 == 0)im8.setImageResource(R.drawable.card);
        if (ac28 == 0)im9.setImageResource(R.drawable.card);
        if (ac29 == 0)im10.setImageResource(R.drawable.card);
        if (ac210 == 0)im11.setImageResource(R.drawable.card);
        if (ac211 == 0)im12.setImageResource(R.drawable.card);
        if (ac212 == 0)im13.setImageResource(R.drawable.card);
        if (ac213 == 0)im14.setImageResource(R.drawable.card);
        if (ac214 == 0)im15.setImageResource(R.drawable.card);
        if (ac215 == 0)im16.setImageResource(R.drawable.card);
        if (ac216 == 0)im17.setImageResource(R.drawable.card);
        if (ac217 == 0)im18.setImageResource(R.drawable.card);
        if (ac218 == 0)im19.setImageResource(R.drawable.card);
        if (ac219 == 0)im20.setImageResource(R.drawable.card);
        if (ac220 == 0)im21.setImageResource(R.drawable.card);
        if (ac221 == 0)im22.setImageResource(R.drawable.card);
        if (ac222 == 0)im23.setImageResource(R.drawable.card);
        if (ac223 == 0)im24.setImageResource(R.drawable.card);
        if (ac224 == 0)im25.setImageResource(R.drawable.card);

    }

    private void updatePoint(boolean k){
        System.out.println("list members are " + holder0 + "and" + holder1);
        if (holder0 == holder1){
            int alala = Player.getInstance().getPlayerScore();
            if (k){
                alala = alala + 100;
                if (holderPic0 == 0) ac20 = 1;
                if (holderPic0 == 1) ac21 = 1;
                if (holderPic0 == 2) ac22 = 1;
                if (holderPic0 == 3) ac23 = 1;
                if (holderPic0 == 4) ac24 = 1;
                if (holderPic0 == 5) ac25 = 1;
                if (holderPic0 == 6) ac26 = 1;
                if (holderPic0 == 7) ac27 = 1;
                if (holderPic0 == 8) ac28 = 1;
                if (holderPic0 == 9) ac29 = 1;
                if (holderPic0 == 10) ac210 = 1;
                if (holderPic0 == 11) ac211 = 1;
                if (holderPic0 == 12) ac212 = 1;
                if (holderPic0 == 13) ac213 = 1;
                if (holderPic0 == 14) ac214 = 1;
                if (holderPic0 == 15) ac215 = 1;
                if (holderPic0 == 16) ac216 = 1;
                if (holderPic0 == 17) ac217 = 1;
                if (holderPic0 == 18) ac218 = 1;
                if (holderPic0 == 19) ac219 = 1;
                if (holderPic0 == 20) ac220 = 1;
                if (holderPic0 == 21) ac221 = 1;
                if (holderPic0 == 22) ac222 = 1;
                if (holderPic0 == 23) ac223 = 1;
                if (holderPic0 == 24) ac224 = 1;
                if (holderPic0 == 25) ac215 = 1;
                if (holderPic1 == 0) ac20 = 1;
                if (holderPic1 == 1) ac21 = 1;
                if (holderPic1 == 2) ac22 = 1;
                if (holderPic1 == 3) ac23 = 1;
                if (holderPic1 == 4) ac24 = 1;
                if (holderPic1 == 5) ac25 = 1;
                if (holderPic1 == 6) ac26 = 1;
                if (holderPic1 == 7) ac27 = 1;
                if (holderPic1 == 8) ac28 = 1;
                if (holderPic1 == 9) ac29 = 1;
                if (holderPic1 == 10) ac210 = 1;
                if (holderPic1 == 11) ac211 = 1;
                if (holderPic1 == 12) ac212 = 1;
                if (holderPic1 == 13) ac213 = 1;
                if (holderPic1 == 14) ac214 = 1;
                if (holderPic1 == 15) ac215 = 1;
                if (holderPic1 == 16) ac216 = 1;
                if (holderPic1 == 17) ac217 = 1;
                if (holderPic1 == 18) ac218 = 1;
                if (holderPic1 == 19) ac219 = 1;
                if (holderPic1 == 20) ac220 = 1;
                if (holderPic1 == 21) ac221 = 1;
                if (holderPic1 == 22) ac222 = 1;
                if (holderPic1 == 23) ac223 = 1;
                if (holderPic1 == 24) ac224 = 1;
                if (holderPic1 == 25) ac225 = 1;

            } else{
                alala = alala - 100;
            }

            Player.getInstance().setPlayerScore(alala);
            TextView textScore = (TextView) getActivity().findViewById(R.id.myscore3);
            String scoree = "SCORE  " + alala;
            textScore.setText(scoree);

        }
    }
}





























