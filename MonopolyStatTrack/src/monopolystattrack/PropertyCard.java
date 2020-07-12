/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolystattrack;

import java.awt.Color;

/**
 *
 * @author shayla
 */
public class PropertyCard extends javax.swing.JFrame {

    /**
     * Creates new form PropertyCard
     */
    public PropertyCard() {
        initComponents();
    }
    
    enum Property {
        BOARDWALK (50, 200, 400, 1400, 1700, 200);
        
        private final int noHRent;
        private final int oneHRent;
        private final int twoHRent;
        private final int threeHRent;
        private final int fourHRent;
        private final int hotelRent;
        
        Property(int noHRent, int oneHRent, int twoHRent, int threeHRent, int fourHRent, int hotelRent) {
            this.noHRent = noHRent;
            this.oneHRent = oneHRent;
            this.twoHRent = twoHRent;
            this.threeHRent = threeHRent;
            this.fourHRent = fourHRent;
            this.hotelRent = hotelRent;
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        propertyName = new javax.swing.JLabel();
        rentTitle = new javax.swing.JLabel();
        rentValue = new javax.swing.JLabel();
        visitorPanel = new javax.swing.JPanel();
        visitorSubtract = new javax.swing.JButton();
        visitorTitle = new javax.swing.JLabel();
        visitors = new javax.swing.JLabel();
        visitorAdd = new javax.swing.JButton();
        housePanel = new javax.swing.JPanel();
        houseTitle = new javax.swing.JLabel();
        houseSubtract = new javax.swing.JButton();
        houseAdd = new javax.swing.JButton();
        houses = new javax.swing.JLabel();
        hotelBox = new javax.swing.JCheckBox();
        profitPanel = new javax.swing.JPanel();
        totalProfitTitle = new javax.swing.JLabel();
        totalProfit = new javax.swing.JLabel();
        profitChecker = new javax.swing.JPanel();
        youText = new javax.swing.JLabel();
        haveOrHaveNot = new javax.swing.JLabel();
        sentenceText = new javax.swing.JLabel();
        costTitle = new javax.swing.JLabel();
        propertyPrice = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        propertyName.setBackground(new java.awt.Color(24, 54, 187));
        propertyName.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        propertyName.setForeground(new java.awt.Color(24, 54, 187));
        propertyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        propertyName.setText("Boardwalk");
        propertyName.setToolTipText("");
        propertyName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(24, 54, 187), null, null));

        rentTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        rentTitle.setText("RENT:");

        rentValue.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        rentValue.setText("50");

        visitorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        visitorSubtract.setText("-");
        visitorSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorSubtractActionPerformed(evt);
            }
        });

        visitorTitle.setText("Visitors");

        visitors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        visitors.setText("0");

        visitorAdd.setText("+");
        visitorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout visitorPanelLayout = new javax.swing.GroupLayout(visitorPanel);
        visitorPanel.setLayout(visitorPanelLayout);
        visitorPanelLayout.setHorizontalGroup(
            visitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visitorSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visitors, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visitorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visitorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visitorTitle)
                .addGap(39, 39, 39))
        );
        visitorPanelLayout.setVerticalGroup(
            visitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visitorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visitorTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(visitorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visitors)
                    .addComponent(visitorSubtract)
                    .addComponent(visitorAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        housePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        houseTitle.setText("Houses");

        houseSubtract.setText("-");
        houseSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseSubtractActionPerformed(evt);
            }
        });

        houseAdd.setText("+");
        houseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseAddActionPerformed(evt);
            }
        });

        houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        houses.setText("0");

        hotelBox.setText("Hotel");
        hotelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout housePanelLayout = new javax.swing.GroupLayout(housePanel);
        housePanel.setLayout(housePanelLayout);
        housePanelLayout.setHorizontalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(housePanelLayout.createSequentialGroup()
                        .addComponent(houseSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(houses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(houseAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(housePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(houseTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(housePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(hotelBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        housePanelLayout.setVerticalGroup(
            housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(housePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(houseTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(housePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseSubtract)
                    .addComponent(houseAdd)
                    .addComponent(houses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hotelBox)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        profitPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        totalProfitTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        totalProfitTitle.setText("Total Amount Gained");

        totalProfit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        totalProfit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalProfit.setText("0");

        javax.swing.GroupLayout profitPanelLayout = new javax.swing.GroupLayout(profitPanel);
        profitPanel.setLayout(profitPanelLayout);
        profitPanelLayout.setHorizontalGroup(
            profitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalProfit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(profitPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalProfitTitle)))
                .addGap(42, 42, 42))
        );
        profitPanelLayout.setVerticalGroup(
            profitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalProfitTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalProfit)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        profitChecker.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        youText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        youText.setText("You");

        haveOrHaveNot.setBackground(new java.awt.Color(255, 51, 51));
        haveOrHaveNot.setForeground(new java.awt.Color(255, 0, 0));
        haveOrHaveNot.setText("HAVEN'T");

        sentenceText.setText("made a true profit.");

        javax.swing.GroupLayout profitCheckerLayout = new javax.swing.GroupLayout(profitChecker);
        profitChecker.setLayout(profitCheckerLayout);
        profitCheckerLayout.setHorizontalGroup(
            profitCheckerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profitCheckerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(youText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(haveOrHaveNot)
                .addGap(32, 32, 32))
            .addGroup(profitCheckerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(sentenceText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profitCheckerLayout.setVerticalGroup(
            profitCheckerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profitCheckerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profitCheckerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(youText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(haveOrHaveNot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sentenceText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        costTitle.setText("Cost: ");

        propertyPrice.setText("400");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(costTitle)
                                .addGap(4, 4, 4)
                                .addComponent(propertyPrice)
                                .addGap(42, 42, 42)
                                .addComponent(rentTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rentValue))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(visitorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(housePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(profitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profitChecker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(propertyName)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rentTitle)
                            .addComponent(rentValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costTitle)
                            .addComponent(propertyPrice))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visitorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(housePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profitChecker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitorSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorSubtractActionPerformed
        int num = Integer.parseInt(visitors.getText());
        int rent = Integer.parseInt(rentValue.getText());
        int totalProf = Integer.parseInt(totalProfit.getText());
        num--;
        if(num < 0) num = 0;
        visitors.setText(Integer.toString(num));
        totalProf = totalProf - rent; 
        totalProfit.setText(Integer.toString(totalProf));
        
        int cost = Integer.parseInt(propertyPrice.getText());
        
        if (totalProf > cost) {
            haveOrHaveNot.setForeground(Color.green);
            haveOrHaveNot.setText("HAVE");
        } 
        if (totalProf < cost) {
            haveOrHaveNot.setForeground(Color.red);
            haveOrHaveNot.setText("HAVEN'T");
        }
    }//GEN-LAST:event_visitorSubtractActionPerformed

    private void visitorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorAddActionPerformed
        
        int num = Integer.parseInt(visitors.getText());
        int rent = Integer.parseInt(rentValue.getText());
        int totalProf = Integer.parseInt(totalProfit.getText());
        num++;
        visitors.setText(Integer.toString(num));
        totalProf = totalProf + rent; 
        totalProfit.setText(Integer.toString(totalProf));
        
        //check to see if player has made a profit
        
        int cost = Integer.parseInt(propertyPrice.getText());
        
        if (totalProf > cost) {
            haveOrHaveNot.setForeground(Color.green);
            haveOrHaveNot.setText("HAVE");
        } 
        if (totalProf < cost) {
            haveOrHaveNot.setForeground(Color.red);
            haveOrHaveNot.setText("HAVEN'T");
        }


    }//GEN-LAST:event_visitorAddActionPerformed

    private void houseSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseSubtractActionPerformed
        int num = Integer.parseInt(houses.getText());
        num--;
        if(num < 0) num = 0;
        houses.setText(Integer.toString(num));
        
        int houseNum = Integer.parseInt(houses.getText());
        int rentVal = Integer.parseInt(rentValue.getText());
        
        if(houseNum == 0) {
            rentVal = 50;
            rentValue.setText(Integer.toString(rentVal)); 
        }
        if(houseNum == 1) {
            rentVal = 200;
            rentValue.setText(Integer.toString(rentVal));
        } 
        if (houseNum == 2) {
            rentVal = 400;
            rentValue.setText(Integer.toString(rentVal));
        } 
        if (houseNum == 3) {
            rentVal = 1400;
            rentValue.setText(Integer.toString(rentVal));
        } 
        if (houseNum == 4) {
            rentVal = 1700;
            rentValue.setText(Integer.toString(rentVal));            
        }
    }//GEN-LAST:event_houseSubtractActionPerformed

    private void houseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseAddActionPerformed
        int num = Integer.parseInt(houses.getText());
        num++;
        if(num > 4) num = 4;
        houses.setText(Integer.toString(num));
        
        int houseNum = Integer.parseInt(houses.getText());
        int rentVal = Integer.parseInt(rentValue.getText());
        
        // If own monopoly rent is double
        // 1 houses makes rent 200 
        // 2 houses makes rent 400
        // 3 houses makes rent 1400
        // 4 houses makes rent 1700
        // 1 Hotel makes rent 2000
        
        if(houseNum == 0) {
            rentVal = 50;
            rentValue.setText(Integer.toString(rentVal)); 
        }        
        if(houseNum == 1) {
            rentVal = 200;
            rentValue.setText(Integer.toString(rentVal));
        } 
        if (houseNum == 2) {
            rentVal = 400;
            rentValue.setText(Integer.toString(rentVal));
        } 
        if (houseNum == 3) {
            rentVal = 1400;
            rentValue.setText(Integer.toString(rentVal));
        } 
        if (houseNum == 4) {
            rentVal = 1700;
            rentValue.setText(Integer.toString(rentVal));            
        }
        
      }//GEN-LAST:event_houseAddActionPerformed

    private void hotelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelBoxActionPerformed
        if (hotelBox.isSelected()) {
            rentValue.setText("2000");
        } else if (!hotelBox.isSelected()) {
            rentValue.setText("50");
        }
    }//GEN-LAST:event_hotelBoxActionPerformed

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
            java.util.logging.Logger.getLogger(PropertyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropertyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropertyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropertyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropertyCard().setVisible(true);
            }
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel costTitle;
    private javax.swing.JLabel haveOrHaveNot;
    private javax.swing.JCheckBox hotelBox;
    private javax.swing.JButton houseAdd;
    private javax.swing.JPanel housePanel;
    private javax.swing.JButton houseSubtract;
    private javax.swing.JLabel houseTitle;
    private javax.swing.JLabel houses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel profitChecker;
    private javax.swing.JPanel profitPanel;
    private javax.swing.JLabel propertyName;
    private javax.swing.JLabel propertyPrice;
    private javax.swing.JLabel rentTitle;
    private javax.swing.JLabel rentValue;
    private javax.swing.JLabel sentenceText;
    private javax.swing.JLabel totalProfit;
    private javax.swing.JLabel totalProfitTitle;
    private javax.swing.JButton visitorAdd;
    private javax.swing.JPanel visitorPanel;
    private javax.swing.JButton visitorSubtract;
    private javax.swing.JLabel visitorTitle;
    private javax.swing.JLabel visitors;
    private javax.swing.JLabel youText;
    // End of variables declaration//GEN-END:variables
}
