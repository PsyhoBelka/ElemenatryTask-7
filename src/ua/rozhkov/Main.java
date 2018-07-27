package ua.rozhkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Input length of row:");
        String input=new Scanner(System.in).nextLine();
        int length=Integer.parseInt(input);
        if (length<=0){
            System.out.println("0");
            return;
        }
        System.out.print("Input max square of number: ");
        input=new Scanner(System.in).nextLine();
        int maxSqr= Integer.parseInt(input);
        if (maxSqr<=0){
            System.out.println("0");
            return;
        }
        int base= (int) Math.sqrt(maxSqr)/1;
        for (int i = 0; i < length; i++) {
            System.out.print((int)Math.pow(++base,2));
            if (i<length-1){
                System.out.print(", ");
            }
        }
//        System.out.println(base);

    }
}
