package com.abhijeet.assingment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countCompartment = input.nextInt();
        int jetpackVal[] = new int[countCompartment];
        for (int i = 0; i < jetpackVal.length; i++) {
            jetpackVal[i] = input.nextInt();
        }
        int thesisCompartment = input.nextInt();

        CompartmentHopsCount compartmentHopsCount = new CompartmentHopsCount();
        Integer hops = compartmentHopsCount.countHops(jetpackVal, thesisCompartment - 1);
        if (hops == Integer.MAX_VALUE) {
            System.out.println("Minimum Hops : Not possible");
        } else {
            System.out.println("Minimum Hops : " + hops);

        }
    }
}
