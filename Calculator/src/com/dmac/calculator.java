package com.dmac;

/**
 * Created by David on 10/8/2016.
 */

import java.util.Scanner;

public class calculator {
    public void start(){
        Scanner input = new Scanner(System.in);
        Operations operate = new Operations();
        tutorial tutorial = new tutorial();
        // Input num 1
        System.out.println("Welcome to the calculator. This is still under development; only two numbers can be inputted, and the ui is a bit, terminal-ly");
        System.out.println("Enter a number:");
        Double num1 = input.nextDouble();

        // Input operation
        System.out.println("Now choose an operation: 1. addition  2. subtraction  3. multiplication  4. division:");
        Integer operation = input.nextInt();

        // Input num 3
        System.out.println("Second number:");
        Double num2 = input.nextDouble();

        if(operation == 1){
            Double num4 = operate.add(num1,num2);
            System.out.println("Your answer is: " + num4.toString());
        }
        else if(operation == 2){
            Double num4 = operate.sub(num1,num2);
            System.out.println("Your answer is: " + num4.toString());
        }
        else if(operation == 3){
            Double num4 = operate.mul(num1,num2);
            System.out.println("Your answer is: " + num4.toString());
        }
        else if(operation == 4){
            Double num4 = operate.div(num1, num2);
            System.out.println("Your answer is: " + num4.toString());
        }

        while(true){
            System.out.println("Do you want to calculate again?  y/n:");
            String again = input.next();
            if(again.equals("y")){
                this.start();
            }
            else if(again.equals("n")){
                System.out.println("Thank you for calculating with us!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            } else{
                System.out.println("Bad answer, try again");
            }
        }


    }


}
