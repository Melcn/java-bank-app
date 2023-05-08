package bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClicliDAO;
import Model.Clicli;
import bankapp.dao.CustomerDao;
import bankapp.model.Customer;



@WebServlet("/mappage")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CustomerDao dao = new CustomerDao();
		request.setAttribute("account", dao.showAllAccount());
		PrintWriter p = response.getWriter();

		p.print(dao.showAllAccount().toString());
	}

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);


		String name = request.getParameter("name");
		String firstName = request.getParameter("firstName");
		String adress = request.getParameter("adress");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		
		Customer customer = new Customer();
		customer.setCustomerName(name);
		customer.setCustomerFirstName(firstName);
		customer.setCustomerAdress(adress);
		customer.setCustomerPhone(tel);
		customer.setCustomerMail(email);
		
		CustomerDao customerDao = new CustomerDao();
		customerDao.addAccount(customer);
		ArrayList<Customer> arrayCustomer = customerDao.showAllAccount();
		
		

		request.setAttribute("account", customer);
		request.setAttribute("array", arrayCustomer);
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/view.jsp").forward(request, response);
	}

}
