# JavaFX Refresher

Testing ground for getting back into JavaFX development

JavaFX was removed from the Oracle API a while ago, so now it's a separate standalone download. Now it's OpenJFX. I found it frustrating that they removed it, which makes JavaFX setup a little more complicated, and it also causes issues with compatibility with JavaFX programs written in Java 8, so I haven't used it in a while. This repo is just me re-learning JavaFX, since I haven't used it in a while, and the setup process is a little different from before. 


This project uses Java 15, OpenJFX 15, and IntelliJ on Windows 10.

## Setup instructions for IntelliJ/OpenJFX/etc.

Go here for the JavaFX tutorial for setup info:

[https://www.youtube.com/watch?v=BHj6zbH3inI&list=PLfu_Bpi_zcDNYL6171Op3S1ABtuyFV7Nr](https://www.youtube.com/watch?v=BHj6zbH3inI&list=PLfu_Bpi_zcDNYL6171Op3S1ABtuyFV7Nr)

The above is the tutorial series I'm using to re-learn JavaFX and the projects in this repo are based on that.

I didn't make this tutorial series, I just learn better when I take notes and code along with it.

Setup info:
1. Download OpenJFX
2. Go to File -> Project Structure -> Libraries -> hit the + icon -> Java -> navigate to the OpenJFX folder.
3. Go to VM options and paste this in (or whatever makes sense for the version of OpenJFX you're using):
	- --module-path PATH_TO_OPENJFX_LIB_FOLDER_GOES_HERE\openjfx-15_windows-x64_bin-sdk\javafx-sdk-15\lib --add-modules javafx.controls,javafx.fxml
4. If you aren't using the sample package the IntelliJ automatically creates, then be sure to set the proper Main class by going to Edit Configuration -> Main class

## JavaFX to JAR!!!

Oracle took JavaFX out of the Oracle API in more recent versions of Java. That makes it a little complicated to create a working JAR. 

You will need to export a JAR using a particular artifact configuration, and then create a shell script that will launch it using the JavaFX dependencies. It's a little complicated, but there's a good tutorial that explains it easily. I've tested it in Java 11/OpenJFX 11.

Watch this tutorial: [https://www.youtube.com/watch?v=HGHu-SzL-5E](https://www.youtube.com/watch?v=HGHu-SzL-5E)
https://www.youtube.com/watch?v=HGHu-SzL-5E



## Notes about JavaFX coding

- public void start(Stage stage) throws Exception {} 
	- When the application starts, this stage is created.
	- A stage is a window in JavaFX/OpenJFX
	- stage.someMethod() changes the window
	- Example: stage.setTitle("Hello world");
	- Use a Main class and a MyJavaFXApplication class
	- stage is in the JavaFX class you wrote
	- For a stage to show up, you have to use stage.show();
- To run a JavaFX application window, within the Main class, do this:
	- Application.launch(JavaFXClassNameGoesHere.class, args);
- Make sure you know the difference between creating a new Java class and creating a new JavaFX class -- these are not the same thing in IntelliJ!
- Make sure your Main config is edited properly as per the OpenJFX documentation and the Youtube tutorial, and you have the correct JavaFX lib folder set up as an external library, etc.
- the init() method within your JavaFXApplication class runs before the window starts
- The start() method within your JavaFXApplication class is what determines window stuff
- The stop() method within your JavaFXApplication class is what happens after you close the window
- The Main class needs to use Application.launch(JavaFXApplication.class, args) in order to run the JavaFX program -- window etc.
- Run the program from the Main class
- You can also just optionally put everything in the Main class, such as init, start(), and stop(), but then you will need the Main class to extend Application

## Episode 3 tutorial notes

### Stages

- 'Stage' is another name for a window
- You can have multiple windows in a single JavaFX program
	- make a stage called stage, then make another one called stage2
	- Stage stage2 = new Stage();
	- You can change the window size with stage.setWidth(123) and stage.setHeight(123)
	- How to change where the location of where the window is opened:
		- stage.setX(123)
		- stage.setY(456)
- Modality: 
	- The following means that other windows can't be used until this one is closed:
		- newWindow.initModality(Modality.APPLICATION_MODAL);
		- This can be useful for error message windows
	-Modality.NONE means there are no limitations for how the window can be used when other windows are open
	-Modality.WINDOW_MODAL means you can't mess with the parent window until the WINDOW_MODAL window is closed, such as if a main window spawns a smaller/sub window
		-Only works if the WINDOW_MODAL window has an owner:
			- newWindow.initOwner(stage2);
	- Modality stuff only matters if you have a multi-window program.
- Window styles:
	- Example: stage.initStyle(StateStyle.TRANSPARENT)
		- Other options:
			- StageStyle.TRANSPARENT
				- Invisible window
			- StageStyle.DECORATED
				- Normal window
			- StageStyle.UNDECORATED
				- Only shows the content of the window, no title bar with minimize/maximize/close buttons
			- StageStyle.UNIFIED
			- StageStyle.UTILITY
				- Simple for a dialogue pop-up or error message
			- StageStyle.valueOf(String name)
			- StageStyle.values()
			- StageStyle.EnumDesc<E>
	- DECORATED is the default window style
	- There's more stuff to it but it doesn't matter for a single-window program. The only really important thing is that, if you want to make an error message pop-up, or some sort of notification, just make a new stage called stageError, add the stuff to the stage, and then set the stageError.initModality(Modality.APPLICATION_MODAL), and maybe set stageError.initStyle(StageStyle.UTILITY)
	- Full screen: stage.setFullScreen(true);
	- Close a window: stage.close();
	- Other stuff:
		- stage.setMaxWidth() and stage.setMinWidth()
		- stage.setMaxHeight() and stage.setMinHeight()



## Episode 4 notes

### Scenes

- Scenes let you add stuff to a stage (window) such as nodes, components, and layouts
- Scenes go inside stages
- One scene displayed at a time per stage
- Scenes are made of nodes/components
- Be sure to import stuff as needed, such as import javafx.stage.Stage and import javafx.scene.Scene;
- Scenes need a parent
	- Example:
		- VBox parent = new VBox();
		- Scene scene1 = new Scene(parent);
		- stage.setScene(scene1);
- import javafx.application.Application;
- import javafx.control.Label;
- import javafx.layout.VBox;
- Adding a label to a scene: 
	- Label label1 = new Label("This is my label");
	- parent.getChildren().add(label1);
	- Then you need to do stage.show
- Hierarchies in scenes
- Stage -> Scene -> Pane -> Nodes
- You can have multiple nested panes, i.e. an HBox in a VBox or something like that. You can also have multiple nodes within each Pane. But a single window (a Stage) can only have on Scene in it.
- You can change the mouse cursor, such as:
	- scene1.setCursor(Cursor.CROSSHAIR);
		- Many other types of cursors too
		- Cursor.WAIT is for loading

## Episode 5 notes

### Labels and images

#### Images

Image and ImageView classes

- You can put images in a JavaFX program
- To display an image in JavaFX, have a stage with a Scene and a VBox, and then do this:
	- ImageView imageView = new ImageView("google.com/image.jpg");
	- In the above example, you are getting an image from a remote location, which works. 
	- Or you can use a local image that you include with the program, which is probably more common and practical for a lot of stuff.
- You can also use the Image class to put an image in that, and then provide the Image object as an argument to the ImageView object.
- After you have an image or a string with a location of an image in an ImageView object, add the ImageView object to the VBox or Pane or whatever you're using:
	- VBox root = new VBox();
	- Scene scene = new Scene();
	- Image image = new Image("google.com/example.png");
	- ImageView imageView = new ImageView(image);
	- root.getChildren().addAll(imageView)
	- stage.setScene(scene);
	- stage.show();
- To load an image from local storage and using a relative path (this was much more complicated than I thought it would be):
	- Firstly, import java.io.FileInputStream; and import java.io.IOException;
	- Then do this:
		- try {
			- FileInputStream imageFile = new FileInputStream("example.png");
			- Image image = new Image(imageFile);
			- ImageView stuff etc
		- } catch (IOException e) {
			- e.printStackTrace();
		- }
	- By default, Java will see the project folder. So if you have your Main.java in the project123/src folder, the program won't see itself as being in the src folder. So if you have an image in the project123/ folder, such as project123/example.png, you would just use the relative path of "example.png". no need to go up one level, which is counterintuitive because i thought it would start the current directory at the location of the Main.java, which is in the src folder, but that's not how it works.
- For ImageView objects, you can use various methods, such as:
	- imageView.getX()
	- imageView.getY()
	- imageView.setX()
	- imageView.setY()
	- To change the size of an ImageView object, use these methods:
		- imageView.setFitHeight(50);
		- imageView.setFitWidth(100);
	- and a bunch of other stuff for changing an image and its size and stuff

#### Note about imports

- Make sure you're importing the classes from the correct places! Swing has some classes that have the same names as the JavaFX ones, but if you use Swing, there will be some problems. Swing is an older way of doing Java GUIs.

Examples of some imports:
 	- import javafx.application.Application;
	- import javafx.scene.Scene;
	- import javafx.scene.control.Label;
	- import javafx.scene.image.ImageView;
	- import javafx.scene.image.Image;
	- import javafx.scene.layout.VBox;
	- import javafx.stage.Stage;

#### Labels

- Labels are just text that you can show on your JavaFX window
- How to make a label:
	- Label label1 = new Label("Test label");
	- root.getChildren().add(label1);
	- In the above example, root is a VBox that is in the Scene that is in the Stage
- You can add an image to a label
	- Label label1 = new Label("Hello world", imageView);
	- In the above line of code, the text from the label will be to the right of the image
	- If the image is small or you used setFitHeight() and setFitWidth() to make the ImageView object smaller, then it will appear like a bullet point to the left of the text
- If you add multiple labels to a VBox, they appear one after the other. It's a vertical box of nodes/controls.
- How to change the color of a label:
	- label1.setTextFill(Color.BLUE);
	- The above line of code only works if you import javafx.scene.paint.Color;
	- You can also change the color with hex colors, like so:
		- label1.setTextFillColor(Color.web("#2fc452"));
- How to change the font and size of the text in the label:
	- First, you must import javafx.scene.text.Font;
	- Then, do this:
		- label2.setFont(new Font("Arial", 100));
- There are other things you can do with labels, such as rotating the text.
- How to change the text in a label:
	- label.setText("here is the new text");

## Episode 6: Hyperlinks

- How to create a hyperlink in JavaFX:
	- Hyperlink link = new Hyperlink("example link");
- How to use a lambda expression to make a link do something when it's clicked:
	- link.setOnAction(e -> {
		- System.out.println("link has been clicked");
	- });
- Then you need to add the hyperlink to your VBox/Pane/whatever:
	- root.getChildren().add(link);
- Instead of a lambda expression, you can use an EventHandler:
	- link.setOnAction(new EventHandler<ActionEvent>() {
		- @Override
		- public void handle(ActionEvent actionEvent) {
			- System.out.println("using an event handler instead of a lambda");
		- }
	- });
- EventHandlers and lambda expressions can achieve pretty much the same thing, at least in this context

## Episode 7: CSS

- CSS might be associated with front-end web development, but you can even use it in JavaFX for your Java program's GUI.
- CSS in JavaFX is different from web dev CSS.
	- Go here to read the documentation about JavaFX CSS:
	- [https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html](https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html)
	- JavaFX CSS starts with -fx-
	- -fx-background-color: instead of background-color
- How to add a stylesheet to a JavaFX program:
	- scene.getStylesheets().add("css/style.css");
- If you have a VBox, here is how you create a JavaFX CSS selector for it:
	- .root {}
	- The VBox can be named anything but you address the root pane as root
	- if you want to target labels, use this:
		- .label {}
- To change the CSS ID of a label (or any kind of node), use this:
	- label1.setId("idTest");
	- Then in your CSS file, do this:
	- #idTest {}
- Aside from using an external stylesheet, you can also do this to style a node:
	- Hyperlink link = new Hyperlink("example");
	- link.setStyle("-fx-background-color: purple");






