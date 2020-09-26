# JavaFX Refresher

Testing ground for getting back into JavaFX development

JavaFX was removed from the Oracle API a while ago, so now it's a separate standalone download. Now it's OpenJFX. I found it frustrating that they removed it, which makes JavaFX setup a little more complicated, and it also causes issues with compatibility with JavaFX programs written in Java 8, so I haven't used it in a while. This repo is just me re-learning JavaFX, since I haven't used it in a while, and the setup process is a little different from before. 


This project uses Java 15, OpenJFX 15, and IntelliJ on Windows 10.

## Setup instructions for IntelliJ/OpenJFX/etc.

Go here for the JavaFX tutorial for setup info:

[https://www.youtube.com/watch?v=BHj6zbH3inI&list=PLfu_Bpi_zcDNYL6171Op3S1ABtuyFV7Nr](https://www.youtube.com/watch?v=BHj6zbH3inI&list=PLfu_Bpi_zcDNYL6171Op3S1ABtuyFV7Nr)

The above is the tutorial series I'm using to re-learn JavaFX and the projects in this repo are based on that.

## Notes

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




### Side note

- To make an exe in IntelliJ, follow these instructions:
	- [https://intellij-support.jetbrains.com/hc/en-us/community/posts/360008885240-How-to-create-an-executable-exe-file-using-Intellij](https://intellij-support.jetbrains.com/hc/en-us/community/posts/360008885240-How-to-create-an-executable-exe-file-using-Intellij)
- Might also want to look into this:
	- [https://youtrack.jetbrains.com/issue/IDEA-200721](https://youtrack.jetbrains.com/issue/IDEA-200721)
- Also look at this:
	- [https://www.youtube.com/results?search_query=Java+FX+Packager%3A+Can%27t+build+artifact+-+fx%3Adeploy+is+not+available+in+this+JDK](https://www.youtube.com/results?search_query=Java+FX+Packager%3A+Can%27t+build+artifact+-+fx%3Adeploy+is+not+available+in+this+JDK)
- In IntelliJ, you can export as a JAR using artifacts(?)
- Or I can just create a Docker container or something
- Don't worry about it too much for now

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





