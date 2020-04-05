
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            long before = System.currentTimeMillis();

            ServletContext context = getServletContext();
            List list = (List) context.getAttribute("data");

            Iterator itr = list.iterator();
            while (itr.hasNext()) {
                User u = (User) itr.next();
//                out.print("<br>" + u.getId() + " " + u.getName() + " " + u.getPassword() + " " + u.getEmail() +" "+u.getCountry());
           out.print("<br>" + u.getName() + " " + u.getPassword());
           
            }

            long after = System.currentTimeMillis();
            out.print("<br>total time :" + (after - before));

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
