package com.boshy.monyapp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class scene1Controller {
    @FXML
    private TextField totalHelwan1, totalHelwan2, totalHHelwan,
            visaHelwan1TF, visaHelwan2TF, visaHHelwanTF,
            vodafoneHelwan1TF, vodafoneHelwan2TF, vodafoneHHelwanTF;

    @FXML
    private RadioButton visaHelwan1RB, visaHelwan2RB, visaHHelwanRB,
            vodfoneHelwan1RB, vodfoneHelwan2RB, vodfoneHHelwanRB;
    //RB == RadioButton , TF == TextField
    private Scene scene;
    private Stage stage;
    private Parent root;
    //MD == MonyDetail
    MonyDetail Helwan1MD = new MonyDetail("حلوان 1 ");
    MonyDetail Helwan2MD = new MonyDetail("حلوان 2 ");
    MonyDetail HHelwanMD = new MonyDetail("حدايق حلوان ");

    public void done(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        scene2Controller sc2 = new scene2Controller();  // Create the controller instance
        loader.setController(sc2);  // Set the controller instance to the loader

        root = loader.load();  // Load the FXML with the set controller
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        setTotal();
        setVisa();
        setVoda();
        String s = Helwan1MD.toString() + Helwan2MD.toString() + HHelwanMD.toString();
        sc2.saveFile(s);
        sc2.setLable(s);
    }

    public void enableVisaTextField() {
        if (visaHelwan1RB.isSelected()) {
            visaHelwan1TF.setDisable(false);
        } else {
            visaHelwan1TF.setDisable(true);
        }
        /////////////////////////////////////
        if (visaHelwan2RB.isSelected()) {
            visaHelwan2TF.setDisable(false);
        } else {
            visaHelwan2TF.setDisable(true);
        }
        //////////////////////////////////
        if (visaHHelwanRB.isSelected()) {
            visaHHelwanTF.setDisable(false);
        } else {
            visaHHelwanTF.setDisable(true);
        }
    }

    public void enableVodaTextFeild() {
        if (vodfoneHelwan1RB.isSelected()) {
            vodafoneHelwan1TF.setDisable(false);
        } else {
            vodafoneHelwan1TF.setDisable(true);
        }
        ////////////////////////////////////////
        if (vodfoneHelwan2RB.isSelected()) {
            vodafoneHelwan2TF.setDisable(false);
        } else {
            vodafoneHelwan2TF.setDisable(true);
        }
        //////////////////////////////////////
        if (vodfoneHHelwanRB.isSelected()) {
            vodafoneHHelwanTF.setDisable(false);
        } else {
            vodafoneHHelwanTF.setDisable(true);
        }
    }
    private void setTotal(){
        try{
        Helwan1MD.setOriinal(Float.parseFloat(totalHelwan1.getText()));
    }catch (Exception e){
            Helwan1MD.setOriinal(0);
        }
        try {
            Helwan2MD.setOriinal(Float.parseFloat(totalHelwan2.getText()));
        }catch (Exception e){
            Helwan2MD.setOriinal(0);
        }
        try {
            HHelwanMD.setOriinal(Float.parseFloat(totalHHelwan.getText()));
        }catch (Exception e){
            HHelwanMD.setOriinal(0);
        }
    }
    //////////////////////////////////////////////////
    private void setVisa(){
        try{
            Helwan1MD.setVisa(Float.parseFloat(visaHelwan1TF.getText()));
        }catch (Exception e){
            Helwan1MD.setVisa(0);
        }
        try{
            Helwan2MD.setVisa(Float.parseFloat(visaHelwan2TF.getText()));
        }catch (Exception e){
            Helwan2MD.setVisa(0);
        }

        try{
            HHelwanMD.setVisa(Float.parseFloat(visaHHelwanTF.getText()));
        }catch (Exception e){
            HHelwanMD.setVisa(0);
        }
    }
    /////////////////////////////////////////////
    private void setVoda(){
        try{
            Helwan1MD.setVodafone(Float.parseFloat(vodafoneHelwan1TF.getText()));
        }catch (Exception e){
            Helwan1MD.setVodafone(0);
        }

        try{
            Helwan2MD.setVodafone(Float.parseFloat(vodafoneHelwan2TF.getText()));
        }catch (Exception e){
            Helwan2MD.setVodafone(0);
        }

        try{
            HHelwanMD.setVodafone(Float.parseFloat(vodafoneHHelwanTF.getText()));
        }catch (Exception e){
            HHelwanMD.setVodafone(0);
        }
    }
}