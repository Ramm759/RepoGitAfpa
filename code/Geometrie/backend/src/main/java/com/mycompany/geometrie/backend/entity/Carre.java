package com.mycompany.geometrie.backend.entity;

public class Carre extends Quadrilatere implements FigureGeometriqueInterface{
    public Carre() {
    }

    public Carre(double cote) {
        super(cote);
    }

    @Override
    public double calculerSurface() {
        return this.getCote() * this.getCote();
    }

    @Override
    public double calculerPerimetre() {
        return (this.getCote()) * 4;
    }
}
