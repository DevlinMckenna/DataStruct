import java.io.File;


import java.util.Scanner;
import java.util.Arrays;

// This program takes a raw data set(2x top 200 spotify chart list from two different weeks), reads all the data into a 2D array,
// and outputs the core data set listed by stream #, (ommiting URLs)
// Then it displays a menu that lets a user navigate the tracks using n and p keys
// while displaying the previous, current, and next track.

public class DataStructHw2 {
  
  //Since are not multiple functions, I chose to do my data parsing,
  // organizing, and printing in my main method
  
  public static void main(String[] args) throws Exception {
    
    
    
    File file =
      new File("spotifyWeek1.txt");
    
    File file2 =
      new File("spotifyWeek2.txt");
    
    
    
    Scanner sc0 = new Scanner(file);
    Scanner sc1 = new Scanner(file2);
    
    String[][] arr2D = new String[402][6];
    
    
    int a= 0;
    int d =200;
    
    
    //  populate(sc0, sc1);
    
    // first loop reads in (One line) raw data to a 1D array. Saving substrings split on the "," character
    
    
    
    
    while (sc0.hasNext()) {
      
      
      String n0 = sc0.nextLine();
      
      String[] arrS0 = n0.split(",");
      
      
      
      for (int i = 0; i <arrS0.length; i++) {
        
        
        arr2D[a][i]= arrS0[i];
      }
      a++;
      
    }
    
    
    
    while (sc1.hasNext()) {
      
      
      String n1 = sc1.nextLine();
      
      String[] arrS1 = n1.split(",");
      
      
      
      for (int i =0; i <arrS1.length; i++) {
        
        
        arr2D[d][i]= arrS1[i];
        
        
      }
      d++;
      
    }
    
    
    
    
    
    
    
    
    System.out.println("===================================");
    System.out.println("Printing FULL Data set: ");
    System.out.println("(400)Combined playlist Top streamed: week1, week2 ");
    System.out.println("====================================");
    
    //nested loop: outside loop moves through all 200 1D arrays read in
    
    for (int p = 1; p <= 400; p++){
      // inside loop moves through each 1D array (each line of outer array) but only prints the first
      // four elements: ranking in terms of stream numbers, track name, artist name, number of times streamed
      System.out.print(p+"  ");
      for (int i = 1; i < 4; i++) {
        
        System.out.print(arr2D[p-1][i]);
        System.out.print("  ");
      }
      System.out.print("\n");
    }
    
    System.out.println("\n====================================");
    
    //   System.out.println("Unique artists sorted alphebetically:\n(original data set with duplicates removed, and alphebetized)");
    System.out.println("===================================");
    
    // the following loops filter the data down furthur, but removing duplicates and alphebetizing the list.
    int count=0;
    String arrUniq[]= new String [200];
    String temp[] = new String [200];
    
    for(int t=0; t<200; t++)   {
      
      arrUniq[t]=arr2D[t][2];
      
    }
    
    Arrays.sort(arrUniq);
    
    for(int t=0; t<199; t++)   {
      if ((arrUniq[t].compareTo(arrUniq[t+1]))!= 0 )  { temp[count++] = arrUniq[t];
        
      }
      
    }
    
    
    
    for (int i=0; i<200; i++)  {
      arrUniq[i] = temp[i]; }
    
    
    
    
    // Final loop prints the filtered data and removes any null elements. (a removed duplicate would leave a null
    // String when its removed.)
    
    for (int e = 0; e <200; e++) {
      if (arrUniq[e]!= null) {
        //  System.out.println(arrUniq[e]);
      }
    }
    // the following is the user interface that allows the user to navigate the playlist
    System.out.println("\n====================================");
    System.out.println("PlayBack menu");
    char c='X';
    int x=0;

    do {
      System.out.println("Press n for next song, p for previous, Q to quit");
      Scanner input = new Scanner(System.in);
      c = input.next().charAt(0);
      while(c != 'Q'){
        if (c=='n'){
          System.out.println("==========================");
          System.out.println("==========================");
          System.out.println("Previous song:");
          if(x!=0){ System.out.print(arr2D[x-1][1]);
            System.out.print(" By: ");
            System.out.println(arr2D[x-1][2]);
          }
          System.out.println("==========================");
          System.out.println("current song:");
          System.out.print(arr2D[x][1]);
          System.out.print(" By: ");
          System.out.println(arr2D[x][2]);
          System.out.println("==========================");
          System.out.println("Next song:");
          System.out.print(arr2D[x+1][1]);
          System.out.print(" By: ");
          System.out.println(arr2D[x+1][2]);
          System.out.println("==========================");
          System.out.println("==========================");
          x++;
          break;}
        if (c=='p'){ x--;
          System.out.println("==========================");
          System.out.println("==========================");
          System.out.println("Previous song:");
          if(x!=0){ System.out.println(arr2D[x-1][1]);}
          System.out.println("==========================");
          System.out.println("current song:");
          System.out.print(arr2D[x][1]);
          System.out.print("  By: ");
          System.out.println(arr2D[x][2]);
          System.out.println("==========================");
          System.out.println("Next song:");
          System.out.println(arr2D[x+1][1]);
          System.out.println("==========================");
          System.out.println("==========================");
          
          break;}
        
      }} while (c!='Q');
      
      System.out.println("program ending");
      
  }
}