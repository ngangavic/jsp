
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterface implements Servlet {

    ServletConfig config = null;

    @Override
    public String getServletInfo() {
        return "Copyright 2020 .gitignore";
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servelet Initialized");
       
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Servelet is destroyed");
    }

}
