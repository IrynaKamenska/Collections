package org.example;

public class AnimalListItem {
     Animal value;
     AnimalListItem next;

     public Animal getValue() {
          return value;
     }

     public void setValue(Animal value) {
          this.value = value;
     }

     public AnimalListItem getNext() {
          return next;
     }

     public void setNext(AnimalListItem next) {
          this.next = next;
     }
}

