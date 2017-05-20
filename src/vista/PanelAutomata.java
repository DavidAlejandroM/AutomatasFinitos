/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Model.Estado;
import controlador.Controlador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Alejandro
 */
public class PanelAutomata extends javax.swing.JPanel {

    private Controlador controlador;
    private JButton estadoActual;
    private JButton estadoSiguiente;
    private JButton simbolo;
    private Color colorFondoBotones;
    /**
     * Creates new form PanelEstados
     */
    public PanelAutomata() {
        initComponents();
        controlador = Controlador.getInstance();
        actualizarEstadosInicales();
        actualizarEstadosAceptacion();
        crearTabla();
        actualizarEstadosInicales2();
        actualizarEstadosAceptacion2();
        crearTabla2();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jp_estadoss = new javax.swing.JPanel();
        jp_estadoss1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pn_estado_aceptacion = new javax.swing.JPanel();
        jp_estadoss2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pn_estado_inicial = new javax.swing.JPanel();
        pn_contenedor_tabla_transiciones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jp_estadoss3 = new javax.swing.JPanel();
        jp_estadoss4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pn_estado_aceptacion1 = new javax.swing.JPanel();
        jp_estadoss5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pn_estado_inicial1 = new javax.swing.JPanel();
        pn_contenedor_tabla_transiciones1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(1, 4));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Automata A");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jp_estadoss.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss.setAlignmentX(5.0F);
        jp_estadoss.setAlignmentY(5.0F);
        jp_estadoss.setAutoscrolls(true);
        jp_estadoss.setLayout(new java.awt.GridLayout(2, 1));

        jp_estadoss1.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss1.setAlignmentX(5.0F);
        jp_estadoss1.setAlignmentY(5.0F);
        jp_estadoss1.setAutoscrolls(true);
        jp_estadoss1.setLayout(new java.awt.GridLayout(3, 1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado de Aceptacion");
        jp_estadoss1.add(jLabel5);

        pn_estado_aceptacion.setBackground(new java.awt.Color(255, 255, 255));
        pn_estado_aceptacion.setLayout(new java.awt.GridLayout(1, 0));
        jp_estadoss1.add(pn_estado_aceptacion);

        jp_estadoss.add(jp_estadoss1);

        jp_estadoss2.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss2.setAlignmentX(5.0F);
        jp_estadoss2.setAlignmentY(5.0F);
        jp_estadoss2.setAutoscrolls(true);
        jp_estadoss2.setLayout(new java.awt.GridLayout(3, 1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estado Inicial");
        jp_estadoss2.add(jLabel6);

        pn_estado_inicial.setBackground(new java.awt.Color(255, 255, 255));
        pn_estado_inicial.setLayout(new java.awt.GridLayout(1, 0));
        jp_estadoss2.add(pn_estado_inicial);

        jp_estadoss.add(jp_estadoss2);

        jPanel2.add(jp_estadoss, java.awt.BorderLayout.CENTER);

        add(jPanel2);

        pn_contenedor_tabla_transiciones.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenedor_tabla_transiciones.setLayout(new java.awt.GridLayout(3, 1));
        add(pn_contenedor_tabla_transiciones);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Automata B");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel2, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jp_estadoss3.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss3.setAlignmentX(5.0F);
        jp_estadoss3.setAlignmentY(5.0F);
        jp_estadoss3.setAutoscrolls(true);
        jp_estadoss3.setLayout(new java.awt.GridLayout(2, 1));

        jp_estadoss4.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss4.setAlignmentX(5.0F);
        jp_estadoss4.setAlignmentY(5.0F);
        jp_estadoss4.setAutoscrolls(true);
        jp_estadoss4.setLayout(new java.awt.GridLayout(3, 1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Estado de Aceptacion");
        jp_estadoss4.add(jLabel7);

        pn_estado_aceptacion1.setBackground(new java.awt.Color(255, 255, 255));
        pn_estado_aceptacion1.setLayout(new java.awt.GridLayout(1, 0));
        jp_estadoss4.add(pn_estado_aceptacion1);

        jp_estadoss3.add(jp_estadoss4);

        jp_estadoss5.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss5.setAlignmentX(5.0F);
        jp_estadoss5.setAlignmentY(5.0F);
        jp_estadoss5.setAutoscrolls(true);
        jp_estadoss5.setLayout(new java.awt.GridLayout(3, 1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Estado Inicial");
        jp_estadoss5.add(jLabel8);

        pn_estado_inicial1.setBackground(new java.awt.Color(255, 255, 255));
        pn_estado_inicial1.setLayout(new java.awt.GridLayout(1, 0));
        jp_estadoss5.add(pn_estado_inicial1);

        jp_estadoss3.add(jp_estadoss5);

        jPanel4.add(jp_estadoss3, java.awt.BorderLayout.CENTER);

        add(jPanel4);

        pn_contenedor_tabla_transiciones1.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenedor_tabla_transiciones1.setLayout(new java.awt.GridLayout(3, 1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenedor_tabla_transiciones1.add(jPanel5);

        add(pn_contenedor_tabla_transiciones1);
    }// </editor-fold>//GEN-END:initComponents

     private void actualizarEstadosInicales() {
        
        ArrayList<String> estados = controlador.obtenerEstadosInicial();
        pn_estado_inicial.removeAll();
        pn_estado_inicial.revalidate();
        
        if(estados != null)
        {
            pn_estado_inicial.setLayout(new GridLayout(estados.size(),1));
            for (int i = 0 ; i< estados.size(); i++) {
                String key = estados.get(i);
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                
                
                pn_estado_inicial.add(btn);
            } 
        }
        
    }
     private void actualizarEstadosAceptacion() {
        ArrayList<String> estados = controlador.obtenerEstadosAceptacion();
        pn_estado_aceptacion.removeAll();
        pn_estado_aceptacion.revalidate();
        
        if(estados != null)
        {
            pn_estado_aceptacion.setLayout(new GridLayout(estados.size(),1));
            for (int i = 0 ; i< estados.size(); i++) {
                String key = estados.get(i);
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                pn_estado_aceptacion.add(btn);
            } 
        } 
    }
     
     private void actualizarEstadosInicales2() {
        
        ArrayList<String> estados = controlador.obtenerEstadosInicial2();
        pn_estado_inicial1.removeAll();
        pn_estado_inicial1.revalidate();
        
        if(estados != null)
        {
            pn_estado_inicial1.setLayout(new GridLayout(estados.size(),1));
            for (int i = 0 ; i< estados.size(); i++) {
                String key = estados.get(i);
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                
                
                pn_estado_inicial1.add(btn);
            } 
        }
        
    }
     private void actualizarEstadosAceptacion2() {
        ArrayList<String> estados = controlador.obtenerEstadosAceptacion2();
        pn_estado_aceptacion1.removeAll();
        pn_estado_aceptacion1.revalidate();
        
        if(estados != null)
        {
            pn_estado_aceptacion1.setLayout(new GridLayout(estados.size(),1));
            for (int i = 0 ; i< estados.size(); i++) {
                String key = estados.get(i);
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                pn_estado_aceptacion1.add(btn);
            } 
        } 
    }
    
     
    private void crearTabla()
    {
        pn_contenedor_tabla_transiciones.removeAll();
        pn_contenedor_tabla_transiciones.revalidate();
        
        ArrayList<Estado> estados = controlador.obtenerEstados();
        ArrayList<String> simbolos = controlador.obtenerSimbolos();
        String[] StrSimbolos = new String[simbolos.size()+1];
        StrSimbolos[0]="Est|Simb";
        for (int i = 0; i < simbolos.size(); i++) {
            StrSimbolos[i+1] = (String)simbolos.get(i);
        }
        
        Object[][] mat = controlador.obtenerMatrizTransiciones(1);
       
        
        if (mat != null)
        {
            JTable table = new JTable(mat, StrSimbolos);
//            JTable table = new JTable(data, columnNames);
            pn_contenedor_tabla_transiciones.add(table);
        }
        //DefaultTableModel model = new DefaultTableModel(StrSimbolos,estados.size());
        
        
        
    }
    
        private void crearTabla2()
    {
        pn_contenedor_tabla_transiciones1.removeAll();
        pn_contenedor_tabla_transiciones1.revalidate();
        
        ArrayList<Estado> estados = controlador.obtenerEstados2();
        ArrayList<String> simbolos = controlador.obtenerSimbolos2();
        if(estados != null && simbolos != null)
        {
           Object[] StrSimbolos = new Object[simbolos.size()+1];
            StrSimbolos[0] = "";      
            for (int i = 0; i < simbolos.size(); i++) {
                StrSimbolos[i+1] = simbolos.get(i);
            }

            Object[][] mat = controlador.obtenerMatrizTransiciones(2);
            if (mat != null)
            {
                JTable table = new JTable(mat, StrSimbolos);
                pn_contenedor_tabla_transiciones1.add(table);
            } 
        }
        
        //DefaultTableModel model = new DefaultTableModel(StrSimbolos,estados.size());
        
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jp_estadoss;
    private javax.swing.JPanel jp_estadoss1;
    private javax.swing.JPanel jp_estadoss2;
    private javax.swing.JPanel jp_estadoss3;
    private javax.swing.JPanel jp_estadoss4;
    private javax.swing.JPanel jp_estadoss5;
    private javax.swing.JPanel pn_contenedor_tabla_transiciones;
    private javax.swing.JPanel pn_contenedor_tabla_transiciones1;
    private javax.swing.JPanel pn_estado_aceptacion;
    private javax.swing.JPanel pn_estado_aceptacion1;
    private javax.swing.JPanel pn_estado_inicial;
    private javax.swing.JPanel pn_estado_inicial1;
    // End of variables declaration//GEN-END:variables
}
