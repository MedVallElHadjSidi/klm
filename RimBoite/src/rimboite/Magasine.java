/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rimboite;

/**
 *
 * @author hk
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import static rimboite.Employer.nb_Em;
public class Magasine {
    
    
    

   private int id;
   private String adresse,nom;
	  Employer e;
           
	private  int capacite;
	public static int nbProduit;
	public static Listemagasin Listemagasin=null;
	private ListeProduit ListeProduit;
        public  static Listeemployer Listeemployer=null;
    private Produit P;
	 Magasine m;
	  public  int nb_em;
	
	
	public Magasine(int id, String nom, String adresse) {
		this.id = id;
		this.nom=nom;
		this.adresse = adresse;
		this.ListeProduit=null;
		
	}
	public static void  ajouterMagasin(Magasine M){
			Listemagasin = new Listemagasin(M, Listemagasin);
			
		}
      public    void  ajouterEm( Magasine m,Employer e){
         
        
      
           
          
          Listeemployer =new Listeemployer(e,m,Listeemployer);
         
      }
    ////        

    public int getNb_em() {
        return nb_em;
    }
        
        
        
        
        
//////////       
	public void  ajouterProduit(Produit p){
              
            
            if(verifierCapacite()){
            this.ListeProduit = new ListeProduit(p, this.ListeProduit);
          
			capacite++;
			nbProduit++;
            
            }
            else
                System.err.println("la capacité du magasin ne peut pas depasser 50");
        }  
	public void  magazinInfos(){
		ListeProduit tmp = ListeProduit;
		System.out.println("ID : "+this.id+", Adresse : "+this.adresse+", Capacite : "
				+ ""+this.capacite);
		while(tmp != null){
			System.out.println("idProduit :"+tmp.P.getId()+" , Libelle :"+tmp.P.getLibelle()+" "
					+ "Marque : "+tmp.P.getMarque()+" Prix : "+tmp.P.getPrix());
			tmp = tmp.suiv;
		}
	}
	
	public static void nombre_supérieur( Magasine M1, Magasine M2) {
		
		 
		if(M1.capacite> M2.capacite){
			M1.magazinInfos();
		}
		
		else{
			M2.magazinInfos();
		}
	}
	public boolean comparer(Produit p){
		ListeProduit tmp = ListeProduit;
		while(tmp != null ){
			if((tmp.P.getId() == p.getId()) && (tmp.P.getLibelle().equalsIgnoreCase(p.getLibelle())) && (tmp.P.getPrix() == p.getPrix())){
				return true;
			}
			tmp = tmp.suiv;
		}
		return false;
	}
	
	public boolean comparerdeuxProduit(Produit p,Produit p2){
		{
			if((p2.getId() == p.getId()) && (p2.getLibelle().equalsIgnoreCase(p.getLibelle())) && (p2.getPrix() == p.getPrix())){
				return true;
			}
			
		}
		return false;
	}
	public int  chercher(Produit p){
		ListeProduit tmp = ListeProduit;
		while(tmp != null ){
			if((tmp.P.getId() == p.getId()) && (tmp.P.getLibelle().equalsIgnoreCase(p.getLibelle())) && (tmp.P.getPrix() == p.getPrix())){
				return 1;
			}
			tmp = tmp.suiv;
		}
		return 0;
	}

   public void    supprimerProduit(Produit p){
    ListeProduit tmp1 =  ListeProduit ;
      ListeProduit tmp2 =  ListeProduit ;
     boolean b= false;
      
   while(tmp2 != null  && !b){
 
  
  if(comparerdeuxProduit(tmp2.P,p)){
  b=true;
  tmp1=tmp2.suiv;
  
  }
  else{
      tmp1.suiv=tmp2;
  tmp2=tmp2.suiv;
   b=false;}
  }
    if(b) {
           System.out.println(" le produit a ete suprimer ");
       }else System.out.println(" le produit n'a pas  suprimer ");
  }
   
   
	public  boolean verifierCapacite(){
		if(capacite < 50){
			return true;
		}
		return false;
	}

    public int getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public static int getNbProduit() {
        return nbProduit;
    }

    public static Listemagasin getListemagasin() {
        return Listemagasin;
    }

    public ListeProduit getListeProduit() {
        return ListeProduit;
    }

    public void setNb_em(int nb_em) {
        this.nb_em = nb_em;
    }
    
    
    
	public  void  Affichage(Magasine m){
             Listeemployer  tmp = Listeemployer;
	System.out.println("ID : "  +" " +" "  +this.id+  " Adresse : " +this.adresse +" "+", Capacite : "
				+ "  "+this.capacite);
             Listemagasin tm=Listemagasin;
               
	while(tmp != null&&tm!=null){
            m.magazinInfos();
        tmp .e.AfficheEm();
                
                  
                   tm=tm.suiv;
                   tmp = tmp.suiv;
		}
	}
        
      boolean testEm(){
        boolean b=false;
        if(nb_Em<=20){
        b=true;}
        else{ b=false;}
        
        return b;
            
    }
   
    

 


}



