package cine;

import javax.swing.table.DefaultTableModel;

public class MiModelo extends DefaultTableModel{
        DefaultTableModel model;

        public MiModelo(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }
        
        public boolean isCellEditable (int row, int column){
            return false;
        }
    }
