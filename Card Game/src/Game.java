//idea is:
//user inputs number of players and hand size
//all values are summed, highest value wins
//first player has precedence for tied scores
public class Game {
    public static void main(String[] args){
        //inputs shall be for hand size
        if (args.length!=2){
            System.err.println("Please only provide two command line argument");
            System.exit(1);
        }

        int handSize = Integer.parseInt(args[0]);
        int playerCount = Integer.parseInt(args[1]);
        if ((handSize*playerCount) > 52){
            System.err.println("There are only 52 cards in a deck, please reconcile the inputs such that the" +
                    "product of the two is less than 52.");
            System.exit(1);
        }
        Deck a = new Deck();
        a.Shuffle();
        Hand[] playerHands = new Hand[playerCount];
        for (int i = 0; i < playerCount; i++) {
            playerHands[i] = a.getHand(handSize);
            System.out.println(playerHands[i].toString());
        }
        int[] scores = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            scores[i] =0;
            for (int card = 0; card < handSize; card++) {
                Card c = playerHands[i].getCard(card);
                int add = c.getRank();
                scores[i]+=add;
            }
        }
        //compare the scores within the array...
        int leader=0;
        //go through each score in the array
        for (int i = 0; i < scores.length; i++) {
            //then compare it to the others
            int moo = scores[i];
            int runningCount=0;
            for (int j = 0; j < scores.length; j++) {
                if (j!=i){
                    int boo = scores[j];
                    if (moo>boo) {
                        runningCount++;

                    }
                    if (moo<=boo){
                        runningCount=0;
                    }
                }
                if (runningCount == scores.length - 1) {
                    leader = i;
                   break;
                }
            }

        }
        System.out.println("Player "+(leader+1)+" is the winner, with a sum total of "+ scores[leader]+" points!");
    }
}




