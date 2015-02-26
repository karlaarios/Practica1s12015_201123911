//Para elegir el tamaño del tablero a crear 

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;


public class FrTTablero_201123911 extends javax.swing.JFrame {
    public static int dim1,dim2;
    public FrTTablero_201123911() {
        super("Plants vs Zombies 201123911");
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/Imagenes/Fondo2.jpg")));
        setLayout(new FlowLayout());
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        ComboTTablero2 = new javax.swing.JComboBox();
        ComboTTablero1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Champagne & Limousines", 0, 18)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboTTablero2.setFont(new java.awt.Font("Champagne & Limousines", 0, 18)); // NOI18N
        ComboTTablero2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija las columnas..", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        ComboTTablero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTTablero2ActionPerformed(evt);
            }
        });

        ComboTTablero1.setFont(new java.awt.Font("Champagne & Limousines", 0, 18)); // NOI18N
        ComboTTablero1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija las filas..", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        ComboTTablero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTTablero1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Champagne & Limousines", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(ComboTTablero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboTTablero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTTablero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboTTablero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(89, 89, 89)
                .addComponent(jButton1)
                .addGap(167, 167, 167))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Tablero_201123911 Tablero=new Tablero_201123911();
        Tablero.setVisible(true);
        dispose();
        

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboTTablero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTTablero1ActionPerformed
JComboBox x=(JComboBox)evt.getSource();
        if(x.getSelectedItem().equals("10")){
            dim1=10;
        }
        if(x.getSelectedItem().equals("11")){
            dim1=11;
        }
        if(x.getSelectedItem().equals("12")){
            dim1=12;
        }
        if(x.getSelectedItem().equals("13")){
            dim1=13;
        }
        if(x.getSelectedItem().equals("14")){
            dim1=14;
        }
        if(x.getSelectedItem().equals("15")){
            dim1=15;
        }
        if(x.getSelectedItem().equals("16")){
            dim1=16;
        }
        if(x.getSelectedItem().equals("17")){
            dim1=17;
        }
        if(x.getSelectedItem().equals("19")){
            dim1=18;
        }
        if(x.getSelectedItem().equals("19")){
            dim1=19;
        }
        if(x.getSelectedItem().equals("20")){
            dim1=20;
        }
        
    }//GEN-LAST:event_ComboTTablero1ActionPerformed

    private void ComboTTablero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTTablero2ActionPerformed
JComboBox x=(JComboBox)evt.getSource();
        if(x.getSelectedItem().equals("10")){
            dim2=10;
        }
        if(x.getSelectedItem().equals("11")){
            dim2=11;
        }
        if(x.getSelectedItem().equals("12")){
            dim2=12;
        }
        if(x.getSelectedItem().equals("13")){
            dim2=13;
        }
        if(x.getSelectedItem().equals("14")){
            dim2=14;
        }
        if(x.getSelectedItem().equals("15")){
            dim2=15;
        }
        if(x.getSelectedItem().equals("16")){
            dim2=16;
        }
        if(x.getSelectedItem().equals("17")){
            dim2=17;
        }
        if(x.getSelectedItem().equals("19")){
            dim2=18;
        }
        if(x.getSelectedItem().equals("19")){
            dim2=19;
        }
        if(x.getSelectedItem().equals("20")){
            dim2=20;
        }
    }//GEN-LAST:event_ComboTTablero2ActionPerformed


    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(FrTTablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrTTablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrTTablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrTTablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrTTablero_201123911().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboTTablero1;
    private javax.swing.JComboBox ComboTTablero2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
