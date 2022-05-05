package main;

import module.BMIAnalyser;
import view.View;

public class Aseesment1B {
    public static void main(String[] args) {
        BMIAnalyser a = new BMIAnalyser();
        View v = new View(a);
        v.commandLoop();

    }
}