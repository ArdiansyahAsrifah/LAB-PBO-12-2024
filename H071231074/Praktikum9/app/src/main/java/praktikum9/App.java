package praktikum9;

import javafx.application.Application;
import javafx.stage.Stage;
import scenes.HomeScene;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        stage.setResizable(false);
        stage.setTitle("Home Scene");

        HomeScene initScene = new HomeScene(stage);
        initScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
