import java.util.concurrent.TimeUnit;

public class IntegralRekursiv {

    static double result = 0;
    static double intervall = 0;
    static int n = 0;

    public static double integralRekursiv(double a, double b, double untereGrenze, double obereGrenze){
        if(b == a){
            return 0;
        } else if((b-a) <= 0.01 && (b + intervall) <= obereGrenze){
            result += (b-a) * (Math.pow(a, 2));
            intervall = (b - a);
            a = b;
            b += intervall;
            return integralRekursiv(a, b, untereGrenze, obereGrenze);
        }  else if ((b-a) > 0.01 && (b + intervall) <= obereGrenze){
            return integralRekursiv(a, ((a + b)/2), untereGrenze, obereGrenze);
        } else {
            double resTemp = result;
            result = 0;
            intervall = 0;
            return resTemp;   
        }
    }

    
        public static void main(String[] args) {
            System.out.println(integralRekursiv(0, 1, 0, 1));
        }
    
    } 
