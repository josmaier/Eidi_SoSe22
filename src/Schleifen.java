public class Schleifen {
    public static void main(String[] args) {
    

        int n = Integer.parseInt(args[0]);

        System.out.println();

        for (int i = n; i > 0; i--){
            System.out.println(i);
        }

        int x = 1;
        
        System.out.println();

        do{
            if(x%2 != 0 || x == 1){
                System.out.println(x);
            }
            x++;

        } while (x <= n);
    }
}
