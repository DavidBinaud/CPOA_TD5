package fr.umontpellier.iut.Ex3.emprunteurs;

import fr.umontpellier.iut.Ex3.politiques.AvantageEmprunteur;

public class EmprunteurBronze implements Emprunteur {

    @Override
    public int getBonus(AvantageEmprunteur av) {
        return av.getBonusEmprunteur(this);
    }
}
