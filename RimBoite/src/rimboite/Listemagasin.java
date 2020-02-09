/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public class Listemagasin {
     Magasine M;
    Listemagasin suiv;
    
	public Listemagasin (Magasine M, Listemagasin suiv) {
		this.M = M;
		this.suiv = suiv;
	}
}
