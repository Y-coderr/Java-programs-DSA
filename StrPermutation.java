public class StrPermutation{
    public static void findPermutation(String str,String ans){
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            Char curr = str.CharAt(i);
            //abcd => "ab"+"de" = abde
            String newstr = str.substring(0,i)+str.substring(i);
            findPermutation(newstr,ans+curr);
        }
    }
    public static void main(String []args){
        String str = "abc";
        findPermutation(str, "");
    }
}