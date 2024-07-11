package net.foxi;

/*
* Check My Password V1.0
* by FoxiMay
*/

public class Main {
    //Constants
    public static final String PASSWORD = "Example2024$#";
    public static final int LEN_MIN = 8;
    public static final int STR_MIN = 4;
    public static final int NUM_MIN = 4;
    public static final int S_SYM_MIN = 2;


    public static void main(String[] args) {

        if (Conditions.passwordLen(PASSWORD, LEN_MIN)) {

            if (Conditions.strC(PASSWORD, STR_MIN)) {

                if (Conditions.digitsC(PASSWORD, NUM_MIN)) {

                    if (Conditions.specSym(PASSWORD, S_SYM_MIN)) {
                        System.out.println("Your Password (" + PASSWORD + ") is Hard To Hack! Well Done!");
                    }
                    else {
                        System.out.println("Your Password doesn't contain special symbols (Min: " + S_SYM_MIN + ")\n\tChange it please!");
                    }

                }
                else {
                    System.out.println("Your Password doesn't contain numbers (Min: " + NUM_MIN + ")\n\tChange it please!");
                }

            }
            else {
                System.out.println("Your Password doesn't contain letters (Min: " + STR_MIN + ")\n\tChange it please!");
            }
        }
        else {
            System.out.println("Your Password doesn't contain " + LEN_MIN + " symbols!\n\tChange it please!");
        }

        /*
        System.out.println(Conditions.digitsC(PASSWORD, 4));
        System.out.println(Conditions.strC(PASSWORD, 4));
        System.out.println(Conditions.passwordLen(PASSWORD, 8));
        System.out.println(Conditions.specSym(PASSWORD, 2));
        */

    }
}