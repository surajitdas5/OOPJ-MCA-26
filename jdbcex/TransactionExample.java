package jdbcex;
import java.sql.*;

public class TransactionExample {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			con.setAutoCommit(false);
			
			double amount = 100.00;
			String sql1 = "UPDATE accounts SET balance = balance - "+amount+" WHERE id=2";
			String sql2 = "UPDATE accounts SET balance = balance + "+amount+" WHERE id=1";
			
			ps = con.prepareStatement(sql1);
			if(ps.executeUpdate() == 1) {
				System.out.println("Amount Debited");
			}
			
//			if(true) {
//				throw new Exception("Network Error...");
//			}
			
			ps = con.prepareStatement(sql2);
			if(ps.executeUpdate() == 1) {
				System.out.println("Amount Credited");
			}
			
			con.commit();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
				System.out.println("Transaction reverted...");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
