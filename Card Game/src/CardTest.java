public class CardTest {
    public static void main(String[] args) {
        // Create a new Card with a random suit and a random rank
        Card a = new Card((int) (Math.random() * 4), 1 + (int) (Math.random() * 13));
        System.out.println("a: " + a.toString());

        // Create a second Card with the same suit and rank as the Card a
        Card b = new Card(a.getSuit(), a.getRank());
        System.out.println("b: " + b); // b.toString() is called automatically

        Card c;
        // A new random Card
        c = new Card((int) (Math.random() * 4), 1 + (int) (Math.random() * 13));
        System.out.println("c: " + c);

        // Testing equality with equals()
        System.out.print("a is ");
        if (! a.equals(c))
            System.out.print("not ");
        System.out.println("the same as c.");

        System.out.print("a is ");
        // Comparison with compareTo()
        int comparison = a.compareTo(c);
        if (comparison == -1) {
            System.out.print("less than ");
        } else if (comparison == 1) {
            System.out.print("greater than ");
        } else {
            System.out.print("the same as ");
        }
        System.out.println("c.");
    }
}