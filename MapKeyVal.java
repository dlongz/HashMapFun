import java.util.HashMap;
import java.util.Set;

/**
 * MapKeyVal
 */
public class MapKeyVal {
    public static void main(String[] args) {
        HashMap<String,String> trackList = new HashMap<String,String>();
        
        // Insert key,val into HashMap
        trackList.put("...Falling?", 
            """
            Don't want a girl whose only talent is just looking good
            Had to switch the paradigm, I know the booking good
            Don't gotta explain when it's understood
            Only thing I wish, I wish, I wish, I wish you good
        
            Right back where we left off
            Sit down this my Ted Talk
            My bad, I took so long but
            Life got in the way (Yeah)
            """);
        trackList.put("Been About It", """
            I'm a young man gettin' what I came for
            'Cause I work hard, I got everything I prayed for
            Money came fast, so, now take my day slow
            Me and 'Crae just like MJ, G and Abel (Talk that talk)
            I just bought her flowers on a weekday (Ooh)
            Baby, why would I cheat? You my cheat day (Ooh)
            You a treat (That's right), you a snack, uh
            Fighting with your jeans 'cause you got it like that
            Well, okay, tell me: whatcha faith matter 'bout today?
            Now I'm great 'cause I 'member when I ain't have a way
            On a date, only had enough to pay for matinée
            Now I'm straight, every mornin' feelin' like it's Saturday
            Well um, they doin' nothin', got a lot to say
            How you never had COVID, you still got no taste?
            """);
        trackList.put("You Know The Drill", """
            Aye, nothing set in stone except for the ring that's on the left hand
            Told her if ya ever cheat, I would give ya secondchance
            What you mean, second chance, that's gon' be ya nextman
            Can't have no one in them jeans, now I'm just ya ex-man
            
            If I'm cheatin, a cheetah girl will be my next plan
            Alimony and the tithe, hold ya head fam
            Don't know where we from, better check man
            You ain't from New York, you a Nets fan
            All talk, no walk, professor x man
            Streets will lift ya up and shoot ya down
            Look at X man
            All dogs go to heaven
            Rest in peace to X man
            """);
        trackList.put("It Could Be Worse", """
            I hit the gym, just opened up again, Reza, he loaded me up with two plates
            Then I went home, Baby, she made me a meal, she loaded me up with two plates
            Jump bought a whip, registered that in GA, I had to go get me new plates
            I just bought a crib, had to move outta New York, I'm really enjoying the space
            Just bought a stick, pray that I don't gotta use it, but I got it there just in case
            You know what it is, people be talkin' online, but never say that to my face
            Look at my wrist, ain't nothin' on it just yet, everything got its time and its place
            If they throw a fit when you tell 'em no, that's how you know they ain't respect you off rip
            Man, it's a trip, but hey, it could be worse (Hey)
            Say it again for them in the back, so they know for sure
            
            It could be worse
            Life is hard, I thank God, it could be worse
            Life is hard, I thank God, it could be worse
            """);

        // Get Key,Val from HashMap
        // String title = trackList.get("It Could Be Worse");
        // System.out.println(title);


        // Get keys via keySet Method. Iterate through the HashMap
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}