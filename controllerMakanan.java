package jdbc;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controllerMakanan implements Initializable{

    @FXML
    private TableView<Makanan> tableMakanan;

    @FXML
    private Button btnBackM;

    @FXML
    private Button btnDeleteM;

    @FXML
    private Button btnRefreshM;

    @FXML
    private TableColumn<Makanan, Integer> kolomHargaM;

    @FXML
    private TableColumn<Makanan, Integer> kolomJumlahM;
    

    @FXML
    private TableColumn<Makanan, String> kolomNamaM;

    ObservableList <Makanan> makananList;
    
    int index = 0;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    @FXML
    void backM(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("kasir.fxml"));
            Scene scene = new Scene (root);
            Stage stage  = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger.getLogger(controllerMakanan.class.getName()).log(Level.SEVERE,null,e);
        }

    }

    @FXML
    void hapusDataM(ActionEvent event) {

    }

    @FXML
    void refreshM(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        kolomNamaM.setCellValueFactory(new PropertyValueFactory<Makanan, String>("nama "));
        kolomHargaM.setCellValueFactory(new PropertyValueFactory<Makanan, Integer>("harga"));
        kolomJumlahM.setCellValueFactory(new PropertyValueFactory<Makanan, Integer>("jumlah"));

        makananList = sqlMakanan.getMakanan();
        tableMakanan.setItems(makananList);
        
    }

}