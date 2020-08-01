/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author DELL
 */
public class IngresoDeProductos extends javax.swing.JFrame {

    private static List<ProductoPadre> ingresoP = new ArrayList<ProductoPadre>();

    public static List<ProductoPadre> getProductos() {
        return ingresoP;
    }

    public static List<ProductoPadre> getIngresoP() {
        return ingresoP;
    }
    

    /**
     * Creates new form Ingreso_PUtencillos
     */
    public IngresoDeProductos() {
        this.setExtendedState(MAXIMIZED_BOTH);

        this.setLocationRelativeTo(null);
        initComponents();
        if (ingresoP.size() > 0) {
            cargar_valores_listaU();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUtencillos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_NombreU = new javax.swing.JTextField();
        txt_PrecioU = new javax.swing.JTextField();
        txt_CaducidadU = new javax.swing.JTextField();
        GuardarU = new javax.swing.JButton();
        RegresarU = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_IdU = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Tipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingreso  de productos ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 267, 25);

        ListaUtencillos.setBackground(new java.awt.Color(204, 204, 255));
        ListaUtencillos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        ListaUtencillos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(ListaUtencillos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(245, 51, 230, 267);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 97, 65, 15);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 173, 65, 15);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("F.Caducidad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 227, 70, 15);

        txt_NombreU.setBackground(new java.awt.Color(204, 255, 255));
        txt_NombreU.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        getContentPane().add(txt_NombreU);
        txt_NombreU.setBounds(85, 94, 96, 20);

        txt_PrecioU.setBackground(new java.awt.Color(204, 255, 255));
        txt_PrecioU.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        getContentPane().add(txt_PrecioU);
        txt_PrecioU.setBounds(85, 170, 96, 20);

        txt_CaducidadU.setBackground(new java.awt.Color(204, 255, 255));
        txt_CaducidadU.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        getContentPane().add(txt_CaducidadU);
        txt_CaducidadU.setBounds(84, 224, 97, 20);

        GuardarU.setBackground(new java.awt.Color(153, 255, 255));
        GuardarU.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        GuardarU.setText("Guardar ");
        GuardarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarUActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarU);
        GuardarU.setBounds(10, 292, 73, 23);

        RegresarU.setBackground(new java.awt.Color(153, 255, 255));
        RegresarU.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        RegresarU.setText("Regresar");
        RegresarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarUActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarU);
        RegresarU.setBounds(112, 292, 73, 23);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 135, 65, 15);

        txt_IdU.setBackground(new java.awt.Color(204, 255, 255));
        txt_IdU.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        getContentPane().add(txt_IdU);
        txt_IdU.setBounds(85, 132, 96, 20);

        jLabel7.setFont(new java.awt.Font("Teko SemiBold", 3, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Productos   Ingresados");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(303, 31, 140, 15);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 59, 24, 15);

        txt_Tipo.setBackground(new java.awt.Color(204, 255, 255));
        txt_Tipo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        getContentPane().add(txt_Tipo);
        txt_Tipo.setBounds(85, 56, 96, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_poo/scorpion vs kratos.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 550, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarUActionPerformed
        // TODO add your handling code here:
        String tipo = txt_Tipo.getText();
        String nom = txt_NombreU.getText();
        String id = txt_IdU.getText();
        double pre = Double.parseDouble(txt_PrecioU.getText());

        String fecha = txt_CaducidadU.getText();
        if (!nom.equals("") && !fecha.equals("")) {
            ProductoPadre pU = new ProductoPadre(tipo, nom, id, pre, fecha);

            getProductos().add(pU);

            limpiar_productosU();
        }
        cargar_valores_listaU();
    }//GEN-LAST:event_GuardarUActionPerformed

    private void RegresarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarUActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        // presentar formulario menu
        Menu me = new Menu();
        me.setVisible(true);
    }//GEN-LAST:event_RegresarUActionPerformed

    public void cargar_valores_listaU() {

        DefaultListModel listU = new DefaultListModel();
        for (ProductoPadre pC : ingresoP) {
            listU.addElement(pC.getTipo() + (" | ") + pC.getNombre() + " | " + pC.getId() + " | " + pC.getPrecio() + " | " + pC.getCaducidad());

        }
        //pasamos valores a mostrar en nuestra lista 
        ListaUtencillos.setModel(listU);
    }

    public void limpiar_productosU() {
        txt_Tipo.setText("");
        txt_NombreU.setText("");
        txt_IdU.setText("");

        txt_PrecioU.setText("");
        txt_CaducidadU.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresoDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoDeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarU;
    private javax.swing.JList<String> ListaUtencillos;
    private javax.swing.JButton RegresarU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_CaducidadU;
    private javax.swing.JTextField txt_IdU;
    private javax.swing.JTextField txt_NombreU;
    private javax.swing.JTextField txt_PrecioU;
    private javax.swing.JTextField txt_Tipo;
    // End of variables declaration//GEN-END:variables
}
