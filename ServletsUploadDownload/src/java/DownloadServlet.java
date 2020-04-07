
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
          response.setContentType("image/jpeg");  
        try (ServletOutputStream out = response.getOutputStream()) {
            String filename = "photo.jpg";
            String filepath = "";

//            response.setContentType("APPLICATION/OCTET-STREAM");
//            response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

            FileInputStream fileInputStream = new FileInputStream(filepath + filename);

            BufferedInputStream bin = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bout = new BufferedOutputStream(out);
            int ch = 0;
            while ((ch = bin.read()) != -1) {
                bout.write(ch);
            }

            bin.close();
            fileInputStream.close();
            bout.close();

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
