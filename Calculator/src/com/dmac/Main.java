package com.dmac;

public class Main {

    // This is the main class (hence the name) It is where your program starts. It is always publicly available, it
    // never changes, and it never returns anything.
    public static void main(String[] args) {
       // To start, I must declare an object that is "written" from a class that comes along with this one "a blueprint"
        Home Home = new Home();

        // Now that the object is created, I can refer to it and what's inside it. Home is the object, start() is the
        // method (block of code) that I want to refer to inside of it. This is called object oriented programming.
        // The program must start in this class, but it doesn't necessarily need to stay in this class.
        Home.start();
    }
}
