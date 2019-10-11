package fr.umontpellier.iut.Ex2.politiques;

import fr.umontpellier.iut.Ex2.documents.CD;
import fr.umontpellier.iut.Ex2.documents.Film;
import fr.umontpellier.iut.Ex2.documents.Livre;

import java.time.LocalDate;

public interface PolitiqueEmprunt {

    LocalDate calculerDateRetour(Livre livre);
    LocalDate calculerDateRetour(CD cd);
    LocalDate calculerDateRetour(Film film);
}
