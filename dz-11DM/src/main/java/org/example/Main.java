package org.example;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("John", "Doe", 66, true);
        Woman woman = new Woman("Jane", "Smith", 61, true);

        // Display initial info
        System.out.println("--- Initial Information ---");
        man.displayInfo();
        woman.displayInfo();
        System.out.println();

        // Register partnership
        man.registerPartnership(woman);
        System.out.println("--- After Registering Partnership ---");
        man.displayInfo();
        woman.displayInfo();
        System.out.println();

        // Deregister partnership
        man.deregisterPartnership(true);
        System.out.println("--- After Deregistering Partnership ---");
        man.displayInfo();
        woman.displayInfo();
    }
}