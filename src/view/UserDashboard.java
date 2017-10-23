package view;

import javax.swing.JOptionPane;

/**
 *
 * @author hatake_47
 */
public class UserDashboard extends javax.swing.JFrame {

    private int user;
    private String usrname=null;
    
    public UserDashboard() {
        initComponents();
    }
    
    public UserDashboard(int user, String usrname) {
        initComponents();
        
        this.user=user;
        
        lbl_user.setText(usrname); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        pnl_dsh = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        lbl_message = new javax.swing.JLabel();
        lbl_opt = new javax.swing.JLabel();
        cmb_option = new javax.swing.JComboBox<>();
        lbl_score = new javax.swing.JLabel();
        lbl_pnt = new javax.swing.JLabel();
        cmb_mod = new javax.swing.JComboBox<>();
        cmb_asmnt = new javax.swing.JComboBox<>();
        btn_start = new javax.swing.JButton();
        btn_start1 = new javax.swing.JButton();
        btn_start2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_message.setText("Welcome,");

        lbl_opt.setText("Select one option");

        cmb_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Module", "Assessment" }));
        cmb_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_optionActionPerformed(evt);
            }
        });

        lbl_score.setText("View score on modules");

        lbl_pnt.setText("View point on assessments");

        cmb_mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GK Set-1", "GK Set-2", "GK Set-3", "Numbers", "Arithmetics", "Whole Number" }));
        cmb_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_modActionPerformed(evt);
            }
        });

        cmb_asmnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GK Set-1", "GK Set-2", "GK Set-3", "Numbers", "Arithmetics", "Whole Number" }));
        cmb_asmnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_asmntActionPerformed(evt);
            }
        });

        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        btn_start1.setText("Start");
        btn_start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_start1ActionPerformed(evt);
            }
        });

        btn_start2.setText("Start");
        btn_start2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_start2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_dshLayout = new javax.swing.GroupLayout(pnl_dsh);
        pnl_dsh.setLayout(pnl_dshLayout);
        pnl_dshLayout.setHorizontalGroup(
            pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dshLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dshLayout.createSequentialGroup()
                        .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_opt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_score)
                            .addComponent(lbl_pnt))
                        .addGap(56, 56, 56)
                        .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_dshLayout.createSequentialGroup()
                                .addComponent(cmb_asmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(btn_start2))
                            .addGroup(pnl_dshLayout.createSequentialGroup()
                                .addComponent(cmb_option, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_start))
                            .addGroup(pnl_dshLayout.createSequentialGroup()
                                .addComponent(cmb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_start1))))
                    .addGroup(pnl_dshLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        pnl_dshLayout.setVerticalGroup(
            pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dshLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_message, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_opt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_option, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_start))
                .addGap(18, 18, 18)
                .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_score, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_start1))
                .addGap(18, 18, 18)
                .addGroup(pnl_dshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_asmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_start2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_dsh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_dsh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_optionActionPerformed

    private void cmb_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_modActionPerformed

    private void cmb_asmntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_asmntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_asmntActionPerformed

    private void btn_start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_start1ActionPerformed
        try{
            String mod = cmb_mod.getSelectedItem().toString();

            Point pnt = new Point(user, mod, false);
            pnt.setVisible(true);
            pnt.setLocationRelativeTo(null);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_start1ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        try{
            String option= (String)cmb_option.getSelectedItem();
        
            Dashboard db = new Dashboard(option, user);
            db.setVisible(true);
            db.setLocationRelativeTo(null);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_start2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_start2ActionPerformed
        try{
            String asmnt = cmb_asmnt.getSelectedItem().toString();
        
            Score sc = new Score(user, asmnt, false);
            sc.setVisible(true);
            sc.setLocationRelativeTo(null);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_start2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_start1;
    private javax.swing.JButton btn_start2;
    private javax.swing.JComboBox<String> cmb_asmnt;
    private javax.swing.JComboBox<String> cmb_mod;
    private javax.swing.JComboBox<String> cmb_option;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JLabel lbl_opt;
    private javax.swing.JLabel lbl_pnt;
    private javax.swing.JLabel lbl_score;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel pnl_dsh;
    // End of variables declaration//GEN-END:variables
}
