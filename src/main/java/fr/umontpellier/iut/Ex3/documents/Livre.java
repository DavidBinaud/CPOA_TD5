package fr.umontpellier.iut.Ex3.documents;

import fr.umontpellier.iut.Ex3.politiques.PolitiqueEmprunt;

public class Livre extends Document {

    public Livre(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "Livre \n" + super.toString();
    }

    @Override
    public void emprunter(PolitiqueEmprunt p) {
        setDateRetour(p.calculerDateRetour(this));
    }
}
