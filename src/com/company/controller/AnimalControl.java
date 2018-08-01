package com.company.controller;

import com.company.model.Animal;

import java.util.Scanner;

public class AnimalControl {

    public int j;
    public void spausdinam() {
        Scanner sc = new Scanner(System.in);
        AnimalModel.getInstance();
        int i = sc.nextInt() - 1;
        j=i;
        AnimalModel.gyvunas(i);

    }
    public void keiciam(){

        Scanner sc=new Scanner(System.in);
        String keiciam=sc.next();

        AnimalModel.gyvunas(keiciam,j);
    }

}
