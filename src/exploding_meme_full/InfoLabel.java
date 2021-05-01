package exploding_meme_full;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;

public class InfoLabel extends Label
{
    public final static String FONT_PATH = "resource/kenvector_future.ttf";
    public final static String BACKGROUND_IMAGE = "resource/yellow_button13.png";

//Label setText("")
    public InfoLabel(String text)
    {
        setPrefHeight(49);
        setPrefWidth(380);
        setText(text);
        setWrapText(true);
        setLabelFont();
        setAlignment(Pos.CENTER);


        BackgroundImage backgroundImage = new BackgroundImage(new Image(BACKGROUND_IMAGE,380,49, false, true),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,null);
        setBackground(new Background(backgroundImage));
    
    }

    private void setLabelFont()
    {
        try {
        setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)),15) );
        } catch (FileNotFoundException e) {
            setFont(Font.font("Verdana",15));
        }
    }




}
