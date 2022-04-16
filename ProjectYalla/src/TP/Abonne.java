package TP;

/*import Tp.Abonnement;
import Tp.Ticket;*/

public class Abonne extends Client{

	 public Abonnement ab=null;
     float prix_Ticket_abonné;
	public Abonne(int cin, String nom, String prenom) {
		super(cin, nom, prenom);
	
	}

	public void  SetAbonnement(Abonnement ab)
	{
		this.ab=ab;
	}
	
	public float get_prix_Ticket_abonné(Ticket tk )
	{
		this.tk=tk;
		if (ab.getBonus() >=7)
		{
			if(tk.compétition=="Champions_league ")
				  prix_Ticket_abonné= this.tk.Getprix()-   this.tk.Getprix()*20 / 100 ;
			else if(tk.compétition=="league1")
				 prix_Ticket_abonné= this.tk.Getprix()-   this.tk.Getprix()*80 / 100;
			else
				 prix_Ticket_abonné= this.tk.Getprix()-   this.tk.Getprix()*75 / 100 ;
				ab.Entrer_partie();
		}
		return  prix_Ticket_abonné ;
	}
	 
}
