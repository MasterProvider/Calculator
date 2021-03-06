/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Federicio Patricio Jr.
 */
public class MainActivity extends javax.swing.JFrame {

    /**
     * Creates new form MainActivity
     */
    int posX=0,posY=0;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char PERCENTAGE = '%';
    private final char EQU = 0;
    private double firstNum = Double.NaN;
    private double secondNum;
    private int decimalClick;
    private double plusminus;

    private char ACTION;

   
    public MainActivity() {
        initComponents();
        
   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        toolbar = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        infoBtn = new javax.swing.JLabel();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        posneg = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        display2 = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainLayout.setBackground(new java.awt.Color(102, 102, 102));
        mainLayout.setAutoscrolls(true);
        mainLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toolbar.setBackground(new java.awt.Color(0, 153, 255));
        toolbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toolbarMouseDragged(evt);
            }
        });
        toolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toolbarMousePressed(evt);
            }
        });

        appName.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("Calculator");

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ic_exit.png"))); // NOI18N
        exitBtn.setFocusCycleRoot(true);
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ic_minimize.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });

        infoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ic_info.png"))); // NOI18N
        infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(appName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(infoBtn)
                .addGap(5, 5, 5)
                .addComponent(minimizeBtn)
                .addGap(5, 5, 5)
                .addComponent(exitBtn)
                .addContainerGap())
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoBtn)
                    .addComponent(minimizeBtn)
                    .addComponent(exitBtn)
                    .addComponent(appName))
                .addContainerGap())
        );

        mainLayout.add(toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        eight.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        mainLayout.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 80, 50));

        nine.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        mainLayout.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 80, 50));

        four.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        mainLayout.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 80, 50));

        five.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        mainLayout.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 80, 50));

        six.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        mainLayout.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, 50));

        one.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        mainLayout.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 80, 50));

        two.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        mainLayout.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 80, 50));

        three.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        mainLayout.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 80, 50));

        multiply.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(51, 153, 255));
        multiply.setText("×");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        mainLayout.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, 50));

        minus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(51, 153, 255));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        mainLayout.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 80, 50));

        add.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(51, 153, 255));
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        mainLayout.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 80, 50));

        clear.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        mainLayout.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 80, 50));

        zero.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        mainLayout.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 80, 50));

        backspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ic_backspace.png"))); // NOI18N
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });
        mainLayout.add(backspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, 50));

        equals.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        equals.setForeground(new java.awt.Color(51, 153, 255));
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        mainLayout.add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 80, 50));

        decimal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });
        mainLayout.add(decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 80, 50));

        posneg.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        posneg.setText("±");
        posneg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posnegActionPerformed(evt);
            }
        });
        mainLayout.add(posneg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 80, 50));

        divide.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(51, 153, 255));
        divide.setText("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        mainLayout.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 50));

        seven.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        mainLayout.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 80, 50));

        percentage.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });
        mainLayout.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, 50));

        display2.setEditable(false);
        display2.setBackground(new java.awt.Color(102, 102, 102));
        display2.setColumns(1);
        display2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setBorder(null);
        display2.setOpaque(false);
        mainLayout.add(display2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 320, 30));

        display1.setEditable(false);
        display1.setBackground(new java.awt.Color(102, 102, 102));
        display1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        display1.setForeground(new java.awt.Color(255, 255, 255));
        display1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display1.setBorder(null);
        mainLayout.add(display1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 320, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mainLayout.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
       this.dispose();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
       this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        display2.setText(display2.getText().toString() + eight.getText());
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        display2.setText(display2.getText().toString() + nine.getText());
    }//GEN-LAST:event_nineActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        display2.setText(display2.getText()+ two.getText());
       
    }//GEN-LAST:event_twoActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
         if(decimalClick==0){
          display2.setText(display2.getText()+decimal.getText());
          decimalClick=1;
         }        
    }//GEN-LAST:event_decimalActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
                 calculate();
                ACTION = EQU;
                display1.setText(String.valueOf(firstNum));
                display2.setText("");
        
    }//GEN-LAST:event_equalsActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
                if(display1.getText().length() > 0){
                    String name = display1.getText().toString();
                    display1.setText(name.substring(0, name.length()-1));
                }else{
                    firstNum = Double.NaN;
                    secondNum = Double.NaN;
                    display1.setText("");
                    display2.setText("");
                }
    }//GEN-LAST:event_backspaceActionPerformed

    private void toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMousePressed
         posX=evt.getX();
         posY=evt.getY();
    }//GEN-LAST:event_toolbarMousePressed

    private void toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMouseDragged
         setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_toolbarMouseDragged

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
         calculate();
         decimalClick = 0;
         ACTION = DIVISION;
         display1.setText(String.valueOf(firstNum) + divide.getText());
         display2.setText("");
    }//GEN-LAST:event_divideActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         display2.setText(display2.getText().toString() + one.getText());
    }//GEN-LAST:event_oneActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         display2.setText(display2.getText().toString() + three.getText());
    }//GEN-LAST:event_threeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        display2.setText(display2.getText().toString() + zero.getText());
    }//GEN-LAST:event_zeroActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        display2.setText(display2.getText().toString() + four.getText());
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        display2.setText(display2.getText().toString() + five.getText());
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        display2.setText(display2.getText().toString() + six.getText());
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        display2.setText(display2.getText().toString() + seven.getText());
    }//GEN-LAST:event_sevenActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                calculate();
                decimalClick = 0;
                ACTION = ADDITION;
                display1.setText(String.valueOf(firstNum) + add.getText());
                display2.setText("");
                
    }//GEN-LAST:event_addActionPerformed

    private void posnegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posnegActionPerformed

                plusminus=(Double.parseDouble(String.valueOf(display2.getText())));
                plusminus=plusminus*(-1);
                display2.setText(String.valueOf(plusminus));
               

        
    }//GEN-LAST:event_posnegActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
                calculate();
                decimalClick = 0;
                ACTION = SUBTRACTION;
                display1.setText(String.valueOf(firstNum) + minus.getText());
                display2.setText(""); 
       
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
                calculate();
                decimalClick = 0;
                ACTION = MULTIPLICATION;
                display1.setText(String.valueOf(firstNum) + multiply.getText());
                display2.setText("");     
    }//GEN-LAST:event_multiplyActionPerformed

    private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseClicked
            AboutActivity info = new AboutActivity();
                info.setVisible(true);
                info.pack();
                info.setLocationRelativeTo(null);
                dispose();
    }//GEN-LAST:event_infoBtnMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         firstNum = Double.NaN;
         secondNum = Double.NaN;
         decimalClick = 0;
         display1.setText("");
         display2.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
         calculate();
         ACTION = PERCENTAGE;
         display1.setText(String.valueOf(firstNum) + percentage.getText());
         display2.setText("");     
    }//GEN-LAST:event_percentageActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
                
            }
        });
    }
    
     private void calculate(){
        try{
         if(!Double.isNaN(firstNum)){
            secondNum = Double.parseDouble(display2.getText().toString());
            switch(ACTION){
                case ADDITION:
                    firstNum = firstNum + secondNum;
                    break;
                case SUBTRACTION:
                    firstNum = firstNum - secondNum;
                    break;
                case MULTIPLICATION:
                    firstNum = firstNum * secondNum;
                    break;
                case DIVISION:
                    firstNum = firstNum / secondNum;
                    break;
                case PERCENTAGE:
                     firstNum =(firstNum * secondNum/100);
                    break;
                case EQU:
                    break;
            }
          }else{
            firstNum = Double.parseDouble(display2.getText().toString());
          } 
        }catch(Exception e){
            //catch error here
        }
  
        
        
       
    }
    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel appName;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimal;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel infoBtn;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percentage;
    private javax.swing.JButton posneg;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JPanel toolbar;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
