public class Bag {
    private int[] b;
    //public Bag symmetricDifference( Bag other ) should return a new Bag object which contains the symmetric difference
    // between this and the other Bag.
    // The symmetric difference is defined as the Bag containing all the elements(potentially duplicated) that are in
    // THIS Bag but are not in other and all the elements that are in other but not
    // in this Bag.
    public Bag(int[] a){
        b= new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
    }
    public boolean contains(int v){
        //returns true if v is in this.bag
    }
    public int count(int v){
        //returns int corresponding to number of times v appears in this.bag
    }
    public int[] distinctValues(){
        //returns an int[] containing all values which only appear once
    }
    public Bag copy(){
        //returns a copy of this.Bag
    }
    public boolean insert(int v){
        //inserts int v into the bag
        //returns true if int v already exists in bag, else false
        //resizes the bag so that it is of correct length(only of size to include all values i.e. no nulls, no omit)
    }
    public boolean rmv(int v){
        //if (v exists) removes && resizes the bag so that all and only remaining ints remove
        //returns true if v exists
        //else no removal && no resize; return false
    }
    public Bag symmetricDifference(Bag other){

        //ATTN GRADER: made two methods, this is the original, alternativeSymmetricDifference is cleaner
        //To complete this collection of methods, please write the instance method symmetricDifference described below
        // for the class Bag.  You may use the already defined methods included in the provided code to write this method.
        //public Bag symmetricDifference( Bag other ) should return a new Bag object which contains the symmetric difference
        // between this and the other Bag.

        // The symmetric difference is defined as the Bag containing all the elements(potentially duplicated) that are in
        // THIS Bag but are not in other and all the elements that are in other but not
        // in this Bag.

        //so there will be a new bag containing only unique values
        Bag a2 = this.copy();
        Bag b2 = other.copy();
        //remove copies of ints from other.bag compared to this
        for (int i = 0; i < a2.b.length; i++) {
            while (b2.rmv(a2.b[i])){

            }
        }
        //remove copies of ints from this.bag compared to other
        for (int i = 0; i < b2.b.length; i++) {
            while (a2.rmv(b2.b[i])){

            }
        }
        //assuming my logic is correct, then we have two bags with no overlap of numbers between them
        //now we just need one new bag made up of the other two

        //make new bag out of two int[]

        int[] a3 = new int[a2.b.length];
        int[] b3 = new int[b2.b.length];
        for (int i = 0; i < a3.length; i++) {
            a3[i]=a2.b[i];
        }
        for (int i = 0; i < b3.length; i++) {
            b3[i]=b2.b[i];
        }
        //now we have a2 and b2 as two int[] called a3 && b3 respectively

        //combine
        int[] c =new int[(a3.length)+(b3.length)];
        for (int i = 0; i < a3.length; i++) {
            c[i]=a3[i];
        }
        for (int i = a3.length; i < c.length; i++) {
            c[i]=b3[i-a3.length];
        }
        //now we have one massive int[] containing the contents of a3 and b3, make new bag
        Bag shiny = new Bag(c);
        return shiny;
    }
    public Bag alternativeSymmetricDifference(Bag other){

        //this is an alternative which is simpler, however, this version does not copy either bag, instead,
        //changes the two bags and yields an output of this.bag containing symmetrical differences and other.bag
        //essentially being useless

        Bag a2 = this.copy();
        Bag b2 = other.copy();

        for (int i = 0; i < a2.b.length; i++) {
            while(b2.rmv(a2.b[i])){

            }

        }
        for (int i = 0; i < b2.b.length; i++) {
            while(a2.rmv(b2.b[i])){


            }
        }
        //yields two bags containing no overlap
        //combine into this.bag
            while (b2.b.length!=0){
                a2.insert(b2.b[0]);
                b2.rmv(b2.b[0]);
            }
    }
}
