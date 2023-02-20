package lk.ijse.dep10.app;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter your nic: ");
        String input = scanner.nextLine().strip();

        if (input.length() != 10){
            System.out.println("Invalid NIC");
            return;
        }

        String first9Chars = input.substring(0, 9);
        if (isInteger(first9Chars) && (input.endsWith("v") || input.endsWith("V"))){
            System.out.println("Valid NIC");
        }else{
            System.out.println("Invalid NIC");
        }
    }

    public static boolean isInteger(String input){
        try {
            Integer.parseInt(input);
            return true;
        }catch (RuntimeException e){
            e.printStackTrace();
            return false;
        }
    }
}
