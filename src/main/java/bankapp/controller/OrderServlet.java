package bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bankapp.dao.OrderDao;
import bankapp.model.Order;


@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		OrderDao orderDao = new OrderDao();
		request.setAttribute("commande", orderDao.showAllOrders());
		PrintWriter p = response.getWriter();

		p.print(orderDao.showAllOrders().toString());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String date = request.getParameter("date");
		String amount = request.getParameter("amount");
		String payment = request.getParameter("payment");
		String payStatus = request.getParameter("paymentStatus");
		String delivery = request.getParameter("delivery");
		String deliveryStatus = request.getParameter("deliveryStatus");
		
		Order order = new Order();
		
		order.setOrderDate(date);
		order.setOrderAmount(amount);
		order.setDeliveryMethod(delivery);
		order.setPaymentStatus(payStatus);
		order.setDeliveryStatus(deliveryStatus);
		
		OrderDao orderDao = new OrderDao();
		orderDao.addOrder(order);
		
		ArrayList<Order> arrayCoco = OrderDao.showAllOrders();
		
		request.setAttribute("commande", order);
		request.setAttribute("array", arrayCoco);
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/OrderView.jsp").forward(request, response);
	
	}

}
