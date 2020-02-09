/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public class Caisser  extends Employer{
    int numer_caisse;

    public Caisser(int numer_caisse, int id_Em, String nom_Em, String adress_Em, int nbr_h) {
        super(id_Em, nom_Em, adress_Em, nbr_h);
        this.numer_caisse = numer_caisse;
    }

    public int getNumer_caisse() {
        return numer_caisse;
    }

    public static int getNb_Em() {
        return nb_Em;
    }

    public void setNumer_caisse(int numer_caisse) {
        this.numer_caisse = numer_caisse;
    }

    public static void setNb_Em(int nb_Em) {
        Employer.nb_Em = nb_Em;
    }
   public void  AfficheEm(){
   System.out.println("id_E =" +" " +this.id_Em + " "+"nom_Em :"+" " +" "+this.nom_Em +" "+"adress:" +" "+this.adress_Em +" "+"nbreheure :"+this.nbr_h  +" "+"nuemro_caisse:"+this.numer_caisse);
   
   }
    
}
