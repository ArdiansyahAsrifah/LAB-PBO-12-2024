package scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        stage.setTitle("Home Scene");

        TextField username = new TextField();
        username.setPromptText("Username");
        username.getStyleClass().add("text-field");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");
        password.getStyleClass().add("text-field");

        Label user = new Label("Username:");
        user.getStyleClass().add("white-text");
        Label pass = new Label("Password:");
        pass.getStyleClass().add("white-text");

        VBox addusername = new VBox(5, user, username);
        addusername.setAlignment(Pos.CENTER_LEFT);
        VBox addpassword = new VBox(5, pass, password);
        addpassword.setAlignment(Pos.CENTER_LEFT);

        Button tombol = new Button("To Profile");
        tombol.getStyleClass().add("button");
        tombol.setOnAction(v -> {
            ProfileScene profileScene = new ProfileScene(stage);
            profileScene.show();
        });

        VBox vbox = new VBox(15, addusername, addpassword, tombol);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        vbox.getStyleClass().add("vbox-home");

        Scene scene = new Scene(vbox, 400, 300);
        scene.getStylesheets().add(getClass().getResource("/styling/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
