package Player;

import GOFOSystem.*;

import java.util.ArrayList;

public class FavoriteTeam extends User {


    private ArrayList <Player> fav_team;
    private String teamName ;

    public ArrayList<Player> getFav_team() {
        return fav_team;
    }

    public void setFav_team(ArrayList<Player> fav_team) {
        this.fav_team = fav_team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    @Override
    public String getStreet() {
        return super.getStreet();
    }

    @Override
    public void setStreet(String street) {
        super.setStreet(street);
    }

    @Override
    public String getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(String area) {
        super.setArea(area);
    }

    @Override
    public String getGovernorate() {
        return super.getGovernorate();
    }

    @Override
    public void setGovernorate(String governorate) {
        super.setGovernorate(governorate);
    }
}

