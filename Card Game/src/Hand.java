public class Hand {
    private final Card[] hand= new Card[52];
    public Hand(int n){
        Card[] hand = new Card[n];

    }
    Card[] deck = new Card[52];
    public int capacity(){
        return hand.length;
    }

    public int size(){
        int number =0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i]==null){break;}
            number++;
        }
        return number;
    }

    public String toString(){
        String holdthis = "";
        for (int i =0; i<52; i++){
            //hand[i] holds the address for a card object, concatonate to holdthis
            //this is kinda hacky but yknow. it works
            if (hand[i]==null){
                break;
            }
            holdthis += hand[i].toString() + "\n";
        }
        return holdthis;
    }

    public void addCard(Card c){
        //deck[index] is the top of the deck post shuffle
        if (size()==capacity()){
            System.err.println("Don't draw any more");
            System.exit(1);
        }
        hand[size()] = c;
    }

    public Card getCard(int i){
        return hand[i];
    }


}
