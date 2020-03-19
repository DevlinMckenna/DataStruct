
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

// This program takes a raw data set(2000 movies from the movie lens data base) and first filters
// it down to just the movie titles(ommitting genres etc.)
// then it sorts the titles alphebetcally, and prints the sorted list
// then it launchs a Binary navigation user interface The purpose is for this interface to
// immitate a binary tree by starting  at the middle and
//  allows the user to move in half list increments up or down the list
public class DataStructHw3 {

    //Since are not multiple functions, or any sort of user interface, I chose to do my data parsing,
    // organizing, and printing in my main method

    public static void main(String[] args) throws Exception {



        File file =
                new File("inputMovieList.txt");


        Scanner sc0 = new Scanner(file);

        String[][] arr2D = new String[10000][10];
        int c= 0;

        // first loop reads in (One line) raw data to a 1D array. Saving substrings split on the "," character

        while (sc0.hasNext()) {


            String n0 = sc0.nextLine();

            String[] arrS = n0.split(",");

            // second loop enters each iteration of the 1D array as a line in the 2D array

            for (int i = 0; i <arrS.length; i++) {


                arr2D[c][i]= arrS[i];
            }
            c++;

        }

        System.out.println("===================================");
        System.out.println("Top 2000 Movie Lens entries (full list not sorted or filtered)");
        System.out.println("====================================");

        //nested loop: outside loop moves through all 200 1D arrays read in

        for (int p = 0; p < 1500; p++){
            // inside loop moves through each 1D array (each line of outer array) but only prints the first
            // four elements: ranking in terms of stream numbers, track name, artist name, number of times streamed
            for (int i = 0; i < 3; i++) {
                System.out.print(arr2D[p][i]);
                System.out.print("  ");
            }
            System.out.print("\n");
        }

        System.out.println("\n====================================");

        System.out.println("Atlpheteted list:");
        System.out.println("===================================");

        // the following loops filter the data down furthur, but removing duplicates and alphebetizing the list.
        int count=0;
        String arrUniq[]= new String [2000];
        String temp[] = new String [2000];

        for(int t=0; t<2000; t++)   {

            arrUniq[t]=arr2D[t][1];

        }

        Arrays.sort(arrUniq);

        for(int t=0; t<1999; t++)   {
            if ((arrUniq[t].compareTo(arrUniq[t+1]))!= 0 )  { temp[count++] = arrUniq[t];

            }

        }



        for (int i=0; i<2000; i++)  {
            arrUniq[i] = temp[i]; }




        // Final loop prints the filtered data and removes any null elements. (a removed duplicate would leave a null
        // String when its removed.)

        for (int e = 0; e <2000; e++) {
            if (arrUniq[e]!= null) {
                System.out.println(arrUniq[e]);
            }
        }

        // The following Do while loop handles the user interface, allowing user to traverse
        // filtered and alphebetized list in a similar way to navigating a binary tree.

        System.out.println("\n\nLaunching Binary naviagtion/Search:(On Sorted moive titles)");
        System.out.println("\n==================================\n");


        int current=1000;
        System.out.println(" Center element is :  "+ arrUniq[current]+"\n");
do {


        System.out.println("Enter a to move halfway toward the front of alphebet or ");
        System.out.println("Enter z to move halfway toward the End of the alphebet ");
    System.out.println("Enter q to quit. ");

        Scanner input = new Scanner(System.in);
        c = input.next().charAt(0);

        while(c != 'q'){
            if (c=='a'){
                current = (current/2);
                System.out.println("you have selected element # "+current+"\n");
                System.out.println("current element : "+arrUniq[current]+"\n");
                break;}
            if (c=='z'){

               current= current + ((2000-current)/2);
                System.out.println("you have selected element #"+current+"\n");
                System.out.println("current element :"+arrUniq[current]+"\n");
                break;}

        }} while (c!='q');

        System.out.println("\n====================================");
        System.out.println("FIN");


    }
}





