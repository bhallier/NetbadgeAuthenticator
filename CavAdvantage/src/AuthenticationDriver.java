import java.util.Scanner;

public class AuthenticationDriver {

	public static void main(String[] args) throws Exception {

		NetbadgeAuthenticator authenticator = new NetbadgeAuthenticator();
		String username, password;
		boolean result;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		username = input.nextLine();
		System.out.print("Enter password: ");
		password = input.nextLine();
		
		input.close();
		System.out.println("Checking...");
		
		// Use the credentials to authenticate
		result = authenticator.Authenticate(username, password);

		//Output result
		if (result == true)
			System.out.println("Authentication Complete.");
		else
			System.out.println("Authentication Failed.");
	}
}
