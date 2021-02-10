package Owner;

import GOFOSystem.User;

import java.util.ArrayList;

public class GroundOwner extends User {



    ArrayList <Ground> nonActiveGrounds = new ArrayList<>();
    ArrayList <Ground> ActiveGrounds = new ArrayList<>();
    ArrayList <GroundOwner> nonActiveOwner = new ArrayList<>();
    ArrayList <GroundOwner> ActiveOwner = new ArrayList<>();

    public ArrayList<GroundOwner> getNonActiveOwner() {
        return nonActiveOwner;
    }

    public void setNonActiveOwner(ArrayList<GroundOwner> nonActiveOwner) {
        this.nonActiveOwner = nonActiveOwner;
    }

    public ArrayList<GroundOwner> getActiveOwner() {
        return ActiveOwner;
    }

    public void setActiveOwner(ArrayList<GroundOwner> activeOwner) {
        ActiveOwner = activeOwner;
    }

    public ArrayList<Ground> getActiveGrounds() {
        return ActiveGrounds;
    }

    public void setActiveGrounds(ArrayList<Ground> activeGrounds) {
        ActiveGrounds = activeGrounds;
    }

    public ArrayList<Ground> getNonActiveGrounds() {
        return nonActiveGrounds;
    }

    public void setNonActiveGrounds(ArrayList<Ground> nonActiveGrounds) {
        this.nonActiveGrounds = nonActiveGrounds;
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public void setRole(String role) {
        super.setRole(role);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String geteMail() {
        return super.geteMail();
    }

    @Override
    public void seteMail(String eMail) {
        super.seteMail(eMail);
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public void setID(String ID) {
        super.setID(ID);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

}
