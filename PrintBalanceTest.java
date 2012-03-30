import static org.junit.Assert.*;

import java.text.Collator;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;



/**
 * TODO Put here a description of what this class does.
 *
 * @author matthewmercer.
 *         Created Mar 30, 2012.
 */
public class PrintBalanceTest {

	@Test
	public void testJUnit(){
		assertTrue("Compiler isn't working...", true);
	}
	
	@Test
	public void testDateAmerican(){
		DateFormat d = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		
		assertEquals(d.format(new Date()), PrintBalance.getDate(new Locale("en", "US")));
	}
	
	@Test
	public void testDateFrench(){
		DateFormat d = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		
		assertEquals(d.format(new Date()), PrintBalance.getDate(new Locale("fr", "FR")));
	}
	
	@Test
	public void testDateGerman(){
		DateFormat d = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		
		assertEquals(d.format(new Date()), PrintBalance.getDate(new Locale("de", "DE")));
	}
	
	@Test
	public void testCurrencyAmerican(){
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		
		assertEquals(n.format(9876543.21), PrintBalance.getCurrency(new Locale("en", "US")));
	}
	
	@Test
	public void testCurrencyFrench(){
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		assertEquals(n.format(9876543.21), PrintBalance.getCurrency(new Locale("fr", "FR")));
	}
	
	@Test
	public void testCurrencyGerman(){
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		
		assertEquals(n.format(9876543.21), PrintBalance.getCurrency(new Locale("de", "DE")));
	}
	
	@Test
	public void testMessagesAmerican(){
		Collator c = Collator.getInstance(Locale.US);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "US"));
		
		if(c.compare("Hello World", messages.getString("greeting")) != 0)
			fail();
		if(c.compare("Please enter your name", messages.getString("enterName")) != 0)
			fail();
		if(c.compare("I am pleased to meet you", messages.getString("pleasedToMeet")) != 0)
			fail();
		if(c.compare("As of", messages.getString("asOf")) != 0)
			fail();
		if(c.compare("You owe the school", messages.getString("youOwe")) != 0)
			fail();
		if(c.compare("Good bye", messages.getString("goodBye")) != 0)
			fail();
	}
	
	@Test
	public void testMessagesFrench(){
		Collator c = Collator.getInstance(Locale.FRANCE);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale("fr", "FR"));
		
		if(c.compare("Bonjour tout le monde", messages.getString("greeting")) != 0)
			fail();
		if(c.compare("S'il vous pla”t entrer votre nom", messages.getString("enterName")) != 0)
			fail();
		if(c.compare("Je suis heureux de vous rencontrer", messages.getString("pleasedToMeet")) != 0)
			fail();
		if(c.compare("En date du", messages.getString("asOf")) != 0)
			fail();
		if(c.compare("Vous devez l'Žcole", messages.getString("youOwe")) != 0)
			fail();
		if(c.compare("Au revoir", messages.getString("goodBye")) != 0)
			fail();
	}
	
	@Test
	public void testMessagesGerman(){
		Collator c = Collator.getInstance(Locale.GERMANY);
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", new Locale("de", "DE"));
		
		if(c.compare("Hallo Welt", messages.getString("greeting")) != 0)
			fail();
		if(c.compare("Bitte geben Sie Ihren Namen", messages.getString("enterName")) != 0)
			fail();
		if(c.compare("Ich freue mich, Sie kennen zu lernen", messages.getString("pleasedToMeet")) != 0)
			fail();
		if(c.compare("Stand", messages.getString("asOf")) != 0)
			fail();
		if(c.compare("Sie schulden die Schule", messages.getString("youOwe")) != 0)
			fail();
		if(c.compare("Auf Wiedersehen", messages.getString("goodBye")) != 0)
			fail();
	}
}
