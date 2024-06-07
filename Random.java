

 import  java .util.Scanner;

 
public class Random{
public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
     int userNumber=0;

    int myNumber=(int)(Math.random()*100);
    do{
        System.out.println("guess any number:");
         userNumber=sc.nextInt();
        if(userNumber==myNumber){
            System.out.println("wooh corect");
            break;

        }
        else if(userNumber>myNumber){
           System.out.println("your numbr is too large");
        }
        else{
            System.out.println("YOUR NUMBER IS SMALL");
        }
    }while(userNumber>=0);
    System.out.println("my number was:");
    System.out.println(myNumber);
}
 }

