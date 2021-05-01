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
    public String lobbyName;
    public String playerName;
    public String code;
    public static ArrayList<String> playerNames;
    public Game game;
    public static boolean isRoomFull;
    public static boolean isInLobby;
    public static boolean isHead;
    public static boolean isJoin;
    public static boolean isCreate ;
    public static boolean isInGame;

    public Lobby(String lobbyName) {
        this.lobbyName = lobbyName;
    }
    
    public void startGame(){
        this.game = new Game(playerName, playerNames);
    }
}
