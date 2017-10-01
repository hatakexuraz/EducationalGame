package view;

/**
 *
 * @author hatake_47
 */
public class Dashboard extends javax.swing.JFrame {
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        pnl_math.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_header = new javax.swing.JPanel();
        pnl_cmp = new javax.swing.JPanel();
        lbl_mes = new javax.swing.JLabel();
        cmb_modules = new javax.swing.JComboBox<>();
        btn_start = new javax.swing.JButton();
        lbl_point = new javax.swing.JLabel();
        lbl_set = new javax.swing.JLabel();
        pane_content = new javax.swing.JLayeredPane();
        pnl_math = new javax.swing.JPanel();
        pane_math = new javax.swing.JScrollPane();
        tbl_maths = new javax.swing.JTable();
        pnl_gk = new javax.swing.JPanel();
        pane_gk = new javax.swing.JScrollPane();
        tbl_gk = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 83, 163));
        setForeground(new java.awt.Color(66, 106, 226));

        pnl_header.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnl_cmp.setBackground(new java.awt.Color(175, 207, 239));

        lbl_mes.setText("Select one module");

        cmb_modules.addItem("GK");
        cmb_modules.addItem("Maths");
        cmb_modules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_modulesActionPerformed(evt);
            }
        });

        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        lbl_point.setText("Click  -->");

        lbl_set.setForeground(new java.awt.Color(44, 100, 223));
        lbl_set.setText("here");
        lbl_set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_setMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_cmpLayout = new javax.swing.GroupLayout(pnl_cmp);
        pnl_cmp.setLayout(pnl_cmpLayout);
        pnl_cmpLayout.setHorizontalGroup(
            pnl_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_mes)
                .addGap(18, 18, 18)
                .addComponent(cmb_modules, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_point)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_set)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
                .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_cmpLayout.setVerticalGroup(
            pnl_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_mes)
                    .addComponent(cmb_modules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_start)
                    .addComponent(lbl_point)
                    .addComponent(lbl_set))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_maths.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Numbers"},
                {"2", "Fractions"},
                {"3", "Whole Number"},
                {null, null}
            },
            new String [] {
                "Unit", "Unit name"
            }
        ));
        pane_math.setViewportView(tbl_maths);

        javax.swing.GroupLayout pnl_mathLayout = new javax.swing.GroupLayout(pnl_math);
        pnl_math.setLayout(pnl_mathLayout);
        pnl_mathLayout.setHorizontalGroup(
            pnl_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mathLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pane_math, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnl_mathLayout.setVerticalGroup(
            pnl_mathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mathLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pane_math, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tbl_gk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "GK Set-1"},
                {"2", "GK Set-2"},
                {"3", "GK Set-3"},
                {null, null}
            },
            new String [] {
                "Unit", "Unit name"
            }
        ));
        pane_gk.setViewportView(tbl_gk);

        javax.swing.GroupLayout pnl_gkLayout = new javax.swing.GroupLayout(pnl_gk);
        pnl_gk.setLayout(pnl_gkLayout);
        pnl_gkLayout.setHorizontalGroup(
            pnl_gkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 952, Short.MAX_VALUE)
            .addGroup(pnl_gkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_gkLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(pane_gk, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        pnl_gkLayout.setVerticalGroup(
            pnl_gkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
            .addGroup(pnl_gkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_gkLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(pane_gk, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        pane_content.setLayer(pnl_math, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pane_content.setLayer(pnl_gk, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pane_contentLayout = new javax.swing.GroupLayout(pane_content);
        pane_content.setLayout(pane_contentLayout);
        pane_contentLayout.setHorizontalGroup(
            pane_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_math, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pane_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pane_contentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_gk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pane_contentLayout.setVerticalGroup(
            pane_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_math, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pane_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_contentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnl_gk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(482, 482, 482))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_cmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addComponent(pane_content)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_cmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pane_content))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
       
        String module;
        String unit;
        module = cmb_modules.getSelectedItem().toString();
        
        if(module.equals("GK")){
            unit = (String) tbl_gk.getValueAt(tbl_gk.getSelectedRow(), tbl_gk.getSelectedColumn());
            
            GKModule sc = new GKModule(unit);
            sc.setVisible(true);
            sc.setLocationRelativeTo(null);
        }
        else{
            unit = (String) tbl_maths.getValueAt(tbl_maths.getSelectedRow(), tbl_maths.getSelectedColumn());
            
            MathsModule math = new MathsModule(unit);
            math.setVisible(true);
            math.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void cmb_modulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_modulesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_modulesActionPerformed

    private void lbl_setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_setMouseClicked
        
        String module;
        module = cmb_modules.getSelectedItem().toString();
                
        if(module.equals("GK")){
            pnl_gk.setVisible(true);
            pnl_math.setVisible(false);
        }
        else{
            pnl_gk.setVisible(false);
            pnl_math.setVisible(true);
            
        }
    }//GEN-LAST:event_lbl_setMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard db = new Dashboard();
                db.setLocationRelativeTo(null);
                db.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JComboBox<String> cmb_modules;
    private javax.swing.JLabel lbl_mes;
    private javax.swing.JLabel lbl_point;
    private javax.swing.JLabel lbl_set;
    private javax.swing.JLayeredPane pane_content;
    private javax.swing.JScrollPane pane_gk;
    private javax.swing.JScrollPane pane_math;
    private javax.swing.JPanel pnl_cmp;
    private javax.swing.JPanel pnl_gk;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_math;
    private javax.swing.JTable tbl_gk;
    private javax.swing.JTable tbl_maths;
    // End of variables declaration//GEN-END:variables
}
