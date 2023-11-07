package com.campusdual.Animal;

public class Mamifero extends Animal{

    private String colourPelo;

    public Mamifero(String nameCientifico, String name, String territorio,double altura, double peso, int edad, String colourPelo) {
        super(nameCientifico, name, territorio, altura, peso, edad);
        this.colourPelo=colourPelo;
    }

    public String getColourPelo() {
        return colourPelo;
    }

    public void setColourPelo(String colourPelo) {
        this.colourPelo = colourPelo;
    }
}
