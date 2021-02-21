import java.util.Scanner;

// Program to Decrypt Code 
public class Decrytion {
       public static void main(String args[])
       {
    	// Accepting String from User.
   		System.out.println("Enter a MESSAGE to Decryt it:");
   		Scanner enc = new Scanner(System.in);

   		String msg = enc.nextLine();
   		System.out.println("The Message entered is :" + msg);
   		
   		// Decrypts each character in the message to find out the hidden message
   		System.out.println("Starting Decrypting sequence :");
   		for(int i=0; i<=10; i++) {
   			String strDecremented = new String();
   			for (int j = 0; j < msg.length(); j++) {
   				strDecremented += (char) (msg.charAt(j) - i);
   			}
   			System.out.println(strDecremented);
   			System.out.println("");
   		}
   		enc.close();
       }
}
