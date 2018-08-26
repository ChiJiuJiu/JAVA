package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import javafx.scene.chart.PieChart.Data;

public class KCBData implements TableModel {
	
	private String[] title = {
			"周一","周二","周三","周四","周五","周六","周日",
	};
	
	private String [][] Data = new String[8][7];
	
	public KCBData() {
		for(int i = 0;i < Data.length; i++) {
			for(int j = 0;j < Data[i].length; j++) {
				Data[i][j] = "";
			}
		}
	}
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		return String.class;
	}

	@Override
	public int getColumnCount() {
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		return title[arg0];
	}

	@Override
	public int getRowCount() {
		return 8;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return Data[arg0][arg1];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		return true;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		Data[arg1][arg2] = (String)arg0;

	}

}
