import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    //runs before the window is closed
    @Override
    public void init() throws Exception {
        super.init();
    }


    //window stuff
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello, world!!!!!!!");


        Stage stage2 = new Stage();
        stage2.setTitle("Second window");
        stage2.setHeight(123);
        stage2.setWidth(456);

        stage2.setX(500);
        stage2.setY(500);

        stage.show();
        stage2.show();
    }


    //runs after the window is closed
    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
