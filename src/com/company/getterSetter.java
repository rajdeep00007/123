package com.company;

import java.util.*;

class student{
    int id;
    String firstName;
    String lastName;
    double percentage;
    String location;

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setPercentage(double percentage) {
//        this.percentage = percentage;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }


    public void setData(int id,String firstName,String lastName,double percentage,String location) {
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.percentage=percentage;
        this.location = location;
    }

    public void print(){
        System.out.println(id + " | " + firstName + " | " + lastName + " | " + percentage + " | " + location);
    }

}
public class getterSetter {
    public static void main(String[] args) {
        student st = new student();
        st.id=44;
        st.firstName="nuehekw";
        st.lastName="dhew";
        st.percentage=90.77;
        st.location="cuba";

        student st1 = new student();
        st1.id = 43;
        st1.firstName ="dijeu";
        st1.lastName = "snqenc";
        st1.percentage =80.88;
        st1.location="newyork";

        student st2 = new student();
        st2.setData(42,"rajdeep","khachar",99.99,"Rajkot");

        st2.print();
//        st.print();
//        st1.print();

    }

}