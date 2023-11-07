package com.campusdual.Animal;

/* Animal
Mamífero
Perro -> Balto
Caballo -> Spirit
Ave
Halcón -> ???
Pollo -> Calimero
Pez
Delfín -> Flipper
Orca -> Willy

Animal -> Altura / Peso / Edad
Mamífero, Ave, Pez -> Características únicas de estos animales -> Habitat + 2 características
Perro, Caballo, Halcón, Pollo, Delfín, Orca -> Nombre cientifico, Nombre del animal, Territorio donde viven, Sonido del animal

Presentarse -> ONOMATOPEYA DEL SONIDO ("NOMBRE DEL ANIMAL")
*/
public class Animal {
    //PROPIEDADES

    protected String nameCientifico;

    protected String name;
    protected String territorio;
    protected double altura;
    protected double peso;
    protected int edad;


    public Animal(String nameCientifico, String name, String territorio, double altura, double peso, int edad){
        this.altura=altura;
        this.peso=peso;
        this.edad=edad;
        this.nameCientifico=nameCientifico;
        this.name=name;
        this.territorio=territorio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNameCientifico() {
        return nameCientifico;
    }

    public void setNameCientifico(String nameCientifico) {
        this.nameCientifico = nameCientifico;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public void getDetails(){
        System.out.println("El nombre cientifico de este animale es "+ this.getNameCientifico()+", su nombre es "+this.getName()+" y su territorio es "+this.getTerritorio());
        System.out.println("La altura es de "+this.getAltura()+" cm"+", el peso es "+this.getPeso()+" kg"+" y su edad es "+this.getEdad()+" años");
    }
}
