package AirBnB;


import java.io.Serializable;

public class Property implements Serializable {

    private int id;
    private String name;
    private String address;
    private String city;
    private int zipcode;
    private int bedrooms;
    private int bathrooms;
    private double nightlyRate;
    private int guestCount;


    public Property(int id, String name, String address, String city, int zipcode, int bedrooms, int bathrooms, int guestCount, double nightlyRate) {
        super();
        setId(id); // same as --> this.id = id //initialize
        setAddress(address);
        setName(name);
        setCity(city);
        setZipcode(zipcode);
        setBedrooms(bedrooms);
        setBathrooms(bathrooms);
        setGuestCount(guestCount);
        setNightlyRate(nightlyRate);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setNightlyRate(double rate) {
        this.nightlyRate = rate;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    @Override
    public String toString() {
        return "\nProperty id: " + id +
                " \nProperty name: " + name +
                " \nProperty Address: " + address +", "  + city + " " + ""+ zipcode +
                " \nbedrooms: " + bedrooms +
                " \nbathrooms: " + bathrooms +
                " \nguestCount: " + guestCount +
                " \nnightlyRate: " + "$"+ nightlyRate ;
    }

    public void print(){
        System.out.println("\nProperty id: " + this.id);
        System.out.println("Welcome to " + getName());
        System.out.println("Our address is: " + this.address +", " + this.city + " " + ""+ this.zipcode);
        System.out.println("Our property has " + ""+ this.bedrooms + " bedrooms, " + this.bathrooms + " bathrooms and can accommodate " + this.guestCount + " guests");
        System.out.println("Nightly rate is:" + " $"+this.nightlyRate);

    }
}

