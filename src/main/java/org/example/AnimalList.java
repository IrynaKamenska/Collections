package org.example;


public class AnimalList {
     AnimalListItem head;



    public void add(Animal value){
        //create new node
        AnimalListItem node = new AnimalListItem();
        node.value = value;
        node.next = null;

        if(head == null){
            head = node;
        } else {
            AnimalListItem n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void addAtStart(Animal value) {
        //create new node
        AnimalListItem node = new AnimalListItem();
        node.value = value;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void addAt(int index, Animal value) {
        //create new node
        AnimalListItem node = new AnimalListItem();
        node.value = value;
        node.next = null;

        if(index == 0){
            addAtStart(value);
        }

        AnimalListItem n = head;
        for (int i = 0; i < index -1 ; i++) {
                n = n.next;
        }
        node.next = n.next;
        n.next = node;

    }


        public void removeByIndex(int index){
            if(index == 0){
                head = head.next;
            } else {
                AnimalListItem n = head;
                AnimalListItem n1 = null;
                for (int i = 0; i < index-1; i++) {
                    n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;
                System.out.println("delete" + n1.value);
            }

    }

    public void show(){
        AnimalListItem node = head;
        while (node.next != null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println(node.value);
    }

}
