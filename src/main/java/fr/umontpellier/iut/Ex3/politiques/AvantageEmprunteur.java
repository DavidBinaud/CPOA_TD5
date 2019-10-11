package fr.umontpellier.iut.Ex3.politiques;

import fr.umontpellier.iut.Ex3.emprunteurs.*;

public interface AvantageEmprunteur {

    int getBonusEmprunteur(EmprunteurStandard emprunteur);
    int getBonusEmprunteur(EmprunteurOr emprunteur);
    int getBonusEmprunteur(EmprunteurArgent emprunteur);
    int getBonusEmprunteur(EmprunteurBronze emprunteur);
    int getBonusEmprunteur(EmprunteurCarteLecture emprunteur);
    int getBonusEmprunteur(EmprunteurCarteMusique emprunteur);
}
