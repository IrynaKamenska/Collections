package org.example;

import java.util.LinkedList;
import java.util.List;

public class AnimalList {
    protected AnimalListItem head;


    public void add(Animal value) {
        AnimalListItem current = head;
        int count = 1;
        while (count < count - 1) {
            count++;
            current = current.next;
        }
        AnimalListItem newItem = new AnimalListItem(value);
        newItem.next = current.next;
        current.next = newItem;

    }


    public void delete(int pos, Animal animal) {
        AnimalListItem current = head;
        AnimalListItem prev = null;
        int count = 1;
        while (count < pos) {
            count++;
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        // return current.value;
    }



    @Override
    public String toString() {
        return "AnimalList{" +
                "head=" + head +
                '}';
    }
}
