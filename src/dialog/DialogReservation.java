/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private LocalDate date;
    private String time;
    private int nbPersons;
    private int numTable;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }
    
    public void handleDateSelectedEvent(LocalDate date) {
        this.date = date;
        frameReservation.setPickHourBoxEnable();
    }

    public void handleTimeSelectedEvent(String time) {
        this.time = time;
        frameReservation.setPickNumberBoxEnable();
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        this.nbPersons = nbPersons;
        if(date != null){
            frameReservation.setPickTableEnable(inf.trouverTableDisponible(date.getDayOfMonth(), date.getMonthValue(), nbPersons, time));
        }
    }

    public void handleTableSelectedEvent(int numTable) {
        this.numTable = numTable;
        frameReservation.setValidateButtonEnable();
    }

    public void handleCancelEvent() {
        frameReservation.resetFrame();
    }

    public void handleValidationEvent() {
        frameReservation.validateReservation(date, numTable, time, nbPersons);
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
