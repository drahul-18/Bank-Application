import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
	     Scanner  scan  = new Scanner(System.in);
		BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);
         System.out.println("Enter the Pin: ");
         int loginPin = scan.nextInt();
         if(account.login(loginPin)) {
        	 System.out.println("Login Successful");
        	 System.out.println("1. Check Balance");
        	 System.out.println("2. Deposit Amount");
        	 System.out.println("3. Withdraw Amount");
        	 System.out.println("4. Display Account Details");
        	 System.out.println("5. Exit");
        	 System.out.println("Enter your choice: ");
        	 int option = scan.nextInt();
        		 switch(option) {
        		 case 1 : account.checkBalance(); 
        		          break;
        		 case 2 : System.out.println("Enter deposit amount: ");
        		          double depositAmount = scan.nextDouble(); 
        			      account.deposit(depositAmount); 
        			      break;
        		 case 3 : System.out.println("Enter withdrawal amount: ");
        		          double withdrawAmount = scan.nextDouble();
        			      account.withdraw(withdrawAmount); 
        			      break;
        		 case 4 : account.displayAccountDetails(); 
        		          break;
        		 case 5 : System.out.println("Thank You For Using The Banking Application...");
        		          return;
        		  default : System.out.println("Invalid Option");

        	 }
         }
         else {
        	 System.out.println("Invalid PIN");
        	 return;
         }
         
	}

}
