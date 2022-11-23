package miniprojeler.kimlikbilgileri;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class KimlikProje {
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";
    public static final String beyaz = "\u001B[37m";

    static Scanner input = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static HashMap<String, KimlikPojo> users = new HashMap<>();

    static Set<String> usersSet = users.keySet();


    public static void saveInfo() {
        System.out.println(mavi + "---------------# SAVE INFO #---------------");
        System.out.println(sari + "Please enter Id number");
        String idNumber = input.next();

        if (idNumber.matches("[0-9]{4}")) {
            boolean situation = true;
            while (situation) {
                if (usersSet.contains(idNumber)) {
                    System.out.println(kirmizi + "This ID number already has a user\n" +
                            "Please try again");
                    idNumber = input.nextLine();
                } else {
                    System.out.println(sari + "Please enter Fullname");
                    String fullName = scan.nextLine();
                    System.out.println(sari + "Please enter Address");
                    String address = scan.nextLine();
                    System.out.println(sari + "Please enter Phone Number");
                    String phoneNumber = input.next();

                    KimlikPojo obje = new KimlikPojo(idNumber, fullName, address, phoneNumber);
                    users.put(idNumber, obje);
                    System.out.println(beyaz + "Information successfully saved\n" +
                            "To continue press 1\n" +
                            "For back to main menu press another button");

                    String select = input.next();

                    if (select.equals("1")) {
                        saveInfo();
                    } else {
                        selectOption();
                    }


                }
            }


        } else {
            System.out.println("ID number must be 4 character\n");
            saveInfo();
        }


    }

    public static void getInfo() {
        System.out.println(mavi + "---------------# GET INFO #---------------");
        System.out.println("Enter ID number you want to get information");
        String idNumber = input.next();

        boolean situation = true;
        while (situation) {
            if (usersSet.contains(idNumber)) {
                System.out.println(users.get(idNumber));
                situation = false;
                System.out.println(beyaz +
                        "For continue to searching press 1\n" +
                        "For back to main menu press another button");

                String select = input.next();

                if (select.equals("1")) {
                    getInfo();
                } else {
                    selectOption();
                }

            } else {
                System.out.println("There is no user with that ID number\n" + "Please enter another ID Number");
                idNumber = input.next();
            }
        }


    }

    public static void removeInfo() {
        System.out.println(mavi + "---------------# REMOVE INFO #---------------");
        System.out.println(mor + "Enter ID number you want to remove");
        String removeIdNumber = input.next();

        boolean situation = true;
        while (situation) {
            if (users.isEmpty()) {
                System.out.println(kirmizi + "There is no user in database.");
                System.out.println(sari+"For back to main menu press a button");
                input.next();
                selectOption();
                situation=false;
            } else if (usersSet.contains(removeIdNumber)) {

                System.out.println(kirmizi+"This user will be removed");
                System.out.println(users.get(removeIdNumber));

                System.out.println(mor+"Are you sure?\n"+ " Yes 1\n" + "No another button");
                String select1 = input.next();

                if(select1.equals("1")){
                    users.remove(removeIdNumber);
                    System.out.println(yesil+"User successfully removed");
                    System.out.println(mavi+ "For continue to remove press 1\n" +
                            "For back to main menu press another button");
                    String select = input.next();

                    if(select.equals("1")){
                        removeInfo();
                    }else {
                        selectOption();
                    }
                    situation=false;

                }else {
                    System.out.println(sari+"User not deleted\n");
                    System.out.println("You are directed to the top menu");
                    selectOption();
                }


            }else {
                System.out.println(kirmizi+"There is no user with that ID number\n" +
                        "Please enter another ID Number");
                removeIdNumber = input.next();

            }

        }


    }
    public static void selectOption() {
        System.out.println(mavi + "---------------#SELECT OPTIONS#---------------");
        System.out.println(mor + "1. Information Save Page\n" +
                "2. User search page\n" +
                "3. Information deletion page\n" +
                "4. Qiut\n");
        System.out.println(yesil + "Please enter your choice");
        String select = input.next();

        boolean situation = true;
        while (situation) {

            switch (select) {

                case "1":
                    saveInfo();
                    situation = false;
                    break;
                case "2":
                    getInfo();
                    situation = false;
                    break;
                case "3":
                    removeInfo();
                    situation = false;
                    break;
                case "4":
                    System.out.println("Thank you for visiting our web sit\n" +
                            "Have a good day");
                    situation = false;
                    break;
                default:
                    System.out.println(kirmizi + "You made the wrong choice\n"
                            + "Please try again");
                    select = input.next();
            }

        }

    }


}

