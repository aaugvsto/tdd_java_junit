package dev.augusto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while (run)
        {
            System.out.println("-- Password Validator --");

            try
            {
                System.out.println("Input your password: ");
                String password = scanner.next();

                PasswordValidator validator = new PasswordValidator(password);

                validator.Validate();

                System.out.println("Success, your password is valid.");

                String result = null;
                while (result == null){
                    System.out.println("Do you want try again? (Y / N)");

                    String input = scanner.next();

                    if(input.equalsIgnoreCase("Y")){
                        result = input;
                    }
                    else if(input.equalsIgnoreCase("N")){
                        run = false;
                        System.out.println("Exited.");
                    }
                }
            }
            catch (Exception exception)
            {
                String result = null;

                while (result == null){
                    System.out.println("An error occurred: " + exception.getMessage());
                    System.out.println("Do you want try again? (Y / N)");

                    String input = scanner.next();

                    if(input.equalsIgnoreCase("Y")){
                        result = input;
                    }
                    else if(input.equalsIgnoreCase("N")){
                        run = false;
                        System.out.println("Exited.");
                    }
                }

            }
        }

        scanner.close();
    }
}