package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class aggregate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            public class CV {

                String URL = "jdbc:mysql://127.0.0.1:3308/mycvproject";
                String USER = "root";
                String PASSWORD = "root";
                int person_id = 0;
                Connection connection = null;
                PreparedStatement insertPerson = null;
                PreparedStatement courses = null;
                PreparedStatement projects = null;
                ResultSet resultSet = null;
                ResultSet rs = null;
                ResultSet rss = null;

                public CV() {
                    

                    try {
                        connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    } catch (SQLException ex) {
                        ex.printStackTrace();

                    }
                }

                // languages
                public int counts() {
                    int counts = 0;
                    Statement st= null;
                    ResultSet rs= null;
                    try {
                        // our SQL SELECT query. 
                        // if you only need a few columns, specify them by name instead of using "*"
                        String query = "SELECT COUNT(*) FROM person WHERE country='Egypt'";

                        // create the java statement
                        st = connection.createStatement();

                        // execute the query, and get a java resultset
                        rs = st.executeQuery(query);

                        rs.next();
                        counts = rs.getInt(1);     

                    } catch (SQLException ex) {

                        ex.printStackTrace();
                    }
                    finally {
                          rs.close();
                          st.close();
                    }

                    return counts;
                    }
}

        

            CV person = new CV();
            int x = person.counts();
            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Aggregate Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 id=\"nav\">MY CV Aggregate Function</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1 id=\"nav\">");
      out.print( x );
      out.write("</h1>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
