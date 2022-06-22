public class PalindromErkennenRekurisv {
    
    
    public static boolean isPalindrom(String s){
        s = s.toLowerCase();
        if(s.length() == 0){//if string.length is 0 we reached the middle of word with even number of chars
            return true;
        } else if(s.length() == 1){//if string.length is 1 we reached the middle of a word with a uneven number of chars
            return true;
        } else if(s.charAt(0) == s.charAt(s.length()-1)){//checking char at beginning and end of string if they are equal
            return isPalindrom(s.substring(1, s.length()-1));//if they are equal we remove the first and last char and check the rest of the string
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("Eure Beispiele"));
        System.out.println(isPalindrom("NeNNe"));
        System.out.println(isPalindrom("uHu"));
        System.out.println(isPalindrom("Bananab"));
        
    }
   
    
}
