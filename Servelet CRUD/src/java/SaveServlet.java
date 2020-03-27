
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String country = request.getParameter("country");

            Emp e = new Emp();
            e.setName(name);
            e.setPassword(password);
            e.setEmail(email);
            e.setCountry(country);

            int status = EmpDao.save(e);
            if (status > 0) {
                out.print("<div class='alert alert-success' style='text-align:center'><strong>Record saved successfully!</strong></div>");
                request.getRequestDispatcher("index.html").include(request, response);
            } else {
                out.print("<div class='alert alert-success' style='text-align:center'><strong>Sorry! unable to save record</strong></div>");
            }

            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
