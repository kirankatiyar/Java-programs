//Create a program that takes a list of words as input andcounts the frequency of each word.
//Example.....
//input : "aaple orange apple banana orange apple"
//output: apple:3  orange:2  banana:1
package Assignment1;
import java.util.HashMap;
import java.util.Scanner;
public class FrequencyCount {
    // Function to count frequency of words in the given string
    static void count_freq(String str)
    {
        HashMap<String,Integer> mp=new HashMap<>();
        // convert given String into String array by string split() method.
        String arr[]=str.split(" ");
        // Loop to iterate array.
        for(int i=0;i<arr.length;i++)
        {
            // Condition checks whether array element is in hashmap or not.
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        // Loop to iterate  HashMap.
        for(HashMap.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        System.out.println("enter list of words");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Function Call
        count_freq(str);
    }
}