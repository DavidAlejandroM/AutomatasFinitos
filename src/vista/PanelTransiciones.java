/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Alejandro
 */
public class PanelTransiciones extends javax.swing.JPanel {

    /**
     * Creates new form PanelEstados
     */
    public PanelTransiciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pn_contenedor_estados_transiciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pn_contenedor_tabla_transiciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_transiciones = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Estados");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel3.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        pn_contenedor_estados_transiciones.setAlignmentX(5.0F);
        pn_contenedor_estados_transiciones.setAlignmentY(5.0F);
        pn_contenedor_estados_transiciones.setAutoscrolls(true);
        pn_contenedor_estados_transiciones.setLayout(new java.awt.GridLayout(8, 3));

        jButton1.setText("jButton1");
        pn_contenedor_estados_transiciones.add(jButton1);

        jButton2.setText("jButton2");
        pn_contenedor_estados_transiciones.add(jButton2);

        jPanel2.add(pn_contenedor_estados_transiciones, java.awt.BorderLayout.CENTER);

        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        add(jPanel2);

        pn_contenedor_tabla_transiciones.setLayout(new java.awt.GridLayout(1, 1));

        tbl_transiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_transiciones);

        pn_contenedor_tabla_transiciones.add(jScrollPane1);

        add(pn_contenedor_tabla_transiciones);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_contenedor_estados_transiciones;
    private javax.swing.JPanel pn_contenedor_tabla_transiciones;
    private javax.swing.JTable tbl_transiciones;
    // End of variables declaration//GEN-END:variables
}