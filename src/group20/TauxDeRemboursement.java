/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group20;

/**
 *
 * @author Danilo Guerra
 */
class TauxDeRemboursement {
    int codeSoin;
    String nomSoin;
    double tauxRemboursement;
    double remboursementMaximal;
    
    public TauxDeRemboursement(){
        this.setCodeSoin(0);
        this.setNomSoin(null);
        this.setTauxRemboursement(0);
        this.setRemboursementMaximal(0);
    }

    public TauxDeRemboursement(int codeSoin, String nomSoin, double tauxRemboursement, double remboursementMaximal) {
        this.setCodeSoin(codeSoin);
        this.setNomSoin(nomSoin);
        this.setTauxRemboursement(tauxRemboursement);
        this.setRemboursementMaximal(remboursementMaximal);
    }

    public void setCodeSoin(int codeSoin) {
        this.codeSoin = codeSoin;
    }

    public void setNomSoin(String nomSoin) {
        this.nomSoin = nomSoin;
    }

    public void setTauxRemboursement(double tauxRemboursement) {
        this.tauxRemboursement = tauxRemboursement;
    }

    public void setRemboursementMaximal(double remboursementMaximal) {
        this.remboursementMaximal = remboursementMaximal;
    }

    public int getCodeSoin() {
        return codeSoin;
    }

    public String getNomSoin() {
        return nomSoin;
    }

    public double getTauxRemboursement() {
        return tauxRemboursement;
    }

    public double getRemboursementMaximal() {
        return remboursementMaximal;
    }

    public String toString() {
        return "TauxDeRemboursement{" + "codeSoin=" + codeSoin + ", nomSoin=" + nomSoin + ", tauxRemboursement=" + tauxRemboursement + ", remboursementMaximal=" + remboursementMaximal + '}';
    }
    
    
}
