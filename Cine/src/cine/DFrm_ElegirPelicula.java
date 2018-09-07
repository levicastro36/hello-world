
package cine;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class DFrm_ElegirPelicula extends javax.swing.JDialog {
    
    ArrayList<Integer[]> butacas = new ArrayList();
    
    Tabla t;
    
    private int idComplejo, idPelicula, idFuncion;
    /*
    private static DFrm_ElegirPelicula dfrm;
    
    public static synchronized DFrm_ElegirPelicula getIntance(){
        if(dfrm==null){
            mainn();
        }
        return dfrm;
    }
    */
    public DFrm_ElegirPelicula(Frm_Principal parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        setResizable(false);
        seteoBlanco();
    }
    
    private void seteoBlanco(){
        t = new Tabla(tabla);
        cbx_funcion.removeAllItems();
        cbx_pelicula.removeAllItems();
        cbx_complejo.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbx_complejo = new javax.swing.JComboBox<>();
        lbl_complejo = new javax.swing.JLabel();
        cbx_pelicula = new javax.swing.JComboBox<>();
        lbl_complejo1 = new javax.swing.JLabel();
        cbx_funcion = new javax.swing.JComboBox<>();
        lbl_complejo2 = new javax.swing.JLabel();
        btn_siguiente = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_reservar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        pnl_pantalla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbx_complejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_complejo.setMaximumSize(new java.awt.Dimension(128, 20));
        cbx_complejo.setMinimumSize(new java.awt.Dimension(128, 20));
        cbx_complejo.setPreferredSize(new java.awt.Dimension(128, 20));
        cbx_complejo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_complejoMouseClicked(evt);
            }
        });
        cbx_complejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_complejoActionPerformed(evt);
            }
        });

        lbl_complejo.setText("COMPLEJO");

        cbx_pelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_pelicula.setAutoscrolls(true);
        cbx_pelicula.setMaximumSize(new java.awt.Dimension(128, 20));
        cbx_pelicula.setMinimumSize(new java.awt.Dimension(128, 20));
        cbx_pelicula.setPreferredSize(new java.awt.Dimension(128, 20));
        cbx_pelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_peliculaMouseClicked(evt);
            }
        });

        lbl_complejo1.setText("PELICULA");

        cbx_funcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_funcion.setMaximumSize(new java.awt.Dimension(128, 20));
        cbx_funcion.setMinimumSize(new java.awt.Dimension(128, 20));
        cbx_funcion.setPreferredSize(new java.awt.Dimension(128, 20));
        cbx_funcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_funcionMouseClicked(evt);
            }
        });

        lbl_complejo2.setText("FUNCION");

        btn_siguiente.setText("Siguiente");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setCellSelectionEnabled(true);
        tabla.setFocusable(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btn_reservar.setText("Reservar");
        btn_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        pnl_pantalla.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("PANTALLA");

        javax.swing.GroupLayout pnl_pantallaLayout = new javax.swing.GroupLayout(pnl_pantalla);
        pnl_pantalla.setLayout(pnl_pantallaLayout);
        pnl_pantallaLayout.setHorizontalGroup(
            pnl_pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pantallaLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150))
        );
        pnl_pantallaLayout.setVerticalGroup(
            pnl_pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_complejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbx_complejo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_complejo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbx_pelicula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_funcion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_complejo2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btn_siguiente)
                                .addGap(78, 78, 78)
                                .addComponent(btn_cancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btn_reservar)
                                .addGap(106, 106, 106)
                                .addComponent(btn_salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(pnl_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_complejo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_complejo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_complejo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_complejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_siguiente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reservar)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int column = tabla.getSelectedColumn();
        int row = tabla.getSelectedRow();

        if(column != 0){
            Object value = tabla.getValueAt(row, column);
            if(value instanceof JButton){
                JButton btn = (JButton) value;
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void cbx_peliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_peliculaMouseClicked
        cargarPeliculas();
    }//GEN-LAST:event_cbx_peliculaMouseClicked

    private void cbx_complejoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_complejoMouseClicked
        cargarComplejos();
    }//GEN-LAST:event_cbx_complejoMouseClicked

    private void cbx_funcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_funcionMouseClicked
         cargarFunciones();
    }//GEN-LAST:event_cbx_funcionMouseClicked

    private void cbx_complejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_complejoActionPerformed

    }//GEN-LAST:event_cbx_complejoActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        cargarButacas();
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        seteoBlanco();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarActionPerformed
        registrarReservas();
    }//GEN-LAST:event_btn_reservarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cargarComplejos(){
        cbx_complejo.removeAllItems();
        ArrayList<Complejo> aux = Cine.getIntancer().getComplejos();
        for (Complejo complejo : aux) {
            cbx_complejo.addItem(complejo.getNombreComplejo());
        }
    }
    
    private void cargarPeliculas(){
        if(cbx_complejo.getSelectedItem()!=null){
            cbx_pelicula.removeAllItems();
            Complejo c = Cine.getIntancer().getUnComplejoNombre(cbx_complejo.getSelectedItem().toString());
            idComplejo = c.getIdComplejo();
            ArrayList<Pelicula> aux = Datos.getIntancer().getPeliculas();
            for (Pelicula pelicula : aux) {
                cbx_pelicula.addItem(pelicula.getNombrePelicula());
            }
        }
    }
    
    private void cargarFunciones(){
        if(cbx_pelicula.getSelectedItem()!=null){
            cbx_funcion.removeAllItems();
            Complejo c = Cine.getIntancer().getUnComplejoNombre(cbx_complejo.getSelectedItem().toString());
            ArrayList<Funcion> aux = c.getFuncion();
            Pelicula p = Datos.getIntancer().getUnaPeliculaNombre(cbx_pelicula.getSelectedItem().toString());
            idPelicula = p.getIdPelicula();
            for (Funcion funcion : aux) {
                if(funcion.getIdPelicula() == p.getIdPelicula()){
                    cbx_funcion.addItem(funcion.getHora());
                }  
            }
        }
    }
    
    private void getIdFuncionSelect(){
        ArrayList<Funcion> funciones = Cine.getIntancer().getUnComplejoID(idComplejo).getFuncion();
        for (Funcion funcion : funciones) {
            if(funcion.getHora().equals(cbx_funcion.getSelectedItem().toString())){
                idFuncion = funcion.getNumeroFuncion();
                break;
            }
        }
    }
    
    private void cargarButacas(){
        if(cbx_funcion.getSelectedItem() != null){
            getIdFuncionSelect();
            Funcion f = Cine.getIntancer().getUnComplejoID(idComplejo).getUnaFuncion(idFuncion);
            t.visualizar(tabla,f);
        }
        
    }
    
    private void agregarButacas(){
        butacas.removeAll(butacas);
        for (int row = 0; row < tabla.getRowCount(); row++) {
            for (int column = 1; column < tabla.getColumnCount(); column++) {
                Object value = tabla.getValueAt(row, column);
                if(value != null){
                    if(value instanceof JButton){
                        JButton btn = (JButton) value;
                        if(btn.isEnabled()){
                            if(btn.getBackground().equals(Color.BLUE)){
                                butacas.add(new Integer[]{row,column});
                            }
                        }
                    }
                }
            }    
        }
    }
    
    private void registrarReservas(){
        agregarButacas();
        for (Integer[] butaca : butacas) {
            char[] letras = new char[]{'F','E','D','C','B','A'};
            Reserva r = new Reserva(Datos.getIntancer().generarNumeroReserva(), idComplejo, idFuncion, letras[butaca[0]], butaca[1]);
            Datos.getIntancer().agregarReserva(r);
        }
        dispose();
    }
    
    public static void mainn() {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DFrm_ElegirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DFrm_ElegirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DFrm_ElegirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DFrm_ElegirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DFrm_ElegirPelicula dfrm = new DFrm_ElegirPelicula(Frm_Principal.getIntance(), true);
                dfrm.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dfrm.dispose();
                    }
                });
                dfrm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_reservar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JComboBox<String> cbx_complejo;
    private javax.swing.JComboBox<String> cbx_funcion;
    private javax.swing.JComboBox<String> cbx_pelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_complejo;
    private javax.swing.JLabel lbl_complejo1;
    private javax.swing.JLabel lbl_complejo2;
    private javax.swing.JPanel pnl_pantalla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
