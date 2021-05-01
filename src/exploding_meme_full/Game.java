package exploding_meme_full;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application{
    public static boolean isHead;
    boolean isStart;
    boolean isJoin;
    boolean isCreate ;
    boolean isInGame;
    boolean isEndGame;
    boolean isRoomFull;
    boolean isInLobby;
    boolean isMyTurn;
    boolean isAttack;
    
    Deck deck;
    Deck dropedDeck;
    
    ArrayList<Player> players;
    ArrayList<String> turnList;
    
    String playerName;
    String gameRoomName;

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
