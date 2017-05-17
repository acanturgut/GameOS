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
    int[] imageViewID = new int[30];

    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageRef = storage.getReference().child("android.jpg");

    int[] flaglistNum;
    int[] a = new int[21];
    int[] ac = new int[25];
    Bitmap[] allpictures;
    Bitmap[] targets;

    public levelTwoFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inf2late the layout f2or this f2ragment
        View layout2 = inflater.inflate(R.layout.fragment_two_level, container, false);


        imageViewID[0] = R.id.f211;
        imageViewID[1] = R.id.f212;
        imageViewID[2] = R.id.f213;
        imageViewID[3] = R.id.f214;
        imageViewID[4] = R.id.f215;
        imageViewID[5] = R.id.f221;
        imageViewID[6] = R.id.f222;
        imageViewID[7] = R.id.f223;
        imageViewID[8] = R.id.f224;
        imageViewID[9] = R.id.f225;
        imageViewID[10] = R.id.f231;
        imageViewID[11] = R.id.f232;
        imageViewID[12] = R.id.f233;
        imageViewID[13] = R.id.f234;
        imageViewID[14] = R.id.f235;
        imageViewID[15] = R.id.f241;
        imageViewID[16] = R.id.f242;
        imageViewID[17] = R.id.f243;
        imageViewID[18] = R.id.f244;
        imageViewID[19] = R.id.f245;
        imageViewID[20] = R.id.f251;
        imageViewID[21] = R.id.f252;
        imageViewID[22] = R.id.f253;
        imageViewID[23] = R.id.f254;
        imageViewID[24] = R.id.f255;

        imageViewID[25] = R.id.newtarget1;
        imageViewID[26] = R.id.newtarget2;
        imageViewID[27] = R.id.newtarget3;
        imageViewID[28] = R.id.newtarget4;
        imageViewID[29] = R.id.newtarget5;

        for (int i = 0; i < imageViewID.length; i++){
            ImageView myImage = (ImageView) layout2.findViewById(imageViewID[i]);
            myImage.setOnClickListener(this);
        }

        int a[] = flaglist.getInstance().getQuestionList2();

        allpictures = new Bitmap[25];
        flaglistNum = new int[25];
        targets = new Bitmap[5];
        createImageArray(a,flaglistNum, allpictures,targets);

        return layout2;
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < ac.length; i++){
            ac[i] = 0;
        }
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
        trueans = 0;

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

        Player.getInstance().setPlayerScore(0);

        final int[] counter = {0};

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                for (int i = 0; i < 25; i++){
                    imagesetter(imageViewID[i],i,1);
                }
                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    public void run() {
                        closeAll();
                        imagesettertarget(R.id.newtarget1,0,1);
                        imagesettertarget(R.id.newtarget2,1,1);
                        imagesettertarget(R.id.newtarget3,2,1);
                        imagesettertarget(R.id.newtarget4,3,1);
                        imagesettertarget(R.id.newtarget5,4,1);
                    }
                }, 5000);
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
                imagesetter(R.id.f211,0,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 1);
                num ++;
                break;
            case R.id.f212:
                imagesetter(R.id.f212,1,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 2);
                num ++;
                break;
            case R.id.f213:
                imagesetter(R.id.f213,2,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 3);
                num ++;
                break;
            case R.id.f214:
                imagesetter(R.id.f214,3,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num,4);
                num ++;
                break;
            case R.id.f215:
                imagesetter(R.id.f215,4,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 5);
                num ++;
                break;
            case R.id.f221:
                imagesetter(R.id.f221,5,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 6);
                num ++;
                break;
            case R.id.f222:
                imagesetter(R.id.f222,6,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 7);
                num ++;
                break;
            case R.id.f223:
                imagesetter(R.id.f223,7,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 8);
                num ++;
                break;
            case R.id.f224:
                imagesetter(R.id.f224,8,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 9);
                num ++;
                break;
            case R.id.f225:
                imagesetter(R.id.f225,9,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 10);
                num ++;
                break;

            case R.id.f231:
                imagesetter(R.id.f231,10,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 11);
                num ++;
                break;
            case R.id.f232:
                imagesetter(R.id.f232,11,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 12);
                num ++;
                break;
            case R.id.f233:
                imagesetter(R.id.f233,12,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 13);
                num ++;
                break;
            case R.id.f234:
                imagesetter(R.id.f234,13,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 14);
                num ++;
                break;
            case R.id.f235:
                imagesetter(R.id.f235,14,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 15);
                num ++;
                break;
            case R.id.f241:
                imagesetter(R.id.f241,15,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 16);
                num ++;
                break;
            case R.id.f242:
                imagesetter(R.id.f242,16,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 17);
                num ++;
                break;
            case R.id.f243:
                imagesetter(R.id.f243,17,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 18);
                num ++;
                break;
            case R.id.f244:
                imagesetter(R.id.f244,18,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 19);
                num ++;
                break;
            case R.id.f245:
                imagesetter(R.id.f245,19,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 20);
                num ++;
                break;
            case R.id.f251:
                imagesetter(R.id.f251,20,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 21);
                num ++;
                break;
            case R.id.f252:
                imagesetter(R.id.f252,21,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 22);
                num ++;
                break;
            case R.id.f253:
                imagesetter(R.id.f253,22,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 23);
                num ++;
                break;
            case R.id.f254:
                imagesetter(R.id.f254,23,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 24);
                num ++;
                break;
            case R.id.f255:
                imagesetter(R.id.f255,24,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 25);
                num ++;
                break;
        }

    }
    public void hold(int number, int k){

        int ref2 = flaglistNum[k-1];
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
                    MemoryGameSelectionFragment move = new MemoryGameSelectionFragment();
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

    public void imagesetter(final int id, int k, int num) {
        ImageView image1 = (ImageView) getActivity().findViewById(id);
        image1.setImageBitmap(allpictures[k]);
    }

    public void imagesettertarget(final int id, int k, int num) {
        ImageView image1 = (ImageView) getActivity().findViewById(id);
        image1.setImageBitmap(allpictures[k]);
    }


    public void closeAll(){

        for (int i = 0; i < 25; i++){
            ImageView myview = (ImageView) getActivity().findViewById(imageViewID[i]);
            if (ac[i] == 0){
                myview.setImageResource(R.drawable.card);
            }
        }
    }


    private int createImageArray(final int a[],final int[] flaglistNum,final Bitmap[] allpictures, final Bitmap[] targets) {
        for (int i = 0; i < 20; i++){
            try {
                final File localFile = File.createTempFile("flag" + a[i] + ".png", "png");
                storageRef = storage.getReference().child("flag" + a[i] + ".png");
                final int finalI = i;
                storageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                        if (finalI < 5){
                            targets[finalI] = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            allpictures[20 + finalI] = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            flaglistNum[20 + finalI] = a[finalI];
                        }
                        flaglistNum[finalI] = a[finalI];
                        allpictures[finalI] = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {}
                });

            } catch (IOException e) {}
        }
        return 1;
    }

    private void updatePoint(boolean k){
        System.out.println("list members are " + holder0 + "and" + holder1);
        if (holder0 == holder1){
            int alala = Player.getInstance().getPlayerScore();
            if (k){
                alala = alala + 100;
                ac[holderPic0] = 1;
                ac[holderPic1] = 1;
            } else{
                alala = alala - 100;
            }

            Player.getInstance().setPlayerScore(alala);
            TextView textScore = (TextView) getActivity().findViewById(R.id.myscore);
            String scoree = "SCORE " + alala;
            textScore.setText(scoree);

        }
    }

}





























