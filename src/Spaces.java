/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Spaces 
{
    public String spaces(String mod)
        {
            String guess = mod;
            StringBuilder result = new StringBuilder();
            if (guess.length() > 0) 
            {
                result.append(guess.charAt(0));
                for (int i = 1; i < guess.length(); i++) 
                {
                    result.append(" ");
                    result.append(guess.charAt(i));
                }
            }
            return result.toString();
        }
}
