package bankapp.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Model.compte;
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
	
	
}
