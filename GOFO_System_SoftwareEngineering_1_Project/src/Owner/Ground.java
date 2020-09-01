package Owner;

import java.util.ArrayList;

public class Ground {

    private String Name ;
    private String ID ;
    private String Street ;
    private String Area ;
    private String Governorate ;
    private int GroundNumber ;
    private double PricePerHour ;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getGovernorate() {
        return Governorate;
    }

    public void setGovernorate(String governorate) {
        Governorate = governorate;
    }

    public int getGroundNumber() {
        return GroundNumber;
    }

    public void setGroundNumber(int groundNumber) {
        GroundNumber = groundNumber;
    }

    public double getPricePerHour() {
        return PricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        PricePerHour = pricePerHour;
    }

}
