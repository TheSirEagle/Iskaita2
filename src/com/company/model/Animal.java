package com.company.model;

public class Animal {

    String category;
    String family;
    String name;
    float weight;
    float height;

    private String movement;


public Animal (String category, String family, String name, float weight, float height, String movement) {
    this.category = category;
    this.family = family;
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.movement = movement;

}


    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getFamily() { return family; }
    public void setFamily(String category) { this.family = family; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public String getMovement() { return movement; }
    public void setMovement(String movement) { this.movement = movement; }



}
