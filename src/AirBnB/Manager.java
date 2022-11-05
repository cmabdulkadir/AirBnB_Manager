package AirBnB;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;



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
        //save(properties.add(new Property(id, name, address, city, zipcode, bedrooms, bathrooms, guestCount, rate)));
        //save();
        //load();
        //p.sav
    }

    // Method to read all the properties
    public void printProperties() {
        for (Property p : properties) {
            //save(properties);
            //load();
            p.print();
        }
    }

    public Property findPropertyById(int id) {
        for (Property home : properties) {
            if (home.getId() == id) {
                return home;
            } else {
                continue;
            }
        }
        return null;
    }

    public void updatePropertyById() {
        this.printProperties();
        System.out.println("\nWhich property id would you like to update?:");
        int update = Integer.parseInt(scan.nextLine());
        Property property = this.findPropertyById(update);
        for (Property updateProperty : this.properties) {
            if (updateProperty.getId() == update) {
                System.out.println("What is the properties iD?:");
                int id = Integer.parseInt(scan.nextLine());
                property.setId(id);
                System.out.println("What is the property name?:");
                String name = scan.nextLine();
                property.setName(name);
                System.out.println("What is the properties address?:");
                String address = scan.nextLine();
                property.setAddress(address);
                System.out.println("What is the properties city and state?:");
                String city = scan.nextLine();
                property.setCity(city);
                System.out.println("What is the properties zipcode?:");
                int zipcode = Integer.parseInt(scan.nextLine());
                property.setZipcode(zipcode);
                System.out.println("How many bedrooms does the property have?:");
                int bedrooms = Integer.parseInt(scan.nextLine());
                property.setBedrooms(bedrooms);
                System.out.println("How many bathrooms does the property have?:");
                int bathrooms = Integer.parseInt(scan.nextLine());
                property.setBathrooms(bathrooms);
                System.out.println("How many guest can the property accommodate?:");
                int guestCount = Integer.parseInt(scan.nextLine());
                property.setGuestCount(guestCount);
                System.out.println("What is the nightly rate?:");
                double rate = Double.parseDouble(scan.nextLine());
                property.setNightlyRate(rate);
                this.printProperties();
                break;
            }
        }
    }
    public void deletePropertyById(){
        this.printProperties();
        System.out.println("Which property iD would you like to delete?:");
        int delete = Integer.parseInt(scan.nextLine());
        //Property propertyToDelete;
        for(Property deleteP: properties){
            if(deleteP.getId() == delete){
                properties.remove(deleteP);
                System.out.println("---PROPERTY REMOVED---");
                this.printProperties();
            }
            break;

        }
    }

}

