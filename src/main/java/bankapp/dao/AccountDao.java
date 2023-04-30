package bankapp.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


import bankapp.model.Account;

public class AccountDao {

	
	public void addAcount(Account cc) {

		ArrayList<Account> tab = new ArrayList<>();

		try {

			FileInputStream io = new FileInputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Account.txt");
			ObjectInputStream o = new ObjectInputStream(io); 

			tab = (ArrayList<Account>) o.readObject(); 
			tab.add(cc);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace(); 

		}

		
		try {

			
			FileOutputStream io = new FileOutputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Account.txt");
			ObjectOutputStream o = new ObjectOutputStream(io); 
			
			o.writeObject(tab); 

		} catch (IOException e) {
			e.printStackTrace(); 

		}
	}
	
	
	public ArrayList<Account> showAllAccount() {

		ArrayList<Account> c = new ArrayList<>();

		try {

			FileInputStream io = new FileInputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Account.txt");
			ObjectInputStream o = new ObjectInputStream(io); 
			
			c = (ArrayList<Account>) o.readObject(); 

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace(); 

		}

		return c;

	}
	
	
	
	public Account showAccount() {

		Account cc = new Account();
		try {

			FileInputStream io = new FileInputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Account.txt"); 
			ObjectInputStream o = new ObjectInputStream(io); 

			cc = (Account) o.readObject();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return cc;
	}
	
	public void crediter(Account account, double amount) {

		ArrayList<Account> tab = new ArrayList<>();

		try {

			
			FileInputStream io = new FileInputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Account.txt");
			ObjectInputStream o = new ObjectInputStream(io);
			
			tab = (ArrayList<Account>) o.readObject(); 

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace(); // 

		}


				double res = Account.getAccountBalance();
				res += amount;
				Account.setAccountBalance(res);
				System.out.println("Youpi" + res);
		

		try {

			
			FileOutputStream io = new FileOutputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Account.txt");
			ObjectOutputStream o = new ObjectOutputStream(io); 

			o.writeObject(tab); 

		} catch (IOException e) {
			
			e.printStackTrace(); 
		}
	}
}
