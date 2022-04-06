import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return ( "Good Morning,"+ name + " " +  "Mr Bruce will be right with you. ");
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Mr Bruce its , " +  date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") > -1 ) {
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        return "Will there be anything else Mr Wayne";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String party(){
        return "yes Mr Bruce the party planner will be here at noon";
    }
}

