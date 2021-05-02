/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploding_meme_full;

import java.util.ArrayList;

/**
 *
 * @author Smart
 */
public class Lobby {
    public String playerName;
    public String code;
    public ArrayList<String> playerNames = new ArrayList<String>();
    public Game game;
    public static boolean isRoomFull;
    public static boolean isInLobby;
    public static boolean isHead;
    public static boolean isJoin;
    public static boolean isCreate ;
    public static boolean isInGame;

    public Lobby(String playerName) {
        this.playerName = playerName;
        this.playerNames.add(playerName);
    }
    
    public Lobby(String playerName, String code) {
        this.playerName = playerName;
        this.code = code;
        //public
    }
    
    public void startGame(){
        this.game = new Game(playerName, playerNames);
    }
}
