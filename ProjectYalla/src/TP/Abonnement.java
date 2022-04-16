package TP;

import java.util.Random;

public class Abonnement {
private  int Code;

private    int nbre_de_partie_entrée = 0 ; // Enregistrer le nbre de partie entré par le client cad le nbre de ticket
private  int Bonus =0; 
public  float prix;

public Abonnement (    )
{    
	
	Random rd = new Random();
     Code =rd.nextInt(8999) + 1000 ;   // mettre un code aleatoir 
	
   	
}
public  int  getCode()
{
	return Code;
}
public  int  getBonus()
{
	return Bonus;
}
public  void  setBonus(int Bonus)
{
	this.Bonus+=Bonus;
}
public  int  getNbrepartie()
{
	return nbre_de_partie_entrée;
}

public   void Rendre_Ticket ()
{
	nbre_de_partie_entrée--; 
	this.Bonus+=7;
}
public   void Entrer_partie ()
{
	nbre_de_partie_entrée++; 
	this.Bonus-=7;
}
}
