package com.dmac;

// You import classes when the core Java commands aren't enough for your needs.
import java.util.Scanner;

public class Home {

    // This is a method. Basically, it is a block of code that can be referenced by this and other classes. Public means
    // It's available to other classes, void means that it doesn't return a value, and start is its name, and the ()
    // refer to values that need to be passed to this method. (in this case, none)
    public void start() {
        // Declare string
        String userInput;

        //make new Scanner object named "input"
        Scanner input = new Scanner(System.in);

        boolean answerRight = false;

        // I need this to run until a proper answer is given. I could have done this a better way, but it was a great
        // chance to show you methods within classes. This while command refers to the yesno() method under it for some
        // of its function. Doing so has overcomplicated things, but whatever.
        while (!answerRight) {
            System.out.println("Welcome to the calculator! Do you want the tutorial, or do you want to go right on calculating?");
            userInput = input.next();
            String choice = this.yesno("y", "n", userInput);

            if (choice.equals("y")) {
                answerRight = true;
                tutorial tutorial = new tutorial();
                tutorial.start();
            } else if (choice.equals("n")) {
                answerRight = true;
                calculator calculator = new calculator();
                calculator.start();
            } else {
                answerRight = false;
            }
        }
    }

    // This class is private, meaning that it can only be accessed by this class. String means it returns a string, and
    // all the things in the () are things that must be passed to this method when it is called.
    private String yesno(String choice1, String choice2, String answer) {
        String yn;
        if (!answer.equals(choice1) && !answer.equals(choice2)) {
            yn = "wrong";
            return yn;
        } else if (answer.equals(choice1)) {
            yn = "y";
            return yn;
        } else {
            yn = "n";
            return yn;
        }
    }

}