package com.example.canta.project2;

/**
 * Created by a_tur on 2/25/2017.
 */
public class QuestionDataSet {
    public static String q1_sport = "a-a-a-a-a";
    public static String q2_sport = "a-a-a-a-a";
    public static String q3_sport = "a-a-a-a-a";
    public static String q4_sport = "a-a-a-a-a";
    public static String q5_sport = "a-a-a-a-a";

    public static String q1_math = "7 ile 8'in çarpımının 6 eksiği olan sayı hangisinin iki katıdır?-5-35-10-25";
    public static String q2_math = "İki işçi bir işi 10 günde yaparsa bir işçi aynı işi kaç günde yapar?-5-10-15-20";
    public static String q3_math = "15 elma 10 armut olan bir torbadan armut çekme olasılığı kaçtır?-%25-%30-%35-%40";
    public static String q4_math = "Bir üçgenin bir kenarı 6cm, diğer kenarı 8cm ise diğer kenarı hangisi olamaz?-8-10-12-14";
    public static String q5_math = "1 ayakkabı üretmesi 30 dk süren ayakkabıcı 3 saatte kaç ayakkabı üretir?-4-5-7-6";

    public static String q1_hist = "What did the letters of the former communist country U.S.S.R. stand for?-United Soviet Socialist Republics-United Socialist Soviets Republic- Union of Socialist Soviet Republic-Union of Soviet Socialist Republics";
    public static String q2_hist = "In what year did Fidel Castro die?-1996-2004-2014-2016";
    public static String q3_hist = "Brazil was once a colony of which European country?-Germany-Turkey-Greece-Portugal";
    public static String q4_hist = "Napoleon suffered defeat at Waterloo in what year?-1765-1795-1803-1815";
    public static String q5_hist = "What does the \"B\" stand for in Lyndon B. Johnson?-Bernard-Barney-Bareteon-Baines";

    public static void setQ1_sport(String q1_sport) {
        QuestionDataSet.q1_sport = q1_sport;
    }

    public static void setQ2_sport(String q2_sport) {
        QuestionDataSet.q2_sport = q2_sport;
    }

    public static void setQ3_sport(String q3_sport) {
        QuestionDataSet.q3_sport = q3_sport;
    }

    public static void setQ4_sport(String q4_sport) {
        QuestionDataSet.q4_sport = q4_sport;
    }

    public static void setQ5_sport(String q5_sport) {
        QuestionDataSet.q5_sport = q5_sport;
    }

    public static void setQ1_math(String q1_math) {
        QuestionDataSet.q1_math = q1_math;
    }

    public static void setQ2_math(String q2_math) {
        QuestionDataSet.q2_math = q2_math;
    }

    public static void setQ3_math(String q3_math) {
        QuestionDataSet.q3_math = q3_math;
    }

    public static void setQ4_math(String q4_math) {
        QuestionDataSet.q4_math = q4_math;
    }

    public static void setQ5_math(String q5_math) {
        QuestionDataSet.q5_math = q5_math;
    }

    public static void setQ1_hist(String q1_hist) {
        QuestionDataSet.q1_hist = q1_hist;
    }

    public static void setQ2_hist(String q2_hist) {
        QuestionDataSet.q2_hist = q2_hist;
    }

    public static void setQ3_hist(String q3_hist) {
        QuestionDataSet.q3_hist = q3_hist;
    }

    public static void setQ4_hist(String q4_hist) {
        QuestionDataSet.q4_hist = q4_hist;
    }

    public static void setQ5_hist(String q5_hist) {
        QuestionDataSet.q5_hist = q5_hist;
    }

    private static QuestionDataSet ourInstance = new QuestionDataSet();

    public static QuestionDataSet getInstance() {
        return ourInstance;
    }

    private QuestionDataSet() {}

    public static String getQ1_sport() {
        return q1_sport;
    }

    public static String getQ2_sport() {
        return q2_sport;
    }

    public static String getQ3_sport() {
        return q3_sport;
    }

    public static String getQ4_sport() {
        return q4_sport;
    }

    public static String getQ5_sport() {
        return q5_sport;
    }

    public static String getQ1_math() {
        return q1_math;
    }

    public static String getQ2_math() {
        return q2_math;
    }

    public static String getQ3_math() {
        return q3_math;
    }

    public static String getQ4_math() {
        return q4_math;
    }

    public static String getQ5_math() {
        return q5_math;
    }

    public static String getQ1_hist() {
        return q1_hist;
    }

    public static String getQ2_hist() {
        return q2_hist;
    }

    public static String getQ3_hist() {
        return q3_hist;
    }

    public static String getQ4_hist() {
        return q4_hist;
    }

    public static String getQ5_hist() {
        return q5_hist;
    }
}
