package seleniumtopics;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		br.LaunchBrowser("Chrome");
		br.launchUrl("https://www.amazon.com/");

		String title = br.getPageTitle();
		System.out.println(title);

		if (title.contains("Amazon")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}

		String url = br.getPageUrl();
		System.out.println("URL is " + url);
		
		
		br.closeBrowser();
	}
	
	
	

}
