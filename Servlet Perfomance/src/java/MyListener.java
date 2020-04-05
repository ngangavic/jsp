
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList list=new ArrayList();  
   try{  
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
              
    PreparedStatement ps=con.prepareStatement("select * from users");  
    ResultSet rs=ps.executeQuery();  
    while(rs.next()){  
        System.out.println(rs.getString(4));
     User u=new User();  
//     u.setId(rs.getInt(1));  
     u.setName(rs.getString(2));  
     u.setPassword(rs.getString(3));  
//     u.setEmail(rs.getString(4));
//     u.setCountry(rs.getString(5));
     list.add(u);  
    }  
    con.close();  
              
   }catch(Exception ex){System.out.print(ex);}  
  
   //storing the ArrayList object in ServletContext       
   ServletContext context=sce.getServletContext();  
   context.setAttribute("data",list);  
  System.out.println(list);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
