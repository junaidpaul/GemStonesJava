
import java.util.Scanner;

public class GemStones {

    public static void main(String[] args){

        int NumberOfRocks;
        String[] Rocks;
        String[] Alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rocks : Integer");
        NumberOfRocks = in.nextInt();

        if (NumberOfRocks<=100){

        Rocks = new String[NumberOfRocks];
        /*
        * Get the rocks from the user based on the number of rocks
        */
        System.out.println("Enter different rocks: String");
        for(int i=0;i<Rocks.length; i++){
            Rocks[i]=in.next().toLowerCase();
        }

        int  match=0;
        for(int i=0;i<Alphabets.length;i++){
            int counter=0;
            for(int j=0;j<Rocks.length;j++){
                char pattern = Alphabets[i].charAt(0);
                if (Rocks[j].contains(Character.toString(pattern))){
                    counter=counter+1;
                }
            }
            if(counter == Rocks.length){
                match= match+1;
            }

        }
        System.out.println(match);
        }else {
            System.out.println("Must be less than or equal to 100");
        }
    }

}
