package com.campusdual.Animal;

public class Pez extends Animal{
    private boolean carnivoro;
    public Pez(String nameCientifico, String name, String territorio, double altura, double peso, int edad, boolean carnivoro) {
        super(nameCientifico, name, territorio, altura, peso, edad);
        this.carnivoro=carnivoro;
    }

    public boolean isCarnivoro() {

        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {

        this.carnivoro = carnivoro;
    }
}
