import java.sql.*;
class jdbc
{
public static void main (String[] args)
{
try
{
Class.forName("org.postgresql.Driver");
String url = "jdbc2:postgresql:jdbc2";
Connection con = DriverManager.getConnection(url,"postgres","");
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery("select name,place from RecordDetails");
System.out.println("");
System.out.println("");
System.out.println(" Name   Place");
System.out.println("------- -------------");
while( rs.next())
{
System.out.print(rs.getString("name")+"\t");
System.out.println(""+rs.getString("place"));
}
}
catch(java.lang.ClassNotFoundException e)
{
System.err.print("ClassNotFoundException: ");
System.err.println(e.getMessage());
}
catch (SQLException e)
{
System.out.println("Exception!");
System.out.println(e.toString());
}
}
}
