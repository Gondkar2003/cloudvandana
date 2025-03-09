import java.util.*;
public class anagram
{
    public static boolean isanagrams(String str1, String str2)
    {
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length())
        return false;
        
        char charArray1[]=str1.toCharArray();
        char charArray2[]=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sc.next();
        System.out.println("Enter the second string:");
        String str2=sc.next();
        if(isanagrams(str1,str2))
        {
            System.out.println("Output:true");
        }
        else
        {
            System.out.println("Output:False");
        }
        
    }
}