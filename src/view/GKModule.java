
package view;

import Util.QuestionList;
import controller.GKChapterController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author hatake_47
 */
public class GKModule extends QuestionList {
    
    private ArrayList<String> que=null;     //to store questions first hand after receiving from the database
    private ArrayList<String> opt=null;     //to store options first hand after receiving from the database
    private ArrayList<String> select=null;  //to store the selected options
    private static int i=1;
    private static int l=1;
    
    private int no=1;
    
    private String option;                  //to store options all at once
    private String[] optn2 = null;          //to store options in different index
    /**
     * Creates new form ScienceModule2
     */
    public GKModule() {
        initComponents();
        
        listQuestion();         //list the questions as soon as the module opens
                
        btn_prev.setVisible(false);
        btn_finish.setVisible(false);
    }
    
    public GKModule(String unit) {
        initComponents();
        
        listQuestion();         //list the questions as soon as the module opens
                
        btn_prev.setVisible(false);
        btn_finish.setVisible(false);
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
        lbl_num = new javax.swing.JLabel();
        btn_finish = new javax.swing.JButton();

        btn_group.add(opt1);
        btn_group.add(opt2);
        btn_group.add(opt3);
        btn_group.add(opt4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_que.setText("Question");

        opt1.setText("Option1");

        opt2.setText("Option2");

        opt3.setText("Option3");
        opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3ActionPerformed(evt);
            }
        });

        opt4.setText("Option4");
        opt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt4ActionPerformed(evt);
            }
        });

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

        lbl_num.setText("S.N");

        btn_finish.setText("Finish");
        btn_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_gkmodLayout = new javax.swing.GroupLayout(pnl_gkmod);
        pnl_gkmod.setLayout(pnl_gkmodLayout);
        pnl_gkmodLayout.setHorizontalGroup(
            pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gkmodLayout.createSequentialGroup()
                .addComponent(lbl_num, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_que, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opt3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt4)
                    .addComponent(opt2))
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_gkmodLayout.setVerticalGroup(
            pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gkmodLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_que, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_num, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt2)
                    .addComponent(opt1))
                .addGap(18, 18, 18)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt3)
                    .addComponent(opt4))
                .addGap(43, 43, 43)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btn_group.add(opt1);
        btn_group.add(opt2);
        btn_group.add(opt3);
        btn_group.add(opt4);

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

    
    //this function is written to list the remaining question other than first
    private void btn_nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nxtActionPerformed
        btn_group.clearSelection();
        no++;
        lbl_num.setText(Integer.toString(no));
        
        Object source = evt.getSource();    //get the event source in the variable 'source'
                 
        GKChapterController ch = new GKChapterController();     //initialized GKChapterController
        if(source.equals(btn_nxt)){                      //checks if the button is clicked
            
//            que.clear();
//            opt.clear();
//            
//            select = new ArrayList<>();
//                        
//            que = new ArrayList<>();                         //initialize the 'que' variable of ArrayList 
//            que.addAll(ch.getContent(l));                    //Add all the values received from the function 'getContent' of GKChapterController
//            lbl_que.setText(que.get(0));                     //set the text on 'lbl_que' which was stored in ArrayList 'que'
//            
//            opt = new ArrayList<>();
//            opt.addAll(ch.getOptions(l));                   //add all the option on ArrayList 'opt'
//            
//            option = opt.get(0);                            
//            optn2=option.split(",");                        //the value on 'option' is received by array of 'optn2' variable...
//                                                            //...on each index of 'opt2'
//            opt1.setText(optn2[0]);
//            opt2.setText(optn2[1]);
//            opt3.setText(optn2[2]);
//            opt4.setText(optn2[3]);
            
            listQuestion();

            l++;                                            //increment the value of l by 1
            
//            Enumeration<AbstractButton> allRadioButton=btn_group.getElements();  
//            while(!allRadioButton.equals(""))  
//            {  
//               JRadioButton temp=(JRadioButton)allRadioButton.nextElement(); 
//                System.out.println(temp.getText()+" || ");
//               if(temp.getText().contains(""))  
//               {  
//                   JOptionPane.showMessageDialog(null,"Please select one option!");  
//               } 
//               else{
//                   btn_nxtActionPerformed(evt);
//               }
//            }
            
            if(l>10){                               //checks if 'que' is empty        
                if(source.equals(btn_nxt)){              //checks if the button is clicked
//                    Point pnt = new Point();                //initilize Point 'pnt' variable
//                    pnt.setVisible(true);                   //make the frame 'pnt' visibkle
//                    pnt.setLocation(pnl_gkmod.getWidth()-200, pnl_gkmod.getHeight()-200); //set the location of 'pnt'

                    btn_nxt.setVisible(false);
                    btn_finish.setVisible(true);
                }
            }
            
            btn_prev.setVisible(true);
            
            //if(source.equals(btn_nxt)){             //checks if button clicked is button next
//                ButtonModel sel = btn_group.getSelection();
//                if(sel.toString().contains("")){
//                    JOptionPane.showMessageDialog(null, "Please select one option!");
//                }
//                else{
//                    btn_prev.setVisible(true);          //set the button visibility to true
//                    select.add(btn_group.getSelection().toString());
//                }

//                String sel = getSelectedButtonText(btn_group);
//                System.out.println(sel+" :wdqd s");
//                if(sel.contains("")){
//                    JOptionPane.showMessageDialog(null, "Please select one option!");
//                }
//                else{
//                    btn_prev.setVisible(true);          //set the button visibility to true
//                    select.add(btn_group.getSelection().toString());
//                }
            //}
            
            if(source.equals(btn_prev)){
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

    //this function is written to list previous question that have been displayed earlier
    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        btn_group.clearSelection();
        lbl_num.setText(Integer.toString(no));
        no--;

        l--;                                            //decrement the value of 'l' by 1
        
        Object source = evt.getSource();    //get the event source in the variable 'source'
        
        GKChapterController ch = new GKChapterController();     //initialized GKChapterController
        
        if(source.equals(btn_prev)){                      //checks if the button is clicked
            
            que.clear();
            opt.clear();
            
            que = new ArrayList<>();                         //initialize the 'que' variable of ArrayList 
            que.addAll(ch.getContent(l));                    //Add all the values received from the function 'getContent' of GKChapterController
            lbl_que.setText(que.get(0));                     //set the text on 'lbl_que' which was stored in ArrayList 'que'
                        
            opt = new ArrayList<>();
            opt.addAll(ch.getOptions(l));
            
            option = opt.get(0);
            optn2=option.split(",");

            opt1.setText(optn2[0]);
            opt2.setText(optn2[1]);
            opt3.setText(optn2[2]);
            opt4.setText(optn2[3]);
            
            if(source.equals(btn_prev)){                    //checks if button clicked is button previous
                btn_nxt.setVisible(true);                   //set the button visibility to true
            }
            
            if(l<=1){                               //checks if the value of 'l' is less than or equal to 1
                if(source.equals(btn_prev)){        //checks if the button clicked is button previous 
                    btn_prev.setVisible(false);     //set the button visibility to false
                }
            }
            
            if(source.equals(btn_nxt)){
                l++;
                btn_nxt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btn_nxt.addActionListener(this);
                    }
                });
            }
        }
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finishActionPerformed
        this.dispose();
        //Point pnt = new Point();
        
    }//GEN-LAST:event_btn_finishActionPerformed

    private void opt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt4ActionPerformed

    
    //this function is created to list first question of a set
    public void listQuestion(){
        btn_group.clearSelection();
        lbl_num.setText(Integer.toString(no));
        
        int j=1;                                            //value of 'j' is provided
        
        GKChapterController ch = new GKChapterController();     //initialized GKChapterController
                       
        que = new ArrayList<>();                             //initialize the 'que' variable of ArrayList 
        que.addAll(ch.getContent(j));                        //Add all the values received from the function 'getContent' of GKChapterController
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
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    } 
    
    public void selectOption(ArrayList<String> opt){
        while(!opt.contains("")){
            Enumeration<AbstractButton> allRadioButton=btn_group.getElements();  
            while(!allRadioButton.equals(""))  
            {  
               JRadioButton temp=(JRadioButton)allRadioButton.nextElement(); 
                System.out.println(temp.getText()+" || ");
               if(temp.getText().contains(""))  
               {  
                   JOptionPane.showMessageDialog(null,"Please select one option!");  
               } 
               else{
                   btn_nxt.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           btn_nxt.addActionListener(this);
                       }
                   });
               }
            }
        }        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GKModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_finish;
    private javax.swing.ButtonGroup btn_group;
    private javax.swing.JButton btn_nxt;
    private javax.swing.JButton btn_prev;
    private javax.swing.JLabel lbl_num;
    private javax.swing.JLabel lbl_que;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JPanel pnl_gkmod;
    // End of variables declaration//GEN-END:variables
}
