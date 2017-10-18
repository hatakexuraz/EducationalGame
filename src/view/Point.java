package view;

import controller.PointController;
import javax.swing.JOptionPane;

/**
 *
 * @author hatake_47
 */
public class Point extends javax.swing.JFrame {

    
    private int point=0;
    private int user;
    private String chapter=null;
    private boolean visible=true;
    
    public Point() {
        initComponents();
    }
    
    public Point(int user, String chapter, boolean visible) {
        try{
            initComponents();
        
            if(visible==false){
                btn_close.setVisible(false);
            }

            this.user = user;
            this.chapter = chapter;
            this.visible = visible;

            getPoint(user);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public Point(int point, int user, String chapter) {
        try{
            initComponents();

            this.point=point;
            this.user = user;
            this.chapter=chapter;

            setPoint(point, user, chapter);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void setPoint(int crt, int user, String chapter){
        try{
            int n = crt/2;
            int wrng = 10-n;

            lbl_crt.setText(Integer.toString(n));
            lbl_wrng.setText(Integer.toString(wrng));
            lbl_point.setText(Integer.toString(crt));  

            if(visible==true){
                btn_close1.setVisible(false);
            }

            savePoint(crt, user, chapter);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void getPoint(int user){
        int n;
        int wrng;
        
        try{
            PointController pc = new PointController();
            point=pc.getPoint(user, chapter);

            n=point/2;
            wrng = 10-n;

            lbl_crt.setText(Integer.toString(n));
            lbl_wrng.setText(Integer.toString(wrng));
            lbl_point.setText(Integer.toString(point));              
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void savePoint(int point, int user, String chapter){
        try{
            PointController pnt = new PointController();

            pnt.savePoints(point, user, chapter);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
    
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_pnt = new javax.swing.JPanel();
        lbl_atmpt = new javax.swing.JLabel();
        lbl_crt = new javax.swing.JLabel();
        lbl_wrng = new javax.swing.JLabel();
        lbl_point = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        lbl_que = new javax.swing.JLabel();
        lbl_ans = new javax.swing.JLabel();
        lbl_wrg_que = new javax.swing.JLabel();
        lbl_pnt = new javax.swing.JLabel();
        btn_close1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_atmpt.setText("10");

        lbl_crt.setText("0");

        lbl_wrng.setText("0");

        lbl_point.setText("0");

        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        lbl_que.setText("Attempted questions");

        lbl_ans.setText("Correct answers");

        lbl_wrg_que.setText("Wrong answers");

        lbl_pnt.setText("Total points");

        btn_close1.setText("Close");
        btn_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_pntLayout = new javax.swing.GroupLayout(pnl_pnt);
        pnl_pnt.setLayout(pnl_pntLayout);
        pnl_pntLayout.setHorizontalGroup(
            pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_pntLayout.createSequentialGroup()
                        .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_pntLayout.createSequentialGroup()
                                .addComponent(lbl_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(lbl_que, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_wrg_que, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pntLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(lbl_pnt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_atmpt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_crt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_wrng, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_point, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pntLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pntLayout.createSequentialGroup()
                    .addContainerGap(173, Short.MAX_VALUE)
                    .addComponent(btn_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        pnl_pntLayout.setVerticalGroup(
            pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pntLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_que, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_atmpt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_crt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ans, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_wrg_que, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_wrng, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pnt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_point, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_close)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(pnl_pntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pntLayout.createSequentialGroup()
                    .addContainerGap(215, Short.MAX_VALUE)
                    .addComponent(btn_close1)
                    .addGap(5, 5, 5)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_pnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_pnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        
        this.setVisible(false);
                
        //savePoint(point, user, chapter);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_close1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_close1;
    private javax.swing.JLabel lbl_ans;
    private javax.swing.JLabel lbl_atmpt;
    private javax.swing.JLabel lbl_crt;
    private javax.swing.JLabel lbl_pnt;
    private javax.swing.JLabel lbl_point;
    private javax.swing.JLabel lbl_que;
    private javax.swing.JLabel lbl_wrg_que;
    private javax.swing.JLabel lbl_wrng;
    private javax.swing.JPanel pnl_pnt;
    // End of variables declaration//GEN-END:variables
}
