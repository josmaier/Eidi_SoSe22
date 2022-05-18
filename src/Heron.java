public class Heron {

    public static double Heron(int x, int k){
        if(x > 0){
        double y = x;
        double y1 = y;
        
        
        if(k > 1){
            for (int i = 1; i <= k; i++){
                y = y1;
                y1 = (((k-1)*Math.pow(y, k))+x)/(k*Math.pow(y, (k-1)));
                if(Math.abs(y)-Math.abs(y1)<Math.pow(10, -8)){
                    return y1;
                }
            }
        }
        return y1;
    }
    return 1;

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        System.out.println(Heron(n, k));
    }

}
