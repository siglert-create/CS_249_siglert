package edu.realemj.exercises.nothing;
import java.util.*;
public class Nothing {
    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter total Food");
        //double rations =2.5; //final equals const
        double totalFood = input.nextDouble();
        System.out.println("Enter number of people");
        int numPeople= input.nextInt();
        final double rations =2.5;
        int x = (int)1.0;

        double foodPerDay = numPeople *rations;
        double daysLeft = totalFood/foodPerDay;


        System.out.println("Days left "+ daysLeft);
        int ic =65;
        char c =(char)ic;
        System.out.println("Also character is ..." +c);

    }
}
