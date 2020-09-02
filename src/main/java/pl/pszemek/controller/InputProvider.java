package pl.pszemek.controller;

import java.util.Scanner;

public class InputProvider {
    private static final Scanner INSTANCE = new Scanner(System.in);

    private InputProvider() {
    }

    public static Scanner getInstance(){
        return INSTANCE;
    }
}
