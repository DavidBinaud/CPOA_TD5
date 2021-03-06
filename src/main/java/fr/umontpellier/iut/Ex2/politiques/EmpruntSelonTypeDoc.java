package fr.umontpellier.iut.Ex2.politiques;

import fr.umontpellier.iut.Ex2.CalculDate;
import fr.umontpellier.iut.Ex2.documents.CD;
import fr.umontpellier.iut.Ex2.documents.Film;
import fr.umontpellier.iut.Ex2.documents.Livre;

import java.time.LocalDate;

public class EmpruntSelonTypeDoc implements PolitiqueEmprunt {

    @Override
    public LocalDate calculerDateRetour(Livre livre) {
        return CalculDate.ajouter(20);
    }

    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return CalculDate.ajouter(10);
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return CalculDate.ajouter(5);
    }
}
