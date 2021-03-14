package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {


    /*
        program desscription:
     */
    public static void main(String[] args) {
	// write your code here

        //get the stuff from the files into my program

        try{
            //prompt the user for the file names and file paths

            FileReader fr1 = new FileReader("E:\\CODING-LEARNINGS\\SpringBootLearning\\ListUnionVerificationApp\\src\\com\\company" +
                    "\\textfiles\\enzo.txt");
            FileReader fr2 = new FileReader("E:\\CODING-LEARNINGS\\SpringBootLearning\\ListUnionVerificationApp" +
                    "\\src\\com\\company\\textfiles\\preswick.txt");
//            FileReader fr1 = new FileReader("E:\\CODING-LEARNINGS\\SpringBootLearning\\ListUnionVerificationApp\\src\\com\\company" +
//                            "\\textfiles\\enzo.txt");
//            FileReader fr2 = new FileReader("E:\\CODING-LEARNINGS\\SpringBootLearning\\ListUnionVerificationApp" +
//                    "\\src\\com\\company\\textfiles\\preswick.txt");

            BufferedReader bufferedReader = new BufferedReader(fr1);
            BufferedReader bufferedReader2 = new BufferedReader(fr2);

            String str1, str2 = " ";
            List<String> libraryAlpha = new ArrayList<>();
            List<String> libraryBeta = new ArrayList<>();

            //fill up list alpha
            while ((str1 = bufferedReader.readLine())   != null){
                libraryAlpha.add(str1);
            }
            while ((str2 = bufferedReader2.readLine())   != null){
                libraryBeta.add(str2);
            }
//            System.out.println("length of list alpha == " + libraryAlpha.size() + "  []  length of list beta == "
//                    + libraryBeta.toString());
//            System.out.println("  HEEEEEEEEEEEEEEEERE "+libraryBeta.get(5).toLowerCase());
            List<String> output = new ArrayList<>();
            int count = 0;
            for(int i = 0 ; i < libraryAlpha.size(); i++){
                for(int j = 0; j < libraryBeta.size(); j++){
                    String sAlpha, sBeta;

                    sAlpha = libraryAlpha.get(i).toLowerCase();
                    sBeta = libraryBeta.get(j).toLowerCase();
//                    System.out.println(  sAlpha + "   versus    " + sBeta);
                    if( sAlpha.equalsIgnoreCase(sBeta) ){
                        //add this to the result list
                        output.add(sAlpha);
//                        System.out.println("adding salpha" +  sAlpha + "string output here "+output.toString());
//                        System.out.println("iteration number" + count++);
                        break;
                    }
//                    System.out.println("iteration number" + count++);
                }

//                System.out.println(output);
            }
            System.out.println("==============================================================================");
            for(int i = 0; i < output.size(); i++){
                System.out.println(output.get(i));
//                System.out.println(output.size());
            }

//            while ((str1 = bufferedReader.readLine())   != null ||   (str2 = bufferedReader2.readLine())  != null){
//                System.out.println("list 1 ===  " + str1 + "|||    list 2 ===   " + str2 );
//            }

//          fileReader();
        }
        catch(IOException e ){
            e.printStackTrace();
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
