package slotmachine;



public class SlotsGameInterface extends javax.swing.JFrame { 
	

    public SlotsGameInterface() {
        initComponents();
        creditsDisplayUpdate();
        winningsDisplayUpdate();
        spinsDisplayUpdate();
    }

    /**
     * method called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsufficientCreditsPopup = new javax.swing.JOptionPane();
        AddCreditsPopup = new javax.swing.JOptionPane();
        HelpDialogPopup = new javax.swing.JDialog();
        HelpOkButton = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AddCreditsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        creditsRemainingField = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        SpinsRemainingField = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        winningsField = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        spinnerOne = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        spinnerTwo = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        spinnerThree = new javax.swing.JTextArea();
        SpinButton = new javax.swing.JButton();
        HelpButton = new javax.swing.JButton();

        HelpDialogPopup.setPreferredSize(new java.awt.Dimension(700, 1000));

        HelpOkButton.setText("OK");
        HelpOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpOkButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Definition of Buttons\n\nSpin: This button will display 3 randomly \ngenerated numbers. You can only spin\nif you have at least 5 credits, and\ndoing so will subtract 5 credits from \nyour total.\n\nExit: This will safely exit the game and\ndisplay your total earnings.\n\nAdd Credits: This button will allow you to \nadd credits in dollar amounts (you do \nnot need to enter the dollar sign).\n\n\nGoal of the Game\n\nThe goal of the game is to earn as \nmany credits as you can by spinning\nthe slot machine. Each spin requires\n5 credits, and you can earn credits\nby getting certain results from\nthe slot machine.");
        jScrollPane7.setViewportView(jTextArea1);

        javax.swing.GroupLayout HelpDialogPopupLayout = new javax.swing.GroupLayout(HelpDialogPopup.getContentPane());
        HelpDialogPopup.getContentPane().setLayout(HelpDialogPopupLayout);
        HelpDialogPopupLayout.setHorizontalGroup(
            HelpDialogPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
            .addGroup(HelpDialogPopupLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(HelpOkButton)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        HelpDialogPopupLayout.setVerticalGroup(
            HelpDialogPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HelpDialogPopupLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(HelpOkButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddCreditsButton.setText("Add Credits");
        AddCreditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCreditsButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Credits Available:");

        jLabel3.setText("Spins Remaining:");

        creditsRemainingField.setEditable(false);
        jScrollPane1.setViewportView(creditsRemainingField);

        SpinsRemainingField.setEditable(false);
        jScrollPane2.setViewportView(SpinsRemainingField);

        jLabel2.setText("Your Winnings: ");

        winningsField.setEditable(false);
        jScrollPane3.setViewportView(winningsField);

        spinnerOne.setColumns(20);
        spinnerOne.setEditable(false);
        spinnerOne.setRows(5);
        jScrollPane4.setViewportView(spinnerOne);

        spinnerTwo.setColumns(20);
        spinnerTwo.setEditable(false);
        spinnerTwo.setRows(5);
        jScrollPane5.setViewportView(spinnerTwo);

        spinnerThree.setColumns(20);
        spinnerThree.setEditable(false);
        spinnerThree.setRows(5);
        jScrollPane6.setViewportView(spinnerThree);

        SpinButton.setText("Spin");
        SpinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpinButtonActionPerformed(evt);
            }
        });

        HelpButton.setText("Help");
        HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                .addComponent(AddCreditsButton)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(29, Short.MAX_VALUE))
                    .           addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(SpinButton))
                                .addComponent(HelpButton))
                                .addGap(0, 0, Short.MAX_VALUE)))));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(ExitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddCreditsButton)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SpinButton)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(HelpButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SpinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpinButtonActionPerformed
        if (spins > 0) {
            spin();
        } else {
            //TODO: display popup for not enough credits
            InsufficientCreditsPopup.showMessageDialog(rootPane,
                    "Insufficient Credits to Spin");
            System.out.println("not enough credits to spin");
        }
    }//GEN-LAST:event_SpinButtonActionPerformed

    private void AddCreditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCreditsButtonActionPerformed


        boolean invalidInput = true;
        String str = "";
        while (invalidInput) {
                try {
                    str = AddCreditsPopup.showInputDialog(rootPane,
                            "Enter Desired Credits To Add: ");
                    currentCredits += Double.parseDouble(str);
                    invalidInput = false;

                } catch (Exception e) {
                    if(str == null)
                    {
                        invalidInput = false;
                    }
                    else
                    {
                        invalidInput = true;
                    }
                }
        }
        creditsDisplayUpdate();
        spinsDisplayUpdate();
    }//GEN-LAST:event_AddCreditsButtonActionPerformed

    private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButtonActionPerformed
        HelpDialogPopup.setSize(360, 500);
        HelpDialogPopup.setVisible(true);
    }//GEN-LAST:event_HelpButtonActionPerformed

    private void HelpOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpOkButtonActionPerformed
        HelpDialogPopup.setVisible(false);
    }//GEN-LAST:event_HelpOkButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        SlotsGame.payoutTable();
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SlotsGameInterface().setVisible(true);
            }
        });
    }

    public void creditsDisplayUpdate() {
        creditsRemainingField.setText(Double.toString(currentCredits));
    }

    public void spinsDisplayUpdate() {
        calcSpins();
        SpinsRemainingField.setText(Integer.toString(spins));
    }

    public void calcSpins() {
        spins = (int) (currentCredits / creditsPerSpin);
    }
    
    public void winningsDisplayUpdate()
    {
        winningsField.setText(Double.toString(winnings));
    }

    public void spin() {
        spins--;
        winnings-=creditsPerSpin;
        spinsDisplayUpdate();
        currentCredits -= creditsPerSpin;
        creditsDisplayUpdate();
        winnings += SlotsGame.payoutTable[rgr.getRandom()];
        winningsDisplayUpdate();
        System.out.println("spin");
        //TODO: display changing values for modded boxes
    }
    private double currentCredits = 0;
    private int spins = 0;
    private double creditsPerSpin = 5;
    private double winnings = 0;
    private RGR rgr = new RGR();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCreditsButton;
    private javax.swing.JOptionPane AddCreditsPopup;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton HelpButton;
    private javax.swing.JDialog HelpDialogPopup;
    private javax.swing.JButton HelpOkButton;
    private javax.swing.JOptionPane InsufficientCreditsPopup;
    private javax.swing.JButton SpinButton;
    private javax.swing.JTextPane SpinsRemainingField;
    private javax.swing.JTextPane creditsRemainingField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea spinnerOne;
    private javax.swing.JTextArea spinnerThree;
    private javax.swing.JTextArea spinnerTwo;
    private javax.swing.JTextPane winningsField;
    // End of variables declaration//GEN-END:variables
}



