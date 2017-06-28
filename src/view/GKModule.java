
package view;

import controller.ChapterController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author hatake_47
 */
public class GKModule extends javax.swing.JFrame {
    
    private ArrayList<String> que=null;
    private ArrayList<String> opt=null;
    private static int i=1;
    private static int l=1;
    
    private String option;
    private String[] optn2 = null;
    /**
     * Creates new form ScienceModule2
     */
    public GKModule() {
        initComponents();
        
        listQuestion();         //list the questions as soon as the module opens
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_group = new javax.swing.ButtonGroup();
        pnl_gkmod = new javax.swing.JPanel();
        lbl_que = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        btn_nxt = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();

        btn_group.add(opt1);
        btn_group.add(opt2);
        btn_group.add(opt3);
        btn_group.add(opt4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_que.setText("jLabel1");

        opt1.setText("jRadioButton1");

        opt2.setText("jRadioButton2");

        opt3.setText("jRadioButton3");
        opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3ActionPerformed(evt);
            }
        });

        opt4.setText("jRadioButton4");

        btn_nxt.setText("Next");
        btn_nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nxtActionPerformed(evt);
            }
        });

        btn_prev.setText("Previous");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_gkmodLayout = new javax.swing.GroupLayout(pnl_gkmod);
        pnl_gkmod.setLayout(pnl_gkmodLayout);
        pnl_gkmodLayout.setHorizontalGroup(
            pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gkmodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_que, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opt3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opt4)
                    .addComponent(opt2))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_gkmodLayout.setVerticalGroup(
            pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gkmodLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl_que, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gkmodLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt1)
                            .addComponent(opt2))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt3)
                            .addComponent(opt4))
                        .addGap(57, 208, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_gkmod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_gkmod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt3ActionPerformed

    
    //this function is overwritten to list the remaining question other than first
    private void btn_nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nxtActionPerformed
        Object source = evt.getSource();    //get the event source in the variable 'source'
        
        ChapterController ch = new ChapterController();     //initialized ChapterController
        if(source.equals(btn_nxt)){                      //checks if the button is clicked
            que = new ArrayList<>();                         //initialize the 'que' variable of ArrayList 
            que.addAll(ch.getContent(l));                    //Add all the values received from the function 'getContent' of ChapterController
            lbl_que.setText(que.get(0));                     //set the text on 'lbl_que' which was stored in ArrayList 'que'
            
            opt = new ArrayList<>();
            opt.addAll(ch.getOptions(l));
            
            option = opt.get(0);
            optn2=option.split(",");

            opt1.setText(optn2[0]);
            opt2.setText(optn2[1]);
            opt3.setText(optn2[2]);
            opt4.setText(optn2[3]);
            
            l++;                                            //increment the value of l by 1
            
            if(l==11){                               //checks if 'que' is empty        
                if(source.equals(btn_nxt)){              //checks if the button is clicked
//                    Point pnt = new Point();                //initilize Point 'pnt' variable
//                    pnt.setVisible(true);                   //make the frame 'pnt' visibkle
//                    pnt.setLocation(pnl_gkmod.getWidth()-200, pnl_gkmod.getHeight()-200); //set the location of 'pnt'

                    btn_nxt.setVisible(false);
                }
            }
            
            if(source.equals(btn_prev)){
                l--;
                l--;
                btn_prev.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn_prev.addActionListener(this);
                    }
                });
            }
        }
    }//GEN-LAST:event_btn_nxtActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        l--;                                            //decrement the value of 'l' by 1
        
        Object source = evt.getSource();    //get the event source in the variable 'source'
        
        ChapterController ch = new ChapterController();     //initialized ChapterController
        
        if(source.equals(btn_prev)){                      //checks if the button is clicked
            que = new ArrayList<>();                         //initialize the 'que' variable of ArrayList 
            que.addAll(ch.getContent(l));                    //Add all the values received from the function 'getContent' of ChapterController
            lbl_que.setText(que.get(0));                     //set the text on 'lbl_que' which was stored in ArrayList 'que'
            
            System.out.println(que.get(0));
            
            opt = new ArrayList<>();
            opt.addAll(ch.getOptions(l));
            
            option = opt.get(0);
            optn2=option.split(",");

            opt1.setText(optn2[0]);
            opt2.setText(optn2[1]);
            opt3.setText(optn2[2]);
            opt4.setText(optn2[3]);
            
            if(que.isEmpty()){                               //checks if 'que' is empty        
                if(source.equals(btn_prev)){              //checks if the button is clicked
                    btn_prev.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_btn_prevActionPerformed

    
    //this function is created to list first question of a set
    public void listQuestion(){
        int j=1;                                            //value of 'j' is provided
        
        ChapterController ch = new ChapterController();     //initialized ChapterController
                       
        que = new ArrayList<>();                             //initialize the 'que' variable of ArrayList 
        que.addAll(ch.getContent(j));                        //Add all the values received from the function 'getContent' of ChapterController
        lbl_que.setText(que.get(0));                         //set the text on 'lbl_que' which was stored in ArrayList 'que'
        l++;                                                //increment the value of l by 1
        
        opt = new ArrayList<>();                            //initialize the 'opt' variable of ArrayList 
        opt.addAll(ch.getOptions(j));
        
        option = opt.get(0);
        optn2=option.split(",");
        
        opt1.setText(optn2[0]);
        opt2.setText(optn2[1]);
        opt3.setText(optn2[2]);
        opt4.setText(optn2[3]);
        
        btn_nxt.addActionListener(new ActionListener() { //method overwritten to call the function 'addActionListener'
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_nxt.addActionListener(this);         //calls the function 'addActionListener'
            }
        });
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GKModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btn_group;
    private javax.swing.JButton btn_nxt;
    private javax.swing.JButton btn_prev;
    private javax.swing.JLabel lbl_que;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JPanel pnl_gkmod;
    // End of variables declaration//GEN-END:variables
}
