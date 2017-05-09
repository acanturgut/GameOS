package com.example.canta.project2;

import android.os.Bundle;
import android.os.Handler;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class levelThreeFragment extends Fragment implements View.OnClickListener {
    int num;
    int holder0;
    int holder1;
    int holderPic0;
    int holderPic1;
    int trueans3;
    int[] a = new int[16];
    int id30,id31,id32,id33,id34,id35,id36,id37,id38,id39,id310,id311,id312,id313,id314,id315,id316,id317,id318,id319,id320,id321,id322,id323,id324,id325,id326,id327,id328,id329,id330,id331,id332,id333,id334,id335,id336;
    int ac30,ac31,ac32,ac33,ac34,ac35,ac36,ac37,ac38,ac39,ac310,ac311,ac312,ac313,ac314,ac315,ac316,ac317,ac318,ac319,ac320,ac321,ac322,ac323,ac324,ac325,ac326,ac327,ac328,ac329,ac330,ac331,ac332,ac333,ac334,ac335,ac336;
    public levelThreeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inf3late the layout f3or this f3ragment
        View layout3 = inflater.inflate(R.layout.fragment_level_three, container, false);

        ImageView im1 = (ImageView) layout3.findViewById(R.id.f311);
        im1.setOnClickListener(this);
        ImageView im2 = (ImageView) layout3.findViewById(R.id.f312);
        im2.setOnClickListener(this);
        ImageView im3 = (ImageView) layout3.findViewById(R.id.f313);
        im3.setOnClickListener(this);
        ImageView im4 = (ImageView) layout3.findViewById(R.id.f314);
        im4.setOnClickListener(this);
        ImageView im5 = (ImageView) layout3.findViewById(R.id.f315);
        im5.setOnClickListener(this);
        ImageView im6 = (ImageView) layout3.findViewById(R.id.f316);
        im6.setOnClickListener(this);
        ImageView im7 = (ImageView) layout3.findViewById(R.id.f321);
        im7.setOnClickListener(this);
        ImageView im8 = (ImageView) layout3.findViewById(R.id.f322);
        im8.setOnClickListener(this);
        ImageView im9 = (ImageView) layout3.findViewById(R.id.f323);
        im9.setOnClickListener(this);
        ImageView im10 = (ImageView) layout3.findViewById(R.id.f324);
        im10.setOnClickListener(this);
        ImageView im11 = (ImageView) layout3.findViewById(R.id.f325);
        im11.setOnClickListener(this);
        ImageView im12 = (ImageView) layout3.findViewById(R.id.f326);
        im12.setOnClickListener(this);
        ImageView im13 = (ImageView) layout3.findViewById(R.id.f331);
        im13.setOnClickListener(this);
        ImageView im14 = (ImageView) layout3.findViewById(R.id.f332);
        im14.setOnClickListener(this);
        ImageView im15 = (ImageView) layout3.findViewById(R.id.f333);
        im15.setOnClickListener(this);
        ImageView im16 = (ImageView) layout3.findViewById(R.id.f334);
        im16.setOnClickListener(this);
        ImageView im17 = (ImageView) layout3.findViewById(R.id.f335);
        im17.setOnClickListener(this);
        ImageView im18 = (ImageView) layout3.findViewById(R.id.f336);
        im18.setOnClickListener(this);
        ImageView im19 = (ImageView) layout3.findViewById(R.id.f341);
        im19.setOnClickListener(this);
        ImageView im20 = (ImageView) layout3.findViewById(R.id.f342);
        im20.setOnClickListener(this);
        ImageView im21 = (ImageView) layout3.findViewById(R.id.f343);
        im21.setOnClickListener(this);
        ImageView im22 = (ImageView) layout3.findViewById(R.id.f344);
        im22.setOnClickListener(this);
        ImageView im23 = (ImageView) layout3.findViewById(R.id.f345);
        im23.setOnClickListener(this);
        ImageView im24 = (ImageView) layout3.findViewById(R.id.f346);
        im24.setOnClickListener(this);
        ImageView im25 = (ImageView) layout3.findViewById(R.id.f351);
        im25.setOnClickListener(this);
        ImageView im26 = (ImageView) layout3.findViewById(R.id.f352);
        im26.setOnClickListener(this);
        ImageView im27 = (ImageView) layout3.findViewById(R.id.f353);
        im27.setOnClickListener(this);
        ImageView im28 = (ImageView) layout3.findViewById(R.id.f354);
        im28.setOnClickListener(this);
        ImageView im29 = (ImageView) layout3.findViewById(R.id.f355);
        im29.setOnClickListener(this);
        ImageView im30 = (ImageView) layout3.findViewById(R.id.f356);
        im30.setOnClickListener(this);
        ImageView im31 = (ImageView) layout3.findViewById(R.id.f361);
        im31.setOnClickListener(this);
        ImageView im32 = (ImageView) layout3.findViewById(R.id.f362);
        im32.setOnClickListener(this);
        ImageView im33 = (ImageView) layout3.findViewById(R.id.f363);
        im33.setOnClickListener(this);
        ImageView im34 = (ImageView) layout3.findViewById(R.id.f364);
        im34.setOnClickListener(this);
        ImageView im35 = (ImageView) layout3.findViewById(R.id.f365);
        im35.setOnClickListener(this);
        ImageView im36 = (ImageView) layout3.findViewById(R.id.f366);
        im36.setOnClickListener(this);

        ImageView target1 = (ImageView) layout3.findViewById(R.id.target1);
        target1.setOnClickListener(this);
        ImageView target2 = (ImageView) layout3.findViewById(R.id.target2);
        target2.setOnClickListener(this);
        ImageView target3 = (ImageView) layout3.findViewById(R.id.target3);
        target3.setOnClickListener(this);
        ImageView target4 = (ImageView) layout3.findViewById(R.id.target8);
        target4.setOnClickListener(this);
        ImageView target5 = (ImageView) layout3.findViewById(R.id.target5);
        target5.setOnClickListener(this);
        ImageView target6 = (ImageView) layout3.findViewById(R.id.target6);
        target6.setOnClickListener(this);
        return layout3;
    }

    public void onStart() {
        super.onStart();
        num = 0;
        ImageView myim1 = (ImageView) getActivity().findViewById(R.id.h31);
        myim1.setImageResource(R.drawable.kalp);
        ImageView myim2 = (ImageView) getActivity().findViewById(R.id.h32);
        myim2.setImageResource(R.drawable.kalp);
        ImageView myim3 = (ImageView) getActivity().findViewById(R.id.h33);
        myim3.setImageResource(R.drawable.kalp);
        ImageView myim4 = (ImageView) getActivity().findViewById(R.id.h34);
        myim4.setImageResource(R.drawable.kalp);
        trueans3 = 0;
        final int myid3;
        int c[] = flaglist.getInstance().getQuestionList3();
        id30 = c[0];
        id31 = c[1];
        id32 = c[2];
        id33 = c[3];
        id34 = c[4];
        id35 = c[5];
        id36 = c[6];
        id37 = c[7];
        id38 = c[8];
        id39 = c[9];
        id310 = c[10];
        id311 = c[11];
        id312 = c[12];
        id313 = c[13];
        id314 = c[14];
        id315 = c[15];
        id316 = c[16];
        id317 = c[17];
        id318 = c[18];
        id319 = c[19];
        id320 = c[20];
        id321 = c[21];
        id322 = c[22];
        id323 = c[23];
        id324 = c[24];
        id325 = c[25];
        id326 = c[26];
        id327 = c[27];
        id328 = c[28];
        id329 = c[29];
        id330 = c[30];
        id331 = c[31];
        id332 = c[32];
        id333 = c[33];
        id334 = c[34];
        id335 = c[35];
        final int myid31,myid32,myid33,myid34,myid35,myid36;
        final ImageView tar1 = (ImageView) getActivity().findViewById(R.id.target1);
        final ImageView tar2 = (ImageView) getActivity().findViewById(R.id.target3);
        final ImageView tar3 = (ImageView) getActivity().findViewById(R.id.target2);
        final ImageView tar4 = (ImageView) getActivity().findViewById(R.id.target8);
        final ImageView tar5 = (ImageView) getActivity().findViewById(R.id.target5);
        final ImageView tar6 = (ImageView) getActivity().findViewById(R.id.target6);
        tar1.setImageResource(R.drawable.card);
        tar2.setImageResource(R.drawable.card);
        tar3.setImageResource(R.drawable.card);
        tar4.setImageResource(R.drawable.card);
        tar5.setImageResource(R.drawable.card);
        tar6.setImageResource(R.drawable.card);

        int t1 = flaglist.getInstance().getTarget31();
        myid31 = flagHolder.getInstance().getFlag(t1);
        int t2 = flaglist.getInstance().getTarget32();
        myid32 = flagHolder.getInstance().getFlag(t2);
        int t3 = flaglist.getInstance().getTarget33();
        myid33 = flagHolder.getInstance().getFlag(t3);
        int t4 = flaglist.getInstance().getTarget34();
        myid34 = flagHolder.getInstance().getFlag(t4);
        int t5 = flaglist.getInstance().getTarget35();
        myid35 = flagHolder.getInstance().getFlag(t5);
        int t6 = flaglist.getInstance().getTarget36();
        myid36 = flagHolder.getInstance().getFlag(t6);
        TextView textScore = (TextView) getActivity().findViewById(R.id.myscore5);
        String scoree = "SCORE  " + Player.getInstance().getPlayerScore();
        textScore.setText(scoree);

        imagesetter(R.id.f311,1,1);
        imagesetter(R.id.f312,2,1);
        imagesetter(R.id.f313,3,1);
        imagesetter(R.id.f314,4,1);
        imagesetter(R.id.f315,5,1);
        imagesetter(R.id.f316,6,1);
        imagesetter(R.id.f321,7,1);
        imagesetter(R.id.f322,8,1);
        imagesetter(R.id.f323,9,1);
        imagesetter(R.id.f324,10,1);
        imagesetter(R.id.f325,11,1);
        imagesetter(R.id.f326,12,1);
        imagesetter(R.id.f331,13,1);
        imagesetter(R.id.f332,14,1);
        imagesetter(R.id.f333,15,1);
        imagesetter(R.id.f334,16,1);
        imagesetter(R.id.f335,17,1);
        imagesetter(R.id.f336,18,1);
        imagesetter(R.id.f341,19,1);
        imagesetter(R.id.f342,20,1);
        imagesetter(R.id.f343,21,1);
        imagesetter(R.id.f344,22,1);
        imagesetter(R.id.f345,23,1);
        imagesetter(R.id.f346,24,1);
        imagesetter(R.id.f351,25,1);
        imagesetter(R.id.f352,26,1);
        imagesetter(R.id.f353,27,1);
        imagesetter(R.id.f354,28,1);
        imagesetter(R.id.f355,29,1);
        imagesetter(R.id.f356,30,1);
        imagesetter(R.id.f361,31,1);
        imagesetter(R.id.f362,32,1);
        imagesetter(R.id.f363,33,1);
        imagesetter(R.id.f364,34,1);
        imagesetter(R.id.f365,35,1);
        imagesetter(R.id.f366,36,1);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                closeAll();
                tar1.setImageResource(myid31);
                tar2.setImageResource(myid32);
                tar3.setImageResource(myid33);
                tar4.setImageResource(myid34);
                tar5.setImageResource(myid35);
                tar6.setImageResource(myid36);

            }
        }, 5000);
    }

    public void onResume(){
        super.onResume();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.f311:
                imagesetter(R.id.f311,1,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 1);
                num ++;
                break;
            case R.id.f312:
                imagesetter(R.id.f312,2,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 2);
                num ++;
                break;
            case R.id.f313:
                imagesetter(R.id.f313,3,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 3);
                num ++;
                break;
            case R.id.f314:
                imagesetter(R.id.f314,4,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num,4);
                num ++;
                break;
            case R.id.f315:
                imagesetter(R.id.f315,5,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 5);
                num ++;
                break;
            case R.id.f316:
                imagesetter(R.id.f316,6,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 6);
                num ++;
                break;
            case R.id.f321:
                imagesetter(R.id.f321,7,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 7);
                num ++;
                break;
            case R.id.f322:
                imagesetter(R.id.f322,8,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 8);
                num ++;
                break;
            case R.id.f323:
                imagesetter(R.id.f323,9,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 9);
                num ++;
                break;
            case R.id.f324:
                imagesetter(R.id.f324,10,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 10);
                num ++;
                break;
            case R.id.f325:
                imagesetter(R.id.f325,11,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 11);
                num ++;
                break;
            case R.id.f326:
                imagesetter(R.id.f326,12,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 12);
                num ++;
                break;
            case R.id.f331:
                imagesetter(R.id.f331,13,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 13);
                num ++;
                break;
            case R.id.f332:
                imagesetter(R.id.f332,14,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 14);
                num ++;
                break;
            case R.id.f333:
                imagesetter(R.id.f333,15,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 15);
                num ++;
                break;
            case R.id.f334:
                imagesetter(R.id.f334,16,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 16);
                num ++;
                break;
            case R.id.f335:
                imagesetter(R.id.f335,17,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 17);
                num ++;
                break;
            case R.id.f336:
                imagesetter(R.id.f336,18,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 18);
                num ++;
                break;
            case R.id.f341:
                imagesetter(R.id.f341,19,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 19);
                num ++;
                break;
            case R.id.f342:
                imagesetter(R.id.f342,20,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 20);
                num ++;
                break;
            case R.id.f343:
                imagesetter(R.id.f343,21,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 21);
                num ++;
                break;
            case R.id.f344:
                imagesetter(R.id.f344,22,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 22);
                num ++;
                break;
            case R.id.f345:
                imagesetter(R.id.f345,23,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 23);
                num ++;
                break;
            case R.id.f346:
                imagesetter(R.id.f346,24,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 24);
                num ++;
                break;
            case R.id.f351:
                imagesetter(R.id.f351,25,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 25);
                num ++;
                break;
            case R.id.f352:
                imagesetter(R.id.f352,26,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 26);
                num ++;
                break;
            case R.id.f353:
                imagesetter(R.id.f353,27,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 27);
                num ++;
                break;
            case R.id.f354:
                imagesetter(R.id.f354,28,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 28);
                num ++;
                break;
            case R.id.f355:
                imagesetter(R.id.f355,29,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 29);
                num ++;
                break;
            case R.id.f356:
                imagesetter(R.id.f356,30,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 30);
                num ++;
                break;
            case R.id.f361:
                imagesetter(R.id.f361,31,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 31);
                num ++;
                break;
            case R.id.f362:
                imagesetter(R.id.f362,32,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 32);
                num ++;
                break;
            case R.id.f363:
                imagesetter(R.id.f363,33,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 33);
                num ++;
                break;
            case R.id.f364:
                imagesetter(R.id.f364,34,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 34);
                num ++;
                break;
            case R.id.f365:
                imagesetter(R.id.f365,35,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 35);
                num ++;
                break;
            case R.id.f366:
                imagesetter(R.id.f366,36,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 36);
                num ++;
                break;
        }

    }
    public void hold(int number, int k){
        int ref3;
        if (k==1)  ref3 = id31;
        else if (k==2)  ref3 = id32;
        else if (k==3)  ref3 = id33;
        else if (k==4)  ref3 = id34;
        else if (k==5)  ref3 = id35;
        else if (k==6)  ref3 = id36;
        else if (k==7)  ref3 = id37;
        else if (k==8)  ref3 = id38;
        else if (k==9)  ref3 = id39;
        else if (k==10)  ref3 = id310;
        else if (k==11)  ref3 = id311;
        else if (k==12)  ref3 = id312;
        else if (k==13)  ref3 = id313;
        else if (k==14)  ref3 = id314;
        else if (k==15)  ref3 = id315;
        else if (k==16)  ref3 = id316;
        else if (k==17)  ref3 = id317;
        else if (k==18)  ref3 = id318;
        else if (k==19)  ref3 = id319;
        else if (k==20)  ref3 = id320;
        else if (k==21)  ref3 = id321;
        else if (k==22)  ref3 = id322;
        else if (k==23)  ref3 = id323;
        else if (k==24)  ref3 = id324;
        else if (k==25)  ref3 = id325;
        else if (k==26)  ref3 = id326;
        else if (k==27)  ref3 = id327;
        else if (k==28)  ref3 = id328;
        else if (k==29)  ref3 = id329;
        else if (k==30)  ref3 = id330;
        else if (k==31)  ref3 = id331;
        else if (k==32)  ref3 = id332;
        else if (k==33)  ref3 = id333;
        else if (k==34)  ref3 = id334;
        else if (k==35)  ref3 = id335;
        else if (k==36)  ref3 = id30;

        else ref3 = 0;
        number ++;
        if (number == 1){
            holderPic0 = k - 1;
            holder0 = ref3;
        }else if (number == 2){
            holderPic1 = k - 1;
            holder1 = ref3;
            System.out.println("Trial : " + holder0 + " at " + holderPic0 + "and " + holder1 + " at " + holderPic1);
            if ((holder0 == holder1) && (holderPic0 != holderPic1)) {
                updatePoint(true);
                trueans3++;

                final ImageView tar1 = (ImageView) getActivity().findViewById(R.id.target1);
                final ImageView tar2 = (ImageView) getActivity().findViewById(R.id.target2);
                final ImageView tar3 = (ImageView) getActivity().findViewById(R.id.target3);
                final ImageView tar4 = (ImageView) getActivity().findViewById(R.id.target5);
                final ImageView tar5 = (ImageView) getActivity().findViewById(R.id.target6);
                final ImageView tar6 = (ImageView) getActivity().findViewById(R.id.target8);
                int t1 = flaglist.getInstance().getTarget31();
                int t2 = flaglist.getInstance().getTarget32();
                int t3 = flaglist.getInstance().getTarget33();
                int t4 = flaglist.getInstance().getTarget34();
                int t5 = flaglist.getInstance().getTarget35();
                int t6 = flaglist.getInstance().getTarget36();
                if (t1 == holder1) tar1.setImageResource(R.drawable.trueans);
                else if (t1 == holder1) tar1.setImageResource(R.drawable.trueans);
                else if (t2 == holder1) tar2.setImageResource(R.drawable.trueans);
                else if (t3 == holder1) tar3.setImageResource(R.drawable.trueans);
                else if (t4 == holder1) tar4.setImageResource(R.drawable.trueans);
                else if (t5 == holder1) tar5.setImageResource(R.drawable.trueans);
                else if (t6 == holder1) tar6.setImageResource(R.drawable.trueans);

                if (trueans3 == 6) {
                    Player.getInstance().setLife(4);
                    trueans3 = 0;
                    System.out.println("Enough True Question");
                    GameOverFragment game1 = new GameOverFragment();
                    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.fragment_container, game1);
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
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h31);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 2){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h32);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 1){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h33);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 0){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h34);
                    myim.setImageResource(R.drawable.ekalp);
                }else{
                    GameOverFragment game1 = new GameOverFragment();
                    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.fragment_container, game1);
                    ft.addToBackStack(null);
                    ft.setTransition(android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.commit();
                }

            }
        }
    }

    public void imagesetter(final int id3, int k, int num) {
        int ref3;
        if (k==0)ref3 = id30;
        else if (k==1) ref3 = id31;
        else if (k==2) ref3 = id32;
        else if (k==3) ref3 = id33;
        else if (k==4) ref3 = id34;
        else if (k==5) ref3 = id35;
        else if (k==6) ref3 = id36;
        else if (k==7) ref3 = id37;
        else if (k==8) ref3 = id38;
        else if (k==9) ref3 = id39;
        else if (k==10) ref3 = id310;
        else if (k==11) ref3 = id311;
        else if (k==12) ref3 = id312;
        else if (k==13) ref3 = id313;
        else if (k==14) ref3 = id314;
        else if (k==15) ref3 = id315;
        else if (k==16) ref3 = id316;
        else if (k==17) ref3 = id317;
        else if (k==18) ref3 = id318;
        else if (k==19) ref3 = id319;
        else if (k==20) ref3 = id320;
        else if (k==21) ref3 = id321;
        else if (k==22) ref3 = id322;
        else if (k==23) ref3 = id323;
        else if (k==24) ref3 = id324;
        else if (k==25) ref3 = id325;
        else if (k==26) ref3 = id326;
        else if (k==27) ref3 = id327;
        else if (k==28) ref3 = id328;
        else if (k==29) ref3 = id329;
        else if (k==30) ref3 = id330;
        else if (k==31) ref3 = id331;
        else if (k==32) ref3 = id332;
        else if (k==33) ref3 = id333;
        else if (k==34) ref3 = id334;
        else if (k==35) ref3 = id335;
        else if (k==36) ref3 = id30;
        else ref3 = 0;

        int myid3 = flagHolder.getInstance().getFlag(ref3);
        final ImageView image1 = (ImageView) getActivity().findViewById(id3);
        image1.setImageResource(myid3);
    }

    public void closeAll(){
        final ImageView im1 = (ImageView) getActivity().findViewById(R.id.f311);
        final ImageView im2 = (ImageView) getActivity().findViewById(R.id.f312);
        final ImageView im3 = (ImageView) getActivity().findViewById(R.id.f313);
        final ImageView im4 = (ImageView) getActivity().findViewById(R.id.f314);
        final ImageView im5 = (ImageView) getActivity().findViewById(R.id.f315);
        final ImageView im6 = (ImageView) getActivity().findViewById(R.id.f316);
        final ImageView im7 = (ImageView) getActivity().findViewById(R.id.f321);
        final ImageView im8 = (ImageView) getActivity().findViewById(R.id.f322);
        final ImageView im9 = (ImageView) getActivity().findViewById(R.id.f323);
        final ImageView im10 = (ImageView) getActivity().findViewById(R.id.f324);
        final ImageView im11 = (ImageView) getActivity().findViewById(R.id.f325);
        final ImageView im12 = (ImageView) getActivity().findViewById(R.id.f326);
        final ImageView im13 = (ImageView) getActivity().findViewById(R.id.f331);
        final ImageView im14 = (ImageView) getActivity().findViewById(R.id.f332);
        final ImageView im15 = (ImageView) getActivity().findViewById(R.id.f333);
        final ImageView im16 = (ImageView) getActivity().findViewById(R.id.f334);
        final ImageView im17 = (ImageView) getActivity().findViewById(R.id.f335);
        final ImageView im18 = (ImageView) getActivity().findViewById(R.id.f336);
        final ImageView im19 = (ImageView) getActivity().findViewById(R.id.f341);
        final ImageView im20 = (ImageView) getActivity().findViewById(R.id.f342);
        final ImageView im21 = (ImageView) getActivity().findViewById(R.id.f343);
        final ImageView im22 = (ImageView) getActivity().findViewById(R.id.f344);
        final ImageView im23 = (ImageView) getActivity().findViewById(R.id.f345);
        final ImageView im24 = (ImageView) getActivity().findViewById(R.id.f346);
        final ImageView im25 = (ImageView) getActivity().findViewById(R.id.f351);
        final ImageView im26 = (ImageView) getActivity().findViewById(R.id.f352);
        final ImageView im27 = (ImageView) getActivity().findViewById(R.id.f353);
        final ImageView im28 = (ImageView) getActivity().findViewById(R.id.f354);
        final ImageView im29 = (ImageView) getActivity().findViewById(R.id.f355);
        final ImageView im30 = (ImageView) getActivity().findViewById(R.id.f356);
        final ImageView im31 = (ImageView) getActivity().findViewById(R.id.f361);
        final ImageView im32 = (ImageView) getActivity().findViewById(R.id.f362);
        final ImageView im33 = (ImageView) getActivity().findViewById(R.id.f363);
        final ImageView im34 = (ImageView) getActivity().findViewById(R.id.f364);
        final ImageView im35 = (ImageView) getActivity().findViewById(R.id.f365);
        final ImageView im36 = (ImageView) getActivity().findViewById(R.id.f366);
        if (ac30 == 0)im1.setImageResource(R.drawable.card);
        if (ac31 == 0)im2.setImageResource(R.drawable.card);
        if (ac32 == 0)im3.setImageResource(R.drawable.card);
        if (ac33 == 0)im4.setImageResource(R.drawable.card);
        if (ac34 == 0)im5.setImageResource(R.drawable.card);
        if (ac35 == 0)im6.setImageResource(R.drawable.card);
        if (ac36 == 0)im7.setImageResource(R.drawable.card);
        if (ac37 == 0)im8.setImageResource(R.drawable.card);
        if (ac38 == 0)im9.setImageResource(R.drawable.card);
        if (ac39 == 0)im10.setImageResource(R.drawable.card);
        if (ac310 == 0)im11.setImageResource(R.drawable.card);
        if (ac311 == 0)im12.setImageResource(R.drawable.card);
        if (ac312 == 0)im13.setImageResource(R.drawable.card);
        if (ac313 == 0)im14.setImageResource(R.drawable.card);
        if (ac314 == 0)im15.setImageResource(R.drawable.card);
        if (ac315 == 0)im16.setImageResource(R.drawable.card);
        if (ac316 == 0)im17.setImageResource(R.drawable.card);
        if (ac317 == 0)im18.setImageResource(R.drawable.card);
        if (ac318 == 0)im19.setImageResource(R.drawable.card);
        if (ac319 == 0)im20.setImageResource(R.drawable.card);
        if (ac320 == 0)im21.setImageResource(R.drawable.card);
        if (ac321 == 0)im22.setImageResource(R.drawable.card);
        if (ac322 == 0)im23.setImageResource(R.drawable.card);
        if (ac323 == 0)im24.setImageResource(R.drawable.card);
        if (ac324 == 0)im25.setImageResource(R.drawable.card);
        if (ac325 == 0)im26.setImageResource(R.drawable.card);
        if (ac326 == 0)im27.setImageResource(R.drawable.card);
        if (ac327 == 0)im28.setImageResource(R.drawable.card);
        if (ac328 == 0)im29.setImageResource(R.drawable.card);
        if (ac329 == 0)im30.setImageResource(R.drawable.card);
        if (ac330 == 0)im31.setImageResource(R.drawable.card);
        if (ac331 == 0)im32.setImageResource(R.drawable.card);
        if (ac332 == 0)im33.setImageResource(R.drawable.card);
        if (ac333 == 0)im34.setImageResource(R.drawable.card);
        if (ac334 == 0)im35.setImageResource(R.drawable.card);
        if (ac335 == 0)im36.setImageResource(R.drawable.card);
    }

    private void updatePoint(boolean k){
        System.out.println("list members are " + holder0 + "and" + holder1);
        if (holder0 == holder1){
            int alala = Player.getInstance().getPlayerScore();
            if (k){
                alala = alala + 100;
                if (holderPic0 == 0) ac30 = 1;
                if (holderPic0 == 1) ac31 = 1;
                if (holderPic0 == 2) ac32 = 1;
                if (holderPic0 == 3) ac33 = 1;
                if (holderPic0 == 4) ac34 = 1;
                if (holderPic0 == 5) ac35 = 1;
                if (holderPic0 == 6) ac36 = 1;
                if (holderPic0 == 7) ac37 = 1;
                if (holderPic0 == 8) ac38 = 1;
                if (holderPic0 == 9) ac39 = 1;
                if (holderPic0 == 10) ac310 = 1;
                if (holderPic0 == 11) ac311 = 1;
                if (holderPic0 == 12) ac312 = 1;
                if (holderPic0 == 13) ac313 = 1;
                if (holderPic0 == 14) ac314 = 1;
                if (holderPic0 == 15) ac315 = 1;
                if (holderPic0 == 16) ac316 = 1;
                if (holderPic0 == 17) ac317 = 1;
                if (holderPic0 == 18) ac318 = 1;
                if (holderPic0 == 19) ac319 = 1;
                if (holderPic0 == 20) ac320 = 1;
                if (holderPic0 == 21) ac321 = 1;
                if (holderPic0 == 22) ac322 = 1;
                if (holderPic0 == 23) ac323 = 1;
                if (holderPic0 == 24) ac324 = 1;
                if (holderPic0 == 25) ac325 = 1;
                if (holderPic0 == 26) ac326 = 1;
                if (holderPic0 == 27) ac327 = 1;
                if (holderPic0 == 28) ac328 = 1;
                if (holderPic0 == 29) ac329 = 1;
                if (holderPic0 == 30) ac330 = 1;
                if (holderPic0 == 31) ac331 = 1;
                if (holderPic0 == 32) ac332 = 1;
                if (holderPic0 == 33) ac333 = 1;
                if (holderPic0 == 34) ac334 = 1;
                if (holderPic0 == 35) ac335 = 1;
                if (holderPic1 == 0) ac30 = 1;
                if (holderPic1 == 1) ac31 = 1;
                if (holderPic1 == 2) ac32 = 1;
                if (holderPic1 == 3) ac33 = 1;
                if (holderPic1 == 4) ac34 = 1;
                if (holderPic1 == 5) ac35 = 1;
                if (holderPic1 == 6) ac36 = 1;
                if (holderPic1 == 7) ac37 = 1;
                if (holderPic1 == 8) ac38 = 1;
                if (holderPic1 == 9) ac39 = 1;
                if (holderPic1 == 10) ac310 = 1;
                if (holderPic1 == 11) ac311 = 1;
                if (holderPic1 == 12) ac312 = 1;
                if (holderPic1 == 13) ac313 = 1;
                if (holderPic1 == 14) ac314 = 1;
                if (holderPic1 == 15) ac315 = 1;
                if (holderPic1 == 16) ac316 = 1;
                if (holderPic1 == 17) ac317 = 1;
                if (holderPic1 == 18) ac318 = 1;
                if (holderPic1 == 19) ac319 = 1;
                if (holderPic1 == 20) ac320 = 1;
                if (holderPic1 == 21) ac321 = 1;
                if (holderPic1 == 22) ac322 = 1;
                if (holderPic1 == 23) ac323 = 1;
                if (holderPic1 == 24) ac324 = 1;
                if (holderPic1 == 25) ac325 = 1;
                if (holderPic1 == 26) ac326 = 1;
                if (holderPic1 == 27) ac327 = 1;
                if (holderPic1 == 28) ac328 = 1;
                if (holderPic1 == 29) ac329 = 1;
                if (holderPic1 == 30) ac330 = 1;
                if (holderPic1 == 31) ac331 = 1;
                if (holderPic1 == 32) ac332 = 1;
                if (holderPic1 == 33) ac333 = 1;
                if (holderPic1 == 34) ac334 = 1;
                if (holderPic1 == 35) ac335 = 1;

            } else{
                alala = alala - 100;
            }
            Player.getInstance().setPlayerScore(alala);
            TextView textScore = (TextView) getActivity().findViewById(R.id.myscore5);
            String scoree = "SCORE  " + alala;
            textScore.setText(scoree);

        }
    }
}





























