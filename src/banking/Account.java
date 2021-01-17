package banking;

import java.util.HashMap;
import java.util.Scanner;

public class Account extends Methods{

	//Create the variables.
	private Scanner s = new Scanner(System.in);
	private HashMap<Integer, String> customers = new HashMap<Integer, String>();
	private int acc_no;
	private String name;
	private float amount;
	private float balance = 100000f;

	// Method to fill the users
	void fillHashMap() {
		customers.put(11111, "Mohammed");
		customers.put(22222, "Ali");
		customers.put(33333, "Bilal");
		customers.put(44444, "Noor");
		customers.put(55555, "Ziad");
		customers.put(66666, "Najwan");
	}
	//Method to check the user if exist or not.
	void readData() {
		
		System.out.println("Welcome to Banwan Bank.");
		System.out.println("=======================");
		do {
			System.out.print("Please Enter your account Number: ");
			acc_no = s.nextInt();
			name = customers.get(acc_no);
			if(name==null)
				System.out.println("Incorrect acount!!");
		} while (name == null);
		operation();
	}
	
	//Method to show the operations allowed to the
	//user and choose one then call the method 
	//required.
	 void operation() {
		int i;
		System.out.println("Hi Mr." + name + "...");
		System.out.println("1- Check the balance.");
		System.out.println("2- Deposite.");
		System.out.println("3- Withdraw.");
		do {
			System.out.println("Please choose an operation...");
			i = s.nextInt();
		} while (i > 3);

		switch (i) {
		case 1:
			checkBalance();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		}
	}
	
	// deposit method
	 void deposit() {
		System.out.print("Please Enter the amuont to deposite: ");
		amount = s.nextFloat();
		balance += amount;
		System.out.println("the deposite amount is:" + amount);
		System.out.println("Your balance is:" + balance);
	}

	// withdraw method
	 void withdraw() {
		do {
			System.out.print("Please Enter the amuont to withdraw: ");
			amount = s.nextFloat();
			if (balance < amount)
				System.out.println("Insufficient Balance!!");
		} while (balance < amount);
		balance -= amount;
		System.out.println("The withdraw amount is:" + amount);
		System.out.println("Your balance is:" + balance);
	}

	// method to check the balance of the account
	 void checkBalance() {
		System.out.println("Account Number: " + acc_no);
		System.out.println("Account Owner: " + name);
		System.out.println("Balance: " + balance);
	}
}
