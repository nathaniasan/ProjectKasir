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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controllerBarang {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeleteB;

    @FXML
    private Button btnRefreshB;

    @FXML
    private TableColumn<?, ?> kolomHargaB;

    @FXML
    private TableColumn<?, ?> kolomJumlahB;

    @FXML
    private TableColumn<?, ?> kolomNamaB;

    @FXML
    private TableView<?> tableBarang;

    @FXML
    void backB(ActionEvent event) {
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
    void hapusDataB(ActionEvent event) {

    }

    @FXML
    void refreshB(ActionEvent event) {

    }

}
