package fr.umontpellier.iut.Ex1.documents;

public class CD extends Document {

    public CD(String titre) {
        super(titre);
    }

    @Override
    public String toString() {
        return "CD \n" + super.toString();
    }
}
