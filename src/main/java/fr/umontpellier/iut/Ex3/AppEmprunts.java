package fr.umontpellier.iut.Ex3;

import fr.umontpellier.iut.Ex3.documents.CD;
import fr.umontpellier.iut.Ex3.documents.Document;
import fr.umontpellier.iut.Ex3.documents.Film;
import fr.umontpellier.iut.Ex3.documents.Livre;
import fr.umontpellier.iut.Ex3.politiques.EmpruntDateFixe;
import fr.umontpellier.iut.Ex3.politiques.EmpruntSelonTypeDoc;

import java.util.ArrayList;
import java.util.HashMap;

public class AppEmprunts {

    private static HashMap<String, Document> fonds = new HashMap<>();

    public static void constituerFonds() {
        fonds.put("LI_ORW_1",new Livre("1984"));
        fonds.put("LI_TOL_1",new Livre("Le seigneur des anneaux"));
        fonds.put("CD_STO_1",new CD("Satisfaction"));
        fonds.put("CD_BEA_1",new CD("Abbey Road"));
        fonds.put("FI_KUB_1",new Film("2001 Odyssée de l'espace"));
        fonds.put("FI_SCO_1",new Film("Taxi Driver"));
    }


    public static void main(String[] args) {
        constituerFonds();

        ArrayList<Document> panierDocument = new ArrayList<>();
        panierDocument.add(fonds.get("LI_ORW_1"));
        panierDocument.add(fonds.get("LI_TOL_1"));
        panierDocument.add(fonds.get("CD_BEA_1"));
        panierDocument.add(fonds.get("FI_KUB_1"));


        EmpruntDateFixe politiqueFixe = new EmpruntDateFixe(15);
        EmpruntSelonTypeDoc politiqueType = new EmpruntSelonTypeDoc();

        for (Document d: panierDocument) {
            d.emprunter(politiqueFixe);
            System.out.println(d.toString());
            d.emprunter(politiqueType);
            System.out.println(d.toString());
        }
    }
}