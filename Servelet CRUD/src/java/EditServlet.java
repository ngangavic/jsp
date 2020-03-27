
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head>");
            out.println("<meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
            out.println("<title>Servlet CRUD</title>");
            out.println("</head><body><div class=\"container\">");
            out.println("<div class=\"col-xs-12 col-sm-12 col-md-6 offset-md-3 col-lg-6\">");
            out.println("<h1>Update Employee</h1>");
            String sid = request.getParameter("id");
            int id = Integer.parseInt(sid);

            Emp e = EmpDao.getEmployeeById(id);

            out.print("<form action='EditServlet2' method='post'>");
            out.print("<div class='form-group'>Name:<input type='text' name='name' value='" + e.getName() + "' class='form-control' /></div>"
                    + "<input type='hidden' name='id' value='" + e.getId() + "'/>"
                    + "<div class='form-group'>Password:<input type='password' name='password' value='" + e.getPassword() + "' class='form-control' /></div>  \n"
                    + "<div class='form-group'>Email:<input type='email' name='email' value='" + e.getEmail() + "' class='form-control' /></div>\n"
                    + "<div class='form-group'>Country:"
                    + "<select name='country' class='form-control'>"
                    + "<option>Kenya</option>"
                    + "<option>Uganda</option>"
                    + "<option>Tanzania</option>"
                    + "<option>Other</option>"
                    + "</select>"
                    + "</div>"
                    + "<div class='form-group'><input type='submit' value=' Edit & Save' class='btn btn-block btn-primary'/></div>");
            out.print("</form>");
            out.println("</div></div>");
            out.println("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n"
                    + "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n"
                    + "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
            out.println("</body></html>");
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
