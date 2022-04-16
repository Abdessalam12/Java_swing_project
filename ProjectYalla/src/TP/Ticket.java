package TP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Ticket {
	private int Code;
	int []  Ecode  = new int[100]  ; 
	String  type ;
	 float prix =0 ;
	 Date dt = new Date();
	 String Date_D_Achat ;
	 
	public  String compétition ;
	 
	
	 public Ticket (String type, String compétition )
	 {
		 this.compétition=compétition;
		 this.type=type;
		 Random rd = new Random();
		 
		 do
	     {Code =rd.nextInt(100)+1;}
		 while(verifierCode(Code));
		
		 Setprix();
		 
		 fixed_date() ;
	 }
	 
	 
	 void fixed_date() {   
		 SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		 Date_D_Achat=formater.format(dt);
	 }
	 
	 
	 
	 public String get_Date_D_Achat()
	 {
		 return  Date_D_Achat ;
	 }
	 
	
	 
	boolean verifierCode(int code)
	{    
		int i=0;
		boolean test=false ;
		while  (!test && i< Ecode.length)
		{
			if (Ecode[i]==code)
				test=true ;
			else
			{i++;}
		}
		return test ;
		
	}
	
	
	
	 private void Setprix ()
	 {
		 if (type=="First class")
			 prix=40;
		 else if (type=="Second class")
			 prix=25;
		 else 
			 prix=10;
		 
		 if(compétition=="Champions_league " )
			 prix*=20;
		 else if (compétition=="league1" )
			 prix*=2;
		 else 
			 prix*=3;
	 }
	 
	
	 
	 
	 
     public int Getprix()
     {
    	 return (int) prix;
     }
     
     
     public int Getcode()
     {
    	 
    	 return Code;
     }
     public String Getclass()
     {
    	 
    	 return type;
     }
    
   
}

