package dotaSoundEditor.Controls;

import dotaSoundEditor.Helpers.Utility;

public class ReadmePanel extends javax.swing.JFrame
{                
    public ReadmePanel()
    {                        
        initComponents();
        this.setSize(530, 450);
        jEditorPane1.setCaretPosition(0);
        Utility.setFrameIcon(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sound Editor Help");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(530, 450));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(530, 450));

        jEditorPane1.setEditable(false);
        jEditorPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setText("<html><h1>How to use</h1><h2>Setting up</h2>1. Open Steam and click on Library.<br>2. Right click on Dota 2, and select Properties.<br>3. Select <i>Set Launch Options</i>.<br>4. Add <i>-override_vpk</i> to the launch options.<br>5. Click Ok.<br><br><h2>Running the program</h2> Simply open Dota_Sound_Editor.jar! <h2>Using Dota 2 Sound Editor</h2> The Dota 2 Sound editor allows you to modify sounds for hero spells, items and music. To begin, select a tab from the top of the window. Then, if applicable, select an entry from the dropdown box and expand the list of sounds associated with a particular action. From there, you can view each sound for a hero spell, item or musical trigger. For each sound, you can:<br><br><b>Replace</b><br>This allows you to change what sound plays when the selected action is performed.<br><br><b>Revert</b><br>This restores the selected action to its default sound.<br><br><b>Revert All</b><br><ul><li><b>Hero Spells:</b> This restores all actions for to current hero to their default sounds.</li><br><li><b>Items:</b> This restores all item actions to their default sound.</li></b><li><b>Music:</b> This restores all music for the current category to its default song.</li></ul><br><b>Advanced/Basic</b><br>The Advanced button allows you to view the current hero's entire sound script as a tree. Currently, manual editing is not supported, but will be added in the future.<br>While in Advanced mode, Replace, Revert and Play Sound will only work on nodes that contain a path to a sound file.<br>Clicking the <b>Basic</b> button will return the editor to Basic mode. <h1>Distribution</h1> Dota 2 Sound Editor is free to use, and may be freely redistributed. <h1>Contact</h1> I can be reached at psychozagal [at-symbol] gmail [dot] com. <h1>Found a bug?</h1> Please let me know. When the program crashes, it attempts to generate an error.txt. Attaching these files to an email, and giving a detailed description of what you were doing when the program crashed both help a lot in determining the cause of a bug or crash. Thanks!</html>");
        jEditorPane1.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jEditorPane1.setMaximumSize(new java.awt.Dimension(530, 450));
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 461, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}