package timus1semester.task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus1semester/task_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshallAndLilly = 2;

        try{

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";

            int numberOffFriends = 0;
            int numberOffPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                if(numberOffFriends == 0){
                    numberOffFriends = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")){
                    numberOffPairs++;
                }
            }
            int result;
            int guests = (marshallAndLilly + numberOffFriends + numberOffPairs);
            if(guests == 13){
                result = (guests * 100) + 100;
            } else {
                result = guests * 100;
            }
            System.out.println(result);
        } catch (IOException exception){
            exception.printStackTrace();
        }




    }
}
