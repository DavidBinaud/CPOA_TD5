package fr.umontpellier.iut.Ex3.documents;

import fr.umontpellier.iut.Ex3.politiques.PolitiqueEmprunt;

public class Film extends Document {

    public Film(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "Film \n" + super.toString();
    }

    @Override
    public void emprunter(PolitiqueEmprunt p) {
        setDateRetour(p.calculerDateRetour(this));
    }
}
