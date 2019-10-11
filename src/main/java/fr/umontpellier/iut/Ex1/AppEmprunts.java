package fr.umontpellier.iut.Ex1;

import java.util.ArrayList;
import java.util.HashMap;

import fr.umontpellier.iut.Ex1.documents.CD;
import fr.umontpellier.iut.Ex1.documents.Document;
import fr.umontpellier.iut.Ex1.documents.Film;
import fr.umontpellier.iut.Ex1.documents.Livre;

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

    public static void gestionEmprunts(ArrayList<Document> listeDocuments){
        for (Document d:listeDocuments) {
            d.setDateRetour(CalculDate.ajouter(15));
        }
    }

    public static void main(String[] args) {
        constituerFonds();

        ArrayList<Document> panierDocument = new ArrayList<>();
        panierDocument.add(fonds.get("LI_ORW_1"));
        panierDocument.add(fonds.get("LI_TOL_1"));
        panierDocument.add(fonds.get("CD_BEA_1"));
        panierDocument.add(fonds.get("FI_KUB_1"));

        gestionEmprunts(panierDocument);


        for (Document d: panierDocument) {
            System.out.println(d.toString());
        }
    }
}
