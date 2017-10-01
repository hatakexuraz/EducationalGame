package view;

import Util.QuestionList;
import controller.MathsChapterController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author hatake_47
 */
public class MathsModule extends QuestionList {

    private ArrayList<String> que=null;
    private ArrayList<String> opt=null;
    private ArrayList<String> ans=null;
    
    private String unit=null;
    private String selectedOpt=null;
    private String answer=null;
    
    private static int i=1;
    private static int l=1;
    
    private int no=1;
    
    private int point=0;
    
    private String option;
    private String[] optn2 = null;
    
    public MathsModule() {
        initComponents();
        
        listQuestion();
        
        btn_prev.setVisible(false);
        btn_finish.setVisible(false);
    }

    public MathsModule(String unit) {
        this.unit = unit;
        
        initComponents();
        
        listQuestion();
        
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
        opt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt1ActionPerformed(evt);
            }
        });

        opt2.setText("Option2");

        opt3.setText("Option3");
        opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3ActionPerformed(evt);
            }
        });

        opt4.setText("Option4");

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
                .addComponent(lbl_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_que, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnl_gkmodLayout.createSequentialGroup()
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gkmodLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(pnl_gkmodLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                        .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opt4)
                            .addComponent(opt2))
                        .addGap(54, 54, 54))
                    .addComponent(btn_nxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(267, 267, 267))
            .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                    .addContainerGap(646, Short.MAX_VALUE)
                    .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(257, 257, 257)))
        );
        pnl_gkmodLayout.setVerticalGroup(
            pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gkmodLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_que, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_num, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt1)
                    .addComponent(opt2))
                .addGap(18, 18, 18)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt3)
                    .addComponent(opt4))
                .addGap(42, 42, 42)
                .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(pnl_gkmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gkmodLayout.createSequentialGroup()
                    .addContainerGap(235, Short.MAX_VALUE)
                    .addComponent(btn_finish, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)))
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

    private void btn_nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nxtActionPerformed
        btn_group.clearSelection();
        no++;
        lbl_num.setText(Integer.toString(no));
        
        Object source = evt.getSource();    //get the event source in the variable 'source'

        MathsChapterController maths = new MathsChapterController();     //initialized MathsChapterController
        if(source.equals(btn_nxt)){                      //checks if the button is clicked
            que = new ArrayList<>();                         //initialize the 'que' variable of ArrayList
            que.addAll(maths.getContent(l));                    //Add all the values received from the function 'getContent' of MathsChapterController
            //lbl_que.setText(que.get(0));                     //set the text on 'lbl_que' which was stored in ArrayList 'que'
            answer = que.get(1);
            
            opt = new ArrayList<>();
            opt.addAll(maths.getOptions(l));
            
            setLabel(que, opt);
            
            l++;                                            //increment the value of l by 1
            
            String next = getSelectedButton(btn_group);
            while(next.contains("")){
                JOptionPane.showMessageDialog(null, "Please select one option!");
            }
            
            if(l>10){                               //checks if 'que' is empty        
                if(source.equals(btn_nxt)){              //checks if the button is clicked
//                    Point pnt = new Point();                //initilize Point 'pnt' variable
//                    pnt.setVisible(true);                   //make the frame 'pnt' visibkle
//                    pnt.setLocation(pnl_gkmod.getWidth()-200, pnl_gkmod.getHeight()-200); //set the location of 'pnt'
                    btn_nxt.setVisible(false);
                    btn_finish.setVisible(true);
                }
            }
            
            if(source.equals(btn_nxt)){             //checks if button clicked is button next
                btn_prev.setVisible(true);          //set the button visibility to true
//                
//                if(opt1.isSelected()){
//                    getPoint(opt1.getText());
//                    System.out.println(opt1.getText());
//                }
//                else if(opt2.isSelected()){
//                    getPoint(opt2.getText());
//                    System.out.println(opt2.getText());
//                }
//                else if(opt3.isSelected()){
//                    getPoint(opt3.getText());
//                    System.out.println(opt3.getText());
//                }
//                else if(opt4.isSelected()){
//                    getPoint(opt4.getText());
//                    System.out.println(opt4.getText());
//                }
                
//                selectedOpt=getSelectedButton(btn_group);
//                System.out.println(answer+" || "+selectedOpt);
//                getPoint(selectedOpt,answer);
            }

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

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        btn_group.clearSelection();
        lbl_num.setText(Integer.toString(no));
        no--;
        
        l--;                                            //decrement the value of 'l' by 1

        Object source = evt.getSource();    //get the event source in the variable 'source'

        MathsChapterController maths = new MathsChapterController();     //initialized MathsChapterController

        if(source.equals(btn_prev)){                      //checks if the button is clicked
            que = new ArrayList<>();                         //initialize the 'que' variable of ArrayList
            que.addAll(maths.getContent(l));                    //Add all the values received from the function 'getContent' of MathsChapterController
            lbl_que.setText(que.get(0));                     //set the text on 'lbl_que' which was stored in ArrayList 'que'
            answer = que.get(1);
            
            opt = new ArrayList<>();
            opt.addAll(maths.getOptions(l));

            setLabel(que, opt);            

            if(source.equals(btn_prev)){                    //checks if button clicked is button previous
                btn_nxt.setVisible(true);                   //set the button visibility to true
            }
            
            if(l<=1){                               //checks if the value of 'l' is less than or equal to 1
                if(source.equals(btn_prev)){        //checks if the button clicked is button previous 
                    btn_prev.setVisible(false);     //set the button visibility to false
                }
            }
            
            if(source.equals(btn_nxt)){
                
//                selectedOpt=getSelectedButton(btn_group);
//                System.out.println(answer+" || "+selectedOpt);
//                getPoint(selectedOpt,answer);
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

    private void listQuestion() {
        btn_group.clearSelection();
        lbl_num.setText(Integer.toString(no));
        
        int j=1;                                            //value of 'j' is provided
        
        MathsChapterController maths = new MathsChapterController();     //initialized MathsChapterController
                       
        que = new ArrayList<>();                             //initialize the 'que' variable of ArrayList 
        que.addAll(maths.getContent(j));                        //Add all the values received from the function 'getContent' of GKChapterController
        lbl_que.setText(que.get(0));                         //set the text on 'lbl_que' which was stored in ArrayList 'que'
        answer = que.get(1);
        l++;                                                //increment the value of l by 1
        
        opt = new ArrayList<>();                            //initialize the 'opt' variable of ArrayList 
        opt.addAll(maths.getOptions(j));
        
        
        setLabel(que, opt);
        
        btn_nxt.addActionListener(new ActionListener() { //method overwritten to call the function 'addActionListener'
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_nxt.addActionListener(this);         //calls the function 'addActionListener'
                
//                selectedOpt=getSelectedButton(btn_group);
//                System.out.println(answer+" || "+selectedOpt);
//                getPoint(selectedOpt,answer);
            }
        });
    }
    
    //this function count the total "sp" word available in the derived value
    public int optionTwo(String option){
        
        Pattern p = Pattern.compile("sp");      //compile the provided expression into pattern
        Matcher m = p.matcher(option);          //matches the given input against the pattern
        int count = 0;
        
        while (m.find()){
            count +=1;                      //increase the value of 'count' by 1 if match is found
        }
        
        return count;
    }
    
    //this function sets the text of the options and the questions
    public void setLabel(ArrayList<String> question, ArrayList<String> options){
        btn_group.add(opt1);
        btn_group.add(opt2);
        btn_group.add(opt3);
        btn_group.add(opt4);
        
        lbl_que.setText(question.get(0));           //sets the label for the question
        
        option = options.get(0);                    //get the value of option
        optn2=option.split("sp");                   //split the driven value if found "sp"

        if(optionTwo(options.toString())==1){       //sends the value of 'options' to the function 'optionTwo' and
            opt3.setVisible(false);                 //only set two radio button visible if there are two option
            opt4.setVisible(false);
            opt1.setText(optn2[0]);
            opt2.setText(optn2[1]);
        }
        else if(optionTwo(options.toString())==2){  //sends the value of 'options' to the function 'optionTwo' and
            opt3.setVisible(true);                  //only set two radio button visible if there are two option

            opt1.setText(optn2[0]);
            opt2.setText(optn2[1]);
            opt3.setText(optn2[2]);

            opt4.setVisible(false);
        }
        else {
            opt3.setVisible(true);
            opt4.setVisible(true);

            opt1.setText(optn2[0]);
            opt2.setText(optn2[1]);
            opt3.setText(optn2[2]);
            opt4.setText(optn2[3]);
        }
        
        selectedOpt=getSelectedButton(btn_group);
        System.out.println(answer+" || "+selectedOpt);
        getPoint(selectedOpt,answer);
    }
    
    //increase the value of point if selected answer is correct 
    public void getPoint(String option,String answer2){
        
        if(answer2.equals(option)){
            point=point+1;
            System.out.println(point);
        }
    }
    
    //returns the text of selected radio button
    public String getSelectedButton(ButtonGroup group)
    {  
        for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = buttons.nextElement();
                if (button.isSelected()) {
                    System.out.println(button.isSelected());
                    return button.getText();
                }
            }
        return null;
    }
    
    private void opt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt1ActionPerformed

    private void btn_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finishActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_finishActionPerformed

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
