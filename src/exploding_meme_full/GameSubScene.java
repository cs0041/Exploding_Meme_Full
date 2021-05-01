package exploding_meme_full;

import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.util.Duration;

public class GameSubScene extends SubScene{

    private final String FONT_PATH = "resource/kenvector_future.ttf";
    private final String BACKGROUND_IMAGE = "resource/yellow_panel.png";
    
    private  boolean isHidden = true;
    
    public GameSubScene() {
        super(new AnchorPane(),500, 500);
        //prefWidth(600);
        //prefHeight(400);

        Image backgroundImage = new Image(BACKGROUND_IMAGE,500,500,false,true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,  BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,null);

        AnchorPane root2 = (AnchorPane)this.getRoot();
        root2.setBackground(new Background(background));

        setLayoutX(1920);
        setLayoutY(220);
    }
   
    public void moveSubScence()
    {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(this);


        if(isHidden)
        {
            transition.setToX(-550);
            isHidden = false;
           
        }
        else
        {
            transition.setToX(0);
            isHidden = true;
            
        }
       

        transition.play();
    }

    public AnchorPane  getPane()
    {
        return (AnchorPane)this.getRoot();
    }
}
