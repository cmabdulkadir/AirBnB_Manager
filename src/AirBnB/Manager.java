package AirBnB;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;



public class Manager {


    Scanner scan = new Scanner(System.in);
    //creating and initializing an arrayList to hold all properties
    ArrayList<Property> properties = new ArrayList<>();


    public void optionMenu() {
        System.out.println("\nType (1) to Create property listing");
        System.out.println("Type (2) to Read all property listings");
        System.out.println("Type (3) to Update property listing");
        System.out.println("Type (4) to Delete property listing");
        System.out.println("Type (5) to Exit");
    }

    public void welcome() {
        System.out.println("Welcome to AirBnB Host🏠 - Where you can manage all your property listings!");
        System.out.println("\nWould you like to load your properties?: Type (Y) for Yes or (N) for No");
        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("y")){
            load();

        } else if (answer.equalsIgnoreCase("n")) {

        }
    }

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
        properties.add(new Property( id, name, address, city, zipcode, bedrooms, bathrooms, guestCount, rate));
        save();
        //load();
    }

    public void printProperties() {
        for (Property p : properties) {
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
        printProperties();
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
        System.out.println("\nWhich property iD would you like to delete?:");
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

    public void save(){
        try{
            FileOutputStream fileOut = new FileOutputStream("properties.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Property p :properties) {
                out.writeObject(properties);
            }
            out.close();
            fileOut.close();

        }catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void load() {

        ArrayList<Property> properties = new ArrayList<>(); // this create an object of type employee to receive data from file or return

        try {
            FileInputStream file = new FileInputStream("properties.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            properties = (ArrayList<Property>) in.readObject();

            in.close();
            file.close();

            System.out.println(properties);

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            System.out.println("No listings exist! Please create a new listing");
        }
    }

        public void exit() {
            System.out.println("Would you like to save your properties?:  Type(Y) for yes or (N) for no");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("y")) {
                save();
                System.out.println("---PROPERTIES SAVED---");
                System.exit(1);

            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("GOODBYE");
                System.exit(1);
            }
        }
    }


