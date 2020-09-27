import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //coding while watching tutorial to learn it better
        stage.setTitle("episode 8 of javafx tutorial");
        stage.setHeight(500);
        stage.setWidth(500);
        VBox root = new VBox();
        Button button = new Button("Click");
        button.setStyle("-fx-font-size: 30px");
        button.setText("_new text");
        button.setWrapText(true);
        button.setMinSize(150, 150);
        button.setMaxSize(220, 220);
        button.setPrefSize(200, 200);
        button.setMnemonicParsing(true);
        button.setOnAction( e -> {
            System.out.println("you clicked the button or activated it with mnemonics");
        });
        root.getChildren().add(button);
        Scene scene = new Scene(root);
        stage.getIcons().add(new Image("file:test_icon.png"));
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
