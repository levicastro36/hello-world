
package cine;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalButtonUI;
import javax.swing.table.DefaultTableModel;

public class Tabla {
    
    private boolean[] editable = {false,true,true,true,true,true,true};

    public Tabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(new String[]{"-", "1", "2", "3", "4","5","6"}, 0) {
            
            Class[] types = new Class[]{
                java.lang.Object.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class
            };
 
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
            
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String letras[] = new String[]{"F","E","D","C","B","A"};
        for(int i=0; i< letras.length; i++){
            Object fila[] = new Object[7];
            fila[0]=letras[i];
            fila[1]=null;
            fila[2]=null;
            fila[3]=null;
            fila[4]=null;
            fila[5]=null;
            fila[6]=null;
            
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        
        tabla.setCellSelectionEnabled(true);    
        
        tabla.getTableHeader().setReorderingAllowed(false);
        
        
        
        
    }
    
    
    
    public void visualizar(JTable tabla, Funcion f){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(new String[]{"-", "1", "2", "3", "4","5","6"}, 0) {
            
            Class[] types = new Class[]{
                java.lang.Object.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class,javax.swing.JButton.class
            };
 
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
            
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        Fila[] filas = f.getSala().getFilas();

        for(int i=0; i< filas.length; i++){
            Object fila[] = new Object[7];
           Butaca[] butacas = filas[i].getButacas();
            
            fila[0] = filas[i].getFila();
            for (int j = 0; j < butacas.length; j++) {
                if(butacas[j].getEstado()){
                    JButton btn = new JButton(butacas[j].getFila()+""+butacas[j].getNumeroButaca());
                    btn.setUI(new javax.swing.plaf.metal.MetalButtonUI());
                    btn.setEnabled(true);
                    btn.setBackground(Color.GREEN);
                    btn.setBorder(new LineBorder(Color.BLACK));
                    btn.setForeground(Color.WHITE);
                    
                    fila[j+1] = btn;
                }else{
                    JButton btn = new JButton(butacas[j].getFila()+""+butacas[j].getNumeroButaca());
                    btn.setUI(new javax.swing.plaf.metal.MetalButtonUI(){    
                        protected Color getDisabledTextColor() {
                            return Color.WHITE;
                        }
                    });
                    btn.setEnabled(false);
                    btn.setBackground(Color.RED);
                    btn.setBorder(new LineBorder(Color.BLACK));
                    
                    fila[j+1] = btn;
                }
            }
            
            if(butacas.length == 4){
                fila[5] = null;
                fila[6] = null;
            }       
        
            dt.addRow(fila);
        
        }
        
        tabla.setModel(dt);
        
        tabla.setCellSelectionEnabled(true);    
        
        tabla.getTableHeader().setReorderingAllowed(false);

    }
    
}


