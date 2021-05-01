package exploding_meme_full;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
// import model.GameSubScene;
// import model.InfoLabel;
// import model.RenewButton;
// import model.ShipPicker;
// import model.SpaceRunnerButton;
// import model.SHIP;


public class ViewManger {

    private static final int HEIGHT = 768;
    private static final int WIDTH =  1280 ;// 1366 768    768    1024  1280 768
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;
    private AnimationTimer TimerLoop;
    private GridPane gridPane1;
    private GridPane gridPane2;

    
    public ViewManger() 
    {
        mainPane = new AnchorPane();

        mainScene= new Scene(mainPane,WIDTH,HEIGHT);

        mainStage = new Stage();
        mainStage.setScene(mainScene);

        createBackground();
        createButtons();
        createLogo();
        createNameGame();
        //createSubscens();
        createGameLoop();

        
    }

    public Stage getMainStage() {
        return mainStage;
    }

    private void createButtons()
    {
        createPLAYBUTTON();
        createHelpButton();
        createExitButton();
    }
    
    private ImageView createModelButton(String URL,int x,int y)
    {
        ImageView button = new ImageView(URL);
        button.setLayoutX(x);
        button.setLayoutY(y);

        button.setOnMouseEntered((event) -> 
        {
            button.setEffect(new Bloom());
        });
        button.setOnMouseExited((event) -> 
        {
            button.setEffect(null);
        });

        button.setOnMousePressed((event) -> 
        {
            button.setLayoutY(button.getLayoutY()+4);
        });

        button.setOnMouseReleased((event) -> 
        {
            button.setLayoutY(button.getLayoutY()-4);
        });
        mainPane.getChildren().add(button);

        return button;
    }

    private void createPLAYBUTTON()
    {
        createModelButton("resource/PLAYBUTTON.png",520,510).setOnMouseClicked((event) -> 
        {
            mainStage.close();
        });
    }
   
    private void createHelpButton()
    {
        createModelButton("resource/HELPBUTTON.png",520,590).setOnMouseClicked((event) -> 
        {
          
        });
    }

    private void createExitButton()
    {
        createModelButton("resource/EXITBUTTON.png",520,670).setOnMouseClicked((event) -> 
        {
           mainStage.close();
        });
    }

    private void createBackground()
    {
        gridPane1 = new GridPane();
        gridPane2 = new GridPane();

        for(int i = 0 ;i<25;i++)
        {
            ImageView backgroImageView1 = new ImageView("resource/BlueRenew.jpg");
            ImageView backgroImageView2 = new ImageView("resource/BlueRenew.jpg");
            GridPane.setConstraints(backgroImageView1, i%5,i/5);
            GridPane.setConstraints(backgroImageView2, i%5,i/5);
            gridPane1.getChildren().add(backgroImageView1);
            gridPane2.getChildren().add(backgroImageView2);
        }

        gridPane2.setLayoutY(-1280);

        mainPane.getChildren().addAll(gridPane1,gridPane2);

    }
    
    private void createLogo()
    {
        ImageView logo = new ImageView("resource/logoCatTNT.png");
        logo.setLayoutX(-10);
        logo.setLayoutY(-20);


        logo.setOnMouseEntered((event) -> 
        {
           logo. setEffect(new Bloom());

          
        });

        logo.setOnMouseExited((event) -> 
        {
           logo.setEffect(null);
        });

        mainPane.getChildren().add(logo);
    }

    private void createNameGame()
    {
        ImageView logo = new ImageView("resource/Level.png");
        logo.setLayoutX(470);
        logo.setLayoutY(0);


        logo.setOnMouseEntered((event) -> 
        {
           logo.setEffect(new Bloom());

        });

        logo.setOnMouseExited((event) -> 
        {
           logo.setEffect(null);
        });

        mainPane.getChildren().add(logo);
    }

    private void moveBackground()
    {
        gridPane1.setLayoutY(gridPane1.getLayoutY()+0.5);
        gridPane2.setLayoutY(gridPane2.getLayoutY()+0.5);

        if(gridPane1.getLayoutY() >= 1280)
        {
            gridPane1.setLayoutY(-1280);
        }

        if(gridPane2.getLayoutY()>=1280)
        {
            gridPane2.setLayoutY(-1280);
        }
    }


    private void createGameLoop()
    {
        TimerLoop = new AnimationTimer(){

            @Override
            public void handle(long now) {    
                moveBackground();
               // checkmouseposition();
            }
            
        };
        TimerLoop.start();
    }

    private void checkmouseposition()
    {
        mainScene.setOnMouseMoved((event) -> 
        {
            String msg =
            "(x: "       + event.getX()      + ", y: "       + event.getY()       + ") -- " +
            "(sceneX: "  + event.getSceneX() + ", sceneY: "  + event.getSceneY()  + ") -- " +
            "(screenX: " + event.getScreenX()+ ", screenY: " + event.getScreenY() + ")";

           System.out.println(msg);
        });
    }

  

}
