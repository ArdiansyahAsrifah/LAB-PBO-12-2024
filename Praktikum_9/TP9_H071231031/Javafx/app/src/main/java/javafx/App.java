package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application {

    private Stage primaryStage;
    private Stage profileStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showHomePage();
    }

    private void showHomePage() {
        
        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.setPadding(new Insets(20));
        gridPane.setAlignment(Pos.CENTER);

        ImageView img1 = new ImageView(new Image(getClass().getResourceAsStream("/Assets/img1.jpg")));
        img1.setFitWidth(200);
        img1.setFitHeight(150);
        ImageView img2 = new ImageView(new Image(getClass().getResourceAsStream("/Assets/img2.png")));
        img2.setFitWidth(200);
        img2.setFitHeight(150);
        ImageView img3 = new ImageView(new Image(getClass().getResourceAsStream("/Assets/img3.jpg")));
        img3.setFitWidth(200);
        img3.setFitHeight(150);

        VBox box1 = createBox("SI IMUT", "Saking imutnya sampai saat ini lautan pun tersipu malu ketika melihat keimutannya");
        VBox box2 = createBox("AMBATUKAM", "Menurut intel terpercaya dari sungut lele beliau akan menjadi presiden dunia di tahun 2068 mengalahkan Ohma-zio");
        VBox box3 = createBox("WAIFU GWH", "Gak ada yang klem gw udah tandain yang ini");

        HBox hbox1 = new HBox(20, box1, img1);
        hbox1.setAlignment(Pos.CENTER);
        HBox hbox2 = new HBox(20, box2, img2);
        hbox2.setAlignment(Pos.CENTER);
        HBox hbox3 = new HBox(20, box3, img3);
        hbox3.setAlignment(Pos.CENTER);

        gridPane.add(hbox1, 0, 0);
        gridPane.add(hbox2, 0, 1);
        gridPane.add(hbox3, 0, 2);


        
        HBox header = new HBox(40);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(20));
        header.setStyle("-fx-background-color: #2C3E50;");

        Button profileButton = new Button("Profile");
        profileButton.setOnAction(e -> showProfilePage());

        profileButton.setTextFill(Color.WHITE);
        profileButton.setFont(Font.font("Arial", FontWeight.NORMAL, 18));
        profileButton.setStyle("-fx-background-color: #2C3E50;");

        header.getChildren().addAll(profileButton);

        BorderPane root = new BorderPane();
        root.setTop(header);
        root.setCenter(gridPane);
  

        Scene homeScene = new Scene(root, 1200, 600);
        primaryStage.setTitle("HomeScene");
        primaryStage.setScene(homeScene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    private void showProfilePage() {
        if (profileStage == null) {
            profileStage = new Stage();
            ProfileScene profileScene = new ProfileScene();
            profileScene.setPreviousStage(primaryStage);
            profileScene.start(profileStage);
            profileStage.setOnHiding(event -> {
                profileStage = null; 
                primaryStage.show(); 
            });
            primaryStage.hide();
        } else {
            profileStage.show();
        }
    }
    private VBox createBox(String title, String description) {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10));
        box.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-border-radius: 10; -fx-effect: dropshadow(one-pass-box, rgba(0,0,0,0.12), 10, 0, 0, 0);");
        Label titleLabel = new Label(title);
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        Label descLabel = new Label(description);
        descLabel.setWrapText(true);
        box.getChildren().addAll(titleLabel, descLabel);
        box.setAlignment(Pos.CENTER);
        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
