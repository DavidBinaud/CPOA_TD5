package fr.umontpellier.iut.Ex3.documents;

import fr.umontpellier.iut.Ex3.politiques.PolitiqueEmprunt;

public class CD extends Document {

    public CD(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "CD \n" + super.toString();
    }

    @Override
    public void emprunter(PolitiqueEmprunt p) {
        setDateRetour(p.calculerDateRetour(this));
    }
}
