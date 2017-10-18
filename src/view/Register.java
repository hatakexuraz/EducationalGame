
package view;

import controller.UserController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author hatake_47
 */
public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        txt_address = new javax.swing.JTextField();
        txt_scname = new javax.swing.JTextField();
        btn_register1 = new javax.swing.JButton();
        pnl_border = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 215, 237));

        txt_fname.setBackground(new java.awt.Color(250, 244, 244));
        txt_fname.setForeground(new java.awt.Color(204, 204, 204));
        txt_fname.setText("Student's first name");
        txt_fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_fnameMousePressed(evt);
            }
        });
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        txt_lname.setBackground(new java.awt.Color(250, 244, 244));
        txt_lname.setForeground(new java.awt.Color(204, 204, 204));
        txt_lname.setText("Student's last name");
        txt_lname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_lnameMousePressed(evt);
            }
        });
        txt_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lnameActionPerformed(evt);
            }
        });

        txt_user.setBackground(new java.awt.Color(250, 244, 244));
        txt_user.setForeground(new java.awt.Color(204, 204, 204));
        txt_user.setText("Enter username");
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_userMousePressed(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        txt_address.setBackground(new java.awt.Color(250, 244, 244));
        txt_address.setForeground(new java.awt.Color(204, 204, 204));
        txt_address.setText("Student's address");
        txt_address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_addressMousePressed(evt);
            }
        });

        txt_scname.setBackground(new java.awt.Color(250, 244, 244));
        txt_scname.setForeground(new java.awt.Color(204, 204, 204));
        txt_scname.setText("Student's school name");
        txt_scname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_scnameMousePressed(evt);
            }
        });
        txt_scname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_scnameActionPerformed(evt);
            }
        });

        btn_register1.setText("Cancel");
        btn_register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_user)
                            .addComponent(txt_scname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_register1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_scname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_border.setBackground(new java.awt.Color(232, 58, 16));

        javax.swing.GroupLayout pnl_borderLayout = new javax.swing.GroupLayout(pnl_border);
        pnl_border.setLayout(pnl_borderLayout);
        pnl_borderLayout.setHorizontalGroup(
            pnl_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_borderLayout.setVerticalGroup(
            pnl_borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnameActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_scnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_scnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_scnameActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        try{
            String fname = txt_fname.getText();
            String lname = txt_lname.getText();
            String address = txt_address.getText();
            String school_name = txt_scname.getText();
            String usr = txt_user.getText();
            
            if(fname.equals("") || lname.equals("") || address.equals("") 
                    || school_name.equals("") || usr.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter all the fields.");
            }
            else{
                User user = new User();
                
                user.setUsername(usr);
                user.setLastName(lname);
                user.setAddress(address);
                user.setSchoolName(school_name);
                user.setFirstName(fname);

                UserController uc = new UserController();
                int Regaut = uc.userRegister(user);

                if(Regaut==1){     
                    
                    JOptionPane.showMessageDialog(this, "Registered Successful");
                    this.dispose();
                    Login loginFrame = new Login();
                    loginFrame.setVisible(true);
                    loginFrame.setLocationRelativeTo(this);

                    txt_fname.setText("");
                    txt_lname.setText("");
                    txt_address.setText("");
                    txt_scname.setText("");
                    txt_user.setText("");
                    txt_fname.requestFocus();
               
                }
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register1ActionPerformed
        try{
            Login lf = new Login();
            lf.setVisible(true);
            lf.setLocationRelativeTo(null);
            this.dispose();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_register1ActionPerformed

    private void txt_fnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fnameMousePressed
        txt_fname.setText("");
        txt_fname.setForeground(Color.black);
    }//GEN-LAST:event_txt_fnameMousePressed

    private void txt_lnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_lnameMousePressed
        txt_lname.setText("");
        txt_lname.setForeground(Color.black);
    }//GEN-LAST:event_txt_lnameMousePressed

    private void txt_addressMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_addressMousePressed
        txt_address.setText("");
        txt_address.setForeground(Color.black);
    }//GEN-LAST:event_txt_addressMousePressed

    private void txt_scnameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_scnameMousePressed
        txt_scname.setText("");
        txt_scname.setForeground(Color.black);
    }//GEN-LAST:event_txt_scnameMousePressed

    private void txt_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMousePressed
        txt_user.setText("");
        txt_user.setForeground(Color.black);
    }//GEN-LAST:event_txt_userMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JButton btn_register1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl_border;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_scname;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
