package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syota sana");
        String sana = lukija.nextLine();
        System.out.println("Syota arvaustenmaara");
        int arvaustenMaara = Integer.parseInt(lukija.nextLine());

        hangman hirsipuu = new hangman(sana, arvaustenMaara);

        System.out.println(hirsipuu.getNaytettavaSana());

        while(!hirsipuu.getPeliOhi()){
            String arvaus = lukija.nextLine();
            if(arvaus.isEmpty()){
                System.out.println("Tarvitaan vähintään yksi merkki.");
                continue;
            }
            char kirjain = arvaus.charAt(0);
            hirsipuu.arvaa(kirjain);
            System.out.println(hirsipuu.getNaytettavaSana());
            System.out.println(hirsipuu.getArvauksiaTehty());
            if(hirsipuu.getNaytettavaSana().equals(sana)){
                System.out.println("Onnistuit!");
                break;
            }
        }
        if(hirsipuu.getPeliOhi()){
            System.out.println("Yritä uudelleen!");
        }
    }
}
