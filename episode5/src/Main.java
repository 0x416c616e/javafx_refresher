import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Happens before the window is opened");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Episode 5: images and labels");
        stage.setWidth(800);
        stage.setHeight(500);
        VBox root = new VBox();
        try {
            FileInputStream imageFile = new FileInputStream("example_for_javafx.png");
            Image image = new Image(imageFile);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(60);
            imageView.setFitWidth(60);
            Label label1 = new Label("This is a text label test", imageView);
            Label label2 = new Label("another test for the VBox");
            label2.setTextFill(Color.web("#2fc452"));
            label2.setFont(new Font("Arial", 100));
            root.getChildren().addAll(label1, label2);
            label2.setRotate(90);
        } catch (IOException e) {
            e.printStackTrace();

        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        System.out.println("current directory: " + System.getProperty("user.dir"));
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Happens after the window is closed");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        launch();
    }
}
