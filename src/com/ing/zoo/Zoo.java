package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    /**
     * Runs the Zoo application.
     * 
     * @param args an array of arguments.
     */
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command: ");
        String input = scanner.nextLine();
        checkInput(input, commands);

        scanner.close();
    }

    /**
     * Checks which command is provided and prints corresponding output.
     * 
     * @param input    the user's input.
     * @param commands the list with known commands.
     */
    private static void checkInput(String input, String[] commands) {
        AnimalActions actions = new AnimalActions();

        if (input.equals(commands[0])) {
            actions.allAnimalsSayHello();
        } else if (input.startsWith(commands[0] + " ")) {
            actions.specificAnimalSaysHello(input, commands);
        } else if (input.equals(commands[1])) {
            actions.giveLeaves();
        } else if (input.equals(commands[2])) {
            actions.giveMeat();
        } else if (input.equals(commands[3])) {
            actions.performTrick();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
