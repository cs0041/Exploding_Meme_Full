package exploding_meme_full;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private String deckName;
    
    public Deck(String deckName) {
        this.deckName = deckName;
    }
    
    public final void refill() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(new Card(i));
            }
        }
    }
    
    public boolean shuffle(){
        try {
            Collections.shuffle(cards);
        } catch (Exception e) {
            return false;
        } finally {
            return true;
        }
    }

    public Card drawCard() {
        int top = 0;
        Card card = this.cards.get(top);
        deleteCard(top);
        return card;
    }
    
    public Card pickCrad(int index) {
        Card card = this.cards.get(index);
        deleteCard(index);
        return card;
    }
    
    public boolean deleteCard(int index){
        try {
            this.cards.remove(index);
        } catch (Exception e) {
            return false;
        } finally {
            return true;
        }
    }
    
    public boolean addCard(Card newCard, int index){
        try {
            this.cards.add(index, newCard);
        } catch (Exception e) {
            return false;
        } finally {
            return true;
        }   
    }
    
    public int getValueOfCard(){
        return this.cards.size();
    }

    public String getDeckName() {
        return deckName;
    }
    
    
}
