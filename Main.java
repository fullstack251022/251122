import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    //targil: create Airplane class, it should have attributes
    // capacity, size, type, maxSpeed
    // fill all attributes with the help of constructor

//        Scanner scanner = new Scanner(System.in);

        Airplane a1 = new Airplane("Airbus",300,120,800, 1600);
        a1.printCurrentSpeed();
        a1.accelerate(200);
        a1.printCurrentSpeed();
        a1.accelerate(200);
        a1.printCurrentSpeed();
        a1.deAccelerate(300);
        a1.printCurrentSpeed();
        a1.deAccelerate(600);
        a1.printCurrentSpeed();
        a1.accelerate(200);
        a1.printCurrentSpeed();
        a1.accelerate(800);
        a1.printCurrentSpeed();
        a1.accelerate(800);
        a1.printCurrentSpeed();



//        Airplane a2 = new Airplane("Boeing",350,180,1100);
//        Airplane a3 = new Airplane();
//
//        a1.printCurrentSpeed();
//        a1.printType();
//        a2.printCurrentSpeed();
//        a2.printType();



//        Smartphone s1 = new Smartphone("Iphone","13pro",6.2f,"Oled",124,2021);
//        Smartphone s2 = new Smartphone("Samsung","s22",6.6f,"amoLed",300,2022);
//        Smartphone s3 = new Smartphone("Xiaomi","xx22",20.0f,"qled",312,2023);

//        System.out.println(s1.cameraPixels);

//        System.out.println(s3.screenSize);

//        System.out.println(s1.type);
//        System.out.println(s1.model);
//        System.out.println(s1.cameraPixels);


//        Smartphone s2 = new Smartphone("Samsung");

//        System.out.println(s1.type);
//        System.out.println(s2.type);

//        Person p1 = new Person();
//        Person p2 = new Person();
//        Person p3 = new Person();
//
//        p1.firstName = "Sarah";
//        p1.lastName = "Conor";
//        p1.age = 38;
//
//        p2.firstName = "Ryu";
//        p2.lastName = "Tatsumaki";
//        p2.age = 28;
//
//        p3.firstName = "Itay";
//        p3.lastName = "Zilberman";
//        p3.age = 30;
//
//
//        p1.printMyFullName("hello");
//        p1.printMyFullName();
//        p2.printMyFullName();
//        p3.printMyFullName();
//
//        p3.printAllAtributes();


//        p1.printMyName();
//        p2.printMyName();
//        p3.printMyName();


//
//        System.out.println("first name: "+p1.firstName+", Last name: "+p1.lastName+ ", age: "+p1.age);
//        System.out.println("first name: "+p2.firstName+", Last name: "+p2.lastName+ ", age: "+p2.age);


//        int number = 5;
//
//        Animal animalOne = new Animal();
//        Animal animalTwo = new Animal();
//        Animal animalThree = new Animal();
//
//
//        animalOne.type = "Cat";
//        animalOne.weight = 6.5f;
//        animalOne.age = 2;
//        animalOne.color = "white";
//
//        animalTwo.type = "Dog";
//        animalTwo.color = "grey";
//        animalTwo.age = 8;
//        animalTwo.weight = 12f;
//
//        animalThree.type = "wolf";
//        animalThree.weight = 30;
//
//        System.out.println("Animal type: " + animalOne.type);
//        System.out.println("animal Type: " + animalTwo.type);
//        System.out.println("dog color: " + animalTwo.color);
//        System.out.println("dog weight: " + animalTwo.weight);
//        System.out.println("Animal type: " + animalThree.type);
//        System.out.println("wolf weight " + animalThree.weight);
    }
}
