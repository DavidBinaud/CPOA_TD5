package fr.umontpellier.iut.Ex2.politiques;

import fr.umontpellier.iut.Ex2.CalculDate;
import fr.umontpellier.iut.Ex2.documents.CD;
import fr.umontpellier.iut.Ex2.documents.Film;
import fr.umontpellier.iut.Ex2.documents.Livre;

import java.time.LocalDate;

public class EmpruntDateFixe implements PolitiqueEmprunt {

    private int nbjours;

    public EmpruntDateFixe(int nbjours) {
        this.nbjours = nbjours;
    }

    private LocalDate calculAuxiliaire(){
        return CalculDate.ajouter(nbjours);
    }

    @Override
    public LocalDate calculerDateRetour(Livre livre) {
        return calculAuxiliaire();
    }

    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return calculAuxiliaire();
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return calculAuxiliaire();
    }
}
