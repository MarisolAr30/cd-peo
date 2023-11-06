package com.campusdual.exercise14;

public class Persona {

    protected String name;
    protected String surname;

    public Persona (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getname(){
        return this.name;
    }
    public String getsurname(){
        return this.surname;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public void getDetails(){
        System.out.println("Nombre completo es "+this.getname()+" "+this.getsurname());
    }

}
