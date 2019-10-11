package fr.umontpellier.iut.Ex3.politiques;

import fr.umontpellier.iut.Ex3.documents.CD;
import fr.umontpellier.iut.Ex3.documents.Film;
import fr.umontpellier.iut.Ex3.documents.Livre;

import java.time.LocalDate;

public interface PolitiqueEmprunt {

    LocalDate calculerDateRetour(Livre livre);
    LocalDate calculerDateRetour(CD cd);
    LocalDate calculerDateRetour(Film film);
}
