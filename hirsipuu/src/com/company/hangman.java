package com.company;

public class hangman {
    private String sana;
    private String naytettavaSana;
    private int arvaustenMaara;
    private int arvauksiaTehty;
    private boolean peliOhi;

    public hangman(String sana, int arvaustenMaara){
        this.sana = sana;
        this.arvaustenMaara = arvaustenMaara;
        this.arvauksiaTehty = 0;
        this.peliOhi = false;
        this.naytettavaSana = "";
        for(int i = 0; i < this.sana.length(); i++){
            this.naytettavaSana += "_";
        }
    }
    public void arvaa(char arvaus){
        if(!this.peliOhi){
            StringBuilder uusiNaytettavaSana = new StringBuilder(this.naytettavaSana);
            for(int i = 0; i < this.sana.length(); i++){
                int paikka = this.sana.indexOf(arvaus, i);
                    if(paikka != -1) {
                        for (int j = i; j < this.sana.length(); j++) {
                            if (paikka == j) {
                                uusiNaytettavaSana.setCharAt(j, sana.charAt(j));
                            } else {
                                uusiNaytettavaSana.setCharAt(j, this.naytettavaSana.charAt(j));
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
            this.naytettavaSana = uusiNaytettavaSana.toString();
            this.arvauksiaTehty++;
            this.paivitaPeliOhi();
        }
    }

    public String getNaytettavaSana() {
        return this.naytettavaSana;
    }
    public boolean getPeliOhi(){
        return this.peliOhi;
    }
    public void paivitaPeliOhi(){
        if (this.arvauksiaTehty == this.arvaustenMaara){
            this.peliOhi = true;
        }
    }
    public int getArvauksiaTehty(){
        return this.arvauksiaTehty;
    }
}
