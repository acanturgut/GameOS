package com.example.canta.project2;


public class Player {
    private static Player ourInstance = new Player();

    public static Player getInstance() {
        return ourInstance;
    }

    private static int playerScore = 0;
    private static int life = 4;
    public static int getLife() {
        return life;
    }

    public static void setLife(int life) {
        Player.life = life;
    }


    private static String playerName = "Enter Your Name";
    private static Player player = new Player();

    private Player() {}


    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        Player.playerName = playerName;
    }

    public static int getPlayerScore() {
        return playerScore;
    }

    public static void setPlayerScore(int playerScore) {
        Player.playerScore = playerScore;
    }
}
