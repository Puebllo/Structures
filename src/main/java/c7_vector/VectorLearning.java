package c7_vector;

import java.util.Vector;

public class VectorLearning {

    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>(5,15);
        System.out.println("Capactity= " + stringVector.capacity());

        stringVector.add("Joe");
        stringVector.add("Alex");
        stringVector.add("Will");
        stringVector.add("Russel");
        stringVector.add("Wario");

        System.out.println("Size = " + stringVector.size());
        System.out.println("Elements = " + stringVector.toString());
        System.out.println("Capactity= " + stringVector.capacity());

        stringVector.add("Peach");
        stringVector.add("Bowser");
        stringVector.add("Gumba");
        stringVector.add("Mario");
        stringVector.add("Kirby");
        stringVector.add("John");

        System.out.println("Size = " + stringVector.size());
        System.out.println("Elements = " + stringVector.toString());
        System.out.println("Capactity= " + stringVector.capacity());

        stringVector.add("Paul");
        stringVector.add("Luigi");

        stringVector.add("Joe");
        stringVector.add("Alex");
        stringVector.add("Will");
        stringVector.add("Russel");
        stringVector.add("Wario");

        stringVector.add("Peach");
        stringVector.add("Bowser");
        stringVector.add("Gumba");
        stringVector.add("Mario");
        stringVector.add("Kirby");

        System.out.println("Size = " + stringVector.size());
        System.out.println("Elements = " + stringVector.toString());
        System.out.println("Capactity= " + stringVector.capacity());

        System.out.println("First element =" + stringVector.firstElement());
        System.out.println("Last element = " + stringVector.lastElement());

        System.out.println("Vector shrunk to 20");
        stringVector.setSize(20);
        System.out.println("Size = " + stringVector.size());
        System.out.println("Elements = " + stringVector.toString());
        System.out.println("Capactity= " + stringVector.capacity());
        System.out.println("Vector size has shrunk, but the capacity stay the same as previous");

        System.out.println("Using trimToSize()");
        stringVector.trimToSize();
        System.out.println("Size = " + stringVector.size());
        System.out.println("Elements = " + stringVector.toString());
        System.out.println("Capactity= " + stringVector.capacity());
    }
}
