/*
Write a Java program that takes a number as input and prints its multiplication
table upto 10.
 */

public class Question_11 {
    public static void main(String[] args)  {
int number = 8;
        for( int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
}
