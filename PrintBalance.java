import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2011.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		
		
		Locale currentLocale = Locale.getDefault();
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		String today = getDate(currentLocale);
		String currency = getCurrency(currentLocale);
		
		//Greeting
		System.out.println(messages.getString("greeting"));
		
		//Get User's Name
		System.out.println(messages.getString("enterName"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("pleasedToMeet") + " " + name);
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("asOf") + " : "+ today);
		System.out.println(messages.getString("youOwe") + " " + currency);
		System.out.println(messages.getString("goodBye"));
	}
	
	public static String getDate(Locale locale){
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, locale);
		
		return dateFormatter.format(new Date());
	}
	
	public static String getCurrency(Locale locale){
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		
		return currencyFormatter.format(9876543.21);
	}
}



