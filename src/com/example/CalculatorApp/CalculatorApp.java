package com.example.CalculatorApp;

/**
 * Created by admin on 9/13/14.
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        double firstNum = 0;
        double secondNum = 0;
        char calcAction;
        boolean progLoop = true;

        System.out.println("Welcome to Calculator\n" +
                "You can enter numbers to calculate and they will be calculated!\n" +
                "You know you're impressed.\n" +
                "Enter a number, then hit enter\n" +
                "Then enter +, -, *, /, or √\n" +
                "Then enter the second number for the calculation.\n" +
                "For the square root you only need to enter the first number and √," +
                "The square root symbol is entered by holding 'alt' and 'v'");

        while (progLoop = true) {
            firstNum =getFirstNum();

        }

    }
    public static double getFirstNum () {
        Scanner getNumScan = new Scanner(System.in);
        for (;;)
            try {
                System.out.println("\nPlease enter first number:");
                double firstNum = getNumScan.nextDouble();
                return firstNum;
        }   catch (InputMismatchException e){
                System.out.println("Not a valid number entry, please try again.\n");
        }
    }
}