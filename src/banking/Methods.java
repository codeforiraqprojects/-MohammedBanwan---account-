package banking;

abstract public class Methods {
	// Method to fill the users
	abstract void fillHashMap();
	//Method to check the user if exist or not.
	abstract void readData();
	//Method to show the operations allowed to the
	//user and choose one then call the method 
	//required.
	abstract void operation();
	// deposit method
	abstract void deposit();
	// withdraw method
	abstract void withdraw();
	// method to check the balance of the account
	abstract void checkBalance();
}
