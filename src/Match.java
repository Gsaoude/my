
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Match 
{
    HangmanGUI gui;
    int attempts = 5;
    int score = 0;
    int pos = 0;
    public String show(String guess, String underString, char letter)
    {
        gui = new HangmanGUI();
        //HangmanGUI gui = new HangmanGUI();
        pickWord pickword = new pickWord();
        StringBuilder word = new StringBuilder(guess);
        StringBuilder underScoreMod; 
        underScoreMod = new StringBuilder(underString);
        boolean damage = false;

        if(!word.toString().equals(underScoreMod.toString()))
        {
            char[] onebyone = new char[word.length()];
            word.getChars(0, word.length(), onebyone, 0);
 
            for(int i = 0; i < guess.length(); i++)
            {

                if(guess.charAt(i) == letter)
                {
                    damage = true;
                    if(underScoreMod.charAt(i)!= letter)
                    {  
                    underScoreMod.setCharAt(i, letter);
                    gui.setScore(++score);
                    }
                }
                
            }
            if(damage == false)
            {
                if(attempts >= 1)
                {
                    gui.settriesNum(attempts--);
                }
                else
                {
                    attempts = 5;
                    score = 0;
                }
            }
        }
        return underScoreMod.toString();
    }
    
    public void freq(String letter)
    {/*
        char chars[] = new char[26];
        for(char ch : chars)
        {
            if(!letter.equals(ch))
            {
                letter.getChars(0, 1, chars, pos);
                pos++;
                gui.setScore(++score);
            }
        }*/
        
        Set<Character> uniqueChars = new HashSet<Character>();
        Set<Character> repeats = new HashSet<Character>();
        for(int i = 0; i < letter.length() - 1; i++) 
        {
            if (!uniqueChars.add(letter.charAt(i)))
            {
                repeats.add(letter.charAt(i));
            }
        }

    }
}
