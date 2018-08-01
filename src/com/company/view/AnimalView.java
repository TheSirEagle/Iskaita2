package com.company.view;

import java.util.Scanner;

public class AnimalView {
    public void choose() {
        System.out.println("Pasirinkite gyvuno nr.: 1 - suo, 2 - kate, 3 - paukstis, 4 - voras");
    }

    public void move() {
        System.out.println("Ar norite pakeisti judejima?");
        System.out.println("y/n");
        Scanner sc = new Scanner(System.in);
        String at = sc.nextLine();
        if (at.equals("n")) {
            System.exit(0);
        }
        System.out.println("Kokio judejimo norit?  walks/crawls/flies");
    }
}
