package scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfileScene {
    private Stage stage;

    public ProfileScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        stage.setTitle("Profile Settings");

        // Header
        Text header = new Text("Profile Settings");
        header.getStyleClass().add("header-text");

        HBox headerBox = new HBox(header);
        headerBox.setAlignment(Pos.CENTER_LEFT);
        headerBox.getStyleClass().add("header-box");

        // Navigation Sidebar
        Image profileImage = new Image(getClass().getResource("/image/IMG_4447.jpg").toExternalForm());
        ImageView profileImageView = new ImageView(profileImage);
        profileImageView.setFitWidth(80);
        profileImageView.setFitHeight(80);
        profileImageView.setStyle("-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.25), 10, 0, 0, 1);");
        profileImageView.setClip(new Circle(40, 40, 40));

        Label fullName = new Label("rinaldiruslan");
        fullName.getStyleClass().add("fullname");

        Button editProfileBtn = new Button("Edit Profile");
        editProfileBtn.getStyleClass().add("edit-button");

        VBox profileBox = new VBox(10, profileImageView, fullName, editProfileBtn);
        profileBox.setAlignment(Pos.CENTER);

        Button profileBtn = new Button("Profile");
        Button notificationsBtn = new Button("Notifications");
        Button passwordBtn = new Button("Password");
        Button settingsBtn = new Button("Settings");
        Button privacyPolicyBtn = new Button("Privacy Policy");

        profileBtn.getStyleClass().add("nav-button");
        notificationsBtn.getStyleClass().add("nav-button");
        passwordBtn.getStyleClass().add("nav-button");
        settingsBtn.getStyleClass().add("nav-button");
        privacyPolicyBtn.getStyleClass().add("nav-button");

        VBox navButtons = new VBox(20, profileBtn, notificationsBtn, passwordBtn, settingsBtn, privacyPolicyBtn);
        navButtons.setAlignment(Pos.TOP_LEFT);

        VBox navBox = new VBox(30, profileBox, navButtons);
        navBox.setAlignment(Pos.TOP_CENTER);
        navBox.getStyleClass().add("nav-box");

        // Main Content
        Text profileDetailsHeader = new Text("Profile details");
        profileDetailsHeader.getStyleClass().add("section-header");

        Label nameLabel = new Label("Name:");
        nameLabel.getStyleClass().add("white-text");
        TextField nameField = new TextField("Muh. Rinaldi Ruslan");
        nameField.getStyleClass().add("text-field");

        Label usernameLabel = new Label("Username:");
        usernameLabel.getStyleClass().add("white-text");
        TextField usernameField = new TextField("@rinaldiruslan");
        usernameField.getStyleClass().add("text-field");

        Label dobLabel = new Label("Date of Birth:");
        dobLabel.getStyleClass().add("white-text");
        TextField dobField = new TextField("30 Januari 2004");
        dobField.getStyleClass().add("text-field");

        Text contactInfoHeader = new Text("Contact info");
        contactInfoHeader.getStyleClass().add("section-header");

        Label phoneLabel = new Label("Phone:");
        phoneLabel.getStyleClass().add("white-text");
        TextField phoneField = new TextField("+6289623080501");
        phoneField.getStyleClass().add("text-field");

        Label emailLabel = new Label("Email:");
        emailLabel.getStyleClass().add("white-text");
        TextField emailField = new TextField("rinaldi.ruslan51@gmail.com");
        emailField.getStyleClass().add("text-field");

        Label programLabel = new Label("Jurusan:");
        programLabel.getStyleClass().add("white-text");
        TextField programField = new TextField("Sistem Informasi");
        programField.getStyleClass().add("text-field");

        Label facultyLabel = new Label("Faculty:");
        facultyLabel.getStyleClass().add("white-text");
        TextField facultyField = new TextField("MIPA");
        facultyField.getStyleClass().add("text-field");

        Label semesterLabel = new Label("Semester:");
        semesterLabel.getStyleClass().add("white-text");
        TextField semesterField = new TextField("2");
        semesterField.getStyleClass().add("text-field");

        Label campusLabel = new Label("Campus:");
        campusLabel.getStyleClass().add("white-text");
        TextField campusField = new TextField("Hasanuddin University");
        campusField.getStyleClass().add("text-field");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(profileDetailsHeader, 0, 0, 2, 1);
        gridPane.add(nameLabel, 0, 1);
        gridPane.add(nameField, 1, 1);
        gridPane.add(usernameLabel, 0, 2);
        gridPane.add(usernameField, 1, 2);
        gridPane.add(dobLabel, 0, 3);
        gridPane.add(dobField, 1, 3);
        gridPane.add(contactInfoHeader, 0, 4, 2, 1);
        gridPane.add(phoneLabel, 0, 5);
        gridPane.add(phoneField, 1, 5);
        gridPane.add(emailLabel, 0, 6);
        gridPane.add(emailField, 1, 6);
        gridPane.add(programLabel, 0, 7);
        gridPane.add(programField, 1, 7);
        gridPane.add(facultyLabel, 0, 8);
        gridPane.add(facultyField, 1, 8);
        gridPane.add(semesterLabel, 0, 9);
        gridPane.add(semesterField, 1, 9);
        gridPane.add(campusLabel, 0, 10);
        gridPane.add(campusField, 1, 10);

        Button saveChangesBtn = new Button("Save Changes");
        saveChangesBtn.getStyleClass().add("save-button");
        saveChangesBtn.setOnAction(v -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });
        HBox saveButtonBox = new HBox(saveChangesBtn);
        saveButtonBox.setAlignment(Pos.CENTER);
        saveButtonBox.setPadding(new Insets(20, 0, 0, 0));

        VBox mainBox = new VBox(20, gridPane, saveButtonBox);
        mainBox.setPadding(new Insets(20));
        mainBox.getStyleClass().add("main-box");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(headerBox);
        borderPane.setCenter(mainBox);
        borderPane.setLeft(navBox);

        Scene scene = new Scene(borderPane, 800, 640);
        scene.getStylesheets().add(getClass().getResource("/styling/style.css").toExternalForm());
        stage.setScene(scene);
    }
}
