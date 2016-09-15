package regexmatch;

public class RegexMatch {
    
    public static boolean isTrue(String str){
        return str.matches("[tT]true");
    }
    
    public static void main(String[] args) {
        System.out.println(isTrue("false"));
    }
    
}
