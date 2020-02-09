 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hk
 */
public class Produit {
    private int id;
	private String libelle;
	private String marque;
	private double prix;
	public Produit(int id, String libelle, String marque, double prix)  {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
                  if(prix<=0)try {
                    throw new PrixException("prix ne peut pas etre egale ou egale negatif ");
                } catch (PrixException ex) {
                    Logger.getLogger(Produit.class.getName()).log(Level.SEVERE, null, ex);
                }
        else
       
		this.prix=prix;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	

}





