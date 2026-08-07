import java.sql.*;  // 1

public class demoJDBC {
    public static void main(String[] args) throws Exception {

/*
 JDBC Steps-
 1.import the packages
 2.load driver
 3.register the driver
 4.create connection
 5.create statements
 6.execute the statement
 7.close
 */

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname= "postgres";
        String pass = "yourpassword";
//        String sql = "select * from student";
        String sql = "delete from student where s_id = 5";

        Class.forName("org.postgresql.Driver"); // step 2-3 - Load Postgres SQL Driver

        Connection con = DriverManager.getConnection(url,uname,pass); // step 4- Establishing connection
        System.out.println("Connection establish");
        Statement step = con.createStatement() ;// step 5- create statement
//       " Fetching" the data using column index
//        ResultSet res = step.executeQuery(sql);// step 6- Execute Statement
//        while(res.next()){
//            System.out.print(res.getInt(1 ) + " | ");
//            System.out.print(res.getString(2) + " | ");
//            System.out.println(res.getInt(3));
//        }
//       "Insertion -"   String sql = "insert into student values(6, 'jack', 32)";
//        boolean status = step.execute(sql);
//        System.out.println(status);

//        "Updation -"   String sql = "update student set s_name='yahi' where s_id = 6";
//           step.execute(sql);

//        "Deletion -"   String sql = "delete from student where s_id = 5";
        step.execute(sql);

        con.close(); // step 7 - close connection
        System.out.println("Connection close");

    }
}
