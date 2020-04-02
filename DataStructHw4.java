
    import java.io.File;
    import java.util.Scanner;


    public class DataStructHw4 {
        
    //  this program reads in 2000 movie entries from the source file movieLens.com and parses each line into a 1D array
       //  which is then stored into a 2D array.
    // next it analyizes and counts the strings in the columns for movie genre and movie release year and prints reports
       // for the populations of these fields

        public static void main(String[] args) throws Exception {


            File file =
                    new File("inputMovieList2.txt");


            Scanner sc0 = new Scanner(file);
            Scanner sc1 = new Scanner(file);

            String[][] arr2D = new String[10000][10];
            int c = 0;

            // first loop reads in (One line) raw data to a 1D array. Saving substrings split on the "," character

            while (sc0.hasNext()) {


                String n0 = sc0.nextLine();

                String[] arrS = n0.split(",");
              //  String[] arrYear = n0.split("\\(");

                // second loop enters each iteration of the 1D array as a line in the 2D array

              //  System.out.print(arrYear[c]);


                for (int i = 0; i < arrS.length; i++) {

                    arr2D[c][i] = arrS[i];
                }
                c++;

            }

            System.out.println("===================================");
            System.out.println("Top 2000 Movie Lens entries (full list not sorted or filtered)");
            System.out.println("====================================");

            //nested loop: outside loop moves through all 200 1D arrays read in

            for (int p = 0; p < 1500; p++) {
                // inside loop moves through each 1D array (each line of outer array) but only prints the first
                // four elements: ranking in terms of stream numbers, track name, artist name, number of times streamed
                for (int i = 0; i < 3; i++) {
                    System.out.print(arr2D[p][i]);
                    System.out.print("  ");

                }
                System.out.print("\n");
            }





                  int y95=0;
                  int y96=0;
                  int y97=0;
                  int y98=0;
                  int y99=0;
                  int y2k=0;
                  int y01=0;
                  int y02=0;
                  int y03=0;
                  int y04=0;
                  int y05=0;
                  int y06=0;
                  int y07=0;
                  int y08=0;
                  int y09=0;
                  int y10=0;
                  int y11=0;
                  int y12=0;
                  int y13=0;
                  int y14=0;
                  int y15=0;
                  int y16=0;
                  int y17=0;
                  int y18=0;

               while (sc1.hasNext()) {

                   String n1 = sc1.nextLine();
                      // System.out.println(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")));
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("1995")){y95++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("1996")){y96++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("1997")){y97++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("1998")){y98++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("1999")){y99++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2000")){y2k++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2001")){y01++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2002")){y02++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2003")){y03++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2004")){y04++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2005")){y05++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2006")){y06++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2007")){y07++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2008")){y08++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2009")){y09++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2010")){y10++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2011")){y11++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2012")){y12++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2013")){y13++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2014")){y14++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2015")){y15++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2016")){y16++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2017")){y17++;}
                       if(n1.substring(n1.indexOf("(")+1,n1.indexOf(")")).equals("2018")){y18++;}

               }
                      System.out.println("===================================");
                      System.out.println("===================================");
                      System.out.println("Report of movie release years");
                      System.out.println("===================================");
                      System.out.println("===================================");
                     System.out.println("# of Movie's released in 1995: "+y95);
                     System.out.println("# of Movie's released in 1996: "+y96);
                     System.out.println("# of Movie's released in 1997: "+y97);
                     System.out.println("# of Movie's released in 1998: "+y98);
                     System.out.println("# of Movie's released in 1999: "+y99);
                     System.out.println("# of Movie's released in 2000: "+y2k);
                     System.out.println("# of Movie's released in 2001: "+y01);
                     System.out.println("# of Movie's released in 2002: "+y02);
                     System.out.println("# of Movie's released in 2003: "+y03);
                     System.out.println("# of Movie's released in 2004: "+y04);
                     System.out.println("# of Movie's released in 2005: "+y05);
                     System.out.println("# of Movie's released in 2006: "+y06);
                     System.out.println("# of Movie's released in 2007: "+y07);
                     System.out.println("# of Movie's released in 2008: "+y08);
                     System.out.println("# of Movie's released in 2009: "+y09);
                     System.out.println("# of Movie's released in 2010: "+y10);
                     System.out.println("# of Movie's released in 2011: "+y11);
                     System.out.println("# of Movie's released in 2012: "+y12);
                     System.out.println("# of Movie's released in 2013: "+y13);
                     System.out.println("# of Movie's released in 2014: "+y14);
                     System.out.println("# of Movie's released in 2015: "+y15);
                     System.out.println("# of Movie's released in 2016: "+y16);
                     System.out.println("# of Movie's released in 2017: "+y17);
                     System.out.println("# of Movie's released in 2018: "+y18);








                int Adventure=0;
                int Children=0;
                int Comedy=0;
                int Fantasy=0;
                int Action=0;
                int Horror=0;
                int Thriller=0;
                int Drama=0;
                int Romance=0;
                int SciFi=0;
                int Western=0;


              for (int i = 0; i < 2000; i++) {
                 // System.out.println(arr2D[i][2]);

                 if (arr2D[i][2].contains("Adventure")){Adventure++;}
                 if (arr2D[i][2].contains("Children")){Children++;}
                 if (arr2D[i][2].contains("Comedy")){Comedy++;}
                 if (arr2D[i][2].contains("Fantasy")){Fantasy++;}
                 if (arr2D[i][2].contains("Action")){Action++;}
                 if (arr2D[i][2].contains("Horror")){Horror++;}
                 if (arr2D[i][2].contains("Thriller")){Thriller++;}
                 if (arr2D[i][2].contains("Romance")){Romance++;}
                 if (arr2D[i][2].contains("Drama")){Drama++;}
                 if (arr2D[i][2].contains("Sci-Fi")){SciFi++;}
                 if (arr2D[i][2].contains("Western")){Western++;}
              }

                        System.out.println("===================================");
                        System.out.println("===================================");
                        System.out.println("report genres:");
                        System.out.println("===================================");
                        System.out.println("===================================");

                                    System.out.println("number of Adventure films:"+Adventure);
                                    System.out.println("number of Comedy films:"+Comedy );
                                    System.out.println("number of Childrens films:"+Children);
                                    System.out.println("number of Fantasy films:"+Fantasy );
                                    System.out.println("number of Action films:"+Action );
                                    System.out.println("number of Horror films:"+Horror );
                                    System.out.println("number of Thriller films:"+Thriller );
                                    System.out.println("number of Romance films:"+Romance );
                                    System.out.println("number of Sci-FI films:"+SciFi );
                                    System.out.println("number of Western films:"+Western );
                                    System.out.println("number of Drama films:"+Drama );

            }}
