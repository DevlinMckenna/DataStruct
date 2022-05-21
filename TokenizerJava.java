import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    
    Pattern ID = Pattern.compile("[a-z]");
    Pattern EXP = Pattern.compile("[0-9]");
String[][] arr1 = new String[5][5];
int row = 0;

 while(true){
     
     
   Console console = System.console();
     String myWord = console.readLine("Enter Input : ");
     
     switch(myWord){
        case "C":
            System.out.println("COMPUTATION MODE");
             break;
             
        default:
    
    String[] arr0 = myWord.split("=");
    for(int i=0; i<arr0.length; i++){
     //   System.out.println(arr1[count][i]);
        arr1[row][i]=arr0[i];
      
    }
    System.out.println("Symbol Table: ");
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
      System.out.println(arr0[0]+": is a valid ID");
    } else {
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
   //  System.out.println("COMUTATION MODE");
    }
  }
}





