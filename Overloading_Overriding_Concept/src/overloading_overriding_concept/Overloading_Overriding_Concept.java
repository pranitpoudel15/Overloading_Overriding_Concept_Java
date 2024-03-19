/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading_overriding_concept;

/**
 *
 * @author pranitpoudel
 */
public class Overloading_Overriding_Concept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // execution of method overloading 
        Overloading o = new Overloading();
        System.out.print("First sum : " + o.add(5, 10));
        System.out.print("Second sum : " + o.add(5, 10 , 15));
        
        // execution of method overriding
        Animal animal1 = new Dog(); 
        Animal animal2 = new Cat(); 
        
        // Method call to sound method of Dog class
        animal1.sound(); // Output will be "Dog barks"
        
        // Method call to sound method of Cat class
        animal2.sound(); // Output will be "Cat meows"
    }    
}

// method overloading example 

 class Overloading{
     public int add ( int a, int b){
         return  a+ b;
     }
     public int add ( int a, int b, int c){
         return  a+ b + c;
     }
}

// method overriding example

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Overriding the sound method of the parent class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass inheriting from Animal
class Cat extends Animal {
    // Overriding the sound method of the parent class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}