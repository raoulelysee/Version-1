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
class Contrat {
    String nomContrat;
    List<TauxDeRemboursement> listeTauxDeRemboursement;

    public Contrat(String nomContrat) {
        this.nomContrat = nomContrat;
        this.listeTauxDeRemboursement = new ArrayList();
        if (nomContrat.equals("A")){
            setContratA();
        }
        else if (nomContrat.equals("B")){
            setContratB();
        }
        else if  (nomContrat.equals("C")){
            setContratC();
        }
        else if (nomContrat.equals("D")){
            setContratD();
        }
        else{
            //Contrat inexistent
        }
    
    }
    
    public void addTauxAListeDeTauxDeRemboursement (TauxDeRemboursement tauxDeRemboursement){
        this.listeTauxDeRemboursement.add(tauxDeRemboursement);
    }
    
    private void setContratA(){
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(0,"Massothérapie",25,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(100,"Ostéopathie",25,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(200,"Psychologie individuelle",25,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(300,"Soins dentaires ",0,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(400,"Naturopathie, acuponcture",0,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(500,"Chiropratie",25,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(600,"Physiothérapie",40,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(700,"Orthophonie, ergothérapie",0,1000000));
                
    }
    
    private void setContratB(){
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(0,"Massothérapie",50,40));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(100,"Ostéopathie",50,50));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(200,"Psychologie individuelle",100,70));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(300,"Soins dentaires ",50,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(400,"Naturopathie, acuponcture",0,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(500,"Chiropratie",50,50));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(600,"Physiothérapie",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(700,"Orthophonie, ergothérapie",70,1000000));
                
    }
    
    private void setContratC(){
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(0,"Massothérapie",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(100,"Ostéopathie",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(200,"Psychologie individuelle",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(300,"Soins dentaires ",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(400,"Naturopathie, acuponcture",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(500,"Chiropratie",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(600,"Physiothérapie",90,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(700,"Orthophonie, ergothérapie",90,1000000));
                
    }
    
    private void setContratD(){
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(0,"Massothérapie",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(100,"Ostéopathie",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(200,"Psychologie individuelle",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(300,"Soins dentaires ",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(400,"Naturopathie, acuponcture",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(500,"Chiropratie",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(600,"Physiothérapie",100,1000000));
        this.addTauxAListeDeTauxDeRemboursement(new TauxDeRemboursement(700,"Orthophonie, ergothérapie",100,1000000));
                
    }
    
    public TauxDeRemboursement getTauxDeRemboursement(int codeSoin){
        
        TauxDeRemboursement unTauxDeRemboursement = new TauxDeRemboursement();
        
        for (int x=0; x < this.listeTauxDeRemboursement.size(); x++){
            System.out.println(this.listeTauxDeRemboursement.get(x).getCodeSoin());
            if(this.listeTauxDeRemboursement.get(x).getCodeSoin() == codeSoin){
                unTauxDeRemboursement = this.listeTauxDeRemboursement.get(x);
            }
        }
        return unTauxDeRemboursement;
    }    

    public String toString() {
        return "Contrat{" + "nomContrat=" + nomContrat + ", listeTauxDeRemboursement=" + listeTauxDeRemboursement + '}';
    }
    
    
}
