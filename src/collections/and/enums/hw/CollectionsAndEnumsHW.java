/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections.and.enums.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections; 
//import java.util.List;


/**
 *
 * @author achap
 */
public class CollectionsAndEnumsHW { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] teamNames = {
        "Primus",
        "Secundus",
        "Tertius",
        "Quartus",
        "Quintus",
        "Sextus",
        "Septimus",
        "Octavus",
        "Nonus",
        "Decimus",
        "Undecimus",
        "Duodecimus",
        "Tertius Decimus",
        "Quartus Decimus",
        "Quintus Decimus",
        "Sextus Decimus",
        "Septimus Decimus",
        "Duodevicesimus",
        "Undevicesimus",
        "Vicesimus"
    };
        
        ArrayList<Person> dataList = new ArrayList<>();
        //ArrayList<List<Person>> teams = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("MOCK_DATA.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by commas so each parameter has its place
                String[] items = line.split(",");
                
                //We separate the items into segments of 4, so we can have the information of each person together
                if (items.length == 4) {
                    int number = Integer.parseInt(items[0]);
                    String fname = items[1];
                    String lname = items[2];
                    String email = items[3];

                    Person person = new Person(number, fname, lname, email);
                    dataList.add(person);
                }
                
            }
        } catch (IOException e) {
            System.out.println("Oh uh, something went wrong");
        }

        // We randomize the data in the ArrayList so we can choose the teams more easily
        Collections.shuffle(dataList);
        
        int teamSize = 5;
        int n = 0;
        
        //Here we are separating each person into their own team and assinging the names for each of the teams using the array at the beginning of the code
        for(int i = 0; i < dataList.size(); i += teamSize) {
            System.out.println("Team "+ teamNames[n] + ":");
            n++;
            for (int j = i; j < i + teamSize && j < dataList.size(); j++) {
            System.out.println(dataList.get(j));
            }
                System.out.println();
            //teams.add(dataList)
        }
 
    }

}
    

