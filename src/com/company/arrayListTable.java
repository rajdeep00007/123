package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class arrayListTable {
    public static void main(String[] args) {

        ArrayList<Integer> id = new ArrayList<>();
        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);
        id.add(5);
      //  id.add(6);

        ArrayList<String> name = new ArrayList<>();
        name.add("Rohan");
        name.add("Mohan");
        name.add("Sohan");
        name.add("Seeta");
        name.add("Geeta");

        ArrayList<Double> marks = new ArrayList<>();
        marks.add(99.99);
        marks.add(94.25);
        marks.add(93.18);
        marks.add(97.64);
        marks.add(95.95);

        ArrayList<Integer> rollNo = new ArrayList<>();
        rollNo.add(42);
        rollNo.add(45);
        rollNo.add(85);
        rollNo.add(94);
        rollNo.add(44);

        ArrayList<String> address = new ArrayList<>();
        address.add("Rajkot");
        address.add("Ahmedabad");
        address.add("Baroda");
        address.add("Bhavnagar");
        address.add("Kutch");

        for (int i =0; i< id.size();i++ ) {

           System.out.println(id.get(i) +" | "+ name.get(i) +" | "+ marks.get(i) +" | "+ rollNo.get(i) +" | "+ address.get(i));

        }


    }
}
