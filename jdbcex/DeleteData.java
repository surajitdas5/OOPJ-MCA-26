package jdbcex;
//S-1
import java.sql.*;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			
			System.out.print("ID of the User to be deleted: ");
			int id = Integer.parseInt(sc.nextLine());
			
			// S-2
			Class.forName("org.postgresql.Driver");
			//S-3
			Connection con = DriverManager.getConnection(connection_url, username, password);
//			S-4
			String qry = "DELETE FROM mca_user WHERE id="+id+"";
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
//			S-5
			if(i==1) {
				System.out.println("Row(s) Deleted");
			} else {
				System.out.println("Delete Failed. Check Id");
			}
			// S-6
			con.close();
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		}

	}

}
