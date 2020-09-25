import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

        //Modality
        Stage newWindow = new Stage();

        //all other stages can't be used until an APPLICATION_MODAL stage is closed
        newWindow.initModality(Modality.APPLICATION_MODAL);

        //this modality mode means you can interact with the window no matter what
        newWindow.initModality(Modality.NONE);
        newWindow.initStyle(StageStyle.UNDECORATED);

        stage.show();
        stage2.show();
        newWindow.show();

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
