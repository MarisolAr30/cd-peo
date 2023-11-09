package com.campusdual.exerccise20;

import com.campusdual.exercise14.Doctor;
import com.campusdual.exercise14.Person;
import com.campusdual.exercise14.PoliceOfficer;
import com.campusdual.exercise14.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {
    public static void main(String[] args) {

        List<Person> stringList = new ArrayList<>();

        stringList.add(new Person("Pedro", "Delgado"));
        stringList.add(new Teacher("Maria", "Montessori", "Educaión"));
        stringList.add(new PoliceOfficer("Jack", "Peralta", "B-99"));
        stringList.add(new Doctor("Gregory", "House","Netrologia"));

    }
}
