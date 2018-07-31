import java.util.Random;;
public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random variable =new Random();
		int temp;
		for(int i =0;i<10;i++)
		{
			temp= variable.nextInt(3);
			System.out.println(temp+" ");
		}

	}

}
