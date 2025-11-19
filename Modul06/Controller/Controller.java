package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import Model.Mahasiswa;

public class Controller implements Initializable {

    @FXML
    private TableView<Mahasiswa> tableMahasiswa;

    @FXML
    private TableColumn<Mahasiswa, String> colNim;

    @FXML
    private TableColumn<Mahasiswa, String> colNama;

    ObservableList<Mahasiswa> list = FXCollections.observableArrayList(
            new Mahasiswa(1, "Budi Hartono", "24100001"),
            new Mahasiswa(2, "Agus Saputra", "24100002"),
            new Mahasiswa(3, "Rina Lestari", "24100003"),
            new Mahasiswa(4, "Dewi Anita", "24100004"),
            new Mahasiswa(5, "Fajar Ramadhan", "24100005"),
            new Mahasiswa(6, "Ilham Pratama", "24100006"),
            new Mahasiswa(7, "Siti Aminah", "24100007"),
            new Mahasiswa(8, "Rizky Maulana", "24100008"),
            new Mahasiswa(9, "Nia Putri", "24100009"),
            new Mahasiswa(10, "Joko Santoso", "24100010")
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableMahasiswa.setItems(list);
    }
}
