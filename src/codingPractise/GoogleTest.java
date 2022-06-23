package codingPractise;



public class GoogleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		 WebDriverWait wait = new WebDriverWait(wdriver, 60);

		    Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {

		        @Override
		        public boolean apply(WebDriver input) {
		            return ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
		        }

		    };
		    wait.until(pageLoaded);
	}

}
