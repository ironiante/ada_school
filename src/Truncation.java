public class Truncation {
    /**
     * se utiliza para recortar los numeros cuando se utiliza double y float
     *
     */

    public static void main(String[] args) {
        double number1= 12.95685588654263145; // the number a truncate
        int digits = 4; // number of digits to take after decimal
        System.out.println(" the number before truncation is: " + number1);
        truncateNumber(number1,digits);

    }

     static void truncateNumber(double n,int decimalplace){
     n = n*Math.pow(10,decimalplace); // moves the decimal to the right
     n=Math.floor(n);     //determines the floor value
     n = n/Math.pow(10,decimalplace);//dividing the floor value by 10 to the power decimalplace
        System.out.println("the number after truncation is: " + n);
    }
}
