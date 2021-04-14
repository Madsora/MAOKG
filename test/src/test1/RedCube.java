package test1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class RedCube extends Application{
public static void main (String args[]) {
launch(args); // main method
}
@Override
public void start(Stage primaryStage) // start - is the main entry point for
all JavaFX applications
{
Group root = new Group(); // making the root of all scene's objects
Scene scene = new Scene (root, 200, 200); // making the scene for root
object with size of 500*400 pixels
scene.setFill(Color.BISQUE); // set the color of scene
root.getChildren().add(new Text(50,100,"Hello, world!!!"));
//adding the object Text as a child to the root object
primaryStage.setScene(scene); // specifying the scene to be used on this
stage
primaryStage.show(); // show the scene
}
}
