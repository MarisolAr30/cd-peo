package com.campusdual.Animal;

public class Sandboc {
    public static void main(String[] args) {
        Mamifero m1= new Mamifero("perro","Balto","Alaska",60,35,3, "Marrón");
        Mamifero m2= new Mamifero("caballo","Spirit","Texas",1.5,450,10,"Blanco");
        Ave a1= new Ave("halcon","Felix","España",40, 1,8,true);
        Ave a2= new Ave("pollo","Calimero","Galicia",35,1.15,5, false);
        Pez p1= new Pez("delfín","Flipper","Oceano Atlantico",1.7,80,25, true);
        Pez p2= new Pez("orca", "Willy", "Oceano Pacifico", 2.7,3000, 35, true);
        m1.getDetails();
        m2.getDetails();
        a1.getDetails();
        a2.getDetails();
        p1.getDetails();
        p2.getDetails();
    }


}
