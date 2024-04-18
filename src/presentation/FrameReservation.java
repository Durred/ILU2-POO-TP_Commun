/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        PickDate = new javax.swing.JLabel();
        PickHourBox = new javax.swing.JComboBox<>();
        PickHour = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        nbPersonsPanel = new javax.swing.JPanel();
        PickNbPersonnes = new javax.swing.JLabel();
        PickNbPersonnesBox = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        TableList = new javax.swing.JScrollPane();
        PickTableList = new javax.swing.JList<>();
        PickTable = new javax.swing.JLabel();
        Validate = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        PickDate.setText("1. Choisissez la date");

        PickHourBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11:30", "12:00", "12:30", "13:00", "13:30" }));
        PickHourBox.setEnabled(false);
        PickHourBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PickHourBoxActionPerformed(evt);
            }
        });

        PickHour.setText("2. Choisissez l'heure");

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PickDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PickHourBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PickHour))
                .addGap(16, 16, 16))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PickDate)
                    .addComponent(PickHour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PickHourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        PickNbPersonnes.setText("3. Indiquer le nombre de personnes");

        PickNbPersonnesBox.setEditable(true);
        PickNbPersonnesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        PickNbPersonnesBox.setEnabled(false);
        PickNbPersonnesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PickNbPersonnesBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PickNbPersonnes)
                    .addComponent(PickNbPersonnesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PickNbPersonnes)
                .addGap(18, 18, 18)
                .addComponent(PickNbPersonnesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pickTablePanel.setEnabled(false);

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesImage.setEnabled(false);

        TableList.setEnabled(false);

        PickTableList.setEnabled(false);
        PickTableList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                PickTableListValueChanged(evt);
            }
        });
        TableList.setViewportView(PickTableList);

        PickTable.setText("4. Choisissez votre table ");

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PickTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(TableList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PickTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(TableList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Validate.setText("Valider");
        Validate.setEnabled(false);
        Validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateActionPerformed(evt);
            }
        });

        Cancel.setText("Annuler");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Validate)
                .addGap(18, 18, 18)
                .addComponent(Cancel)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Validate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PickHourBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PickHourBoxActionPerformed
        dialog.handleTimeSelectedEvent(PickHourBox.getSelectedItem().toString());
    }//GEN-LAST:event_PickHourBoxActionPerformed

    private void PickNbPersonnesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PickNbPersonnesBoxActionPerformed
        dialog.handleNumOfPersonsSelectedEvent(PickNbPersonnesBox.getSelectedIndex()+2);
    }//GEN-LAST:event_PickNbPersonnesBoxActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_CancelActionPerformed

    private void PickTableListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_PickTableListValueChanged
        String table = PickTableList.getSelectedValue();
        if(table != null){
            int numTable = Integer.parseInt(table.substring(table.lastIndexOf(" ")+1));
            dialog.handleTableSelectedEvent(numTable);
        }
    }//GEN-LAST:event_PickTableListValueChanged

    private void ValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidateActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_ValidateActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        LocalDate date = datePicker.getDate();
        if(date != null){
            dialog.handleDateSelectedEvent(date);
        }
    }
    
    public void setPickHourBoxEnable(){
        PickHourBox.setEnabled(true);
        PickHourBox.setEditable(true);
    }
    
    public void setPickNumberBoxEnable(){
        PickNbPersonnesBox.setEnabled(true);
        PickNbPersonnesBox.setEditable(true);
    }
    
    public void setPickTableEnable(String[] model){
        PickTableList.setEnabled(true);
        DefaultListModel tables = new DefaultListModel<String>();
        for(String table : model){
            tables.addElement(table);
        }
        PickTableList.setModel(tables);
    }
    
    public void setValidateButtonEnable(){
        Validate.setEnabled(true);
    }
    
    public void resetFrame(){
        datePicker.clear();
        PickHourBox.setEnabled(false);
        PickHourBox.setEditable(false);
        PickHourBox.setSelectedIndex(0);
        PickNbPersonnesBox.setEnabled(false);
        PickNbPersonnesBox.setEditable(false);
        PickNbPersonnesBox.setSelectedIndex(0);
        String[] resetTable = {};
        setPickTableEnable(resetTable);
        PickTableList.setEnabled(false);
        PickTableList.clearSelection();
        Validate.setEnabled(false);
    }
    
    public void validateReservation(LocalDate date, int numTable, String time, int nbPersons){
        String msg = "Réservation validée pour le " + date.getDayOfMonth()+" "+ date.getMonth()+" "+ date.getYear() +
                " à " + time + " pour " + nbPersons + " personnes à la table n°" + numTable + ".\n";  
        popup(msg);
    }
    
    public void popup(String msg){
        JOptionPane.showMessageDialog(nbPersonsPanel, msg, "Confirmation de réservation", 1);
        resetFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel PickDate;
    private javax.swing.JLabel PickHour;
    private javax.swing.JComboBox<String> PickHourBox;
    private javax.swing.JLabel PickNbPersonnes;
    private javax.swing.JComboBox<String> PickNbPersonnesBox;
    private javax.swing.JLabel PickTable;
    private javax.swing.JList<String> PickTableList;
    private javax.swing.JScrollPane TableList;
    private javax.swing.JButton Validate;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesImage;
    // End of variables declaration//GEN-END:variables

}
