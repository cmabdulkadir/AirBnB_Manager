package AirBnB;

import java.util.Scanner;
import java.util.ArrayList;


public class Manager {


    Scanner scan = new Scanner(System.in);

    //creating and initializing an arrayList to hold all properties
    ArrayList<Property> properties = new ArrayList<>();


    //CREATE A OPTION METHOD
    public void optionMenu() {
        System.out.println("\nType (1) to Create property listing");
        System.out.println("Type (2) to read all property listings");
        System.out.println("Type (3) to update property listing");
        System.out.println("Type (4) to delete property listing");
        System.out.println("Type (5) to Exit");
    }

    public void welcome() {
        System.out.println("Welcome to AirBnB Host🏠 - Where you can manage all your property listings!");
    }

    // CREATING A METHOD TO CREATE PROPERTY LISTINGS
    public void createListing() {
        System.out.println("What is the properties iD?:");
        int id = Integer.parseInt(scan.nextLine());
        System.out.println("What is the property name?:");
        String name = scan.nextLine();
        System.out.println("What is the properties address?:");
        String address = scan.nextLine();
        System.out.println("What is the properties city and state?:");
        String city = scan.nextLine();
        System.out.println("What is the properties zipcode?:");
        int zipcode = Integer.parseInt(scan.nextLine());
        System.out.println("How many bedrooms does the property have?:");
        int bedrooms = Integer.parseInt(scan.nextLine());
        System.out.println("How many bathrooms does the property have?:");
        int bathrooms = Integer.parseInt(scan.nextLine());
        System.out.println("How many guest can the property accommodate?:");
        int guestCount = Integer.parseInt(scan.nextLine());
        System.out.println("What is the nightly rate?:");
        double rate = Double.parseDouble(scan.nextLine());

        properties.add(new Property(id, name, address, city, zipcode, bedrooms, bathrooms, guestCount, rate));
    }

}
