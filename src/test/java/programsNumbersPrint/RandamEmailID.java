package programsNumbersPrint;

import java.util.Random;

public class RandamEmailID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String alphabet = "abcdefghijklmnopqrstuvwxyz";
	      String email = "";
	      Random rand = new Random();

	      // generate random prefix
	      for (int i = 0; i < 10; i++) {
	         email += alphabet.charAt(rand.nextInt(alphabet.length()));
	      }
	      
	      // add "@domain.com" to the end
	      email += "@domain.com";

	      System.out.println(email);
	   }
	}

