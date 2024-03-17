package vnua.fita.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
	
			throws ServletException, IOException{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/loginView.jsp");
			dispatcher.forward(request, response);
			
		}
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Lấy dữ liệu từ form submit
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        // In thông tin lên cửa sổ console (tạm thời)
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);

	        // Quay lại trang chủ (có thể thay đổi đường dẫn)
	        response.sendRedirect("index.jsp");
	    }
}
