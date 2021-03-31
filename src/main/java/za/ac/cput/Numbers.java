package za.ac.cput;

/**@author Baron Mukenyi
 * 217163742
 * ADP Assignment 1
 * 31 March 2021
 */

public class Numbers {
    public String Numbers;

    public long MultiPlyNumbers(long a, long b){
        return a * b;
    }

    public int addNumbers(int x, int y){
        return x + y;
    }

    public String addNumbers(String number1, String number2){
        return number1 + number2;
    }

    public String number;
    public boolean equalsNum(Object num){
        if(this.number.equalsIgnoreCase(((Numbers)num).number)){
            return true;
        }
        return false;
    }
}