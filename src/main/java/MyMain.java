public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        if (x>y && x>z) {
            return(x);
        }
        else if (y>x && y>z) {
            return(y);
        }
        else {
            return(z);
        }
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        return (Math.random()>=0.5);
        /*double rand_val=Math.random();
        if (rand_val>=0.5){
            return true;
        }
        else{
            return false;
        }*/
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        double rand_val=Math.random();
        if (rand_val>0.7){
            return true;
        }
        else{
            return false;
        }
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        //(int((Math.random()*6)+1));
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {

    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        return;
    }

    public static void main(String[] args) {
        // Test the add5 method
        /*int x = 2;
        int y = 3;
        int z = 5;
        int big=(findBiggestNumber(x,y,z));
        System.out.println(big);*/

        //System.out.println(flipCoin());
        System.out.println(flipWeightedCoin());
    }
}