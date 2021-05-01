package model;

import java.io.FileInputStream;
import  java.io.FileNotFoundException;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.Blend;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.effect.DisplacementMap;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.FloatMap;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Font;


public class SpaceRunnerButton extends Button
{
    private final String FONT_PATH = "testjavafx-01/src/model/resource/kenvector_future.ttf";
   private final String BUTTON_PRESSED_STYLE = "-fx-background-color: transparent; -fx-background-image: url('/model/resource/yellow_button03.png');";
    private final String BUTTON_FREE_STYLE = "-fx-background-color: transparent; -fx-background-image: url('/model/resource/yellow_button04.png');";

   

    public SpaceRunnerButton(String text,int height,int width) 
    {
        setText(text);
        setButtonFont();
        setPrefHeight(height); //49
        setPrefWidth(width); //190
        setStyle( BUTTON_FREE_STYLE);
        initializeButtonListeners();
    }

    private void setButtonFont()
    {
        try {
            setFont(Font.loadFont(new FileInputStream(FONT_PATH), 23));
            
        } catch (FileNotFoundException e) 
        {
            setFont(Font.font("Verdana",23));
           
        }
    }

    private void setButtonPressedStyle()
    {
        setStyle(BUTTON_PRESSED_STYLE);
        setPrefHeight(45);
        setLayoutY(getLayoutY()+4);
    }

    private void setButtonReleasedStyle()
    {
        setStyle(BUTTON_FREE_STYLE);
        setPrefHeight(45);
        setLayoutY(getLayoutY()-4);
    }

    private void initializeButtonListeners()
    {
        setOnMousePressed((event) -> 
        {
            setButtonPressedStyle();
            /*
            System.out.println("Pressed");
           if(event.getButton().equals(MouseButton.PRIMARY))
           {
               
           }*/
        });

        setOnMouseReleased((event) -> 
        {
            setButtonReleasedStyle();
            /*
            System.out.println("Releaesd");
           if(event.getButton().equals(MouseButton.PRIMARY))
           {
              
           }*/
        });

        setOnMouseEntered((event) -> 
        {
           setEffect(new DropShadow());// เงา
         //  setEffect(new Bloom());//มีแสง
        //   setEffect(new BoxBlur()); // เบลอ
          // setEffect(new ColorInput()); // กระพริบ
        //  setEffect(new GaussianBlur()); //เบลอหนัก
         // setEffect(new Glow()); //แสงออกนิดหน่อย
           
          
        });

        setOnMouseExited((event) -> 
        {
           setEffect(null);
         
        });
    }

    

    






}

