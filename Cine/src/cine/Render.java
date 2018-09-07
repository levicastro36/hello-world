
package cine;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hola");
				if(btn.getBackground().equals(Color.BLUE)){
                                    btn.setBackground(Color.GREEN);
                                }else{
                                    btn.setBackground(Color.BLUE);
                                }
			}
            });
            if(isSelected){
                if(btn.isEnabled()){
                    if(btn.getBackground().equals(Color.BLUE)){
                    btn.setForeground(Color.WHITE);
                    btn.setBackground(Color.GREEN);
                    }else{
                        btn.setForeground(table.getSelectionForeground());
                        btn.setBackground(Color.BLUE);
                    }
                }   
            }
            return btn;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, 
                hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

}
