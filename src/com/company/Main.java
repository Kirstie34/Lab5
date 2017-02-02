package com.company;

        import java.util.Random;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        boolean rollDice = true;

        while (rollDice) {
            int input1 = readInteger();
            int input2 = readInteger2();

            Random rand = new Random();
            int random1 = rand.nextInt(input1) + 1;

            Random rand2 = new Random();
            int random2 = rand2.nextInt(input2) + 1;

            System.out.println("Roll 1: ");
            System.out.println(random1);
            System.out.println();
            System.out.println("Roll 2: ");
            System.out.println(random2);
            System.out.println();

            System.out.print("Would you like to continue? (y/n): ");
            System.out.println();
            char yN = scan1.next().charAt(0);

            System.out.println();

            if (yN == 'y') {
                rollDice = true;
            } else {
                rollDice = false;
                System.out.println("Bye!");

            }
        }
    }

    public static int readInteger() {

        Scanner scan1 = new Scanner(System.in);
        boolean programStart = true;

        while (programStart) {
            System.out.println("Welcome to the Virtual Dice Roller!");
            System.out.println();

            System.out.print("Would you like to roll the dice? (y/n): ");
            System.out.println();
            char yN = scan1.next().charAt(0);

            System.out.println();

            if (yN == 'y') {
                programStart = false;

            } else {
                programStart = true;
                System.out.println("Bye!");

            }
        }

        System.out.println("How many sides does die 1 have?: ");
        int x = scan1.nextInt();
        System.out.println();
        scan1.nextLine();

        return x;
    }

    public static int readInteger2() {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("How many sides does die 2 have?: ");
        int x = scan1.nextInt();
        System.out.println();
        scan1.nextLine();

        return x;

    }

}