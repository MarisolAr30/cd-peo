package com.campusdual.Animal;

public class Ave extends Animal{
    private boolean vuelan;
    public Ave(String nameCientifico, String name, String territorio,double altura, double peso, int edad, boolean vuelan) {
        super(nameCientifico, name, territorio, altura, peso, edad);
        this.vuelan=vuelan;
    }

    public void isVuelan(boolean puedeVolar) {
        if (puedeVolar=true) {
            System.out.println("El ave puede volar");
        } else {
            System.out.println("El ave no puede volar");
        }
        this.vuelan = puedeVolar;
    }

    public void setColour(boolean vuelan) {
        this.vuelan = vuelan;
    }
}
