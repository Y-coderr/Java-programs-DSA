public class PalindromeString{
    public static void CheckString(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
               System.out.println("string is not palindrome");
            }
            else{
                System.out.println("String is palindrome");
            }
        }
    }
    public static void main(String args[]){
        String str = "pop";
        CheckString(str);
    }
}