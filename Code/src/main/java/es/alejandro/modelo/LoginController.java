package es.alejandro.modelo;

import es.alejandro.modelo.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {
    public static Usuarios usuarios;

    @FXML
    private Label usuarioLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private JFXButton signInButton;

    @FXML
    private JFXTextField userTextField;

    @FXML
    private JFXPasswordField passwordTextField;

    @FXML
    private Label testLabel;

    @FXML
    void logInEvent(ActionEvent event) throws IOException {
        String usuario = userTextField.getText();
        String contraseña = passwordTextField.getText();

        List<Usuarios>listaUsuario= recuperar();
        if(compruebaUsuario(listaUsuario, usuario, contraseña)){
            testLabel.setText("Login Correcto");
            Stage stage = (Stage) signInButton.getScene().getWindow();
            stage.close();

            Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("view/mainUI.fxml"));
            Stage stageNewWindow = new Stage();
            stageNewWindow.setTitle("ABC");
            stageNewWindow.setScene(new Scene(root1));
            stageNewWindow.show();

        }else{
            testLabel.setText("Login Incorrecto");
        }
    }

    private boolean compruebaUsuario(List<Usuarios> listaUsuarios, String usuario, String contraseña) {
        System.out.println(listaUsuarios.size());
        for (int i = 0; i< listaUsuarios.size(); i++){
            System.out.println(listaUsuarios.get(i).getUsername());
            if (listaUsuarios.get(i).getUsername().equals(usuario)){
                if (listaUsuarios.get(i).getPassword().contentEquals(contraseña)){
                    usuarios= listaUsuarios.get(i);
                    return true;
                }
            }
        }
        return false;
    }

    private List<Usuarios> recuperar() {
        PersistenciaUsuarios pUsuarios = new PersistenciaUsuarios();
        List<Usuarios>listaUsuarios = pUsuarios.recuperar();

        return listaUsuarios;
    }


}
