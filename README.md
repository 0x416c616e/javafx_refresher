# JavaFX Refresher

Testing ground for getting back into JavaFX development

JavaFX was removed from the Oracle API a while ago, so now it's a separate standalone download. Now it's OpenJFX. I found it frustrating that they removed it, which makes JavaFX setup a little more complicated, and it also causes issues with compatibility with JavaFX programs written in Java 8, so I haven't used it in a while. This repo is just me re-learning JavaFX, since I haven't used it in a while, and the setup process is a little different from before. 


This project uses Java 15, OpenJFX 15, and IntelliJ on Windows 10.

## Setup instructions for IntelliJ/OpenJFX/etc.

Go here for the JavaFX tutorial for setup info:
[https://www.youtube.com/watch?v=BHj6zbH3inI&list=PLfu_Bpi_zcDNYL6171Op3S1ABtuyFV7Nr](https://www.youtube.com/watch?v=BHj6zbH3inI&list=PLfu_Bpi_zcDNYL6171Op3S1ABtuyFV7Nr)

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
		



### Side note

- To make an exe in IntelliJ, follow these instructions:
	- [https://intellij-support.jetbrains.com/hc/en-us/community/posts/360008885240-How-to-create-an-executable-exe-file-using-Intellij](https://intellij-support.jetbrains.com/hc/en-us/community/posts/360008885240-How-to-create-an-executable-exe-file-using-Intellij)
- Might also want to look into this:
	- [https://youtrack.jetbrains.com/issue/IDEA-200721](https://youtrack.jetbrains.com/issue/IDEA-200721)
- Also look at this:
	- [https://www.youtube.com/results?search_query=Java+FX+Packager%3A+Can%27t+build+artifact+-+fx%3Adeploy+is+not+available+in+this+JDK](https://www.youtube.com/results?search_query=Java+FX+Packager%3A+Can%27t+build+artifact+-+fx%3Adeploy+is+not+available+in+this+JDK)
- In IntelliJ, you can export as a JAR using artifacts(?)





