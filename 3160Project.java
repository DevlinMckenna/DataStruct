// program attempts to parse user input into tokens and then execute operations on these tokens
import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    
    Pattern ID = Pattern.compile("[a-z]");  //pattern for variable name token 
    Pattern EXP = Pattern.compile("[0-9]"); //pattern for variable value 
String[][] arr1 = new String[50][2];         // 2D array to hold the variable tokens and values
int row = 0;

 while(true){
     
     
   Console console = System.console();
     String myWord = console.readLine("Enter Input : ");
     
     switch(myWord){
        case "C":                           //  User can type 'c' to enter Computation mode,
                                            //computation mode is after all inputs are collected 
            System.out.println("COMPUTATION MODE");
            Console console1 = System.console();
            String myVar0 = console.readLine("Enter Variable : ");
            String myVar1 = console.readLine("Enter Variable: ");
            int a=0;
            int b=0;
            int sum=0;
            for(int k=0; k<arr1.length; k++){
                if(myVar0==arr1[k][0]){a= Integer.parseInt(arr1[k][1]);} // this loop is a search for string in the table that
            }                                                               // matches the input variable, and assigns its  
             for(int k=0; k<arr1.length; k++){                              // associated integer value to a.
                if(myVar1==arr1[k][0]){b= Integer.parseInt(arr1[k][1]);}
            }                                                               
            sum = a+b;                                                  // for now this only does addition but I will add,
             System.out.println("The Sum is: ");                        // other operations/functionalities when I have time
             System.out.println(sum);
             break;
             
        default:                    // defualt block will collect user input,
                                    // parse it down into string tokens 
    String[] arr0 = myWord.split("=");  // and store them into the 2D array
    for(int i=0; i<arr0.length; i++){
    
        arr1[row][i]=arr0[i];
      
    }
    System.out.println("Symbol Table: ");           // symbol table is represented by the 2D array arr1
    for(int j=0; j<=row; j++){                      
    for(int p=0; p<arr0.length; p++){
     System.out.print(arr1[j][p]);
    }
    System.out.println("\n");
    }
    row++;
    System.out.println();
    Matcher matcher0 = ID.matcher(arr0[0]);
    boolean matchFound0 = matcher0.find();
    if(matchFound0) {
      System.out.println(arr0[0]+": is a valid ID");    // logic here just checks inputs to see if they match,
    } else {                                            // our input pattern
      System.out.println("Invalid ID");
    }
    
     Matcher matcher1 = EXP.matcher(arr0[1]);
    boolean matchFound1 = matcher1.find();
    if(matchFound1) {
      System.out.println(arr0[1]+": is a valid EXP");
    } else {
      System.out.println("Invalid EXP");
    }
    
    
     }
   
    }
  }
}







