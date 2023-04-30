package bankapp.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bankapp.model.Order;

public class OrderDao {

	public void ajouterCommande(Order cc) {

		ArrayList<Order> tab = new ArrayList<>();

		try {

			FileInputStream io = new FileInputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Order.txt");
			ObjectInputStream o = new ObjectInputStream(io);

			tab = (ArrayList<Order>) o.readObject();
			tab.add(cc);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();

		}

		try {

			FileOutputStream io = new FileOutputStream("C:\\Users\\Jekyll\\Documents\\textJsp\\Order.txt");

			ObjectOutputStream o = new ObjectOutputStream(io);

			o.writeObject(tab);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
