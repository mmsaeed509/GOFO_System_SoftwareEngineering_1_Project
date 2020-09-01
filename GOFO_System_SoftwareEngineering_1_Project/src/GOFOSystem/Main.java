package GOFOSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import Player.*;
import Owner.*;

public class Main {

    public static void main(String[] args) {

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);

        //--------------  Number ---------------

        int GroundNumber = 0 ;
        int playerNumber = 3 ;
        int playerIndex ;
        int ownerGroundIndex ;

        //--------------  Number ---------------


        //------ Object From Class ----------

        Admin admin = new Admin();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        GroundOwner owner1 = new GroundOwner();

        //------ Object From Class ----------

        //---- Default UserName & Password For Admin Page ------

        admin.setUserName("admin@gofo.com");
        admin.setPassword("admin");

        //---- Default UserName & Password For Admin Page ------

        //-------------- ArrayList To Store Data -------------------

        ArrayList <Player> Accounts = new ArrayList<>();
        ArrayList <GroundOwner> groundOwners = new ArrayList<>();
        ArrayList <Ground> groundArrayList = new ArrayList<>();

        //-------------- ArrayList To Store Data -------------------

        //---------- Creat Default Accounts ------------

        player1.setName("Mahmoud Mohamed Siad Ahmed");
        player1.setPhoneNumber("01116060955");
        player1.seteMail("mmsaeed509@gmial.com");
        player1.setID("20180261");
        player1.setPassword("ozil12345");
        player1.setStreet("13_Ahmed Maoud");
        player1.setArea("Ayat");
        player1.setGovernorate("Giza");
        player1.setUserName("mmsaeed509");
        player1.setRole("player");
        player1.setPlayerNumber(0);
        Accounts.add(player1);

        player2.setName("Ali Ahmed Mutaz");
        player2.setPhoneNumber("01100249152");
        player2.seteMail("mmozil509@gmial.com");
        player2.setID("20190261");
        player2.setPassword("12345");
        player2.setStreet("13_Ahmed Khames");
        player2.setArea("Dokki");
        player2.setGovernorate("Giza");
        player2.setUserName("mmozil509");
        player2.setRole("player");
        player2.setPlayerNumber(1);
        Accounts.add(player2);

        player3.setName("Gamal Nabel Ali");
        player3.setPhoneNumber("01115959877");
        player3.seteMail("gamal356@gmial.com");
        player3.setID("201983476");
        player3.setPassword("ozil145");
        player3.setStreet("4_Kamal Adham");
        player3.setArea("Borg Elarab");
        player3.setGovernorate("Alex");
        player3.setUserName("gamal356");
        player3.setRole("player");
        player3.setPlayerNumber(2);
        Accounts.add(player3);

        //---------- Creat Default Accounts ------------

        while (true){

            System.out.println("************************************");
            System.out.println("*      Welcome In GOFO System      *");
            System.out.println("************************************");
            System.out.println("* 1 _ Sign Up                      *");
            System.out.println("* 2 _ Log In                       *");
            System.out.println("* 3 _ Register Play Ground         *");
            System.out.println("* 4 _ Admin Home Page              *");
            System.out.println("* 5 _ Exit                         *");
            System.out.println("************************************");

            String Choice;
            Choice = scannerString.nextLine();

            //--------------- Sign Up ---------------

            if (Choice.equals("1")){

                Player player = new Player();

                String Name;
                String PhoneNumber;
                String eMail ;
                String ID;
                String Password , passValidation ;
                String Street ;
                String Area ;
                String Governorate ;
                String user_name ;
                int code ;

                System.out.println(" Enter Your Full Name : ");
                Name = scannerString.nextLine();
                player.setName(Name);

                System.out.println(" Phone No. : ");
                PhoneNumber = scannerString.nextLine();
                while (PhoneNumber.length()!=11){
                    System.out.println(" Enter Pone No. Again : ");
                    PhoneNumber = scannerString.nextLine();
                }
                player.setPhoneNumber(PhoneNumber);

                System.out.println(" E-mail : ");
                eMail = scannerString.nextLine();
                while (!VerifyViaMail.isValid(eMail)){
                    System.out.println(" Wrong E-mail Please Write E-mail Again : ");
                    eMail = scannerString.nextLine();
                }
                player.seteMail(eMail);

                System.out.println(" Enter your User Name : ");
                user_name = scannerString.nextLine();
                player.setUserName(user_name);

                System.out.println(" ID : ");
                ID = scannerString.nextLine();
                player.setID(ID);

                System.out.println(" Password : ");
                Password = scannerString.nextLine();
                System.out.println(" Enter Password Again : ");
                passValidation = scannerString.nextLine();
                while (!Password.equals(passValidation)){
                    System.out.println(" Password Didn't Match ");
                    System.out.println(" Password : ");
                    Password = scannerString.nextLine();
                    System.out.println(" Enter Password Again : ");
                    passValidation = scannerString.nextLine();
                }
                player.setPassword(Password);

                System.out.println(" Street : ");
                Street = scannerString.nextLine();
                player.setStreet(Street);

                System.out.println(" Area : ");
                Area = scannerString.nextLine();
                player.setArea(Area);

                System.out.println(" Governorate : ");
                Governorate = scannerString.nextLine();
                player.setGovernorate(Governorate);

                System.out.println("*******************************");
                System.out.println(" Sending Code Via e-mail...... ");
                VerifyViaMail.Send_Verify_Code(eMail,Name);
                System.out.println(" Code Has been Sent successfully\n");
                System.out.println(" Enter The Verification Code : ");
                code = scannerInt.nextInt();
                while (!VerifyViaMail.Check_Validation_Code(code)){
                    System.out.println(" Code Didn't Match ");
                    System.out.println(" Enter Code Again : ");
                    code = scannerInt.nextInt();
                }
                player.setRole("player");
                player.setPlayerNumber(playerNumber);
                playerNumber++ ;
                System.out.println(" Account Created successfully ");
                Accounts.add(player);

            }

            //--------------- Sign Up ---------------

            //--------------- Log In ---------------

            else if (Choice.equals("2")){

                if (Accounts.isEmpty() && owner1.getActiveOwner().isEmpty()){

                    System.out.println(" No Accounts Is Registered ");

                }

                else {

                    System.out.println(" 1 _ Player \n 2 _ Ground Owner ");
                    String cho ;
                    cho = scannerString.nextLine();



                    //===== Player =======

                    if (cho.equals("1")){

                        String userName , password ;
                        boolean statusPlayer = false ;
                        System.out.println(" Enter Your User Name : ");
                        userName = scannerString.nextLine();
                        System.out.println(" Enter Your Password : ");
                        password = scannerString.nextLine();

                        //========= Log In Validation =============

                        for (int i = 0; i < Accounts.size() ; i++) {

                            if ( userName.equals(Accounts.get(i).getUserName()) && password.equals(Accounts.get(i).getPassword())){

                                statusPlayer = true ;
                                playerIndex = i ;

                            }

                        }

                        //========= Log In Validation =============

                        //========= Home Page =====================

                        if (statusPlayer){

                            System.out.println("*******************************");
                            System.out.println("* Welcome In Home Page Player *");
                            System.out.println("*******************************");

                        }

                        //========== Home Page ===================

                        else {

                            System.out.println(" Wrong Password ");

                        }


                    }

                    //====== Player =========





                    //====== Ground Owner ==========

                    else if (cho.equals("2")){

                        String userName , password ;
                        boolean statusOwner = false ;
                        System.out.println(" Enter Your User Name : ");
                        userName = scannerString.nextLine();
                        System.out.println(" Enter Your Password : ");
                        password = scannerString.nextLine();

                        //========= Log In Validation =============

                        for (int i = 0; i < owner1.getActiveOwner().size(); i++) {

                            if (userName.equals(owner1.getActiveOwner().get(i).getUserName()) && password.equals(owner1.getActiveOwner().get(i).getPassword()) ){

                                statusOwner = true ;
                                ownerGroundIndex = i;

                            }

                        }


                        //======== Owner Home Page ============

                        if (statusOwner){

                            System.out.println("******************************");
                            System.out.println("* Welcome In Owner Home Page *");
                            System.out.println("******************************");
                            
                        }

                        else {

                            System.out.println(" Wrong Password ");

                        }

                        //======= Owner Home Page =============




                        //========= Log In Validation =============

                    }

                    //======= Ground Owner =======

                }

            }

            //--------------- Log In ---------------

            //--------------- Register Play Ground ---------------

            else if (Choice.equals("3")){

                Ground ground = new Ground();
                GroundOwner owner = new GroundOwner();

                String name , groundName ;
                String phone ;
                String e_mail ;
                String id , groundID ;
                String groundStreet , groundArea , groundGovernorate ;
                String password , pass_validation ;
                String userName ;
                int codeValidation ;
                double price ;


                owner.setRole("owner");
                System.out.println(" Enter Your Full Name : ");
                name = scannerString.nextLine();
                owner.setName(name);

                System.out.println(" Phone No. : ");
                phone = scannerString.nextLine();
                while (phone.length()!=11){
                    System.out.println(" Enter Pone No. Again : ");
                    phone = scannerString.nextLine();
                }
                owner.setPhoneNumber(phone);

                System.out.println(" E-mail : ");
                e_mail = scannerString.nextLine();
                while (!VerifyViaMail.isValid(e_mail)){
                    System.out.println(" Wrong E-mail Please Write E-mail Again : ");
                    e_mail = scannerString.nextLine();
                }
                owner.seteMail(e_mail);

                System.out.println(" Enter your User Name : ");
                userName = scannerString.nextLine();
                owner.setUserName(userName);

                System.out.println(" ID : ");
                id = scannerString.nextLine();
                owner.setID(id);

                System.out.println(" Password : ");
                password = scannerString.nextLine();
                System.out.println(" Enter Password Again : ");
                pass_validation = scannerString.nextLine();
                while (!password.equals(pass_validation)){
                    System.out.println(" Password Didn't Match ");
                    System.out.println(" Password : ");
                   password = scannerString.nextLine();
                    System.out.println(" Enter Password Again : ");
                    pass_validation = scannerString.nextLine();
                }
                owner.setPassword(password);

                System.out.println(" Ground Name : ");
                groundName = scannerString.nextLine();
                ground.setName(groundName);

                System.out.println(" Ground ID : ");
                groundID = scannerString.nextLine();
                ground.setID(groundID);

                System.out.println(" Price Per Hours : ");
                price = scannerDouble.nextDouble();
                ground.setPricePerHour(price);

                System.out.println(" Ground Street : ");
                groundStreet = scannerString.nextLine();
                ground.setStreet(groundStreet);

                System.out.println(" Ground Area : ");
                groundArea = scannerString.nextLine();
                ground.setStreet(groundArea);

                System.out.println(" Ground Governorate : ");
                groundGovernorate = scannerString.nextLine();
                ground.setStreet(groundGovernorate);

                ground.setGroundNumber(GroundNumber);
                GroundNumber++;

                groundArrayList.add(ground);
                owner.setNonActiveGrounds(groundArrayList);

                System.out.println("********************************");
                System.out.println(" Sending Code Via e-mail......  ");
                VerifyViaMail.Send_Verify_Code(e_mail,name);
                System.out.println(" Code Has been Sent successfully\n");
                System.out.println(" Enter The Verification Code : ");
                codeValidation = scannerInt.nextInt();
                while (!VerifyViaMail.Check_Validation_Code(codeValidation)){
                    System.out.println(" Code Didn't Match ");
                    System.out.println(" Enter Code Again : ");
                    codeValidation = scannerInt.nextInt();
                }
                System.out.println(" Account Created successfully \n The Admin Will Review Your Ground Registration ");

                groundOwners.add(owner);
                owner.setNonActiveOwner(groundOwners);

            }

            //--------------- Register Play Ground ---------------

            //--------------- Admin Home Page ---------------

            else if (Choice.equals("4")){

                String userName , password ;
                System.out.println(" Enter User Name : ");
                userName=scannerString.nextLine();
                System.out.println(" Enter Password : ");
                password=scannerString.nextLine();

                if (userName.equals(admin.getUserName()) && password.equals(admin.getPassword())){

                    //======= Admin Home Page =========

                    while (true){

                        System.out.println("******************************");
                        System.out.println("* Welcome In Admin Home Page *");
                        System.out.println("******************************");
                        System.out.println("* 1 _ View Player            *");
                        System.out.println("* 2 _ View Grounds           *");
                        System.out.println("* 3 _ Delete Player          *");
                        System.out.println("* 4 _ Delete Ground          *");
                        System.out.println("* 5 _ Active Grounds         *");
                        System.out.println("* 6 _ Exit Admin             *");
                        System.out.println("******************************");
                        String choiceAdmin;
                        choiceAdmin=scannerString.nextLine();

                        //---- View Player -------------

                        if (choiceAdmin.equals("1")){

                            System.out.println(" There Are : " + Accounts.size() + " Players \n");

                            for (int i = 0; i < Accounts.size(); i++) {

                                System.out.println(" Name :  " + Accounts.get(i).getName());
                                System.out.println(" Role : " + Accounts.get(i).getRole());
                                System.out.println(" E-mail : " + Accounts.get(i).geteMail());
                                System.out.println(" User Name : " + Accounts.get(i).getUserName());
                                System.out.println(" Phone No. : " + Accounts.get(i).getPhoneNumber());
                                System.out.println(" ID : " + Accounts.get(i).getID());
                                System.out.println(" Password : " + Accounts.get(i).getPassword());
                                System.out.println(" Street : " + Accounts.get(i).getStreet());
                                System.out.println(" Area : " + Accounts.get(i).getArea());
                                System.out.println(" Governorate : " + Accounts.get(i).getGovernorate());
                                System.out.println("\n");
                                
                            }

                        }

                        //---- View Player -------------

                        //------- View Grounds ---------

                        else if (choiceAdmin.equals("2")){

                            if (owner1.getActiveOwner().isEmpty() && owner1.getActiveGrounds().isEmpty()){

                                System.out.println(" No Ground Is Active ");

                            }else {

                                System.out.println(" There Are : " + owner1.getActiveGrounds().size() + "Grounds \n");

                                for (int i = 0; i < owner1.getActiveGrounds().size(); i++) {

                                    System.out.println(" Ground Owner Name : " + owner1.getActiveOwner().get(i).getName());
                                    System.out.println(" Role : " + owner1.getActiveOwner().get(i).getRole());
                                    System.out.println(" Ground Owner Phone No. : " + owner1.getActiveOwner().get(i).getPhoneNumber());
                                    System.out.println(" Ground Owner ID : " + owner1.getActiveOwner().get(i).getID());
                                    System.out.println(" Ground E-mail : " + owner1.getActiveOwner().get(i).geteMail());
                                    System.out.println(" User Name  : " + owner1.getActiveOwner().get(i).getUserName());
                                    System.out.println(" Ground Owner Password : " + owner1.getActiveOwner().get(i).getPassword());
                                    System.out.println(" Ground Info. : ");
                                    System.out.println(" Ground Name : " + owner1.getActiveGrounds().get(i).getName());
                                    System.out.println(" Ground ID : " + owner1.getActiveGrounds().get(i).getID());
                                    System.out.println(" Ground No. " + owner1.getActiveGrounds().get(i).getGroundNumber());
                                    System.out.println(" Price Per Hour : " + owner1.getActiveGrounds().get(i).getPricePerHour());
                                    System.out.println(" Ground's Street : " + owner1.getActiveGrounds().get(i).getStreet());
                                    System.out.println(" Ground's Area : " + owner1.getActiveGrounds().get(i).getArea());
                                    System.out.println(" Ground's Governorate : " + owner1.getActiveGrounds().get(i).getGovernorate());

                                }

                            }

                        }

                        //------- View Grounds ---------

                        //------ Delete Player -----------

                        else if (choiceAdmin.equals("3")){

                            System.out.println(" Enter Player's Number : ");
                            int number ;
                            number = scannerInt.nextInt();
                            Accounts.remove(number);

                        }

                        //------ Delete Player -----------

                        //------ Delete Grounds ----------

                        else if (choiceAdmin.equals("4")){

                            System.out.println(" Enter Ground's Number : ");
                            int number ;
                            number = scannerInt.nextInt();
                            owner1.getActiveGrounds().remove(number);
                            owner1.getActiveOwner().remove(number);

                        }

                        //------ Delete Grounds ----------

                        //------- Active Grounds ---------

                        else if (choiceAdmin.equals("5")){

                            if (owner1.getNonActiveGrounds().isEmpty() && owner1.getNonActiveOwner().isEmpty() ){

                                System.out.println(" No Grounds Need To Activate ");

                            } else {

                                System.out.println(" There Are : " + owner1.getNonActiveGrounds().size() + "  Request To Active Grounds ");

                                for (int i = 0; i < owner1.getNonActiveGrounds().size() ; i++) {

                                    System.out.println(" Ground Owner Name : " + owner1.getNonActiveOwner().get(i).getName());
                                    System.out.println(" Role : " + owner1.getNonActiveOwner().get(i).getRole());
                                    System.out.println(" Ground Owner Phone No. : " + owner1.getNonActiveOwner().get(i).getPhoneNumber());
                                    System.out.println(" Ground Owner ID : " + owner1.getNonActiveOwner().get(i).getID());
                                    System.out.println(" Ground E-mail : " + owner1.getNonActiveOwner().get(i).geteMail());
                                    System.out.println(" User Name  : " + owner1.getNonActiveOwner().get(i).getUserName());
                                    System.out.println(" Ground Owner Password : " + owner1.getNonActiveOwner().get(i).getPassword());
                                    System.out.println(" Ground Info. : ");
                                    System.out.println(" Ground Name : " + owner1.getNonActiveGrounds().get(i).getName());
                                    System.out.println(" Ground ID : " + owner1.getNonActiveGrounds().get(i).getID());
                                    System.out.println(" Ground No. " + owner1.getNonActiveGrounds().get(i).getGroundNumber());
                                    System.out.println(" Price Per Hour : " + owner1.getNonActiveGrounds().get(i).getPricePerHour());
                                    System.out.println(" Ground's Street : " + owner1.getNonActiveGrounds().get(i).getStreet());
                                    System.out.println(" Ground's Area : " + owner1.getNonActiveGrounds().get(i).getArea());
                                    System.out.println(" Ground's Governorate : " + owner1.getNonActiveGrounds().get(i).getGovernorate());

                                }

                                System.out.println(" 1 _ Active All \n 2 _ Delete All");
                                String cho;
                                cho = scannerString.nextLine();

                                //====== Active =========

                                if (cho.equals("1")){

                                    Collections.copy(owner1.getNonActiveGrounds(),owner1.getActiveGrounds());
                                    Collections.copy(owner1.getNonActiveOwner(),owner1.getActiveOwner());

                                    for (int i = 0; i < owner1.getNonActiveGrounds().size() ; i++) {

                                        owner1.getNonActiveGrounds().remove(i);
                                        owner1.getNonActiveOwner().remove(i);

                                    }

                                }

                                //====== Active =========

                                //====== Delete =========

                                else if (cho.equals("2")){

                                    for (int i = 0; i < owner1.getNonActiveGrounds().size() ; i++) {

                                        owner1.getNonActiveGrounds().remove(i);
                                        owner1.getNonActiveOwner().remove(i);

                                    }

                                }

                                //====== Delete =========

                            }
                        }

                        //------- Active Grounds ---------

                        //--------- Exit Admin ----------

                        else if (choiceAdmin.equals("6")){
                            break;
                        }

                        //--------- Exit Admin ----------

                        else {
                            System.out.println(" Invalid Choice ");
                        }

                    }

                    //======= Admin Home Page =========

                }else {
                    System.out.println(" Wrong Password");
                }
            }

            //--------------- Admin Home Page ---------------

            //--------------- Exit ---------------

            else if (Choice.equals("5")){
                System.out.println(" Good Bye ^_^ \n");
                System.exit(0);
            }

            //--------------- Exit ---------------
            else {

                System.out.println(" Invalid Choice \n");

            }
        }
    }
}
