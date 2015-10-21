
public class Compare
{
    /** description of instance variable x (add comment for each instance variable) */
    
   

    public static void main(String[] arg)
    
    {  String word1 = "catalog";
         String word2 = "cat";
        if (word1.compareTo("aaa")< 0)
        {
            System.out.println("word1 is lexicographically less than \"aaa\"");
        }
        else if(word1.compareTo("aaa") == 0)
        {
            System.out.println("word1 is lexicographically equal \"aaa\"");
        }
        else
        {
            System.out.println("word1 is lexicographically greater than \"aaa\"");
        }
        
        if (word1.compareTo(word2)< 0)
        {
            System.out.println("word1 is lexicographically less than word2");
        }
        else if(word1.compareTo(word2) == 0)
        {
            System.out.println("word1 is lexicographically equal to word2");
            
        }
        else
        {
            System.out.println("word1 is lexcographically greater than word2");
        }
        
        String sub1;
        String sub2;
        
        sub1 = word1.substring(0,4);
        
        
        if (sub1.equals(word2))
        {
            System.out.println("word1 and word2 have the same three-letter prefix");
        }
        else
        {
            System.out.println("word1 and word2 do not have the same three-letter prefix");
        }
    }

}
