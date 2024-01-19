import java.util.Arrays;

public class Deck {
    int index = 52;
    Card[] deck = new Card[52];
    //build a deck constructor
    public Deck(){
        //need to build an array....wait,,,, I don't need to make the private var
        //now iterate
        int j = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank < 14; rank++) {
                deck[j] = new Card(suit, rank);
                j++;
            }

        }

        }
    public String toString(){
        //i don't understand how the tostring of card would help me if I'm just printing..
        //wait what am I even printing ohhh im returning each card in the deck
        //make a for loop and print the to String....... wait it needs to return a string
        String holdthis = "";
        for (int i =0; i<52; i++){
            //Deck[i] holds the address for a card object how do i follow the address into the card referenced
            holdthis += deck[i].toString() + "\n";
        }
        return holdthis;
    }
    public void Shuffle(){
        for (int i = 51; i >1 ; i--) {
            int temp = ((int) (Math.random()*i));
            Card hold = deck[temp];
            deck[temp]=deck[i]; deck[i]=hold;


        }
    }
    public Card getCard(int i){
        //i need this to pull a card from the deck object
        return deck[i];
    }

    public Hand getHand(int n){
        if (n>index-1){
            System.err.println("You can only draw up to the deck size");
            System.exit(1);
        }
        Hand x = new Hand(n);
        for (int i = 0; i < n; i++) {
            x.addCard(deck[index-1]);
            index--;
        }
        return x;
    }


}
