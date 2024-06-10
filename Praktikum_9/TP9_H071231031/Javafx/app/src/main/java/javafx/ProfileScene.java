package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class ProfileScene extends Application {

    private Stage previousStage; 

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 50, 20, 50));
        root.setStyle("-fx-background-color: linear-gradient(to bottom right, #80cbc4, #b2dfdb);");

        VBox leftSection = new VBox(20);
        leftSection.setPadding(new Insets(20));
        leftSection.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-border-radius: 10;");

        Circle profilePic = new Circle(50);
        try {
            Image image = new Image(getClass().getResourceAsStream("/Assets/profil.jpg"));
            profilePic.setFill(new ImagePattern(image));
        } catch (Exception e) {
            e.printStackTrace();
            profilePic.setFill(null);
        }

        Label nameLabel = new Label("Elon Muskinhg");
        nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Label studentIDLabel = new Label("Student ID: H071231000");
        Label classLabel = new Label("Prodi: Sistem Informasi");
        Label sectionLabel = new Label("Batch: 100");

        leftSection.getChildren().addAll(profilePic, nameLabel, studentIDLabel, classLabel, sectionLabel);

        VBox rightSection = new VBox(20);

        VBox generalInfoSection = new VBox(10);
        generalInfoSection.setPadding(new Insets(20));
        generalInfoSection.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-border-radius: 10;");

        Label generalInfoTitle = new Label("General Information");
        generalInfoTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        GridPane generalInfoGrid = new GridPane();
        generalInfoGrid.setHgap(10);
        generalInfoGrid.setVgap(10);

        generalInfoGrid.add(new Label("Roll"), 0, 0);
        generalInfoGrid.add(new Label(": 000"), 1, 0);
        generalInfoGrid.add(new Label("Academic Year"), 0, 1);
        generalInfoGrid.add(new Label(": 2068"), 1, 1);
        generalInfoGrid.add(new Label("Gender"), 0, 2);
        generalInfoGrid.add(new Label(": Male"), 1, 2);
        generalInfoGrid.add(new Label("Agama"), 0, 3);
        generalInfoGrid.add(new Label(": Islam"), 1, 3);
        generalInfoGrid.add(new Label("Golongan darah"), 0, 4);
        generalInfoGrid.add(new Label(": XL"), 1, 4);

        generalInfoSection.getChildren().addAll(generalInfoTitle, generalInfoGrid);

        VBox otherInfoSection = new VBox(10);
        otherInfoSection.setPadding(new Insets(20));
        otherInfoSection.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-border-radius: 10;");

        Label otherInfoTitle = new Label("Other Information");
        otherInfoTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        TextArea otherInfoText = new TextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        otherInfoText.setWrapText(true);
        otherInfoText.setEditable(false);
        otherInfoText.setStyle("-fx-control-inner-background: #f0f4c3;");

        otherInfoSection.getChildren().addAll(otherInfoTitle, otherInfoText);

        rightSection.getChildren().addAll(generalInfoSection, otherInfoSection);

        HBox mainLayout = new HBox(20, leftSection, rightSection);
        root.setCenter(mainLayout);

        Button backButton = new Button("Back");
        backButton.setOnAction(e -> {
            previousStage.show(); 
            primaryStage.hide(); 
        });

        HBox backButtonLayout = new HBox(backButton);
        backButtonLayout.setPadding(new Insets(10));
        backButtonLayout.setAlignment(Pos.CENTER_LEFT);
        root.setTop(backButtonLayout);

        Scene scene = new Scene(root, 800, 400);
        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Student Profile");
        primaryStage.setScene(scene);
         
        primaryStage.show();
    }

    public void setPreviousStage(Stage stage) {
        this.previousStage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
