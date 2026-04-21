package jdbcex;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingTable {
	JFrame frame;
	JScrollPane scrollPane;
	JTable table;
	DefaultTableModel tableData;
	
	public SwingTable() {
		frame = new JFrame("Swing Table");
		frame.setLocation(400, 100);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Object[] columns = { "EID", "Name", "Dept", "Salary" };
//		Object[][] data = {
//				{ 1, "John", "SDE", 75000 },	
//				{ 2, "Jane", "SDE", 105000 },
//				{ 3, "Sara", "MGR", 85000 },
//				{ 4, "Clark", "TEST", 65000 }
//		};
		
//		tableData = new DefaultTableModel(data, columns); // static data, initial data
		tableData = new DefaultTableModel(columns, 0); // no initial data; column, initial number of rows
		
		tableData.addRow(new Object[] { 5, "Smith", "HR", 65000 });
		tableData.addRow(new Object[] { 6, "Emili", "TEST", 75000 });
		
		table = new JTable(tableData);
		
		scrollPane = new JScrollPane(table);
		
		frame.add(scrollPane);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingTable();

	}

}
