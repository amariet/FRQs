/**
 * A word guessing game
 * 
 * @Kara Herson 
 * @3/1/2017
 */
public class HiddenWord
{
    private String word; //the secret word

    public HiddenWord(String s)
    {
        word = s;
    }

    public String getHint (String guess)
    {
        String toReturn = "";
        int i = 0;
        while (i < guess.length())
        {
            if (word.charAt(i) == guess.charAt(i)) 
            {
                toReturn += word.charAt(i);
            } else {
                char c = guess.charAt(i);
                boolean found = false;
                for (int j = 0; j < word.length(); j++)
                {
                    if (c == word.charAt(j))
                    {
                        found = true;
                    }
                }
                if (found)
                {
                    toReturn += "+";
                } else {
                    toReturn += "*"; 
                }
            }
            i++;
        }
               
        return toReturn;
    }
}
