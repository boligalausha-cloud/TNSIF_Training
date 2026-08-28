package org.tnsif.acc.c2tc.java;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class - Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleLevelInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from parent
        d.bark(); // from child
    }
}
