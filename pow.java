public class Main {

    
        public double myPow(double x, int n) {
            if (n == 0) {
                return 1;
            }
            double d = myPow(x * x, n / 2);
            if (n % 2 == 1) {
                d *= x;
            } else if (n % 2 == -1) {
                d /= x;
            }
            
            return d;
        }
}
