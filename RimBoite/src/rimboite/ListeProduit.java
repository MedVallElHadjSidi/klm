/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */

public class ListeProduit {
    Produit P;
	 ListeProduit suiv;
	public ListeProduit(Produit p, ListeProduit suiv) {
		P = p;
		this.suiv = suiv;
	}
}
