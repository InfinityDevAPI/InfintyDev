package application.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AgendamentosController {

    @FXML
    private Button botaoDefesasTG;

    @FXML
    private Button botaoEntregas;

    @FXML
    private Button botaoHome;

    @FXML
    void abrirDefesasTG(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) botaoDefesasTG.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/ui/AgendamentosDefesasTG.fxml"));
        Scene agendamentosDefesasTG = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Agendamentos: Defesas de TG");
        stage.setScene(agendamentosDefesasTG);
        stage.setResizable(false);
        currentStage.close();
        stage.show();
    }

    @FXML
    void abrirEntregas(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) botaoEntregas.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/ui/AgendamentosEntregas.fxml"));
        Scene agendamentosDefesasTG = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Agendamentos: Entregas");
        stage.setScene(agendamentosDefesasTG);
        stage.setResizable(false);
        currentStage.close();
        stage.show();
    }

    @FXML
    void abrirHome(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) botaoHome.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/ui/Home.fxml"));
        Scene agendamentosDefesasTG = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(agendamentosDefesasTG);
        stage.setResizable(false);
        currentStage.close();
        stage.show();
    }

}