import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Using the same map for registered users
    private static final Map<String, String> registeredUsers = RegisterServlet.getRegisteredUsers();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if (registeredUsers.containsKey(username) && registeredUsers.get(username).equals(password)) {
            // Successful login
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<form action='LogoutServlet' method='post'>");
            out.println("<input type='submit' value='Logout'></form>");
            out.println("</body></html>");
        } else {
            // Incorrect password or user not found
            out.println("<html><body>");
            out.println("<h2>Login failed. Incorrect username or password.</h2>");
            out.println("<a href='login.jsp'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}
