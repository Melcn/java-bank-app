package bankapp.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bankapp.model.Customer;


public class CustomerDao {

	
	public void addAccount(Customer cc) {

		ArrayList<Customer> tab = new ArrayList<>();

		try {

			FileInputStream io = new FileInputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Customer.txt");
			ObjectInputStream o = new ObjectInputStream(io);

			tab = (ArrayList<Customer>) o.readObject();
			tab.add(cc);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();

		}

		try {

			FileOutputStream io = new FileOutputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Customer.txt");
			ObjectOutputStream o = new ObjectOutputStream(io);

			o.writeObject(tab);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	
	
}
