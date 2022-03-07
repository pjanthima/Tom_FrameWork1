package drivers;

import pages.CommonPage;
import pages.HomePage;

public class PageInitializer extends Driver {
	public static CommonPage cp;
	public static HomePage myHPage;

	public static void initialize() {
		cp = new CommonPage();
		myHPage = new HomePage();
	}
}
