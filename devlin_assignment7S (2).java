// this program reads integer values from A text file (thefile.txt) then creates an array of size n where n is the first interger read then prints the array, then it counts the zeros,
// then it appends the array adding in all the remaining values in the file, then prints the appeneded array, and finally counts the zeros of the appened array
import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class devlin_assignment7S {
  public static void main(String[] args) throws Exception {
    
    PrintStream ps = new PrintStream("output.txt");
    
    File file = 
      new File("thefile.txt"); 
    
    
    Scanner sc = new Scanner(file); 
    
    int maxaccts=100;
    int[] acctnum = new int [maxaccts];
    double[] balance = new double [maxaccts];
    char operation='P';
    int count= readata(acctnum,balance,sc);
    printacct(acctnum,balance,count,ps);
    System.out.print("\nnumber of acounts:"+count+"\n");
    while(operation!='Q'){
      Scanner sc2 = new Scanner(file);
      
      
      
      
      menu();
      Scanner kin = new Scanner(System.in); 
      operation=kin.next().charAt(0);
      switch(operation){
        case'B':{int index=findacct(acctnum,balance,ps);
          
          break;}
        
        case'W':{withd(acctnum,balance,ps);
          break;}
        
        case'D':{deposit(acctnum,balance,ps);
          break;}
        
        case'N':{newacct(acctnum,balance,count,ps);
          break;}
        
        case'X':{delete(acctnum,balance,count,ps);
          break;}
      }
    }
    System.out.print(" you have selected Q ===> program ending\n");
    ps.print(" you have selected Q ===> program ending\n");
  }
  public static void menu(){
    System.out.print("===============\nPlease select one of the following:\n");
    System.out.print("\nW for withdrawl");
    System.out.print("\nD for deposit");
    System.out.print(" \nN for new account");
    System.out.print(" \nX for delete account");
    System.out.print(" \nB for balance");
    System.out.print("\nQ to quit\n");
  }
  
  public static void printacct(int[] acctnum,double[] balance,int count,PrintStream ps ){
    System.out.print("     acount #:           Balance:\n");
    ps.print("     acount #:           Balance:\n");
    for(int p=0; p<count; p++){
      
      System.out.printf("%10d  ",acctnum[p]);
      ps.printf("%10d  ",acctnum[p]);
      System.out.printf("%20.2f\n",balance[p]);
      ps.printf("%20.2f\n",balance[p]);
    }
  }
  
  public static int readata(int[] acctnum, double[] balance,Scanner sc2 ){
    int i =0;
    while(sc2.hasNextInt()){
      
      acctnum[i]=sc2.nextInt();
      balance[i]=sc2.nextDouble();
      i++;
    }
    
    return i;
  }
  
  public static int findacct(int[] acctnum, double[] balance,PrintStream ps ){
    System.out.print(" please enter acount number: \n");
    ps.print(" please enter acount number: \n");
    Scanner kin2 = new Scanner(System.in); 
    int id=kin2.nextInt();
    int i;
    int test=5;
    for( i=0;i<=50;i++){
      if (acctnum[i]==id){
        System.out.print("the balance for acount "+id+" is: "+balance[i]+"\n");
        ps.print("the balance for acount "+id+" is: "+balance[i]+"\n\n");
        test=4;
        break;}
    }
    if (test!=4){
      System.out.print("======\nError account not found\n========\n");
      ps.print("======\nError account not found\n========\n");
      i=-1;}
    return i;
  }
  public static void withd(int[] acctnum, double[] balance,PrintStream ps ){
    System.out.print("You have selected Withdrawl : \n");
    ps.print("You have selected Withdrawl : \n");
    int index=findacct(acctnum, balance,ps);
    if(index!=-1){
      System.out.print("Enter the amount you would like to withdraw\n");
      ps.print("Enter the amount you would like to withdraw\n");
      Scanner kin2 = new Scanner(System.in); 
      double amount=kin2.nextDouble();
      balance[index]=balance[index]-amount;
      if (balance[index]<0){
        System.out.print("=========\nerror: insufecient funds\n========\n");
        ps.print("=========\nerror: insufecient funds\n========\n");
        balance[index]=balance[index]+amount;}
      System.out.print("new balance:"+balance[index]+"\n\n");
      ps.print("acount "+acctnum[index]+" new balance:"+balance[index]+"\n\n");
    }
  }
  public static void deposit(int[] acctnum, double[] balance,PrintStream ps ){
    System.out.print("You have selected Deposit : \n");
    ps.print("You have selected Deposit : \n");
    int index=findacct(acctnum, balance,ps);
    if(index!=-1){
      System.out.print("Enter the amount you would like to Deposit\n");
      ps.print("Enter the amount you would like to Deposit\n");
      Scanner kin2 = new Scanner(System.in); 
      double amount=kin2.nextDouble();
      balance[index]=balance[index]+amount;
      System.out.print("new balance:"+balance[index]+"\n\n");
      ps.print("acount "+acctnum[index]+" new balance:"+balance[index]+"\n\n");
    }
  }
  public static void newacct(int[] acctnum, double[] balance,int count,PrintStream ps){
    System.out.print("You have selected create new acount : \n");
    ps.print("You have selected create new acount : \n");
    System.out.print(" please enter acount number: \n");
    ps.print(" please enter acount number: \n");
    Scanner kin2 = new Scanner(System.in); 
    int id=kin2.nextInt();
    int i;
    int test=5;
    for( i=0;i<=50;i++){
      if (acctnum[i]==id){
        System.out.print("error Acount alreaddy exists\n");
        ps.print("error Acount alreaddy exists\n\n");
        test=4;
        break;}
    }
    if (test!=4){System.out.print("======valid ID========");
      ps.print("======valid ID========\n");
      acctnum[count]=id;
      balance[count]=0.0;
      System.out.print("\nAcount"+id+" created, balance 0.0 \n");
      ps.print("\nAcount"+id+" created, balance 0.0 \n\n");}
    
  }
  public static void delete(int[] acctnum, double[] balance,int count,PrintStream ps ){
    System.out.print("You have selected Delete account : \n");
    ps.print("You have selected Delete account : \n");
    int index=findacct(acctnum, balance,ps);
    if(index!=-1){
      System.out.print("Deleting acount"+acctnum[index]+"\n");
      ps.print("Deleting acount"+acctnum[index]+"\n\n");
      acctnum[index]=acctnum[count];
      balance[index]=balance[count];
      
    }
    
  }
  
}









// Written by Devlin Mckenna -1170