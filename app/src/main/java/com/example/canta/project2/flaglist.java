package com.example.canta.project2;

        import java.util.Random;
        import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by canta on 3/31/2017.
 */
public class flaglist {
    private static flaglist ourInstance = new flaglist();
    public static flaglist getInstance() {
        return ourInstance;
    }
    public static int flag_List[] = new int[16];
    public static int flag_List2[] = new int[25];
    public static int flag_List3[] = new int[36];
    public static int getTarget1() {
        return target1;
    }
    public static int getTarget2() {
        return target2;
    }
    public static int getTarget3() {
        return target3;
    }
    public static int getTarget4() {
        return target4;
    }
    public static int getTarget21() {
        return target21;
    }
    public static int getTarget22() {
        return target22;
    }
    public static int getTarget23() {
        return target23;
    }
    public static int getTarget24() {
        return target24;
    }
    public static int getTarget25() {return target25; }
    public static int getTarget31() {
        return target31;
    }
    public static int getTarget32() {
        return target32;
    }
    public static int getTarget33() {
        return target33;
    }
    public static int getTarget34() {
        return target34;
    }
    public static int getTarget35() {
        return target35;
    }
    public static int getTarget36() {
        return target36;
    }
    public static int target1;
    public static int target2;
    public static int target3;
    public static int target4;
    public static int target21;
    public static int target22;
    public static int target23;
    public static int target24;
    public static int target25;
    public static int target31;
    public static int target32;
    public static int target33;
    public static int target34;
    public static int target35;
    public static int target36;
    private flaglist() {    }

    public static int[] getQuestionList() {
        boolean control;
        flag_List[0]=0;
        flag_List[1]=1;
        for(int i1 = 0; i1 <  12; i1++) {
            control = true;
            flag_List[i1] = (int) (Math.random() * 220 + 1);
            for(int i2 = 0; i2 < i1; i2++) {
                if (flag_List[i2] == flag_List[i1]){
                    control = false;
                }
            }
            if (control == false){
                i1 = i1 - 1;
            }
        }

        target1 = flag_List[0];
        target2 = flag_List[1];
        target3 = flag_List[2];
        target4 = flag_List[3];
        flag_List[12] = target1;
        flag_List[13] = target2;
        flag_List[14] = target3;
        flag_List[15] = target4;

        int index, temp;
        Random random = new Random();
        for (int i = flag_List.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = flag_List[index];
            flag_List[index] = flag_List[i];
            flag_List[i] = temp;
        }
        for (int k = 0; k < flag_List.length ; k++){
            System.out.print(flag_List[k] + "  ");
        }
        return flag_List;
    }







    public static int[] getQuestionList2() {
        boolean control;
        flag_List2[0]=0;
        flag_List2[1]=1;
        for(int i1 = 0; i1 <  20; i1++) {
            control = true;
            flag_List2[i1] = (int) (Math.random() * 220 + 1);
            for(int i2 = 0; i2 < i1; i2++) {
                if (flag_List2[i2] == flag_List2[i1]){
                    control = false;
                }
            }
            if (control == false){
                i1 = i1 - 1;
            }
        }

        target21 = flag_List2[0];
        target22 = flag_List2[1];
        target23 = flag_List2[2];
        target24 = flag_List2[3];
        target25 = flag_List2[4];
        flag_List2[20] = target25;
        flag_List2[21] = target21;
        flag_List2[22] = target22;
        flag_List2[23] = target23;
        flag_List2[24] = target24;

        int index, temp;
        Random random = new Random();
        for (int i = flag_List2.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = flag_List2[index];
            flag_List2[index] = flag_List2[i];
            flag_List2[i] = temp;
        }
        for (int k = 0; k < flag_List2.length ; k++){
            System.out.print(k + ": " + flag_List2[k] + " - ");
        }
        return flag_List2;
    }






    public static int[] getQuestionList3() {
        boolean control;
        flag_List3[0]=0;
        flag_List3[1]=1;
        for(int i1 = 0; i1 <  32; i1++) {
            control = true;
            flag_List3[i1] = (int) (Math.random() * 220 + 1);
            for(int i2 = 0; i2 < i1; i2++) {
                if (flag_List3[i2] == flag_List3[i1]){
                    control = false;
                }
            }
            if (control == false){
                i1 = i1 - 1;
            }
        }

        target31 = flag_List3[0];
        target32 = flag_List3[1];
        target33 = flag_List3[2];
        target34 = flag_List3[3];
        target35 = flag_List3[4];
        target36 = flag_List3[5];
        flag_List3[30] = target36;
        flag_List3[31] = target35;
        flag_List3[32] = target31;
        flag_List3[33] = target32;
        flag_List3[34] = target33;
        flag_List3[35] = target34;

        int index, temp;
        Random random = new Random();
        for (int i = flag_List3.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = flag_List3[index];
            flag_List3[index] = flag_List3[i];
            flag_List3[i] = temp;
        }
        for (int k = 0; k < flag_List3.length ; k++){
            System.out.print(flag_List3[k] + "  ");
        }
        return flag_List3;
    }
}




