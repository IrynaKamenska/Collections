package org.example;

import java.util.LinkedList;
import java.util.List;
// tutorial: https://www.worldofitech.com/java-programming-linkedlist/#Example_Create_LinkedList_in_Java

public class Main {
    public static void main(String[] args) {
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


        Animal animal1 = new Animal("cow");
        Animal animal2 = new Animal("dog");
        Animal animal3 = new Animal("cat");


        AnimalListItem listItem1 = new AnimalListItem(animal1);
        AnimalListItem listItem2 = new AnimalListItem(animal2);
        AnimalListItem listItem3 = new AnimalListItem(animal3);

        AnimalList list = new AnimalList();
        list.add(animal1);



    }
}