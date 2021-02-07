/**
 name: Ramneek Kaur
 Student ID: 991555460
 Assignment 1
 Date: January 14,2020
 */

package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstInitial extends Stage{
    public FirstInitial(){
        setTitle("First Initial - Ramneek Kaur");
    setHeight(400);
    setWidth(500);
    setX(550);
    setY(100);
    setScene(scene);
    setRectangle();
    setArc();
    }
     private Rectangle rect = new Rectangle(100,50,50,250);
     private Rectangle rect1 = new Rectangle(150,50,100,50);
     private Arc arc = new Arc(250,100,50,50,0,90);
     private Rectangle rect2 = new Rectangle(250,100,50,50);
     private Arc arc1 = new Arc(250.0,150.0,50,25,270,90);
     private Rectangle rect3 = new Rectangle (150,150,100,25);
     private Rectangle rect4 = new Rectangle (150,175,100,25);
     private Arc arc2 = new Arc(250.0,200.0,50,25,360,90);
     private Rectangle rect5 = new Rectangle(250,200,50,100);
     private Text name = new Text(300,20,"Ramneek Kaur");
     
     
     private Pane pane = new Pane(rect,rect1,arc,rect2,
             arc1,rect3,rect4,arc2,
             rect5,name);
    private Scene scene = new Scene(pane, 400, 600);
   
      private void setRectangle(){
        rect.setStrokeWidth(2);
        rect.setFill(Color.ROYALBLUE);
        rect.setStroke(Color.DARKVIOLET);
        rect1.setStrokeWidth(2);
        rect1.setStroke(Color.DARKVIOLET);
        rect1.setFill(Color.ROYALBLUE);
        rect2.setFill(Color.ROYALBLUE);
        rect2.setStrokeWidth(2);
        rect2.setStroke(Color.DARKVIOLET);
        rect3.setFill(Color.ROYALBLUE);
        rect3.setStrokeWidth(2);
        rect3.setStroke(Color.DARKVIOLET);
        rect4.setFill(Color.ROYALBLUE);
        rect4.setStrokeWidth(2);
        rect4.setStroke(Color.DARKVIOLET);
        rect5.setFill(Color.ROYALBLUE);
        rect5.setStrokeWidth(2);
        rect5.setStroke(Color.DARKVIOLET);
         name.setFill(Color.INDIGO);
         name.setFont(Font.font("Rockwell",
                 FontPosture.ITALIC, 18));
    }
          private void setArc(){
      arc.setFill(Color.ROYALBLUE);
      arc.setType(ArcType.ROUND);
      arc.setStrokeWidth(2);
      arc.setStroke(Color.DARKVIOLET);
      arc1.setFill(Color.ROYALBLUE);
      arc1.setType(ArcType.ROUND);
      arc1.setStrokeWidth(2);
      arc1.setStroke(Color.DARKVIOLET);
      arc2.setType(ArcType.ROUND);
      arc2.setStrokeWidth(2);
      arc2.setStroke(Color.DARKVIOLET);
      arc2.setFill(Color.ROYALBLUE);
      }
}
