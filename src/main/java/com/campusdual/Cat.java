package com.campusdual;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Cat {
     /*
 Crea una clase llamada Cat
 La clase debe tener las siguientes propiedades sin inicializar:
 - nombre (name)
 - raza (breed)
 - sexo (sex)
 - edad en meses (age) (estática)
 - tamaño del pelo (hair)
 - color del pelo (colour) (estática)
 - un booleano que indique si está castrado/a o no (castrated)I

 La clase debe tener las siguientes propiedades con los valores inicializados
 - el color de los ojos (eyeColour): "green"

 Crea un constructor que incluya todos los atributos no inicializados

 Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

 Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

 Crea un método no estático que castre a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

 Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de los datos, dale un poco de arte)

 Crea un main()

 Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

 Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

 Cámbiale el color del pelo a los dos primeros gatos

 Cámbiale el color de los ojos al último gato

 Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

 Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

 Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático, getters y setters)
  Verás cómo afecta a los métodos estáticos
*/

    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;
    public String eyeColour = "verde";

    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        Cat.age = age;
        this.hair = hair;
        Cat.colour = colour;
        this.castrated = castrated;
    }

    public String getName (){
        return this.name;
    }
    public String getBreed (){
        return this.breed;
    }
    public String getSex (){
        return this.sex;
    }
    public int getAge (){
        return this.age;
    }
    public void setAge (int age){
        if (this.age > 0) {
            this.age = age;
        }else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public String getHair (){
        return this.hair;
    }
    public String getColour(){
        return this.colour;
    }
    public void setColour(String nuevoColour) {
        colour = nuevoColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void Castrado() {
        this.castrated = true;
    }

    public void isCastrated() {
        if (this.castrated) {
            System.out.println("Esta castrado");
        } else {
            System.out.println("Sin castrar");
        }
    }

    public void catDetails(){
        System.out.println("Detalles del gato ");
        System.out.println("Nombre: " +this.getName());
        System.out.println("Raza: "+this.getBreed());
        System.out.println("Sexo: " +this.getSex());
        System.out.println("Edad: "+this.getAge()+ " años");
        System.out.println("Tamaño Pelo: "+this.getHair());
        System.out.println("Color de pelo: "+this.getColour());
        System.out.println("Color de ojos: "+this.getEyeColour());
        isCastrated();
    }

    public static void main(String[] args) {
        System.out.println("MOSTRAR GATO SIAMES");
        Cat c1= new Cat("Blacky", "Siames", "Hembra", 3, "Largo", "Negro", true);
        c1.catDetails();
        System.out.println("MOSTRAR GATO PERSA");
        Cat c2= new Cat("Felix", "Persa", "Macho", 1, "Largo", "Blanco", true);
        c2.catDetails();
        System.out.println("MOSTRAR GATO ESFINGE");
        Cat c3= new Cat("Pepe", "Esfinge", "Macho", -2, "Sin pelo", " ", false);
        c3.catDetails();
        c3.setEyeColour("azul");
        c3.setAge(-2);

    }

}
