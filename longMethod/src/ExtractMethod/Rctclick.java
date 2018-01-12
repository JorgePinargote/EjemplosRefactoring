/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtractMethod;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Jorge Pinargote
 */
public class Rctclick extends Application {
    
    Boolean change = true;
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        Rectangle r = new Rectangle();
        setRectangleStyle(r);
        addEventstoRect(r);
        
        root.getChildren().add(r);
        WindowStyle(root,primaryStage);
    }
    
    public void setRectangleStyle(Rectangle r){
        r.setX(50);
        r.setY(50);
        r.setWidth(200);
        r.setHeight(100);
        r.setArcWidth(20);
        r.setArcHeight(40);
    }
    
    public void WindowStyle(Pane root,Stage primaryStage){
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void addEventstoRect(Rectangle r){
        r.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent t) {
                onRectangleClick(r);
            }
        });
        
    }
    
    public void onRectangleClick(Rectangle r){
        if(change){
                    r.setFill(Color.RED);
                    change=false;
                }
                else{
                    r.setFill(Color.BLACK);
                    change=true;
                 
                }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
