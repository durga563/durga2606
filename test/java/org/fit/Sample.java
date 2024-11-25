package org.fit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;



public class Sample {

	public static void main(String[] args) throws InterruptedException {
	    // Setup WebDriverManager to automatically download and set up ChromeDriver
		        WebDriverManager.chromedriver().setup();

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		       
		     // Step 1: Navigate to FitPeo Homepage
		            driver.get("https://www.fitpeo.com");  // Replace with the correct URL of FitPeo homepage

		            
		    // Step 2: Navigate to the Revenue Calculator Page
		            WebElement menubar = driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-1nqfnyp']"));
		            menubar.click();		          //*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-1nqfnyp']
		   
		   // Locate and click on the "Revenue Calculator" link by its text or class
		            Thread.sleep(2000);
		            WebElement calculatorLink = driver.findElement(By.xpath("(//*[text()='Revenue Calculator'])[2]"));
		            calculatorLink.click();
		            
		            
		   // Step 3: Wait until the slider is visible
		   // Step 4: Scroll to the slider
		            JavascriptExecutor js=(JavascriptExecutor)driver;
		    		
		    		WebElement down = driver.findElement(By.xpath("//*[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));
		    		js.executeScript("arguments[0].scrollIntoView(true)", down);
		    		Thread.sleep(2000);
 
		   // Step 5: Adjust the slider to the value of 820
		            WebElement sliderHandle = driver.findElement(By.xpath("//*[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));  // Replace with the correct handle class
		            new org.openqa.selenium.interactions.Actions(driver)
		                    .clickAndHold(sliderHandle)
		                    .moveByOffset(100, 0)  // Adjust this offset to move the slider handle to 820
		                    .release()
		                    .perform();
		            
		            Thread.sleep(2000);
		    // Step 6: Locate the text field associated with the slider
		            WebElement textField = driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")); // Replace with actual ID
		            textField.clear();
		            Thread.sleep(3000);
		            textField.sendKeys("560");
		            Thread.sleep(3000);
//		     // Step 2: Wait for the slider to adjust based on the entered value (560)
//		            WebElement slider = driver.findElement(By.id("sliderId")); 
//		            
//		     // Step 3: Validate the slider value after entering 560
//		            String sliderValue = slider.getAttribute("value");
//		            if (sliderValue.equals("560")) {
//		                System.out.println("Slider value updated to: " + sliderValue);
//		            } else {
//		                System.out.println("Slider value did not update correctly. Current value: " + sliderValue);
//		            }

		            
//		            (//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt'])[1]
		            
                    JavascriptExecutor js1=(JavascriptExecutor)driver;
		    		
		    		WebElement down1 = driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt'])[1]"));
		    		js.executeScript("arguments[0].scrollIntoView(true)", down1);
		    		
		    		Thread.sleep(2000);
		    		WebElement Radiobutton1 = driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]"));
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]
		    		Radiobutton1.click();
		    		
		    		Thread.sleep(2000);
		    		WebElement Radiobutton2 = driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"));
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]
		    		Radiobutton2.click();
		    		
		    		
		    		Thread.sleep(2000);
		    		WebElement Radiobutton3 = driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]"));
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]
		    		Radiobutton3.click();
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]
		    		
		    		
		    		Thread.sleep(2000);
		    		WebElement Radiobutton4 = driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]"));
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]
		    		Radiobutton4.click();
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]
		    		
		    		
                    JavascriptExecutor js3=(JavascriptExecutor)driver;
		    		
		    		WebElement down3 = driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]"));
		    		js3.executeScript("arguments[0].scrollIntoView(true)", down3);
		    		
		    		Thread.sleep(2000);
		    		WebElement Radiobutton5 = driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]"));
//		    		(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]
		    		Radiobutton5.click();
		    		

		    		
                    JavascriptExecutor js4=(JavascriptExecutor)driver;
		    		
		    		WebElement Up = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-h4 crimsonPro css-12siehf']"));
		    		js4.executeScript("arguments[0].scrollIntoView(true)", Up);
		    		
		    		Thread.sleep(2000);
		    	
		        
		        }
		    }
