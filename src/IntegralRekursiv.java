/* import java.util.concurrent.TimeUnit;

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
    
    }  */
    import java.util.concurrent.TimeUnit;

    public class IntegralRekursiv {
    
        static double result = 0;
        static double intervall, help = 0;
        static int n = 0;
    
        /* public static double integralRekursiv(double a, double b, double untereGrenze, double obereGrenze){
            
            if(b == a){
                return 0;
            } else if((b-a) <= 0.01){
                result += (b-a) * (Math.pow(a, 2));
                intervall = (b - a);
                a = b;
                b += intervall;
                return integralRekursiv(a, b, untereGrenze, obereGrenze);
            }  else if ((b-a) > 0.01){
                return integralRekursiv(a, ((a + b)/2), untereGrenze, obereGrenze) + integralRekursiv(((a + b)/2), b, untereGrenze, obereGrenze);
            } else {
                return result;   
            }
        } */

        public static double IntegralRekursiv2(double a, double b){
            if(a == b){
                return 0;
            } else if ((b-a) <= 0.01) {
                return (b-a) * (a*a);
            } else {
                return IntegralRekursiv2(a, ((a + b)/2)) + IntegralRekursiv2(((a + b)/2), b);
            }
        }
    
        
        /* public static double IntegralRekursivExitPls(double res){
            if (n < 1){
                n++;
                return res;
            } else {
                return 0;
            }
        } */
        
            public static void main(String[] args) {
                //System.out.println(integralRekursiv(0, 1, 0, 1));
                System.out.println(IntegralRekursiv2(0, 1));
            }
        
        } 