package RGMCode;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello fishis!");
    }


    public static int add(int a, int b){
        return a+b;
    }

    public static boolean checkValue100(int checkNum){
        return checkNum > 100;
    }



    /*User gibt sein Alter ein und nach einer rüfung werden
    * folgende Werte zurückgegeben
    * unter 14 = Kind
    * zwischen 14 und 16 = Minderjährig
    * zwischen 16 und 18 = Jugendlich
    * 18+ Erwachsen
    * */

    public static String checkAge(int age) {
        if (age < 16 && age > 13){
            return "Minderjährig";
        } else if (age < 18 && age > 15) {
            return "Jugendlich";
        } else if (age >= 18) {
            return "Erwachsen";
        }
        return "Kind";
    }


}