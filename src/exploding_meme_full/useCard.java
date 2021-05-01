package exploding_meme_full;

import java.util.ArrayList;

public class useCard {
    private static final String[] cardSet = {"ATTACK", "FAVOR", "NOPE", "SEETHEFUTURE", "SHUFFLE", "SKIP", "NORMAL1", "NORMAL2", "NORMAL3", "NORMAL4", "NORMAL5", "DEFUSE", "EXPLODINGKITTEN"};
    
    public static void card(Card card){
        effect(card.getCardId());
    }
    
    public static void card(ArrayList<Card> cards){
        switch(cards.size()) {
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
    
    private static void effect(int id){
        switch(id){
            case 0:
                //who
                Game.turnList.add("Name");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
    }
}
