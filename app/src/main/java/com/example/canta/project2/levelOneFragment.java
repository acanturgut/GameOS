package com.example.canta.project2;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class levelOneFragment extends Fragment implements View.OnClickListener {
    int num = 0;
    int holder0;
    int holder1;
    int holderPic0;
    int holderPic1;
    int trueans = 0;

    int[] a = new int[16];
    int id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15;
    int ac0,ac1,ac2,ac3,ac4,ac5,ac6,ac7,ac8,ac9,ac10,ac11,ac12,ac13,ac14,ac15;
    public levelOneFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_one_level, container, false);


        ImageView im1 = (ImageView) layout.findViewById(R.id.f11);
        im1.setOnClickListener(this);
        ImageView im2 = (ImageView) layout.findViewById(R.id.f12);
        im2.setOnClickListener(this);
        ImageView im3 = (ImageView) layout.findViewById(R.id.f13);
        im3.setOnClickListener(this);
        ImageView im4 = (ImageView) layout.findViewById(R.id.f14);
        im4.setOnClickListener(this);
        ImageView im5 = (ImageView) layout.findViewById(R.id.f21);
        im5.setOnClickListener(this);
        ImageView im6 = (ImageView) layout.findViewById(R.id.f22);
        im6.setOnClickListener(this);
        ImageView im7 = (ImageView) layout.findViewById(R.id.f23);
        im7.setOnClickListener(this);
        ImageView im8 = (ImageView) layout.findViewById(R.id.f24);
        im8.setOnClickListener(this);
        ImageView im9 = (ImageView) layout.findViewById(R.id.f31);
        im9.setOnClickListener(this);
        ImageView im10 = (ImageView) layout.findViewById(R.id.f32);
        im10.setOnClickListener(this);
        ImageView im11 = (ImageView) layout.findViewById(R.id.f33);
        im11.setOnClickListener(this);
        ImageView im12 = (ImageView) layout.findViewById(R.id.f34);
        im12.setOnClickListener(this);
        ImageView im13 = (ImageView) layout.findViewById(R.id.f41);
        im13.setOnClickListener(this);
        ImageView im14 = (ImageView) layout.findViewById(R.id.f42);
        im14.setOnClickListener(this);
        ImageView im15 = (ImageView) layout.findViewById(R.id.f43);
        im15.setOnClickListener(this);
        ImageView im16 = (ImageView) layout.findViewById(R.id.f44);
        im16.setOnClickListener(this);

        ImageView target1 = (ImageView) layout.findViewById(R.id.imageView5);
        target1.setOnClickListener(this);
        ImageView target2 = (ImageView) layout.findViewById(R.id.imageView6);
        target2.setOnClickListener(this);
        ImageView target3 = (ImageView) layout.findViewById(R.id.imageView7);
        target3.setOnClickListener(this);
        ImageView target4 = (ImageView) layout.findViewById(R.id.imageView8);
        target4.setOnClickListener(this);
        return layout;
    }

    public void onStart() {
        super.onStart();
        ac0=0;
        ac1=0;
        ac2=0;
        ac3=0;
        ac4=0;
        ac5=0;
        ac6=0;
        ac7=0;
        ac8=0;
        ac9=0;
        ac10=0;
        ac11=0;
        ac12=0;
        ac13=0;
        ac14=0;
        ac15=0;
        final int myid1,myid2,myid3,myid4;
        ImageView myim1 = (ImageView) getActivity().findViewById(R.id.h1);
        myim1.setImageResource(R.drawable.kalp);
        ImageView myim2 = (ImageView) getActivity().findViewById(R.id.h2);
        myim2.setImageResource(R.drawable.kalp);
        ImageView myim3 = (ImageView) getActivity().findViewById(R.id.h3);
        myim3.setImageResource(R.drawable.kalp);
        ImageView myim4 = (ImageView) getActivity().findViewById(R.id.h4);
        myim4.setImageResource(R.drawable.kalp);
        trueans = 0;
        int a[] = flaglist.getInstance().getQuestionList();
        id0 = a[0];
        id1 = a[1];
        id2 = a[2];
        id3 = a[3];
        id4 = a[4];
        id5 = a[5];
        id6 = a[6];
        id7 = a[7];
        id8 = a[8];
        id9 = a[9];
        id10 = a[10];
        id11 = a[11];
        id12 = a[12];
        id13 = a[13];
        id14 = a[14];
        id15 = a[15];
        final ImageView tar1 = (ImageView) getActivity().findViewById(R.id.imageView5);
        final ImageView tar2 = (ImageView) getActivity().findViewById(R.id.imageView6);
        final ImageView tar3 = (ImageView) getActivity().findViewById(R.id.imageView7);
        final ImageView tar4 = (ImageView) getActivity().findViewById(R.id.imageView8);
        int t1 = flaglist.getInstance().getTarget1();
        myid1 = flagHolder.getInstance().getFlag(t1);
        int t2 = flaglist.getInstance().getTarget2();
        myid2 = flagHolder.getInstance().getFlag(t2);
        int t3 = flaglist.getInstance().getTarget3();
        myid3 = flagHolder.getInstance().getFlag(t3);
        int t4 = flaglist.getInstance().getTarget4();
        myid4 = flagHolder.getInstance().getFlag(t4);
        tar1.setImageResource(R.drawable.card);
        tar2.setImageResource(R.drawable.card);
        tar3.setImageResource(R.drawable.card);
        tar4.setImageResource(R.drawable.card);

        Player.getInstance().setPlayerScore(0);

        imagesetter(R.id.f11,1,1);
        imagesetter(R.id.f12,2,1);
        imagesetter(R.id.f13,3,1);
        imagesetter(R.id.f14,4,1);
        imagesetter(R.id.f21,5,1);
        imagesetter(R.id.f22,6,1);
        imagesetter(R.id.f23,7,1);
        imagesetter(R.id.f24,8,1);
        imagesetter(R.id.f31,9,1);
        imagesetter(R.id.f32,10,1);
        imagesetter(R.id.f33,11,1);
        imagesetter(R.id.f34,12,1);
        imagesetter(R.id.f41,13,1);
        imagesetter(R.id.f42,14,1);
        imagesetter(R.id.f43,15,1);
        imagesetter(R.id.f44,16,1);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
               closeAll();
               tar1.setImageResource(myid1);
               tar2.setImageResource(myid2);
               tar3.setImageResource(myid3);
               tar4.setImageResource(myid4);
            }
        }, 5000);
    }

    public void onResume(){
        super.onResume();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.f11:
                imagesetter(R.id.f11,1,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 1);
                num ++;
                break;
            case R.id.f12:
                imagesetter(R.id.f12,2,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 2);
                num ++;
                break;
            case R.id.f13:
                imagesetter(R.id.f13,3,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 3);
                num ++;
                break;
            case R.id.f14:
                imagesetter(R.id.f14,4,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 4);
                num ++;
                break;
            case R.id.f21:
                imagesetter(R.id.f21,5,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 5);
                num ++;
                break;
            case R.id.f22:
                imagesetter(R.id.f22,6,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 6);
                num ++;
                break;
            case R.id.f23:
                imagesetter(R.id.f23,7,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 7);
                num ++;
                break;
            case R.id.f24:
                imagesetter(R.id.f24,8,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 8);
                num ++;
                break;
            case R.id.f31:
                imagesetter(R.id.f31,9,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 9);
                num ++;
                break;
            case R.id.f32:
                imagesetter(R.id.f32,10,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 10);
                num ++;
                break;
            case R.id.f33:
                imagesetter(R.id.f33,11,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 11);
                num ++;
                break;
            case R.id.f34:
                imagesetter(R.id.f34,12,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 12);
                num ++;
                break;
            case R.id.f41:
                imagesetter(R.id.f41,13,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 13);
                num ++;
                break;
            case R.id.f42:
                imagesetter(R.id.f42,14,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 14);
                num ++;
                break;
            case R.id.f43:
                imagesetter(R.id.f43,15,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 15);
                num ++;
                break;
            case R.id.f44:
                imagesetter(R.id.f44,16,num);
                if(num == 2){
                    closeAll();
                    num = -1;
                }else hold(num, 16);
                num ++;
                break;
        }

    }
    public void hold(int number, int k){
        int ref;
        if (k==1) {
            ref = id1;
        }
        else if (k==2){
            ref = id2;
        }
        else if (k==3){
            ref = id3;
        }
        else if (k==4){
            ref = id4;
        }
        else if (k==5){
            ref = id5;
        }
        else if (k==6){
            ref = id6;
        }
        else if (k==7){
            ref = id7;
        }
        else if (k==8){
            ref = id8;
        }
        else if (k==9){
            ref = id9;
        }
        else if (k==10){
            ref = id10;
        }
        else if (k==11){
            ref = id11;
        }
        else if (k==12){
            ref = id12;
        }
        else if (k==13){
            ref = id13;
        }
        else if (k==14){
            ref = id14;
        }
        else if (k==15){
            ref = id15;
        }
        else if (k==16){
            ref = id0;
        }
        else ref = 0;
        number ++;
        if (number == 1){
            holderPic0 = k - 1;
            holder0 = ref;
        }else if (number == 2){
            holderPic1 = k - 1;
            holder1 = ref;
            System.out.println("Trial : " + holder0 + " at " + holderPic0 + "and " + holder1 + " at " + holderPic1);
            if ((holder0 == holder1) && (holderPic0 != holderPic1)) {
                updatePoint(true);
                trueans++;
                final ImageView tar1 = (ImageView) getActivity().findViewById(R.id.imageView5);
                final ImageView tar2 = (ImageView) getActivity().findViewById(R.id.imageView6);
                final ImageView tar3 = (ImageView) getActivity().findViewById(R.id.imageView7);
                final ImageView tar4 = (ImageView) getActivity().findViewById(R.id.imageView8);
                int t1 = flaglist.getInstance().getTarget1();
                int t2 = flaglist.getInstance().getTarget2();
                int t3 = flaglist.getInstance().getTarget3();
                int t4 = flaglist.getInstance().getTarget4();
                if (t1 == holder1) tar1.setImageResource(R.drawable.trueans);
                else if (t1 == holder1) tar1.setImageResource(R.drawable.trueans);
                else if (t2 == holder1) tar2.setImageResource(R.drawable.trueans);
                else if (t3 == holder1) tar3.setImageResource(R.drawable.trueans);
                else if (t4 == holder1) tar4.setImageResource(R.drawable.trueans);



                if (trueans == 4) {
                    Player.getInstance().setLife(4);
                    trueans = 0;
                    levelTwoFragment move = new levelTwoFragment();
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
            }
            else{
                Player.getInstance().setLife(Player.getInstance().getLife()-1);
                if(Player.getInstance().getLife() == 3){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h1);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 2){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h2);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 1){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h3);
                    myim.setImageResource(R.drawable.ekalp);
                }else if(Player.getInstance().getLife() == 0){
                    ImageView myim = (ImageView) getActivity().findViewById(R.id.h4);
                    myim.setImageResource(R.drawable.ekalp);
                }else{
                    Player.getInstance().setLife(4);
                    trueans = 0;
                    memBoardSelectionFragment game1 = new memBoardSelectionFragment();
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
        int ref;
        if (k==0)ref = id0;
        else if (k==1) ref = id1;
        else if (k==2) ref = id2;
        else if (k==3) ref = id3;
        else if (k==4) ref = id4;
        else if (k==5) ref = id5;
        else if (k==6) ref = id6;
        else if (k==7) ref = id7;
        else if (k==8) ref = id8;
        else if (k==9) ref = id9;
        else if (k==10) ref = id10;
        else if (k==11) ref = id11;
        else if (k==12) ref = id12;
        else if (k==13) ref = id13;
        else if (k==14) ref = id14;
        else if (k==15) ref = id15;
        else if (k==16) ref = id0;
        else ref = 0;

        int myid = flagHolder.getInstance().getFlag(ref);
        final ImageView image1 = (ImageView) getActivity().findViewById(id);
        image1.setImageResource(myid);
    }

    public void closeAll(){
        final ImageView im1 = (ImageView) getActivity().findViewById(R.id.f11);
        final ImageView im2 = (ImageView) getActivity().findViewById(R.id.f12);
        final ImageView im3 = (ImageView) getActivity().findViewById(R.id.f13);
        final ImageView im4 = (ImageView) getActivity().findViewById(R.id.f14);
        final ImageView im5 = (ImageView) getActivity().findViewById(R.id.f21);
        final ImageView im6 = (ImageView) getActivity().findViewById(R.id.f22);
        final ImageView im7 = (ImageView) getActivity().findViewById(R.id.f23);
        final ImageView im8 = (ImageView) getActivity().findViewById(R.id.f24);
        final ImageView im9 = (ImageView) getActivity().findViewById(R.id.f31);
        final ImageView im10 = (ImageView) getActivity().findViewById(R.id.f32);
        final ImageView im11 = (ImageView) getActivity().findViewById(R.id.f33);
        final ImageView im12 = (ImageView) getActivity().findViewById(R.id.f34);
        final ImageView im13 = (ImageView) getActivity().findViewById(R.id.f41);
        final ImageView im14 = (ImageView) getActivity().findViewById(R.id.f42);
        final ImageView im15 = (ImageView) getActivity().findViewById(R.id.f43);
        final ImageView im16 = (ImageView) getActivity().findViewById(R.id.f44);
        if (ac0 == 0) im1.setImageResource(R.drawable.card);
        if (ac1 == 0) im2.setImageResource(R.drawable.card);
        if (ac2 == 0) im3.setImageResource(R.drawable.card);
        if (ac3 == 0)im4.setImageResource(R.drawable.card);
        if (ac4 == 0)im5.setImageResource(R.drawable.card);
        if (ac5 == 0)im6.setImageResource(R.drawable.card);
        if (ac6 == 0)im7.setImageResource(R.drawable.card);
        if (ac7 == 0)im8.setImageResource(R.drawable.card);
        if (ac8 == 0)im9.setImageResource(R.drawable.card);
        if (ac9 == 0)im10.setImageResource(R.drawable.card);
        if (ac10 == 0)im11.setImageResource(R.drawable.card);
        if (ac11 == 0)im12.setImageResource(R.drawable.card);
        if (ac12 == 0)im13.setImageResource(R.drawable.card);
        if (ac13 == 0)im14.setImageResource(R.drawable.card);
        if (ac14 == 0)im15.setImageResource(R.drawable.card);
        if (ac15 == 0)im16.setImageResource(R.drawable.card);
    }

    private void updatePoint(boolean k){
            System.out.println("list members are " + holder0 + "and" + holder1);
            if (holder0 == holder1){
                int alala = Player.getInstance().getPlayerScore();
                if (k){
                    alala = alala + 100;
                        if (holderPic0 == 0) ac0 = 1;
                        if (holderPic0 == 1) ac1 = 1;
                        if (holderPic0 == 2) ac2 = 1;
                        if (holderPic0 == 3) ac3 = 1;
                        if (holderPic0 == 4) ac4 = 1;
                        if (holderPic0 == 5) ac5 = 1;
                        if (holderPic0 == 6) ac6 = 1;
                        if (holderPic0 == 7) ac7 = 1;
                        if (holderPic0 == 8) ac8 = 1;
                        if (holderPic0 == 9) ac9 = 1;
                        if (holderPic0 == 10) ac10 = 1;
                        if (holderPic0 == 11) ac11 = 1;
                        if (holderPic0 == 12) ac12 = 1;
                        if (holderPic0 == 13) ac13 = 1;
                        if (holderPic0 == 14) ac14 = 1;
                        if (holderPic0 == 15) ac15 = 1;
                        if (holderPic1 == 0) ac0 = 1;
                        if (holderPic1 == 1) ac1 = 1;
                        if (holderPic1 == 2) ac2 = 1;
                        if (holderPic1 == 3) ac3 = 1;
                        if (holderPic1 == 4) ac4 = 1;
                        if (holderPic1 == 5) ac5 = 1;
                        if (holderPic1 == 6) ac6 = 1;
                        if (holderPic1 == 7) ac7 = 1;
                        if (holderPic1 == 8) ac8 = 1;
                        if (holderPic1 == 9) ac9 = 1;
                        if (holderPic1 == 10) ac10 = 1;
                        if (holderPic1 == 11) ac11 = 1;
                        if (holderPic1 == 12) ac12 = 1;
                        if (holderPic1 == 13) ac13 = 1;
                        if (holderPic1 == 14) ac14 = 1;
                        if (holderPic1 == 15) ac15 = 1;

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



























