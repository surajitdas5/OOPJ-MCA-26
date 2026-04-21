package jdbcex;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingJdbcTable {
	JFrame frame;
	JScrollPane scrollPane;
	JTable table;
	DefaultTableModel tableData;
	
	public SwingJdbcTable() {
		frame = new JFrame("Swing Table");
		frame.setLocation(400, 100);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String driver = "org.postgresql.Driver";
		String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
		String username = "25mmca01";
		String password = "25mmca01";
		
		Object[] columns = {"roll", "name", "cgpa", "status"};
		tableData = new DefaultTableModel(columns, 0);
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connection_url, username, password);
			String sql = "SELECT * FROM student";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				tableData.addRow(new Object[] { rs.getInt("roll"), rs.getString("name"), rs.getDouble("cgpa"), rs.getString("status") } );
			}
			rs.close();
			smt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		table = new JTable(tableData);
		scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingJdbcTable();

	}

}
