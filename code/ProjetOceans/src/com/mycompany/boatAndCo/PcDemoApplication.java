package com.mycompany.boatAndCo;

import com.mycompany.boatAndCo.entity.Computer;
import com.mycompany.boatAndCo.entity.Screen;

public class PcDemoApplication {
    public static void main(String[] args) {
        Screen ecranAcer = new Screen("Acer","A000214C", 17);
        System.out.println("L'écran instancié est de marque " + ecranAcer.getMarque() + " " + ecranAcer.getModele() + " " +
                " , sa taille est de " + ecranAcer.getTaille() + " pouces");

        Computer pcFujitsu = new Computer("Amd", ecranAcer);
        System.out.println("Le pc instancié a un processeur de marque " + pcFujitsu.getMarqueProcesseur() +
                        " , son écran est de marque "+ pcFujitsu.getScreen().getMarque() + " , sa taille est de "+
                pcFujitsu.getScreen().getTaille() + " pouces."
                );

        Computer pcAvecProprietesEcran = new Computer("Intel", "Mi", "MiA4587C", 40);
        System.out.println("Le pc instancié a un processeur de marque " + pcAvecProprietesEcran.getMarqueProcesseur() +
                " , son écran est de marque "+ pcAvecProprietesEcran.getScreen().getMarque() + " , sa taille est de "+
                pcAvecProprietesEcran.getScreen().getTaille() + " pouces."
        );

        ecranAcer.afficherTexte("Hello", "rouge");



        System.out.println(Screen.getNbEcranInstancies() + " écrans ont été instanciés.");
        System.out.println(Computer.getNbPcInstancies() + " Pc ont été instanciés");
    }
}
