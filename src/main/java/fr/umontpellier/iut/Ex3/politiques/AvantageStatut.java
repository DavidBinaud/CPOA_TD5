package fr.umontpellier.iut.Ex3.politiques;

import fr.umontpellier.iut.Ex3.emprunteurs.*;

public class AvantageStatut implements AvantageEmprunteur {

    @Override
    public int getBonusEmprunteur(EmprunteurStandard emprunteur) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurOr emprunteur) {
        return 8;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurArgent emprunteur) {
        return 5;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurBronze emprunteur) {
        return 2;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurCarteLecture emprunteur) {
        return 0;
    }

    @Override
    public int getBonusEmprunteur(EmprunteurCarteMusique emprunteur) {
        return 0;
    }
}
