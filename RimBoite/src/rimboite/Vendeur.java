/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public class Vendeur  extends Employer {
    double tauxVente;

    public Vendeur(double tauxVente, int id_Em, String nom_Em, String adress_Em, int nbr_h) {
        super(id_Em, nom_Em, adress_Em, nbr_h);
        this.tauxVente = tauxVente;
    }

    public double getTauxVente() {
        return tauxVente;
    }

    public static int getNb_Em() {
        return nb_Em;
    }

    public void setTauxVente(double tauxVente) {
        this.tauxVente = tauxVente;
    }
   public void  AfficheEm(){
   System.out.println("id_E =" +" " +this.id_Em + " "+" "+"nom_Em :"+" " +" "+this.nom_Em + " " +"adress:" +" "+this.adress_Em +" "+"nbreheure :"+this.nbr_h  +" "+"tauxVente:"+this.tauxVente);
   
   }
}

  


