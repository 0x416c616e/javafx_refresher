import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Episode 9: Menu Buttons");
        stage.setWidth(500);
        stage.setHeight(500);
        VBox root = new VBox();
        MenuItem item1 = new MenuItem("Select All");
        MenuItem item2 = new MenuItem("Select None");
        MenuItem item3 = new MenuItem("Copy");
        MenuItem item4 = new MenuItem("Paste");
        MenuItem item5 = new MenuItem("Cut");
        MenuItem item6 = new MenuItem("Undo");
        MenuItem item7 = new MenuItem("Redo");
        Menu editMenu = new Menu("Edit", null, item1, item2, item3, item4, item5, item6, item7);
        MenuBar menuBar = new MenuBar(editMenu);
        root.getChildren().add(menuBar);
        Label message = new Label("Nothing clicked yet");
        root.getChildren().add(message);
        item1.setOnAction( e -> {
            message.setText("Select All was clicked");
        });
        item2.setOnAction( e -> {
            message.setText("Select None was clicked");
        });
        item3.setOnAction( e -> {
            message.setText("Copy was clicked");
        });
        item4.setOnAction( e -> {
            message.setText("Paste was clicked");
        });
        item5.setOnAction( e -> {
            message.setText("Cut was clicked");
        });
        item6.setOnAction( e -> {
            message.setText("Undo was clicked");
        });
        item7.setOnAction( e -> {
            message.setText("Redo was clicked");
        });


        Scene scene = new Scene(root);
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
