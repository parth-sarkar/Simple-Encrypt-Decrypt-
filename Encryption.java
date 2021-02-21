import java.util.Scanner;

// Program to Encrypt Code 
public class Encryption {
	public static void main(String args[]) {
		// Accepting String from User.
		System.out.println("Enter a MESSAGE to Encryt it:");
		Scanner enc = new Scanner(System.in);

		String msg = enc.nextLine();
		System.out.println("The Message entered is :" + msg);

		// Encryption of each character as per user requirement.
		System.out.println("Enter a Number to Encrypt your message by that many characters :");
		int n = enc.nextInt();
		String strIncremented = new String();
		for (int i = 0; i < msg.length(); i++) {
			strIncremented += (char) (msg.charAt(i) + n);
		}
		System.out.println(strIncremented);
		enc.close();
	}
}
