package jdbcex;
import java.math.BigDecimal;
import java.sql.*;

public class CreateAccountCBS {

	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			CallableStatement cs = con.prepareCall("{ ? = call create_account(?,?) }");
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.setString(2, "Tom");
			cs.setBigDecimal(3, new BigDecimal(-20000));
			
			cs.execute();
			String msg = cs.getString(1);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
