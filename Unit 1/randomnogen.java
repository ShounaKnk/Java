import java.util.Random;

public class randomnogen {
    public static void main(String args[])
    {
        //USING MATH.RADOM
        System.out.println("Roll Dice: ");
        for(int i =0; i<6; i++)
        {
            //math.random()*(max-min)
            double dice = Math.random()*(6-1)+1;

            System.out.println("Dice outcme: "+Math.round(dice));
        }

        //USING JAVA.UTIL.RANDOM class

        System.out.println("\n\nROLL DICE: ");
        Random r = new Random();
        for(int i=0; i<6; i++)
        {
            System.out.println("Dice outcome: "+(r.nextInt(6)+1));
        }
    }
}
