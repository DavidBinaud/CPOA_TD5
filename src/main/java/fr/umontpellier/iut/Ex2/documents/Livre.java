package fr.umontpellier.iut.Ex2.documents;

public class Livre extends Document {

    public Livre(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "Livre \n" + super.toString();
    }
}
