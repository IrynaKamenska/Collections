package org.example;

import java.util.LinkedList;
// tutorial: https://www.worldofitech.com/java-programming-linkedlist/#Example_Create_LinkedList_in_Java

public class Main {
    public static void main(String[] args) {
        // example record
        Cat cat1 = new Cat("aok", 8);
        System.out.println(cat1.name());
        System.out.println(cat1.age());


        Animal an1 = new Animal("cat");
        Animal an2 = new Animal("dog");
        Animal an3 = new Animal("cow");

        AnimalList list = new AnimalList();
        list.add(an1);
        list.add(an2);
        list.add(an3);

        list.show();

        list.addAtStart(new Animal("pet"));
        list.show();

        list.addAt(1, new Animal("crocodile"));
        list.show();
        list.removeByIndex(1);
        list.show();


        /*
// create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

// add() method with the index parameter
        animals.add(0, "Horse");
        System.out.println("Updated LinkedList: " + animals);


// get the element from the linked list
        String animal = animals.get(1);
        System.out.print("Element at index 1: " + animal);

        // change elements at index 3
        animals.set(3, "pig");
        System.out.println("Updated LinkedList: " + animals);

// remove elements from index 1
        String removedAnimal = animals.remove(1);
        System.out.println("Removed Element: " + removedAnimal);

        System.out.println("Updated LinkedList: " + animals);


// Iterating - using forEach loop
        for (String anim : animals) {
            System.out.print(anim);
            System.out.print(", ");
        }
*/


    }
}