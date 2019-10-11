package fr.umontpellier.iut.Ex3.politiques;

import fr.umontpellier.iut.Ex3.CalculDate;
import fr.umontpellier.iut.Ex3.documents.CD;
import fr.umontpellier.iut.Ex3.documents.Film;
import fr.umontpellier.iut.Ex3.documents.Livre;
import fr.umontpellier.iut.Ex3.emprunteurs.Emprunteur;

import java.time.LocalDate;

public class EmpruntSelonTypeEmprunteur implements PolitiqueEmprunt {

    private Emprunteur emp;

    public EmpruntSelonTypeEmprunteur(Emprunteur emp) {
        this.emp = emp;
    }

    @Override
    public LocalDate calculerDateRetour(Livre livre) {
        return CalculDate.ajouter(10 + emp.getBonus(new AvantageCarteLecture()));
    }

    @Override
    public LocalDate calculerDateRetour(CD cd) {
        return CalculDate.ajouter(10 + emp.getBonus(new AvantageCarteMusique()));
    }

    @Override
    public LocalDate calculerDateRetour(Film film) {
        return CalculDate.ajouter(10 + emp.getBonus(new AvantageStatut()));
    }
}
