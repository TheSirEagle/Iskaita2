package com.company.controller;

import com.company.model.Animal;
import com.company.model.Gyvunai.Bird;
import com.company.model.Gyvunai.Cat;
import com.company.model.Gyvunai.Dog;
import com.company.model.Gyvunai.Spider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalModel {

    static ArrayList<Animal> arrList = new ArrayList<>();

    public void readData() {
        FileReader reader = null;
        try {
            reader = new FileReader("duomenys.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            String category = sc.next();
            String family = sc.next();
            String name = sc.next();
            float weight = sc.nextFloat();
            float height = sc.nextFloat();
            String movement = sc.next();

            arrList.add(this.buildAnimal(category, family, name, weight, height, movement));


        }

        try {
            reader.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private AnimalModel(){
        readData();
    }
    public static AnimalModel getInstance() {
        if(instance == null){
            instance = new AnimalModel();
        }
        return instance;
    }


    public Animal buildAnimal(String category, String family, String name, float weight, float height, String movement) {
        Animal result = null;
        switch (category) {
            case "cat":
                result = new Cat(category, family, name, weight, height, movement);
            break;
            case "dog":
                result = new Dog(category, family, name, weight, height, movement);
            break;
            case "bird":
                result = new Bird(category, family, name, weight, height, movement);
            break;
            case "spider":
                result = new Spider(category, family, name, weight, height, movement);
            break;
        }
        return result;
    }

    public static void gyvunas(int i){


        System.out.print(arrList.get(i).getCategory()+" ");
        System.out.print(arrList.get(i).getFamily()+" ");
        System.out.print(arrList.get(i).getName()+" ");
        System.out.print(arrList.get(i).getWeight()+" ");
        System.out.print(arrList.get(i).getHeight()+" ");
        System.out.println(arrList.get(i).getMovement());
    }
    public static void gyvunas(String keiciam, int j){


        System.out.print(arrList.get(j).getCategory()+" ");
        System.out.print(arrList.get(j).getFamily()+" ");
        System.out.print(arrList.get(j).getName()+" ");
        System.out.print(arrList.get(j).getWeight()+" ");
        System.out.print(arrList.get(j).getHeight()+" ");
        System.out.println(keiciam);
    }



    private static AnimalModel instance;




}
