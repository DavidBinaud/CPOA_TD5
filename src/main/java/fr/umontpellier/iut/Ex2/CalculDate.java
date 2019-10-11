package fr.umontpellier.iut.Ex2;

import java.time.LocalDate;

public class CalculDate {

    static LocalDate ajouter(int nbJours){
        return LocalDate.now().plusDays(nbJours);
    }
}
