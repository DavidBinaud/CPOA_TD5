package fr.umontpellier.iut.Ex2;

import java.time.LocalDate;

public class CalculDate {

    public static LocalDate ajouter(int nbJours){
        return LocalDate.now().plusDays(nbJours);
    }
}
