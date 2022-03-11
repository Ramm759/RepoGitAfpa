package com.mycompany.boatAndCo.entity;

public class Port {
    private String name;
    private int nbOfDisponiblesSites;
    private Boat[] sites;

    private int nbOffreeSites;

    public boolean restePlaceDisponible(Boat[] emplacements) {
        boolean restePlaceDisponible = false;

        for (int index = 0; index < emplacements.length; index++) {

            if (emplacements[index] == null) {
                return true;
            }
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbOfDisponiblesSites() {
        return nbOfDisponiblesSites;
    }

    public void setNbOfDisponiblesSites(int nbOfDisponiblesSites) {
        this.nbOfDisponiblesSites = nbOfDisponiblesSites;
    }

    public Boat[] getSites() {
        return sites;
    }

    public void setSites(Boat[] sites) {
        this.sites = sites;
    }

    public int getNbOffreeSites() {
        return nbOffreeSites;
    }

    public void setNbOffreeSites(int nbOffreeSites) {
        this.nbOffreeSites = nbOffreeSites;
    }
}


