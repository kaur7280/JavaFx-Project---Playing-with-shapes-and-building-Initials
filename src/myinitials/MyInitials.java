/**
 name: Ramneek Kaur
 Student ID: 991555460
 Assignment 1
 Date: January 14,2020
 */

package myinitials;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import content.FirstInitial;
import content.SecondInitial;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyInitials extends Application {
     @Override
    public void start(Stage primaryStage) {
       ImageView img = new ImageView("images/img1.jpg");
       img.setFitHeight(400);
       img.setFitWidth(500);
       Text name = new Text(300, 20, "Ramneek Kaur");
       Pane back = new Pane(img,name);
       Scene image = new Scene(back,500,400);
       
       primaryStage.setHeight(400);
       primaryStage.setWidth(500);
       primaryStage.setY(100);
       primaryStage.setX(50);
       primaryStage.setScene(image);
       primaryStage.setTitle("Primary Stage - Ramneek Kaur");
        name.setFill(Color.WHITE);
        name.setFont(Font.font("Rockwell", FontPosture.ITALIC, 18));
       
        primaryStage.show();
        FirstInitial fname = new FirstInitial();
        fname.show();
        SecondInitial sname = new SecondInitial();
        sname.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
