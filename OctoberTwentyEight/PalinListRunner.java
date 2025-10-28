package OctoberTwentyEight;

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		String [] testCases = {
            "one two three two one",
            "1 2 3 4 5 one two three four five",
            "a b c d e f g x y z g f h",
            "racecar is racecar",
            "1 2 3 a b c c b a 3 2 1",
            "chicken is a chicken"
        };	
        
        for (String test : testCases) {
            PalinList p = new PalinList(test);
            if (p.isPalin())
                System.out.println(p.toString() + " is a palinlist.\n");
            else
                System.out.println(p.toString() + " is not a palinlist.\n");
        }
	}
}