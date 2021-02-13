import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
public class FirTree extends Application 
{
    public static void main(String[] args) {
        launch(args);    
    }    
    @Override 
    public void start(Stage primaryStage) 
    {        
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);
        scene.setFill(Color.rgb(0, 127, 255));

        Rectangle r = new Rectangle(220, 220, 50, 120);
        r.setFill(Color.rgb(128, 64, 0));
        root.getChildren().add(r);

        Polygon triangle1 = new Polygon(160, 220, 235, 100, 340, 220);
        root.getChildren().add(triangle1);
        triangle1.setFill(Color.rgb(2, 127, 0));

        Polygon triangle2 = new Polygon(170, 160, 235, 50, 320, 160);
        root.getChildren().add(triangle2);
        triangle2.setFill(Color.rgb(2, 127, 0));

        Polygon triangle3 = new Polygon(180, 100, 235, 5, 300, 100);
        root.getChildren().add(triangle3);
        triangle3.setFill(Color.rgb(2, 127, 0));

        Rectangle sq1 = new Rectangle(210, 125, 20, 20);
        sq1.setFill(Color.rgb(255, 251, 1));
        root.getChildren().add(sq1);

        Rectangle sq2 = new Rectangle(255, 110, 20, 20);
        sq2.setFill(Color.rgb(255, 251, 1));
        root.getChildren().add(sq2);

        Rectangle sq3 = new Rectangle(245, 165, 20, 20);
        sq3.setFill(Color.rgb(255, 251, 1));
        root.getChildren().add(sq3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}