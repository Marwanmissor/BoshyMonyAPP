package com.boshy.monyapp;


import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class scene1Controller {
    @FXML
    private TextField totalHelwan1 , totalHelwan2 , totalHHelwan,
            visaHelwan1TF , visaHelwan2TF , visaHHelwanTF,
            vodafoneHelwan1TF,vodafoneHelwan2TF,vodafoneHHelwanTF;
    @FXML
    private RadioButton visaHelwan1RB , visaHelwan2RB,visaHHelwanRB,
            vodfoneHelwan1RB , vodfoneHelwan2RB ,vodfoneHHelwanRB;

    public void enableVisaTextField(){
        if (visaHelwan1RB.isSelected()){
            visaHelwan1TF.setDisable(false);
        }else {
            visaHelwan1TF.setDisable(true);
        }
        /////////////////////////////////////
        if (visaHelwan2RB.isSelected()){
            visaHelwan2TF.setDisable(false);
        }else {
            visaHelwan2TF.setDisable(true);
        }
        //////////////////////////////////
        if (visaHHelwanRB.isSelected()){
            visaHHelwanTF.setDisable(false);
        }else {
            visaHHelwanTF.setDisable(true);
        }
    }
    public void enableVodaTextFeild(){
        if (vodfoneHelwan1RB.isSelected()){
            vodafoneHelwan1TF.setDisable(false);
        }else {
            vodafoneHelwan1TF.setDisable(true);
        }
        ////////////////////////////////////////
        if (vodfoneHelwan2RB.isSelected()){
            vodafoneHelwan2TF.setDisable(false);
        }else {
            vodafoneHelwan2TF.setDisable(true);
        }
        //////////////////////////////////////
        if (vodfoneHHelwanRB.isSelected()){
            vodafoneHHelwanTF.setDisable(false);
        }else {
            vodafoneHHelwanTF.setDisable(true);
        }
    }
}