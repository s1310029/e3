import java.util.Random;

public class coin{
    public static void main(String[] args){
	Random r = new Random();
	int count1 = 0;
	
	System.out.println("Tosing a coin...");
	for(int i = 1; i <= 3; i++){
	int randomValue = r.nextInt(2);
	if(randomValue == 1){
	    System.out.println("Round " + i + ": Heads");
	    count1++;
	}
	else System.out.println("Round " + i + ": Tails");
	}
	int count2 = 3 - count1;
	System.out.println("Heads: " + count1 + ", Tails: " + count2);
	if(count1 > count2) System.out.println("You won");
	else if(count1 < count2) System.out.println("You lost");
    }
}
