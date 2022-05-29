package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        if (input[1].equals("Wizard")) {

            Wizard wizard = new Wizard(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]), Integer.parseInt(input[5]));
            System.out.println(wizard.toString());
            String str = scanner.nextLine();
            while (!(str.equals("End"))) {
                System.out.println(wizard.action());
                str = scanner.nextLine();
            }
            System.out.println("Wizard "+ input[2]+"["+input[3]+" level] is offline");
        }

        if (input[1].equals("Elf")) {

            Elf elf = new Elf(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]));
                    System.out.println(elf.toString());
            String str = scanner.nextLine();
            while (!(str.equals("End"))) {
                System.out.println(elf.action());
                str = scanner.nextLine();
            }
            System.out.println("Elf "+ input[2]+"["+input[3]+" level] is offline");
        }

        if (input[1].equals("Knight")) {

            Knight knight = new Knight(input[2],Integer.parseInt(input[3]),Integer.parseInt(input[4]),Integer.parseInt(input[5]));
                    System.out.println(knight.toString());
            String str = scanner.nextLine();
            while (!(str.equals("End"))) {
                System.out.println(knight.action());
                str = scanner.nextLine();
            }
            System.out.println("Knight "+ input[2]+"["+input[3]+" level] is offline");
        }
    }
}