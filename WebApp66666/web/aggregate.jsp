<%-- 
    Document   : aggregate
    Created on : Jun 3, 2021, 2:45:04 AM
    Author     : Ebrahim ElGhareeb
--%>

<%@page import="java.sql.*" %>
<%@page import="java.util.*"%>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aggregate Page</title>
    </head>
    <body>
        <h1 id="nav">MY CV Aggregate Function</h1>
        <%!
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
                        st.close();
                        rs.close();

                    } catch (SQLException ex) {

                        ex.printStackTrace();
                    }

                    return counts;
                    }
}

        %>
        
        <%!
            CV person = new CV();
            int x = person.counts();
            %>
        
        
        
        <h1 id="nav"><%= x %></h1>
       
        
        
    </body>
</html>
