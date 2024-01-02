import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Simulating a database of registered users
    private static final Map<String, String> registeredUsers = new HashMap<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        registeredUsers.put(username, password);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<a href='login.jsp'>Login Now</a>");
        out.println("</body></html>");
    }
    public static Map<String, String> getRegisteredUsers() {
        return registeredUsers;
    }
}
