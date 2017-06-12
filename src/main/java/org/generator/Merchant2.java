package use_case;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

public class Merchant{
	
	private static String MerchantName;
	private static String MerchantAddress;
    
	   @Override
	    public String toString(){
		   StringBuilder returnString = new StringBuilder("Merchant{"+
				   "MerchantName='"+MerchantName+'\''+
				   ",MerchantAddress='"+MerchantAddress);
		   
		   return returnString.toString();
		   
	   }
	

	    public Merchant(double ... buyingPower) throws ParseException,IOException
	    {
	    	
	    	 try{
		     		FileReader fr = new FileReader("C:\\Users\\Srikanth\\Downloads\\Stateswithlatlong.csv");
		     		BufferedReader br = new BufferedReader(fr);
		     		
		     		String line = br.readLine();
		     		line = br.readLine();
		         
		     		String[][] address = new String[289][4];
		     		int i=0,j=0;
		     		while(line!=null)
		     		{
		     			address[i++] = line.split(",");
		     			line = br.readLine();
		     		}
		         
		         int NumofMerchant = 1000;
		         
		         String city = "",Latitude = "",state =  "",Longitude="";
		         
		         for(int k = 0;k<NumofMerchant;k++)
		         {
		        	 
		        	// generating 1000 merchant names randomly 	
		     		Random random = new Random();
		        	 int MerchantNameLength = random.nextInt(7) + 5;
		        	 
		        	 StringBuilder MerchantName = new StringBuilder("");
		             for(int l = 0 ; l < MerchantNameLength ; l++) {
		            	 MerchantName.append(((char)(random.nextInt(26) + 65)));
		             }
		             
		             
		            //  generating 1000 addresses for the merchant names. 
		             
		        	 city = address[ (int) (Math.random()* address.length) ][0];
		        	 state = address[ (int) (Math.random() * address.length) ][1];
		        	 Latitude = address[ (int) (Math.random() * address.length) ][2];
		        	 Longitude = address[ (int) (Math.random() * address.length) ][3];
		        	
		        	 String mer_addr = city+" "+state+" "+Latitude+" "+Longitude;
			         
		        	 System.out.println(MerchantName+" --"+ mer_addr+"-->"+k);
		        	 
		        	 this.MerchantName = MerchantName.toString();
		        	 this.MerchantAddress = mer_addr.toString();
		        	 
		         }
		         
		        }
		         catch (FileNotFoundException ex) 
		 		{
		 	            System.out.println("File not found!");
		 	    } 
		 		catch (IOException ex) 
		 		{
		 	             System.out.println("An error has occured: " + ex.getMessage());
		 	    }
	    	
	    	 
	    	 
	    	 Random random = new Random();
	    	 int MerchantNameLength = random.nextInt(7) + 5;
	    	 
	    	 StringBuilder MerchantName = new StringBuilder("");
	         for(int i = 0 ; i < MerchantNameLength ; i++) {
	        	 MerchantName.append(((char)(random.nextInt(26) + 65)));
	         }
	         
	         this.MerchantName = MerchantName.toString();
	         
	             
	         try{
	     		FileReader fr = new FileReader("C:\\Users\\Srikanth\\Downloads\\Stateswithlatlong.csv");
	     		BufferedReader br = new BufferedReader(fr);
	     		String line = br.readLine();
	         
	     		String[][] address = new String[289][4];
	     		int i=0,j=0;
	     		while(line!=null)
	     		{
	     			System.out.println("im here");
	     			address[i++] = line.split(",");
	     			line = br.readLine();
	     		}
	         
	         int NumofTransactions = 1000;
	         
	         String city = "",Latitude = "",state =  "",Longitude="";
	         
	         for(int k = 0;k<NumofTransactions;k++)
	         {
	        	 city = address[ (int) (Math.random()* address.length) ][0];
	        	 state = address[ (int) (Math.random() * address.length) ][1];
	        	 Latitude = address[ (int) (Math.random() * address.length) ][2];
	        	 Longitude = address[ (int) (Math.random() * address.length) ][3];
	        	 
	         }
	         
	         String mer_addr = city+" "+state+" "+Latitude+" "+Longitude;
	         this.MerchantAddress = mer_addr;
	         }
	         catch (FileNotFoundException ex) 
	 		{
	 	            System.out.println("File not found!");
	 	    } 
	 		catch (IOException ex) 
	 		{
	 	             System.out.println("An error has occured: " + ex.getMessage());
	 	    }
	    }


		public static String getMerchantName() {
			return MerchantName;
		}


		public static void setMerchantName(String merchantName) {
			MerchantName = merchantName;
		}


		public static String getMerchantAddress() {
			return MerchantAddress;
		}


		public static void setMerchantAddress(String merchantAddress) {
			MerchantAddress = merchantAddress;
		}
	    
}
