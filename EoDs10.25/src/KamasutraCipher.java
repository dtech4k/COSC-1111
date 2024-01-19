
public class KamasutraCipher {
    //keys are: THEQUICKBROWN && FXJMPSVLAZYDG; using these bc it's readily available and contains the entire
    //alphabet with no repeats

    //You can ignore the indented comments, they're just my thoughts
        //I put some thought into randomizing the keys... but then I remembered why KMI exists lmao... so these are
        //static keys.
        //though I guess if you clear the CLargs and leave no record of the keys it'd be useless to decrypt messages
        //encrypted this way. Except for that's where the father of computer science came into play
        // s/o to Sir Alan Turing
        //though I'm pretty sure you could've brute-forced this particular cipher pretty easily, but I'm not sure how
        //to go about it
    public static void main(String[] args){
        //parse out the keys
        String key1 = args[0].toUpperCase();
        String key2 = args[1].toUpperCase();
        //parse out any number of messages to be encrypted
        //store the messages to be (en/de)coded in an array
        String[] messages = new String[args.length-2];
        for (int numMessages = 2; numMessages < args.length; numMessages++){
            messages[numMessages-2] = args[numMessages].toUpperCase();
        }
        //now build our cipher based off of the two keys
        //for ease of thinking I'm going to go ahead and place them into two arrays
        char[] key1arr = new char[13];
        for (int key1char =0; key1char<13; key1char++){
            key1arr[key1char] = key1.charAt(key1char);
        }
        char[] key2arr = new char[13];
        for (int key2char =0; key2char<13; key2char++){
            key2arr[key2char] = key2.charAt(key2char);
        }

        //this for loop populated bc intelliJ told me to do it. but it makes sense to me
        //for (a) message in (the list of) messages
        for (String message : messages) {
            //now we go into the array of messages, grab each one in sequence, iterate through
                //I'm gonna hold onto a numbercorresponding to the length of the message currently being decoded
                int number = message.length();
                //edit: superflous layer of loops removed upon debugging, praise the Machine.God


                //new array of chars where my (de/en)crypted message lives
                char[] outputtobeprintedinasecond = new char[number];
                //for loop to fill the (de/en)crypted empty array
                for (int outputIndex = 0; outputIndex < number; outputIndex++) {
                    //just gonna grab a letter and throw it in the bucket while I'm using it
                    char Bucket = message.charAt(outputIndex);
                    //look for where the letter in the bucket lives in key1
                    int cipherIndex = key1.indexOf(Bucket);
                    //if it doesn't live in key1, find where it lives in key2
                    if (cipherIndex < 0) {
                        cipherIndex = key2.indexOf(Bucket);
                        //write whats in the same position in key1 to the output message
                        outputtobeprintedinasecond[outputIndex] = key1arr[cipherIndex];
                    } else {
                        //ditto to last comment (the one that's inside the if(){}
                        outputtobeprintedinasecond[outputIndex] = key2arr[cipherIndex];
                    }
                }
                //make that monstrous array of chars into a workable string
                String output = String.valueOf(outputtobeprintedinasecond);
                //print it, exit the loop and grab the next message if need be
                System.out.println(output);
            }
        }

    }
