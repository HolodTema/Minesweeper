package com.terabyte.minesweeper.repository;

public class GameSessionHelper {
    private static GameSessionHelper instance = null;

    public static GameSessionHelper getInstance() {
        if (instance == null) {
            instance = new GameSessionHelper();
        }
        return instance;
    }
}

