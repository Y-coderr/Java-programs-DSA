public class KMPalgorithm {
    public static boolean kmp(String str , String pattern){
        char [] strA = str.toCharArray();
        char [] patternA = pattern.toCharArray();
        int [] lps = new int[patternA.length];
        lps( lps, patternA);
        int i=0;
        int j=0;
        while(strA.length>i){
           if(strA[i] == patternA[j]){
            i++;
            j++;
           }
           
           if(j==patternA.length){
             j = lps[j-1];
             return true;
            
           }else if(strA[i] != patternA[j]){
            if(j != 0){
                j = lps[j-1];
            }else{
                i++;
            }
            
           }
        }

        return false;
    }

    //lps calculate
    public static void lps(int [] lps , char [] pattern){
        int length=0;
        lps[0]=0;
        int i =1;
        while(i<lps.length){
            if(pattern[i]== pattern[length]){
                length++;
                lps[i]= length;
                i++;
            }else{
                if(length!=0){
                    length = lps[length-1];

                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "ABABCD";
        String pattern = "ABCD";

        System.out.println(kmp(str, pattern));
    }
}
