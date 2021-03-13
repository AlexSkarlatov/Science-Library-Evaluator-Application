package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    /*
        program desscription:
     */
    public static void main(String[] args) {
	// write your code here

        //get the stuff from the files into my program

        try{
            //prompt the user for the file names and file paths

            FileReader fr1 = new FileReader("enzo 1 library.txt");
            FileReader fr2 = new FileReader("enzo 1 library.txt");

            BufferedReader bufferedReader = new BufferedReader(fr1);
            BufferedReader bufferedReader2 = new BufferedReader(fr2);

            String str1, str2;
            while ((str1 = bufferedReader.readLine())   != null ||   (str2 = bufferedReader2.readLine())  != null){
                System.out.println("testing to see if works" + str1);
            }

//          fileReader();
        }
        catch(IOException e ){
            System.out.println("eerror");
        }





    }
    //refine this after proof of concept phase
    private static void fileReader(ArrayList<String> librariesToCompare) throws FileNotFoundException {
        try
        {
            List<FileReader> fileReaders = new ArrayList<>();
            List<BufferedReader> bufferedReaders = new ArrayList<>();
            for(int i = 0 ; i < librariesToCompare.size(); i++){
                //create a bunch of file reader
                fileReaders.add(new FileReader(librariesToCompare.get(i)));
                bufferedReaders.add(new BufferedReader(fileReaders.get(i)));
            }
    //       BufferedReader br = new BufferedReader();
        }
        catch (IOException e){

        }
    }
}
