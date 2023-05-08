package bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.compteDao;
import Model.compte;
import bankapp.dao.AccountDao;
import bankapp.model.Account;
import controlor.WebServlet;



@WebServlet("/ServletAccount")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
    	AccountDao accountDao = new AccountDao();
		request.setAttribute("account", accountDao.showAllAccount());
		PrintWriter p = response.getWriter();

		p.print(accountDao.showAllAccount().toString());
	}

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
    	
    	String owner = request.getParameter("owner");
		Integer number = Integer.parseInt(request.getParameter("number"));
		double sold = Double.parseDouble(request.getParameter("sold"));
		String radioAccount = request.getParameter("account");

		Account account = new Account();
		account.setAccountOwner(owner);
		account.setAccountNumber(number);
		account.setAccountBalance(sold);

		AccountDao accountDao = new AccountDao();
		ArrayList<Account> arr = accountDao.showAllAccount();

		switch (radioAccount) {
		case "Create":
			accountDao.addAcount(account);
			break;

		case "Credit":
			
			for (Account acc : arr) {

				if (number == account.getAccountNumber()) {
					accountDao.credit(account, sold);
				}

			}
			
		
			break;

		case "Debit":

			for (Account acc : arr) {

				if (number == account.getAccountNumber()) {
					accountDao.debit(number, sold);
				}

			}
			
			
			break;
		}

		request.setAttribute("account", account);
		request.setAttribute("array", arr);

		this.getServletContext().getRequestDispatcher("/WEB-INF/AccountView.jsp").forward(request, response);


		
	}

}
