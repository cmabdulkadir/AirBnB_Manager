package AirBnB;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manage = new Manager();

        manage.welcome();
        //manage.load();
        int option = -1;
        do {
            manage.optionMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    //create listing
                    manage.createListing();
                    //manage.save();
                    //manage.load();
                    break;
                case 2:
                    //Print all listing
                    manage.printProperties();
                    //manage.load();
                    break;
                case 3:
                    //update listing
                    manage.updatePropertyById();
                    break;
                case 4:
                    //delete listing
                    manage.deletePropertyById();
                    break;
                case 5:
                    manage.exit();
                    break;

            }
        } while (option != 0);


    }


}
