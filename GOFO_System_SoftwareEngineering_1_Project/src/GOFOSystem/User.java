package GOFOSystem;

public class User {

    private String Name;
    private String PhoneNumber;
    private String eMail ;
    private String ID;
    private String Password ;
    private String Street ;
    private String Area ;
    private String Governorate ;
    private String Role ;
    private String userName ;

    public User() {
    }

    public User(String name, String phoneNumber, String eMail, String ID, String password, String street, String area, String governorate, String role, String userName) {
        Name = name;
        PhoneNumber = phoneNumber;
        this.eMail = eMail;
        this.ID = ID;
        Password = password;
        Street = street;
        Area = area;
        Governorate = governorate;
        Role = role;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
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
}
