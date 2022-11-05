package AirBnB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manage = new Manager();

        manage.welcome();
        int option = -1;
        do {
            manage.optionMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    //create listing
                    manage.createListing();
                    break;
                case 2:
                    //Print all listing

                    break;
                case 3:
                    //update listing

                case 4:
                    //delete listing

                case 5:
                    //EXIT
                    System.exit(1);
                    break;

            }
        } while (option != 0);


    }


}
