package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicsApp extends Application {



    @Override
    public void start(Stage primaryStage) {
        try {
            GridPane root = new GridPane();
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            TextField rechteckWidth = new TextField();
            rechteckWidth.setPromptText("Enter the width in cm");
            TextField rechteckHeight = new TextField();
            rechteckHeight.setPromptText("Enter the Height in cm");
            TextField resultareaTextField = new TextField();
            resultareaTextField.setPromptText("Result");
            resultareaTextField.setEditable(false);
            resultareaTextField.setMouseTransparent(true);
            resultareaTextField.setFocusTraversable(false);
            resultareaTextField.setBackground(new Background(
                    new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

            TextField resultcircumTextField = new TextField();
            resultcircumTextField.setPromptText("Result");
            resultcircumTextField.setEditable(false);
            resultcircumTextField.setMouseTransparent(true);
            resultcircumTextField.setFocusTraversable(false);
            resultcircumTextField.setBackground(new Background(
                    new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

            Label widthLabel = new Label("Width");
            Label heightLabel = new Label("Height");
            Label circumferenceLabel = new Label("Circumference");
            Label areaLabel = new Label("Area");
            Label cmLabel = new Label("Centimeters");
            Label squareCmLabel = new Label("Square Centimeters");
            Button computeButton = new Button("Compute");


            root.add(heightLabel, 0, 0);
            root.add(rechteckHeight, 1, 0);
            root.add(widthLabel, 0, 1);
            root.add(rechteckWidth, 1, 1);
            root.add(computeButton, 1, 2);
            root.add(circumferenceLabel, 0, 3);
            root.add(resultcircumTextField, 1, 3);
            root.add(areaLabel,0,4);
            root.add(resultareaTextField,1,4);
            root.add(cmLabel,2,3);
            root.add(squareCmLabel,2,4);
            root.setHgap(10);
            root.setVgap(10);

            primaryStage.setTitle("Graphics App");
            primaryStage.show();

            computeButton.setOnAction(e->{

                double number1 = Double.valueOf(rechteckWidth.getText());
                double number2 = Double.valueOf(rechteckHeight.getText());
                Rectangular rect = new Rectangular(1,1,number1,number2);
                resultareaTextField.setText(String.valueOf(rect.computeArea()));
                resultcircumTextField.setText(String.valueOf((rect.computeCircumference())));
            });



        } catch(Exception e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        launch(args);
    }
}

