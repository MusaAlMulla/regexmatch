package regexmatch;

public class RegexMatch {
    
    public static boolean isTrue(String str){
        return str.matches("[tT]true");
    }
    public static boolean containsFalse(String str){
        return str.matches(".*false.*");
    }
    
    
    public static void main(String[]args)
    {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("howareyou"));
    }
    
  
    
}
