package com.example.movidle;

import java.io.*;
import java.util.ArrayList;
public class Movie {
    public static ArrayList movieNameList = new ArrayList();
    public static ArrayList movieYearList = new ArrayList();
    public static ArrayList movieGenreList = new ArrayList();
    public static ArrayList movieOriginList = new ArrayList();
    public static ArrayList movieDirectorList = new ArrayList();
    public static ArrayList movieStarList = new ArrayList();

    public static void Read() throws IOException {

        String patch = "Movidle\\imdb_top_250.csv";
        BufferedReader reader = null;
        String line = "";
        try {

           // reader = new BufferedReader(new FileReader(patch));
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(patch), "ISO-8859-1"));

            while ((line = reader.readLine()) != null) {
                String[] movieInfo = line.split(";");
                int i = 1;
                movieNameList.add(movieInfo[i]);
                i++;
                movieYearList.add(movieInfo[i]);
                i++;
                movieGenreList.add(movieInfo[i]);
                i++;
                movieOriginList.add(movieInfo[i]);
                i++;
                movieDirectorList.add(movieInfo[i]);
                i++;
                movieStarList.add(movieInfo[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

/*
     for(int i=1;i<movieNameList.size();i++){
         System.out.println(movieNameList.get(i));
     }*/
/*
        for (int i = 1; i < movieYearList.size(); i++) {
            System.out.println(movieYearList.get(i));
        }
*/
        /*
        RandomClass obj=new RandomClass();
        int i=obj.keepRandom();
        System.out.println(movieNameList.get(i));

         */
}
}
