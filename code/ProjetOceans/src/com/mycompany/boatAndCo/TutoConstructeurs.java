package com.mycompany.boatAndCo;
import com.mycompany.boatAndCo.entity.Adress;
import com.mycompany.boatAndCo.entity.Motor;
import com.mycompany.boatAndCo.entity.Passager;

public class TutoConstructeurs {
    public static void main(String[] args) {
        Passager passagerDupont = new Passager();
        Passager passagerDurand = new Passager();

        Passager passagerAvecNom = new Passager("Dupuis");
        System.out.println("Le passager créé avec le constructeur qui prend en paramètre" +
                " le nom du passager est " + passagerAvecNom.getLastname());

        Passager passagerAvecNomEtPrenom = new Passager("Dupuis", "René");
        System.out.println("Le passager créé avec le constructeur qui prend en paramètre" +
                " le nom et le prénom du passager est " + passagerAvecNomEtPrenom.getLastname() + " " + passagerAvecNomEtPrenom.getFirstname());


        Adress adressOfDupont = new Adress(7, "Rue Emile Zola", 59000, "Lille");
        passagerDupont.setAddress(adressOfDupont);
        passagerDupont.setLastname("Dupont");

        System.out.println("L'adresse de M." + passagerDupont.getLastname() + " est "
        + passagerDupont.getAddress().getNumber() + " " + passagerDupont.getAddress().getNumber() + " "+ passagerDupont.getAddress().getCp() + " " +
                 passagerDupont.getAddress().getCity());

        Passager pasagerToto = new Passager("Toto", "René", 8, "rue Verte", 59000, "Lille");
        System.out.println("L'adresse de M." + pasagerToto.getLastname() + " est "
                + pasagerToto.getAddress().getNumber() + " " + pasagerToto.getAddress().getStreet() + " "+ pasagerToto.getAddress().getCp() + " " +
                pasagerToto.getAddress().getCity());

        System.out.println(Passager.nbOfpassagersCreated + " passagés ont été créés.");

        System.out.println();

        // Utilisation des Getters & Setters
        System.out.println("Utilisation des Getters & Setters");
        Motor motorTest = new Motor();

        motorTest.setNbCylinder(4);
        // remplace
        // moteurTest.NbCylindres = 4;

        motorTest.setYearOfManufacture("1987");
        // remplace
        //moteurTest.anneeFabricationMoteur = "1987";

        System.out.println(motorTest.getYearOfManufacture());
        // remplace
        // System.out.println(moteurTest.anneeFabricationMoteur);

    }
}
