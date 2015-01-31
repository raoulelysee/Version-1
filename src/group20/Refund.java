/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group20;

import java.io.IOException;
import org.jberger.jsonparsingexample.json.FileReader;
import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;

/**
 *
 * @author Danilo Guerra
 */
public class Refund {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        DemandeDeReclamation uneDemandeDeReclamation = new DemandeDeReclamation();
        System.out.println("Demande de reclamation vide");
        System.out.println(uneDemandeDeReclamation);
        System.out.println();
        
        replirDemandeDeReclamation("src/group20/inputfile.json", uneDemandeDeReclamation);
        System.out.println("Demande de reclamation remplie");
        System.out.println(uneDemandeDeReclamation);
        System.out.println();
        
        validerDemandeDeReclamation(uneDemandeDeReclamation);
        
        Contrat unContrat = new Contrat(uneDemandeDeReclamation.getCodeContrat());
        System.out.println("Contrat en fonction de la demande de reclamation");
        System.out.println(unContrat);
        System.out.println();
        
        miseAJourDeRemboursements(uneDemandeDeReclamation, unContrat);
        creationFichierDeSortie(uneDemandeDeReclamation, "src/group20/outputfile.json");
        
        } catch (IOException e){
            //Implementer reponse a l exception        
        }
    
    }

    private static String getJSONToString(String cheminFichierJSON) throws IOException{
        return FileReader.loadFileIntoString(cheminFichierJSON, "UTF-8");
        
    }

    private static JSONArray getTableauJSON(String fichierJSON) throws IOException{
        return (JSONArray)JSONSerializer.toJSON(fichierJSON);
    }
    
    private static void replirDemandeDeReclamation(String cheminFichierJSON, DemandeDeReclamation uneDemandeDeReclamation) throws IOException {
        
        String fichierJSON = getJSONToString(cheminFichierJSON);
        
        JSONArray tableauJSON = getTableauJSON(fichierJSON);
        
        String numeroClient = tableauJSON.getJSONObject(0).getString("client");
        String codeContrat = tableauJSON.getJSONObject(0).getString("contrat");
        String moisReclamation = tableauJSON.getJSONObject(0).getString("mois");
        String reclamations = tableauJSON.getJSONObject(0).getString("reclamations");
        
        uneDemandeDeReclamation.setNumeroClient(numeroClient);
        uneDemandeDeReclamation.setCodeContrat(codeContrat);
        uneDemandeDeReclamation.setMoisReclamation(moisReclamation);
        
        ajouterReclamationsADemande(reclamations, uneDemandeDeReclamation);
    }
    
    private static void ajouterReclamationsADemande(String reclamations, DemandeDeReclamation uneDemandeDeReclamation) throws IOException{
        JSONArray tableauReclamations = getTableauJSON(reclamations);
        int codeSoin;
        String dateSoin;
        String montantReclame;
       
        long nombreElements = tableauReclamations.size();
        
        for(int x = 0; x < nombreElements; x++){
            codeSoin = Integer.parseInt(tableauReclamations.getJSONObject(x).getString("soin"));
            dateSoin = tableauReclamations.getJSONObject(x).getString("date");
            montantReclame = tableauReclamations.getJSONObject(x).getString("montant");
             
            uneDemandeDeReclamation.addReclamationAListeDeReclamations(new Reclamation(codeSoin, dateSoin, montantReclame));
        }
    }

    private static void validerDemandeDeReclamation(DemandeDeReclamation uneDemandeDeReclamation) throws IOException{
        //Implementer ici l'ensemble de methodes de validation (noclient, lettre du contrat, mois du contrat, etc)
    }

    private static void miseAJourDeRemboursements(DemandeDeReclamation uneDemandeDeReclamation, Contrat unContrat) throws IOException {
        //Implementer ici l'ensemble de methodes pour mettre a jour remboursement par reclamation
        //Iteration par reclamation
        //Methode pour calcul du remboursement
    }

    private static void calculDuRemboursement(Reclamation uneReclamation, TauxDeRemboursement unTauxDeRemboursement) throws IOException {
        //Implemente methode que calcule le remboursement
    }
    private static void creationFichierDeSortie(DemandeDeReclamation uneDemandeDeReclamation, String arg) throws IOException {
        //Implementer ici methodes pour generer fichier de sortie
    }
    
}
