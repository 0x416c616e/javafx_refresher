import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    @Override
    public void init() throws Exception {
        //super.init();
        System.out.println("This happens before the window is launched");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello world!!!");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        //super.stop();
        System.out.println("This is what happens after the window is closed");
    }
}
