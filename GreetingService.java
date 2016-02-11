
public class GreetingService {

	public static void main(String[] args) {
		if (args.length == 0){
            System.out.println("Error: the options is empty. Please write the option."); 
            System.out.println("Usage: java GreetingService <options>.");
            System.out.println("The options may be any word or numeral.");
        } else {
        	System.out.print("Hello ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }

        }
	}

}
