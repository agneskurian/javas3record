import java.sql.*;
class PostgreSQLTest1
{
  public static void main (String[]args)
  {
    try
    {
      Class.forName ("org.postgresql.Driver");
      String url = "testdb:postgresql:testdb";
      Connection con = DriverManager.getConnection (url, "postgres", "");
      Statement stm = con.createStatement ();
      ResultSet rs = stm.executeQuery ("select name,place,age from RDetails");
        System.out.println ("");
        System.out.println ("");
        System.out.println (" Name    Place      Age");
        System.out.println ("------   -------    ------ ");
      while (rs.next ())
	{
	  System.out.print (rs.getString ("name")+"\t");
	  System.out.print ("" + rs.getString ("place")+"\t");
	  System.out.println ("" + rs.getString ("age")+"\t");
	}
    }
    catch (java.lang.ClassNotFoundException e)
    {
      System.err.print ("ClassNotFoundException: ");
      System.err.println (e.getMessage ());
    }
    catch (SQLException e)
    {
      System.out.println ("Exception!");
      System.out.println (e.toString ());
    }
  }
}
