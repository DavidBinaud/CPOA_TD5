package fr.umontpellier.iut.Ex2.documents;

public class Film extends Document {

    public Film(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "Film \n" + super.toString();
    }
}
