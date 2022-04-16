package TP;


import java.text.SimpleDateFormat;
import java.util.Date;
public class Gerer_client {
	int  index,index3 ;
	private Client Ec [] ; 
	
	private    Abonne abonm [] ; 
	Date dt = new Date();
	 String Date_De_Validation ;
	Ticket tkt;
	Abonne ab=null;
	
	public Gerer_client ()
	{
		abonm= new Abonne[30];
		index3=0;
		Ec=new Client [100];
		index=0;
	
	}
	//Lorsque l'Abonne rendre un ticket
	void RendreBonus (Client cl)
	{
		
		Abonne  abn = (Abonne) cl ;
		abn.ab.Rendre_Ticket();
		abn=null;
		
	}
	//Chercher la date actuelle
	 void fixed_date() {   
		 SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		 Date_De_Validation=formater.format(dt);
	 }
	 
	 //choisir un  Abonne parmis les autre 
	public Abonne Chercher_Abonné (Client cl  ) 
	{
		
       Abonne a=null ;
        int i=0;
		while( i<index3)
		{  
			Abonne  Abn = null ;
			Abn=abonm[i];
			if(  Abn.cin==cl.cin )
			{
				a=Abn ;
				i=index3;
				
			
				
				
			}
			else
			{i++;}
			
		
	}
		return a ;
		
	}
	
	
	//Faire la remise de ticket en cas que le client soit un Abonne
	public int Getprixabn (Client cl  ) 
	{
		int prix = 0;
       boolean test=false;
        int i=0;
		while(!test && i<index3)
		{  
			Abonne  Abn = null ;
			Abn=abonm[i];
			if(  Abn.cin==cl.cin )
			{
			
				
			  prix=(int)Abn.get_prix_Ticket_abonné(cl.tk);
				test=true;
				
			}
			else
			{i++;}
			
		
	}
		
		return prix;
	}
	
	
	//Enregistrer le client qu  achete un ticket
	public void  Enregistrer_client(Client cl)
	{
			Ec[index]=cl;
		index++;
	}
  
	
	//verfier si l'utilisateur est un client ou non
	public Client Ret_client (String Cin , String Code )
	{
		int cin = Integer.parseInt( Cin);
		   int code = Integer.parseInt( Code);
		   Client cl1=null;
        int i=0;
		while(  i<index)
		{  
			Client  cl = null ;
			cl=Ec[i];
			int c = cl.tk.Getcode();
			if( cin==cl.cin  &&  c == code   )
				
			{    
				
				cl1=cl;
				i=index;
				
			}
			else
			{i++;}
			
		
		}
		return cl1 ;
	}
	
	//verfier la date de ticket acceptable ou non
	boolean verfier_date (Client cl)
	{
		fixed_date();
		boolean test=true;
		
		if (	Date_De_Validation.equals(cl.tk.get_Date_D_Achat()))
		test=false;
		return test ;
	}
	
	//Effacer le client lorsqu ' il rendre sa ticket
	public void Effacer (Client c )
	{
		int i=0;
		boolean test=false ;
		while(!test && i<index3)
		{  
			Client c1=Ec[i];
			if(   c1.equals(c) )
				test=true;
			else
			{i++;}}
        Ec[i]=null;		
		for(int j=i ; Ec[j+1]!=null ;j++)
		{
			Ec[j]=Ec[j+1];
			
		}
		index--;
	
	}
	//Ajouter le nouveau abonné
	public  void  Enregistrer_Abonne(Abonne ab)
	{
		this.ab=null;
		this.ab=ab;
		abonm[index3]=this.ab;
		index3++;
		
	}
	
	//verfier si l'utilisateur est un abonneé ou non
	public boolean verfier_Abonne (String Price ,String Cin ,String Code,int j )
	{
		int i=0;
		Abonne  Abn = null ;
		
		boolean test=false;
		
		int cin= Integer.parseInt( Cin);
		int code= Integer.parseInt( Code);
		
		while(test==false && i<index3)
		{  
			
			Abn=abonm[i];
			
			if(Abn.cin==cin  && Abn.ab.getCode()==code)
				
			{
				
				if(j==1)
				{ Voir_abonnement.bonus =Abn.ab.getBonus();
				  Voir_abonnement.nbre = Abn.ab.getNbrepartie();
				//System.out.print(Abn.ab.getBonus());
				}
				if(j==2)
				{
					int price=Integer.parseInt( Price);
					AjouterBonus(Abn,price);
					
				}
				
				test=true ;
				
				 
			}
			i++;
			
			
	    }
		return test;
	}
     
	
	//transform le chargement d'Abonne à un bonus pour baisser le prix de ticket
	void AjouterBonus(Abonne abn, int  price)
	{
		int i= price * 5  / 80  ;
		abn.ab.setBonus(i);
		 
	}
	
	
	//Rendre le code de nouveau abonnée
	public int getCode()
	{    
		int i= abonm[index3-1].ab.getCode();
		
		return i;
	}

	}


