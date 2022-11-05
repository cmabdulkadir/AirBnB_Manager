package AirBnB;


public class Property {

    private String address;
    private int id;
    private String name;
    private String city;
    private int zipcode;
    private int bedrooms;
    private int bathrooms;
    private double nightlyRate;
    private int guestCount;


    public Property(int id, String name, String address, String city, int zipcode, int bedrooms, int bathrooms, int guestCount, double nightlyRate) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.city = city;
        this.zipcode = zipcode;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.nightlyRate = nightlyRate;
        this.guestCount = guestCount;

    }

    public String getAddress() {
        return address;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double rate) {
        this.nightlyRate = rate;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public void print(){
        System.out.println("\nProperty id: " + this.id);
        System.out.println("Welcome to " + getName());
        System.out.println("Our address is: " + this.address +", " + this.city + " " + ""+ this.zipcode);
        System.out.println("Our property has " + ""+ this.bedrooms + " bedrooms, " + this.bathrooms + " bathrooms and can accommodate " + this.guestCount + " guests");
        System.out.println("Nightly rate is:" + " $"+this.nightlyRate);

    }


}

