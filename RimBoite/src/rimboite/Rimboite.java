/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
public class Rimboite {
    public static void main(String[] args) {
       Magasine m1=new Magasine(1,"carrefour","centre_ville");
   Produit p1=new Produit(1,"ordinateu1","toshiba", 95.0);
    Produit p2=new  Produit (2,"ordinateur2","hp",1000.0);
       Magasine m2=new Magasine(2,"Monoprix", "Tavragh Zein");
        Magasine .ajouterMagasin(m1);
         Magasine.ajouterMagasin(m2);
              m1.ajouterProduit(p2);
              m1.ajouterProduit(p1);
              m2.ajouterProduit(p2);
     //          m1.magazinInfos();
         //      m2.magazinInfos();
          //     Magasine.nombre_supérieur(m1, m2);
         
   
 Employer c1=new Caisser(1,1,"med","carefour",23);
 c1.AfficheEm();
 Employer c2 =new Caisser(2,2,"ab","tvz",45);
 c2.AfficheEm();
 Employer v=new Vendeur(12.0,3,"we","rew",23);
 v.AfficheEm();
 Employer res= new Respo(12.3,4,"sidi","iuscae",45);
 res.AfficheEm();
    Produit p3=new Produit(3,"boubou","ezbi", 95.0);
    Produit p4=new  Produit (4,"boubou","royal",1000.0);
       Produit p5=new Produit(5,"chemise","lotti", 1200.0);
    Produit p6=new  Produit (6,"chemise","cocu",1000.0);
       Produit p7=new Produit(7,"toto","tata", 95.0);
    Produit p8=new  Produit (8,"hihi","haha",1000.0);
      
 
     
    
    }
}
