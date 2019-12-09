
import java.util.Random;


public class pickWord 
{
    private String guess;
    public StringBuilder underScore;
    private String underString;
    private int tries;
    private int score;
    
    public pickWord()
    {
        tries = 6;
    }

    public String getGuess() 
    {
        return guess;
    }
    public void setGuess(String guess) 
    {
        this.guess = guess;
    }
    
    //StringBuilder underscore = new StringBuilder();

    public StringBuilder getUnderscore()
    {
        return underScore;
    }
    public void setUnderscore(StringBuilder underscore) 
    {
        this.underScore = new StringBuilder(underscore);
        this.underScore = underscore;
        this.underString = underscore.toString();
        //String myUnderscore= underscore.toString();
    }
    
    public String getUnderstring()
    {
        return underString;
    }
    public void setUnderString(String underString) 
    {
        this.underString = underString;
    }

    public int getTries() 
    {
        return tries;
    }
    public void setTries(int tries) 
    {
        this.tries = tries;
    }

    public int getScore() 
    {
        return score;
    }
    public void setScore(int score) 
    {
        this.score = score;
    }
    
    
    public void guessWord()
    {
        Spaces spaces = new Spaces();
        //String wordsBank[] = {"computer", "java", "activity", "silence"};
        String wordsBank[] = {"java", "java"};
        Random myRand = new Random(); 
        int n = myRand.nextInt(wordsBank.length);
        if(wordsBank[n] != "null")
        {
            /*
            guess = spaces.spaces(wordsBank[n]);
            underscore.append(guess.replaceAll("\\S", "_"));
            */
            setGuess(spaces.spaces(wordsBank[n]));
            this.underScore = new StringBuilder(guess.replaceAll("\\S", "_"));
            setUnderString(this.underScore.toString());
            /*StringBuffer strbld = new StringBuffer(guess.replaceAll("\\S", "_"));
            setUnderscore(strbld);*/
            //underScore = guess.replaceAll("\\S", "_");    doesn't work
            wordsBank[n] = "null";
        }
    }
    
    
}
