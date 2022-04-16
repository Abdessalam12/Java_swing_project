package TP;

//import Tp.Ticket;

public class Client     {
	public  int cin;
	public String nom;
	public   String prenom;
	
    Ticket tk ;
    public Client ()
	{
		
		
	}

	public Client (int cin,String nom , String prenom )
	{
		this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
		
	}
	
	void achter_ticket (Ticket tk)
	{
		this.tk=tk;
	}
	public Ticket Getticket ()
	{
		return tk;
	}
	
	
	
	
	
    

}

