
import java.util.*;

/**
* 
*/
public class client {

/**
* Default constructor
*/
public client() {
}

public static void main(String args[]){
    abstractfactory af;
    address a;
    phoneno p;
    Scanner s=new Scanner(System.in);
    String choice;
    System.out.println("Enter your choice(US , IN):");
    choice=s.nextLine();
    if(choice.compareToIgnoreCase("US")==0){
        af=new usfactory();
        a=af.getaddress();
        p=af.getphoneno();
        a.printaddress();
        p.printphoneno();
    }
    else if(choice.compareToIgnoreCase("IN")==0){
        af=new infactory();
        a=af.getaddress();
        p=af.getphoneno();
        a.printaddress();
        p.printphoneno();
    }
    else{
        System.out.println("Wrong choice");
    }   
} 

}
