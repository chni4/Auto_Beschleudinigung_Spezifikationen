package org.example;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Auto myAuto = new Auto("Koenigsegg", "Jesko", "Blau", 2022);




            System.out.println(myAuto.spezifikationen);
            Scanner sc = new Scanner(System.in);
        System.out.println("Sie Sitzen in einem " + myAuto.marke + " " + myAuto.modell + " In der farbe " + myAuto.farbe + " Mit dem Baujahr " + myAuto.baujahr);
            System.out.print("Wollen sie das Fahrzeug beschleunigen?");
            String Frage = sc.next();


        int AutoGs = 0;
        boolean solange = true;


        do {
            if (Frage.equals("Ja")) {
                AutoGs++;
                System.out.println(AutoGs);


                try {
                    Thread.sleep(65);
                } catch (InterruptedException e) {
                    System.out.println("Fehler");
                }
            } else {
                solange = false;
            }
            if (AutoGs == 520) {
                System.out.println("Das Auto hat die maximal GEschwindikeit erreicht");
                System.exit(Integer.parseInt("Autofahrt ende"));
            }

        } while (solange);
    }
}








