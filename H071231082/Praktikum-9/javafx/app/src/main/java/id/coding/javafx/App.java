package id.coding.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {

    private String name;
    private String dob;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("DisplayInfo");
        showFirstScene(primaryStage);
    }

    private void showFirstScene(Stage primaryStage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        Label label = new Label("Hello, please enter your details before continuing.");
        label.setFont(Font.font("System Bold", 20));

        Label nameLabel = new Label("Name");
        Label dobLabel = new Label("Date of Birth");

        Label creditsLabel = new Label("Made with ❤️ by jih89 :)");
        creditsLabel.setFont(Font.font("System Italic", 10));

        TextField nameField = new TextField();
        TextField dobField = new TextField();

        Button continueButton = new Button("Continue");
        continueButton.setOnAction(e -> {
            if (nameField.getText().trim().isEmpty() || dobField.getText().trim().isEmpty()) {
                return;
            } else {
                name = nameField.getText();
                dob = dobField.getText();
                showSecondScene(primaryStage);
            }
        });

        root.getChildren().addAll(label, nameLabel, nameField, dobLabel, dobField, continueButton, creditsLabel);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showSecondScene(Stage primaryStage) {
        HBox mainBox = new HBox();
        mainBox.setSpacing(20.0);
        mainBox.setAlignment(Pos.CENTER_LEFT);
        mainBox.setPadding(new Insets(48.0, 48.0, 48.0, 48.0));
        
        VBox imageBox = new VBox();
        imageBox.setAlignment(Pos.CENTER_LEFT);
        ImageView imageView = new ImageView();
        Image image = new Image(getClass().getClassLoader().getResourceAsStream("images/profile.png")); 
        imageView.setImage(image);
        imageView.setFitHeight(124.0); 
        imageView.setFitWidth(124.0); 
        imageBox.getChildren().add(imageView);
        mainBox.getChildren().add(imageBox);
        
        VBox textBox = new VBox();
        textBox.setSpacing(15.0);
        textBox.setAlignment(Pos.CENTER_LEFT);
        
        HBox labelBox1 = new HBox();
        labelBox1.setAlignment(Pos.CENTER_LEFT);
        Label label1 = new Label("Hello, " + name + "!");
        label1.setFont(new Font("System Bold", 16.0));
        labelBox1.getChildren().add(label1);
        textBox.getChildren().add(labelBox1);
        
        HBox labelBox2 = new HBox();
        labelBox2.setAlignment(Pos.CENTER_LEFT);
        Label label2 = new Label("You were born on " + dob);
        labelBox2.getChildren().add(label2);
        textBox.getChildren().add(labelBox2);
        
        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER);
        Button button = new Button("Return");
        button.setOnAction(e -> {
            showFirstScene(primaryStage);
        });
        buttonBox.getChildren().add(button);
        textBox.getChildren().add(buttonBox);
        
        mainBox.getChildren().add(textBox);
        
        Scene scene = new Scene(mainBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DisplayInfo");
    }        

    public static void main(String[] args) {
        launch(args);
    }
}

