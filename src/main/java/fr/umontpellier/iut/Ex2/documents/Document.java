package fr.umontpellier.iut.Ex2.documents;

import fr.umontpellier.iut.Ex2.politiques.PolitiqueEmprunt;

import java.time.LocalDate;

public abstract class Document {
    private LocalDate dateRetour;
    private String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    protected void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "[titre = " + titre + ", " +
                (dateRetour == null ? " non emprunté" : "Retour le " + dateRetour) + "]";
    }

    //On est obligé de le réaliser dans les classes filles car on doit passer l'objet this
    //et le passer depuis cette classe ferait qu'on ne pourrait pas faire la distinction entre ses classes filles
    public abstract void emprunter(PolitiqueEmprunt p);
}
