import java.util.*;
public class bankapplication {
	private String accno;
	private String name;

	private long balance;
     Scanner sc = new Scanner(System.in);
	
     void openAccount()
     {
    	 System.out.println("eneter accno");
    	 accno = sc.nextLine();
    	 System.out.println("enter name");
    	 name = sc.nextLine();
    	 System.out.println("eneter balance");
    	 balance = sc.nextLong();
     }
     public void showAccount() {  
         System.out.println("Name of account holder: " + name);  
         System.out.println("Account no.: " + accno);  
        // System.out.println("Account type: " + acc_type);  
         System.out.println("Balance: " + balance);  
     } 
     public void deposit() {  
         long amt;  
         System.out.println("Enter the amount you want to deposit: ");  
         amt = sc.nextLong();  
         balance = balance + amt;  
     }  
     public void withdrawal() {  
         long amt;  
         System.out.println("Enter the amount you want to withdraw: ");  
         amt = sc.nextLong();  
         if (balance >= amt) {  
             balance = balance - amt;  
             System.out.println("Balance after withdrawal: " + balance);  
         } else {  
             System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
         }  
     }  
     public boolean search(String ac_no) {  
         if (accno.equals(ac_no)) {  
             showAccount();  
             return (true);  
         }  
         return (false);  
     }  
     
	

	}


