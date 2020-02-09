/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public abstract class Employer {

    int id_Em;
    String nom_Em;
    String adress_Em;
    int nbr_h;
static int nb_Em=0;
   public  abstract void  AfficheEm();
   
    public Employer(int id_Em, String nom_Em, String adress_Em, int nbr_h) {
        
        this.id_Em = id_Em;
        this.nom_Em = nom_Em;
        this.adress_Em = adress_Em;
        this.nbr_h = nbr_h;
    
      
    
    
    }

    
 









    public int getId_Em() {
        return id_Em;
    }

    public String getNom_Em() {
        return nom_Em;
    }

    public String getAdress_Em() {
        return adress_Em;
    }

    public int getNbr_h() {
        return nbr_h;
    }

    public void setId_Em(int id_Em) {
        this.id_Em = id_Em;
    }

    public void setNom_Em(String nom_Em) {
        this.nom_Em = nom_Em;
    }

    public void setAdress_Em(String adress_Em) {
        this.adress_Em = adress_Em;
    }

    public void setNbr_h(int nbr_h) {
        this.nbr_h = nbr_h;
    }
 
    }
    

