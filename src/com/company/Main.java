package com.company;

import com.company.controller.AnimalControl;
import com.company.controller.AnimalModel;
import com.company.view.AnimalView;

public class Main {

    public static void main(String[] args) {

        AnimalModel.getInstance();
        AnimalView obj=new AnimalView();
        obj.choose();
        AnimalControl obj1=new AnimalControl();
        obj1.spausdinam();
        obj.move();
        obj1.keiciam();

    }
}
