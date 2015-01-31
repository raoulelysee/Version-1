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
public class Reclamation {
    
    int codeSoin;
    String dateSoin;
    String montantReclame;
    String montantRembourse;
    
    public Reclamation(){
        setCodeSoin(0);
        setDateSoin(null);
        setMontantReclame(null);
        setMontantRembourse("0$");
    }
    public Reclamation(int codeSoin, String dateSoin, String montantReclame){
        setCodeSoin(codeSoin);
        setDateSoin(dateSoin);
        setMontantReclame(montantReclame);
        setMontantRembourse("0$");
    }

    public void setCodeSoin(int codeSoin) {
        this.codeSoin = codeSoin;
    }

    public void setDateSoin(String dateSoin) {
        this.dateSoin = dateSoin;
    }

    public void setMontantReclame(String montantReclame) {
        this.montantReclame = montantReclame;
    }

    public void setMontantRembourse(String montantRembourse) {
        this.montantRembourse = montantRembourse;
    }

    public int getCodeSoin() {
        return codeSoin;
    }

    public String getDateSoin() {
        return dateSoin;
    }

    public String getMontantReclame() {
        return montantReclame;
    }

    public String getMontantRembourse() {
        return montantRembourse;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "codeSoin=" + codeSoin + ", dateSoin=" + dateSoin + ", montantReclame=" + montantReclame + ", montantRembourse=" + montantRembourse + '}';
    }
    
    
}
