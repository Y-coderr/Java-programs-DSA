public class LongestWordInPrefixes {

    public static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        Node(){
         for(int i=0;i<26;i++){
            children[i] = null;
         }
        }
    }

    public static Node root = new Node();
    public static void insert(String word){

        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }

            curr = curr.children[idx];
        }
    }

    public static String ans ="";
    public static void longestWord(Node root,StringBuilder temp){
        for(int i =0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);

                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    
    public static void main(String[] args) {
        String []str = {"a","ap","banana","app","apply","apple"};
        for(int i=0;i<str.length;i++){
          insert(str[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
