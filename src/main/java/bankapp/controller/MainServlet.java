package bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bankapp.dao.AccountDao;
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
		// TODO Auto-generated method stub
		// doGet(request, response);


		
	}

}
