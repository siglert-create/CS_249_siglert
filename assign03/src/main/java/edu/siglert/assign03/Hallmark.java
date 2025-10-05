package edu.siglert.assign03;

import java.util.Scanner;

public class Hallmark {
    public static GreetingCard generateCard(Scanner input){
        System.out.println("Enter boundary character:");
        String boundChar = input.nextLine();
        char boundary = boundChar.charAt(0);
        System.out.println( "Enter number of lines:");
        String numLine = input.nextLine();
        int num = Integer.parseInt(numLine);
        String[] allLines =new String[num];
        System.out.println("Enter lines:");
        for (int i = 0; i < num; i++) {
            allLines[i] = input.nextLine();
        }
        GreetingCard card = new GreetingCard(allLines, boundary);
        return card;
    }
    public static void main(String [] args){
        Scanner scanner  = new Scanner(System.in);
        GreetingCard n = generateCard(scanner);
        System.out.println("For any occasion:");
        System.out.println(n);
    }

}
