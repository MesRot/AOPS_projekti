package com.company;

import java.util.Random;
import java.util.Scanner;

public class Apumetodit {

	private final Random r;
	
	public Apumetodit(long siemen) {
		r = new Random(siemen);
	}
	
	//System.in sulkeminen on huono juttu
	@SuppressWarnings("resource")
	public String lueMerkkijono() {
		System.out.println("Odotetaan syötettä:");
		return new Scanner(System.in).nextLine();
	}
	
	//System.in sulkeminen on huono juttu
	@SuppressWarnings("resource")
	public int lueKokonaisluku() throws Exception {
		System.out.println("Odotetaan syötettä:");
		return new Scanner(System.in).nextInt();
	}
	
	/**
	 * Toimii kuten Random-luokan nextInt. Palauttaa satunnaisen kokonaisluvun väliltä [0,ylaraja[.<br>
	 * Yläraja on eksklusiivinen, eli sitä ei koskaan palauteta.
	 * @param ylaraja eksklusiivinen yläraja satunnaiselle kokonaisluvulle
	 * @return satunnainen kokonaisluku x: 0 <= x < ylaraja
	 */
	public int satunnainenKokonaisluku(int ylaraja) {
		return r.nextInt(ylaraja);
	}

	/**
	 * Tulostaa annetun ristinollalaudan.<br>
	 * @param lauta 3x3 ristinollalauta.
	 */
	 public void tulostaLauta(String[][] lauta) {
	    if(lauta == null){
	        System.out.println("Lautaasi ei ole alustettu!");
	        return;
	    }
	    if(lauta.length != 3 || lauta[0].length != 3){
	        System.out.println("Laudallasi on väärät dimensiot. Pitäisi olla 3x3.");
	        return;
	    }
	    
		System.out.println(lauta[0][0]+"|"+lauta[0][1]+"|"+lauta[0][2]);
		System.out.println("-|-|-");
		System.out.println(lauta[1][0]+"|"+lauta[1][1]+"|"+lauta[1][2]);
		System.out.println("-|-|-");
		System.out.println(lauta[2][0]+"|"+lauta[2][1]+"|"+lauta[2][2]);
	}
}
