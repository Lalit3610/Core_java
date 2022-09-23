import java.util.Scanner;
class NotSufficientFundException extends Exception{}
public class UserDefinedException {
    public static void main(String[] args){
        int CBal,WBal;
        CBal=700;
        Scanner input=new Scanner(System.in);// decleare the object
        System.out.println("Add the amount you want to withdraw: ");// print the mssage 
        WBal =input.nextInt();
        if(WBal>=CBal){
            try{
            throw new NotSufficientFundException();
        }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Insufficient Balance: Rs"+CBal);
        }
        }
        else{
            CBal=CBal-WBal;
            System.out.println("Your Current balance is: Rs"+CBal);
        }

    }    
}