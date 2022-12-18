package jdbc;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class kasirController {

    ObservableList<String> ktgr = FXCollections.observableArrayList("Barang", "Makanan");

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnHapusBarang;

    @FXML
    private Button btnHapusMakanan;

    @FXML
    private Button btnShowBarang;

    @FXML
    private Button btnShowMakanan;

    @FXML
    private Button btnTambah;

    @FXML
    private ChoiceBox choiceKategori;

    @FXML
    private void initialize(){
        choiceKategori.setValue("Barang");
        choiceKategori.setItems(ktgr);
    }

    @FXML
    private TextField fieldJumlah;


    @FXML
    private AnchorPane fieldStok;

    @FXML
    private TextField fieldharga;

    @FXML
    private TextField fieldproduk;

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void deleteBarang(ActionEvent event) {

    }

    @FXML
    void deleteMakanan(ActionEvent event) {

    }

    @FXML
    void inputHarga(ActionEvent event) {

    }

    @FXML
    void inputJumlah(ActionEvent event) {

    }

    @FXML
    void inputProduk(ActionEvent event) {

    }

    @FXML
    void showBarang(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("barang.fxml"));
            Scene scene = new Scene (root);
            Stage stage  = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger.getLogger(controllerMakanan.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    @FXML
    void showMakanan(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("makanan.fxml"));
            Scene scene = new Scene (root);
            Stage stage  = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger.getLogger(controllerMakanan.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
}
