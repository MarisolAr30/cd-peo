package com.campusdual;

import com.campusdual.exercise14.Persona;
import com.campusdual.exercise14.Teacher;

public class Sandbox {
    public static void main(String[] args) {
        Persona p1= new Persona("John","Doe");
        Persona t1= new Teacher("John","Doe", "Educacion");
        p1.getDetails();
    }
}