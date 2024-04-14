package com.boshy.monyapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class scene2Controller {
@FXML
    private Scene scene;
    private Stage stage;
    Parent root;
    @FXML
    private Label detail = new Label();

    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void saveFile(String TS1)throws FileNotFoundException, IOException{
        LocalDate d = LocalDate.now();
        File f = new File("ايراد يوم " + d.minusDays(1) +".txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.write(TS1);
        fw.flush();
        fw.close();
    }
    public void setLable(String ms){
        this.detail.setText(ms);
    }

}
