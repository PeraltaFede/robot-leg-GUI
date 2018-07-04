/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Fede
 */

public class MainFrame extends javax.swing.JFrame {
    boolean isAutomatic = false;
    boolean isSimulated = false;
    JFXPanel fxPanel;
    
    String currentState = "Informacion del Estado de la conexion con la Pierna Robotica.";
    String currentIcon = "OptionPane.informationIcon";
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        fxPanel = new JFXPanel();
        jPanel1.add(fxPanel);

        Platform.runLater(() -> {
            initDataFX(fxPanel);
        });
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

        controlSelect = new javax.swing.ButtonGroup();
        stateSelect = new javax.swing.ButtonGroup();
        controlPanel = new javax.swing.JPanel();
        manual = new javax.swing.JRadioButton();
        automatic = new javax.swing.JRadioButton();
        jointsPanel = new javax.swing.JPanel();
        hipLabel = new javax.swing.JLabel();
        hipSlider = new javax.swing.JSlider();
        hipSpinner = new javax.swing.JSpinner();
        kneeLabel = new javax.swing.JLabel();
        kneeSlider = new javax.swing.JSlider();
        kneeSpinner = new javax.swing.JSpinner();
        ankleLabel = new javax.swing.JLabel();
        ankleSlider = new javax.swing.JSlider();
        ankleSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sensorsPanel = new javax.swing.JPanel();
        comboVisual = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        statePanel = new javax.swing.JPanel();
        stateLabel = new javax.swing.JLabel();
        connectBtn = new javax.swing.JToggleButton();
        menuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        saveFigMenuIt = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuState = new javax.swing.JMenu();
        rbItUnkown = new javax.swing.JRadioButtonMenuItem();
        rbItConnected = new javax.swing.JRadioButtonMenuItem();
        rbItDisconnected = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItExit = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        menuItHelp = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Robot Leg Controller");

        controlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Control"));

        controlSelect.add(manual);
        manual.setSelected(true);
        manual.setText("Manual.");
        manual.setToolTipText("Elegir las posiciones de las juntas.");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });

        controlSelect.add(automatic);
        automatic.setText("Automatico.");
        automatic.setToolTipText("Utilizar algoritmos de caminata.");
        automatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manual)
                    .addComponent(automatic)))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(automatic))
        );

        jointsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Posiciones deseadas de las Juntas"));
        jointsPanel.setMaximumSize(new java.awt.Dimension(300, 300));

        hipLabel.setText("Cadera:");

        hipSlider.setMaximum(359);
        hipSlider.setMinimum(-359);
        hipSlider.setPaintTicks(true);
        hipSlider.setToolTipText("");

        hipSpinner.setModel(new javax.swing.SpinnerNumberModel(0, -359, 359, 1));
        hipSpinner.setMinimumSize(new java.awt.Dimension(50, 22));
        hipSpinner.setPreferredSize(null);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, hipSlider, org.jdesktop.beansbinding.ELProperty.create("${value}"), hipSpinner, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        kneeLabel.setText("Rodilla:");

        kneeSlider.setMaximum(359);
        kneeSlider.setMinimum(-359);
        kneeSlider.setPaintTicks(true);
        kneeSlider.setToolTipText("");

        kneeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, -359, 359, 1));
        kneeSpinner.setMinimumSize(new java.awt.Dimension(50, 22));
        kneeSpinner.setPreferredSize(null);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, kneeSlider, org.jdesktop.beansbinding.ELProperty.create("${value}"), kneeSpinner, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        ankleLabel.setText("Tobillo:");

        ankleSlider.setMaximum(359);
        ankleSlider.setMinimum(-359);
        ankleSlider.setPaintTicks(true);

        ankleSpinner.setModel(new javax.swing.SpinnerNumberModel(0, -359, 359, 1));
        ankleSpinner.setMinimumSize(new java.awt.Dimension(50, 22));
        ankleSpinner.setPreferredSize(null);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ankleSlider, org.jdesktop.beansbinding.ELProperty.create("${value}"), ankleSpinner, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabel2.setText("[Grados]");

        jLabel3.setText("[Grados]");

        jLabel4.setText("[Grados]");

        javax.swing.GroupLayout jointsPanelLayout = new javax.swing.GroupLayout(jointsPanel);
        jointsPanel.setLayout(jointsPanelLayout);
        jointsPanelLayout.setHorizontalGroup(
            jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jointsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ankleSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(kneeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hipSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jointsPanelLayout.createSequentialGroup()
                        .addGroup(jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jointsPanelLayout.createSequentialGroup()
                                .addComponent(ankleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ankleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jointsPanelLayout.createSequentialGroup()
                                .addComponent(kneeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kneeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(jointsPanelLayout.createSequentialGroup()
                                .addComponent(hipLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hipSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jointsPanelLayout.setVerticalGroup(
            jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jointsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hipLabel)
                    .addComponent(hipSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addComponent(hipSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kneeLabel)
                    .addComponent(kneeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addComponent(kneeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ankleLabel)
                    .addComponent(ankleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ankleSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sensorsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizacion de sensores en las Juntas"));

        comboVisual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Datos.", "Pierna Simulada." }));
        comboVisual.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboVisualItemStateChanged(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout sensorsPanelLayout = new javax.swing.GroupLayout(sensorsPanel);
        sensorsPanel.setLayout(sensorsPanelLayout);
        sensorsPanelLayout.setHorizontalGroup(
            sensorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sensorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sensorsPanelLayout.createSequentialGroup()
                        .addComponent(comboVisual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(240, Short.MAX_VALUE))))
        );
        sensorsPanelLayout.setVerticalGroup(
            sensorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboVisual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        statePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        stateLabel.setIcon(javax.swing.UIManager.getIcon("OptionPane.informationIcon"));
        stateLabel.setText("Informacion del Estado de la conexion con la Pierna Robotica.");
        stateLabel.setAutoscrolls(true);
        statePanel.add(stateLabel);

        connectBtn.setText("Conexion a Pierna");
        connectBtn.setToolTipText("");
        connectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBtnActionPerformed(evt);
            }
        });
        statePanel.add(connectBtn);

        FileMenu.setText("Archivo");

        saveFigMenuIt.setText("Guardar Figura...");
        FileMenu.add(saveFigMenuIt);
        FileMenu.add(jSeparator3);

        menuState.setText("Simular Conexion");

        stateSelect.add(rbItUnkown);
        rbItUnkown.setSelected(true);
        rbItUnkown.setText("Simular Buscando");
        rbItUnkown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbItUnkownActionPerformed(evt);
            }
        });
        menuState.add(rbItUnkown);

        stateSelect.add(rbItConnected);
        rbItConnected.setText("Simular Conectado");
        rbItConnected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbItConnectedActionPerformed(evt);
            }
        });
        menuState.add(rbItConnected);

        stateSelect.add(rbItDisconnected);
        rbItDisconnected.setText("Simular Desconectado");
        rbItDisconnected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbItDisconnectedActionPerformed(evt);
            }
        });
        menuState.add(rbItDisconnected);

        FileMenu.add(menuState);
        FileMenu.add(jSeparator1);

        menuItExit.setText("Salir");
        menuItExit.setToolTipText("Salir de Robot Leg Controller");
        menuItExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuItExitMouseReleased(evt);
            }
        });
        FileMenu.add(menuItExit);
        menuItExit.getAccessibleContext().setAccessibleDescription("Exit Program");

        menuBar.add(FileMenu);

        helpMenu.setText("Ayuda");

        menuItHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItHelp.setText("Contenido de Ayuda");
        menuItHelp.setToolTipText("Visualizar el Contenido de Ayuda disponible.");
        menuItHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItHelpActionPerformed(evt);
            }
        });
        helpMenu.add(menuItHelp);
        helpMenu.add(jSeparator2);

        menuItAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        menuItAbout.setText("Acerca de");
        menuItAbout.setToolTipText("Acerca de.");
        menuItAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItAboutActionPerformed(evt);
            }
        });
        helpMenu.add(menuItAbout);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(statePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jointsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(sensorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sensorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jointsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItExitMouseReleased
        this.dispose();
    }//GEN-LAST:event_menuItExitMouseReleased

    private void menuItHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItHelpActionPerformed
        System.out.println("Todo: Ventana de ayuda.");
    }//GEN-LAST:event_menuItHelpActionPerformed

    private void menuItAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItAboutActionPerformed
        System.out.println("Todo: Ventana de acerca de.");
    }//GEN-LAST:event_menuItAboutActionPerformed

    private void automaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticActionPerformed
        if (automatic.isSelected() && !isAutomatic)
        {  
           hipSpinner.setEnabled(false);
           kneeSpinner.setEnabled(false);
           ankleSpinner.setEnabled(false);
           hipSlider.setEnabled(false);
           kneeSlider.setEnabled(false);
           ankleSlider.setEnabled(false);
           isAutomatic = true;
        }
    }//GEN-LAST:event_automaticActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
        if (manual.isSelected() && isAutomatic)
        {
           hipSpinner.setEnabled(true);
           kneeSpinner.setEnabled(true);
           ankleSpinner.setEnabled(true);
           hipSlider.setEnabled(true);
           kneeSlider.setEnabled(true);
           ankleSlider.setEnabled(true);
           isAutomatic = false;
        }
    }//GEN-LAST:event_manualActionPerformed

    private void rbItUnkownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbItUnkownActionPerformed
        if (rbItUnkown.isSelected())
        {
            currentState = "Conectando con Pierna Robotica ...";
            currentIcon = "OptionPane.questionIcon";
            updateState(currentState, currentIcon);
        }
    }//GEN-LAST:event_rbItUnkownActionPerformed

    private void rbItConnectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbItConnectedActionPerformed
        if (rbItConnected.isSelected())
        {currentState = "Control de Pierna Robotica disponible.";
            currentIcon = "OptionPane.informationIcon";
            updateState(currentState, currentIcon);
        }
    }//GEN-LAST:event_rbItConnectedActionPerformed

    private void rbItDisconnectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbItDisconnectedActionPerformed
        if (rbItDisconnected.isSelected())
        {currentState = "No existe conexion con Pierna Robotica.";
            currentIcon = "OptionPane.errorIcon";
            updateState(currentState, currentIcon);
        }
    }//GEN-LAST:event_rbItDisconnectedActionPerformed

    private void comboVisualItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboVisualItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
            isSimulated = evt.getItem().equals("Pierna Simulada.");
            initDataFX(fxPanel);
        }
    }//GEN-LAST:event_comboVisualItemStateChanged

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBtnActionPerformed
        if (connectBtn.isSelected()){
            rbItUnkown.setSelected(true);
            currentState = "Conectando con Pierna Robotica ...";
            currentIcon = "OptionPane.questionIcon";
            updateState(currentState, currentIcon);
        }
        else {
            rbItDisconnected.setSelected(true);
            currentState = "No existe conexion con Pierna Robotica.";
            currentIcon = "OptionPane.errorIcon";
            updateState(currentState, currentIcon);
        }
    }//GEN-LAST:event_connectBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenu;
    private javax.swing.JLabel ankleLabel;
    private javax.swing.JSlider ankleSlider;
    private javax.swing.JSpinner ankleSpinner;
    private javax.swing.JRadioButton automatic;
    private javax.swing.JComboBox<String> comboVisual;
    private javax.swing.JToggleButton connectBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.ButtonGroup controlSelect;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel hipLabel;
    private javax.swing.JSlider hipSlider;
    private javax.swing.JSpinner hipSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPanel jointsPanel;
    private javax.swing.JLabel kneeLabel;
    private javax.swing.JSlider kneeSlider;
    private javax.swing.JSpinner kneeSpinner;
    private javax.swing.JRadioButton manual;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItAbout;
    private javax.swing.JMenuItem menuItExit;
    private javax.swing.JMenuItem menuItHelp;
    private javax.swing.JMenu menuState;
    private javax.swing.JRadioButtonMenuItem rbItConnected;
    private javax.swing.JRadioButtonMenuItem rbItDisconnected;
    private javax.swing.JRadioButtonMenuItem rbItUnkown;
    private javax.swing.JMenuItem saveFigMenuIt;
    private javax.swing.JPanel sensorsPanel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel statePanel;
    private javax.swing.ButtonGroup stateSelect;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void updateState(String currentState, String currentIcon){
        stateLabel.setIcon(javax.swing.
                UIManager.getIcon(currentIcon));
                stateLabel.setText(currentState);
    }
    
    private void initDataFX(JFXPanel fxPanel) {
        fxPanel.removeAll();
        if (isSimulated){
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<>(xAxis,yAxis);
        //defining a series
        
        XYChart.Series series = new XYChart.Series();
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 20));
        series.getData().add(new XYChart.Data(3, 10));
        series.getData().add(new XYChart.Data(2, 2));
        lineChart.getData().add(series);
        Scene scene  = new Scene(lineChart,800,600);
        fxPanel.setScene(scene);
        }
        else {    
        GridPane grid = new GridPane();
        
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Tiempo [s]");
        yAxis.setLabel("Angulo [°]");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<>(xAxis,yAxis);
        //defining a series
        XYChart.Series series = new XYChart.Series();
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
        lineChart.getData().add(series);
        grid.add(lineChart,0,0);
        
        final LineChart<Number,Number> line2Chart = 
                new LineChart<>(xAxis,yAxis);
        XYChart.Series series2 = new XYChart.Series();
        //populating the series with data
        series2.getData().add(new XYChart.Data(1, 23));
        series2.getData().add(new XYChart.Data(2, 14));
        series2.getData().add(new XYChart.Data(3, 15));
        series2.getData().add(new XYChart.Data(4, 24));
        series2.getData().add(new XYChart.Data(5, 34));
        series2.getData().add(new XYChart.Data(6, 36));
        series2.getData().add(new XYChart.Data(7, 22));
        series2.getData().add(new XYChart.Data(8, 45));
        series2.getData().add(new XYChart.Data(9, 43));
        series2.getData().add(new XYChart.Data(10, 17));
        series2.getData().add(new XYChart.Data(11, 29));
        series2.getData().add(new XYChart.Data(12, 25));
        line2Chart.getData().add(series2);
        grid.add(line2Chart,0,2);
        
        //creating the chart
        final LineChart<Number,Number> lineChart3 = 
                new LineChart<>(xAxis,yAxis);
        //defining a series
        XYChart.Series series3 = new XYChart.Series();
        //populating the series with data
        series3.getData().add(new XYChart.Data(1, 23));
        series3.getData().add(new XYChart.Data(2, 14));
        series3.getData().add(new XYChart.Data(3, 15));
        series3.getData().add(new XYChart.Data(4, 24));
        series3.getData().add(new XYChart.Data(5, 34));
        series3.getData().add(new XYChart.Data(6, 36));
        series3.getData().add(new XYChart.Data(7, 22));
        series3.getData().add(new XYChart.Data(8, 45));
        series3.getData().add(new XYChart.Data(9, 43));
        series3.getData().add(new XYChart.Data(10, 17));
        series3.getData().add(new XYChart.Data(11, 29));
        series3.getData().add(new XYChart.Data(12, 25));
        lineChart3.getData().add(series3);
        grid.add(lineChart3,0,4);
                  
        Scene scene  = new Scene(grid,800,600);
        fxPanel.setScene(scene);
        }
    }
private XYChart.Data getData(double x, double y){
    XYChart.Data data = new XYChart.Data<>();
    data.setXValue(x);
    data.setYValue(y);
    return data;
  }

  private XYChart.Data getData(double x, String y){
    XYChart.Data data = new XYChart.Data<>();
    data.setYValue(x);
    data.setXValue(y);
    return data;
  }
}