/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.views;

import Model.Drink;
import Model.Money_Dispenser;
import backend.event.engine.Engine;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import system.events.*;

/**
 *
 * @author ragrag
 */
public class WaterHeater_VIEW extends javax.swing.JFrame {

    /**
     * Creates new form WaterHeater_VIEW
     */
    private static final WaterHeater_VIEW waterHeaterView = new WaterHeater_VIEW();

    public void setTemp(String tempreture) {
        this.tempreture.setText(tempreture);
    }

    public void setPower(Boolean power) {
        String pow = power ? "ON" : "OFF";
        this.power.setText(pow);
        if (pow == "ON") {
            this.power.setForeground(Color.GREEN);
        } else if (pow == "OFF") {
            this.power.setForeground(Color.RED);
        }
    }

    public void setStatus(String status) {
        this.status.setText(status);
        if (status == "COOLING") {
            this.status.setForeground(Color.BLUE);
        } else if (status == "HEATING") {
            this.status.setForeground(Color.RED);
        } else {
            this.status.setForeground(Color.BLACK);
        }
    }

    private WaterHeater_VIEW() {
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }

    public static WaterHeater_VIEW getWaterHeaterView() {
        return waterHeaterView;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        status = new javax.swing.JLabel();
        tempreture = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        power = new javax.swing.JLabel();
        switchPowerBtn = new javax.swing.JButton();
        InsertMoney = new javax.swing.JButton();
        moneyEntered = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();
        Latte = new javax.swing.JRadioButton();
        Cappuccino = new javax.swing.JRadioButton();
        Espresso = new javax.swing.JRadioButton();
        Americano = new javax.swing.JRadioButton();
        Mocha = new javax.swing.JRadioButton();
        Macchiato = new javax.swing.JRadioButton();
        Sugar = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        Small = new javax.swing.JRadioButton();
        Medium = new javax.swing.JRadioButton();
        Large = new javax.swing.JRadioButton();
        Start = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        status.setText("Status");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 340, -1, -1));

        tempreture.setEditable(false);
        tempreture.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tempreture.setText("temperature");
        tempreture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempretureActionPerformed(evt);
            }
        });
        getContentPane().add(tempreture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Water Tempreture");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, -1, -1));

        power.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        power.setText("Power");
        getContentPane().add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 390, -1, -1));

        switchPowerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        switchPowerBtn.setText("Switch Power");
        switchPowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchPowerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(switchPowerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 380, -1, -1));

        InsertMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InsertMoney.setText("Insert Money");
        InsertMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(InsertMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, -1, -1));

        moneyEntered.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(moneyEntered, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 180, 113, -1));

        Screen.setColumns(20);
        Screen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Screen.setRows(5);
        jScrollPane2.setViewportView(Screen);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, 138));

        Latte.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Latte.setText("Latte");
        getContentPane().add(Latte, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 110, 40));

        Cappuccino.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Cappuccino.setText("Cappuccino");
        getContentPane().add(Cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 130, 40));

        Espresso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Espresso.setText("Espresso");
        getContentPane().add(Espresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 110, 40));

        Americano.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Americano.setText("Americano");
        getContentPane().add(Americano, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 150, 40));

        Mocha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Mocha.setText("Mocha");
        getContentPane().add(Mocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 120, 40));

        Macchiato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Macchiato.setText("Macchiato");
        getContentPane().add(Macchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 40));

        Sugar.setMaximum(5);
        Sugar.setValue(0);
        getContentPane().add(Sugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Sugar 0->5");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 110, 20));

        Small.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Small.setText("Small");
        getContentPane().add(Small, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        Medium.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Medium.setText("Medium");
        getContentPane().add(Medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        Large.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Large.setText("Large");
        getContentPane().add(Large, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        Start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 110, 50));

        Cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancel.setText("Cancel");
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 110, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/5.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setNextFocusableComponent(Espresso);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Espresso, org.jdesktop.beansbinding.ObjectProperty.create(), jLabel4, org.jdesktop.beansbinding.BeanProperty.create("labelFor"));
        bindingGroup.addBinding(binding);

        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 190, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMinimumSize(new java.awt.Dimension(220, 220));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/6.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 200, 220));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 210));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 180, 220));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/4.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 210));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/coffee_minimal_wallpapers_by_webmozg-d3d9qfb.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 900, 430));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tempretureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempretureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempretureActionPerformed

    private void switchPowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchPowerBtnActionPerformed
        Engine.sendEvent(new Power_EVENT(false));        // TODO add your handling code here:
    }//GEN-LAST:event_switchPowerBtnActionPerformed

    private void InsertMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertMoneyActionPerformed
        Money_Dispenser.getMoneyDispenser().swallow(); // TODO add your handling code here:
    }//GEN-LAST:event_InsertMoneyActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartActionPerformed

    /**
     * @param args the command line arguments
     */
    public JTextArea getScreen() {
        return Screen;
    }

    /**
     * @param args the command line arguments
     */
    public JTextField getMoneyEntered() {
        return moneyEntered;
    }
    

    public void setDrink(Drink drink, boolean state) {
        switch (drink.getName()) {
            case "mocha":
                if (state) {
                    Mocha.setForeground(Color.GREEN);
                } else {
                    Mocha.setForeground(Color.RED);
                }
            case "espresso":
                if (state) {
                    Espresso.setForeground(Color.GREEN);
                } else {
                    Espresso.setForeground(Color.RED);
                }
            case "americano":
                if (state) {
                    Americano.setForeground(Color.GREEN);
                } else {
                    Americano.setForeground(Color.RED);
                }
            case "machiatto":
                if (state) {
                    Macchiato.setForeground(Color.GREEN);
                } else {
                    Macchiato.setForeground(Color.RED);
                }
            case "latte":
                if (state) {
                    Latte.setForeground(Color.GREEN);
                } else {
                    Latte.setForeground(Color.RED);
                }
            case "cappuccino":
                if (state) {
                    Cappuccino.setForeground(Color.GREEN);
                } else {
                    Cappuccino.setForeground(Color.RED);
                }
                

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Americano;
    private javax.swing.JButton Cancel;
    private javax.swing.JRadioButton Cappuccino;
    private javax.swing.JRadioButton Espresso;
    private javax.swing.JButton InsertMoney;
    private javax.swing.JRadioButton Large;
    private javax.swing.JRadioButton Latte;
    private javax.swing.JRadioButton Macchiato;
    private javax.swing.JRadioButton Medium;
    private javax.swing.JRadioButton Mocha;
    private javax.swing.JTextArea Screen;
    private javax.swing.JRadioButton Small;
    private javax.swing.JButton Start;
    private javax.swing.JSlider Sugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField moneyEntered;
    private javax.swing.JLabel power;
    private javax.swing.JLabel status;
    private javax.swing.JButton switchPowerBtn;
    private javax.swing.JTextField tempreture;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
