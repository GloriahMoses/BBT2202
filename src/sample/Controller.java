package sample;

import Connection.ConnectionClass;

import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Statement;

public class Controller {

    public DatePicker checkin;
    public DatePicker checkout;
    public ChoiceBox room;
    public TextField emailField;

    public Label isConnected;
    public PasswordField userPassword;

    public void submit(ActionEvent actionEvent) throws SQLException {

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        //String sql = "INSERT INTO USER VALUES('"+emailField.getText+"')";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        //checkin.setDate(checkin.getDate);
    }
}
