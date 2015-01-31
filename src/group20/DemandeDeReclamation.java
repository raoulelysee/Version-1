/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Guerra
 */
public class DemandeDeReclamation {
    
    String numeroClient;
    String codeContrat;
    String moisReclamation;
    List<Reclamation> listeDeReclamations;

    public DemandeDeReclamation() {
        setNumeroClient(null);
        setCodeContrat(null);
        setMoisReclamation(null);
        listeDeReclamations = new ArrayList();
    }
   
    public DemandeDeReclamation(String numeroClient, String codeContrat, String moisReclamation) {
        setNumeroClient(numeroClient);
        setCodeContrat(codeContrat);
        setMoisReclamation(moisReclamation);
        listeDeReclamations = new ArrayList();
    }

    public void setNumeroClient(String numeroClient) {
        this.numeroClient = numeroClient;
    }

    public void setCodeContrat(String codeContrat) {
        this.codeContrat = codeContrat;
    }

    public void setMoisReclamation(String moisReclamation) {
        this.moisReclamation = moisReclamation;
    }

    public String getNumeroClient() {
        return numeroClient;
    }

    public String getCodeContrat() {
        return codeContrat;
    }

    public String getMoisReclamation() {
        return moisReclamation;
    }

    public List<Reclamation> getListeDeReclamations() {
        return listeDeReclamations;
    }
    
    public void setListeDeReclamations(List<Reclamation> listeDeReclamations) {
        this.listeDeReclamations = listeDeReclamations;
    }
    
    public void addReclamationAListeDeReclamations (Reclamation uneReclamation){
        this.listeDeReclamations.add(uneReclamation);
    }

    public String toString() {
        return "DemandeDeReclamation{" + "numeroClient=" + numeroClient + ", codeContrat=" + codeContrat + ", moisReclamation=" + moisReclamation + ", listeDeReclamations=" + listeDeReclamations + '}';
    }

   
    
}
