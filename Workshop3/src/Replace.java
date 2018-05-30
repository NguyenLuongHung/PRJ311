public class Replace extends javax.swing.JDialog {
    Workshop3B u;
    public Replace(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        u = (Workshop3B) parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFind = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        lblRe = new javax.swing.JLabel();
        txtRe = new javax.swing.JTextField();
        btnRe = new javax.swing.JButton();
        ckbRe = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFind.setText("Find what:");

        lblRe.setText("Replace with:");

        btnRe.setText("Replace");
        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReActionPerformed(evt);
            }
        });

        ckbRe.setText("Replace all");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRe)
                    .addComponent(lblFind)
                    .addComponent(ckbRe))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRe)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFind, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(txtRe)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRe)
                    .addComponent(txtRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbRe)
                    .addComponent(btnRe))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReActionPerformed
        u.setText(checkBox());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReActionPerformed
    
    public String checkBox(){
        boolean a = ckbRe.isSelected();
        String s = u.getText();
        String find = txtFind.getText().trim();
        if(a){
            
            
            for (int i = 0; i < s.length()-find.length(); i++) {
                if(s.substring(i, i+find.length()).equals(find)){
                    s = s.substring(0,i) + txtRe.getText().trim() + s.substring(i+find.length());
                    i = i + txtRe.getText().length();
                }
            }
        }
        else if(!a){
            for (int i = 0; i < s.length()-find.length(); i++) {
                if(s.substring(i, i+find.length()).equals(find)){
                    s = s.substring(0,i) + txtRe.getText().trim() + s.substring(i+find.length());
                    break;
                }
                
            }
        }
       return s; 
    }
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
            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Replace dialog1 = new Replace(new javax.swing.JFrame(), true);
                dialog1.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRe;
    private javax.swing.JCheckBox ckbRe;
    private javax.swing.JLabel lblFind;
    private javax.swing.JLabel lblRe;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtRe;
    // End of variables declaration//GEN-END:variables
}
