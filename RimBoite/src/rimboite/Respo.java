/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public class Respo  extends Employer {
   double  prime ;

    public Respo(double prime, int id_Em, String nom_Em, String adress_Em, int nbr_h) {
        super(id_Em, nom_Em, adress_Em, nbr_h);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public static int getNb_Em() {
        return nb_Em;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public static void setNb_Em(int nb_Em) {
        Employer.nb_Em = nb_Em;}
 
   public void  AfficheEm(){
   System.out.println("id_E =" +" " +this.id_Em + " "+" "+"nom_Em :"+" " +" "+this.nom_Em  +" "+"adress:" +" "+this.adress_Em +" "+"nbreheure :"+this.nbr_h  +" "+"prime:"+this.prime);
   
   }
}