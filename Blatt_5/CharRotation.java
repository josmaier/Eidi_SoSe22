public class CharRotation {

    public static int n = 3;

    public static char[] rotiereCharacterArray(char[] arr) {

        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                /*
                 If the letter saved in arr[i] would result in going 
                 over 90 after ading n instead substract a set amount
                 to recieve alphabetically correct char
                 */
                if ((arr[i] + n) > 90) {
                    arr[i] -= (26 - n);
                } else {
                    arr[i] += n;
                }
            } else if(97 <= arr[i] && arr[i] <= 122){
                if ((arr[i] + n) > 122) {//same as above
                    arr[i] -= (26 - n);
                } else {
                    arr[i] += n;
                }
                
            }
           
        }
        
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'Z'};

        rotiereCharacterArray(arr);
    }

}
