package com.afpa.tennis.core;

import com.afpa.tennis.core.entity.Joueur;
import com.afpa.tennis.core.repository.JoueurRepository;

import java.util.List;

public class TestJoueurRepository {
    public static void main(String[] args) {
        JoueurRepository joueurRepository = new JoueurRepository();

        // Recherche par Id
        Joueur noah = new Joueur();
        noah.setNom("Noah");
        noah.setPrenom("Yannickkkkkkk");
        noah.setSexe('H');

        // joueurRepository.create(noah);
        // System.out.println("L'id du joueur cré est : " + noah.getId());

        // Update
        Joueur yNoah = joueurRepository.getById(82L);
        yNoah.setPrenom("Yannick");
        // joueurRepository.update(yNoah);

        // Delete
        // joueurRepository.delete(82L);

        // Liste
        List<Joueur> liste = joueurRepository.liste();
        for (Joueur joueur :liste){
            System.out.println(joueur.getPrenom() + " " + joueur.getNom());
        }
    }
}
