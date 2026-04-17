package jdbcex;
//S-1
import java.sql.*;
import java.util.Scanner;

public class InsertDynaicData {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String driver = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			System.out.print("Roll: ");
			int roll = Integer.parseInt(sc.nextLine());
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("CGPA: ");
			double cgpa = Double.parseDouble(sc.nextLine());
			System.out.print("Status: ");
			String status = sc.next();
			// S-2
			Class.forName("org.postgresql.Driver");
			//S-3
			Connection con = DriverManager.getConnection(driver, username, password);
//			S-4
			String qry = "INSERT INTO student(roll, name, cgpa, status) VALUES("+roll+", '"+name+"', "+cgpa+", '"+status+"')";
			System.out.println(qry);
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
//			S-5
			if(i==1) {
				System.out.println("Row(s) Inserted");
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
