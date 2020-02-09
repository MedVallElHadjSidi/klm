/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public class Listeemployer {
    Employer e;
   Magasine m;
    Listeemployer suiv;

    public Listeemployer(Employer e, Magasine m, Listeemployer suiv) {
        this.e = e;
        this.m = m;
        this.suiv = suiv;
    }

    

  
}
