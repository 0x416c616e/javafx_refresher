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




