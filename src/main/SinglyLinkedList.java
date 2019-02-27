package main;



import java.util.ArrayList;



public class SinglyLinkedList {



    private Node head = null;

    private int size = 0;



    //  method to add a new node at the head

    public void insert(int value) {

        head = new Node(value, this.head);

        size++;

    }



    //  method to add a new node after a node

    public void insert(int value, Node node) {

        node.next = new Node(value, node.next);

        size++;

    }



    public static void main(String[] args) {



        SinglyLinkedList linkedList = new SinglyLinkedList();



        for (int i = 0; i < 5; i++) {

            linkedList.insert(i + 1);

        }



        Node temp = linkedList.head;

        while (temp != null) {

            if (temp.data == 4) {

                linkedList.insert(42, temp);

                break;

            }

            temp = temp.next;

        }



        System.out.println(linkedList);



    }



    private static class Node {



        private int data;

        private Node next;

        private Node(int data, Node next) {

            this.data = data;

            this.next = next;

        }



        public Node(int data) {

            this.data = data;

            this.next = null;

        }



    }



    @Override

    public String toString() {

        StringBuilder result = new StringBuilder();



        result.append("[");



        Node temp = this.head;



        while (temp != null) {

            result.append(temp.data);

            if (temp.next != null) {

                result.append(" ==> ");

            }

            temp = temp.next;

        }



        result.append("]");



        return result.toString();

    }

}