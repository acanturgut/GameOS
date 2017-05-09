package com.example.canta.project2;

/**
 * Created by a_tur on 2/25/2017.
 */
public class QuestionDataSet {


    public static String q1_sport = "How many periods in basketball match and how many minutes per preiod?-2 Periyot 5 dk-2 Periyot 10 dk-3 Periyot 10 dk-4 Periyot 10 dk";
    public static String q2_sport = "Which team won UEFA Champion in 2000?-Kayserispor-Beşiktaş-Fenerbahçe-Galatasaray";
    public static String q3_sport = "What does Alpinism mean?-Sailing-Wrestling-Camping-Mountaineering";
    public static String q4_sport = "How many referees can manage the basketball game?-6-5-4-3";
    public static String q5_sport = "Which national team won the 2006 World Cup?-Turkey-Swiss-French-Italy";

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
