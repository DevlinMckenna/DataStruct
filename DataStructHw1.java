
        import java.io.File;
        import java.util.Scanner;
        import java.util.Arrays;

        // This program takes a raw data set(top 200 spotify chart list), reads all the data into a 2D array,
        // and outputs the core data set listed by stream #, (ommiting URLs), and outputs the data filtered down to just
        // the unique artist names (duplicates removed, and alphebetized)

        public class DataStructHw1 {

            //Since are not multiple functions, or any sort of user interface, I chose to do my data parsing,
            // organizing, and printing in my main method

            public static void main(String[] args) throws Exception {



                File file =
                        new File("input2.txt");


                Scanner sc0 = new Scanner(file);

                String[][] arr2D = new String[201][5];
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
                System.out.println("Top 200 spotify streamed tracks Sorted by most times streamed");
                System.out.println("====================================");

                //nested loop: outside loop moves through all 200 1D arrays read in

                for (int p = 0; p < 200; p++){
                    // inside loop moves through each 1D array (each line of outer array) but only prints the first
                    // four elements: ranking in terms of stream numbers, track name, artist name, number of times streamed
                for (int i = 0; i < 4; i++) {
                    System.out.print(arr2D[p][i]);
                    System.out.print("  ");
                }
                    System.out.print("\n");
                }

                System.out.println("\n====================================");

                System.out.println("Unique artists sorted alphebetically:\n(original data set with duplicates removed, and alphebetized)");
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
                     System.out.println(arrUniq[e]);
                 }
                }

                System.out.println("\n====================================");
                System.out.println("FIN");

            }
        }



