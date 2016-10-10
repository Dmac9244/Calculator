package com.dmac;

public class tutorial {
    public void start() {
        // This here is where I make an instance of the "Operations" class for use inside this static method. The
        // Operations class exists, but it is more of a blueprint. Here I can't refer to it directly, I must create an
        // Instance (object) of that class before it can be used here.
        Operations Operations = new Operations();

        // You could declare a variable, then give it a value, or do both at the same time.
        Double num_3;
        num_3 = Operations.add(1.0, 3.0);

        // Here num_4 is declared and given a value both at the same time.
        Double num_4 = Operations.sub(5.0, 2.0);

        System.out.println(num_3);
        System.out.println(num_4);

        System.out.println("I just did a lot of stuff that you don't yet understand! Let me help you understand.");
    }
}
