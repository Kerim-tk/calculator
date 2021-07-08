package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1 = getInt();
        float num2 = getInt();
        char operation = getOperation();
        float result = calc(num1,num2,operation);
        System.out.println("result: "+result);
    }

    public static float getInt(){
        System.out.println("enter your number:");
        float num;
        if(scanner.hasNextFloat()){
            num = scanner.nextFloat();
        } else {
            System.out.println("You made a mistake entering the number. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Enter operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake entering the number. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static float calc(float num1, float num2, char operation){
        float result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation not recognized. Re-enter.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
