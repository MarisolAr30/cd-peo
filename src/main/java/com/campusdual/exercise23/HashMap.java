package com.campusdual.exercise23;

import com.campusdual.exercise14.Doctor;
import com.campusdual.exercise14.Person;
import com.campusdual.exercise14.PoliceOfficer;
import com.campusdual.exercise14.Teacher;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<String, Person> customMap = new HashMap<>();

        customMap.put("person", new Person("John", "Smith"));
        customMap.put("teacher", new Teacher("Maria", "Montessori","Educación"));
        customMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        customMap.put("doctor", new Doctor("Gregory", "House", "Nefoloxia e infectoloxia"));

        customMap.get("teacher").getDetails();
        customMap.remove("teacher");

        System.out.println("Contén a clave \"police\": " + customMap.containsKey("police"));
        System.out.println("Contén a clave \"teacher\": " + customMap.containsKey("teacher"));

        customMap.put("police", new PoliceOfficer("Charles", "Boyle", "b-99"));
        System.out.println("Contén a clave \"police\": "+customMap.containsKey("police"));
        customMap.get("police").getDetails();
    }
}
