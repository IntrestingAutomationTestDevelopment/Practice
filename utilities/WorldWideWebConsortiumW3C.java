package utilities;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

public class WorldWideWebConsortiumW3C {

	//Using W3C Actions (New Way): 
	
   
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); 

		Sequence swipe = new Sequence(finger, 1); 
		
		/**
		 * Single Touch
		 * 15-01-2025
		 * @author KSRAbhilash
		 */
		public static void tap(AppiumDriver driver,int x,int y) {
			//int x,y;
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence tap = new Sequence(finger, 0);
			tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
			tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			driver.perform(Arrays.asList(tap));

		}
		/**
		 * Long Press
		 * 15-01-2025
		 * @author KSRAbhilash
		 */
		public static void  lognPress(AppiumDriver driver,int x,int y) {
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence longPress = new Sequence(finger, 0);
			longPress.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
			longPress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			longPress.addAction(new Pause(finger, Duration.ofSeconds(2))); // Hold for 2 seconds
			longPress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			driver.perform(Arrays.asList(longPress));

		}
		/**
		 * Swipe
		 * 15-01-2025
		 * @author KSRAbhilash
		 * 
		 */
		public static void swipe(AppiumDriver driver,int startX,int startY,int endX,int endY) {
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence swipe = new Sequence(finger, 0);
			swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
			swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, endY));
			swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			driver.perform(Arrays.asList(swipe));

		}
		
		
		/**
		 * Pinch
		 * ZoomOut
		 * 15-01-2025
		 * @author KSRAbhilash
		 */
		public static void zoomOut(AppiumDriver driver,int startX1,int startY1,int endX1,int endY1,int startX2,int startY2,int endX2, int endY2) {

		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

		Sequence pinchFinger1 = new Sequence(finger1, 0);
		Sequence pinchFinger2 = new Sequence(finger2, 0);

		// Move fingers apart initially
		pinchFinger1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX1, startY1));
		pinchFinger2.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX2, startY2));

		// Perform pinch gesture (move fingers closer)
		pinchFinger1.addAction(finger1.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX1, endY1));
		pinchFinger2.addAction(finger2.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX2, endY2));

		pinchFinger1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		pinchFinger2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(pinchFinger1, pinchFinger2));
		
		}

		/**
		 * Zoom
		 * Zoomin
		 * 15-01-2025
		 * @author KSRAbhilash
		 */
		public static void zoomIn(AppiumDriver driver,int startX1,int startY1,int endX1,int endY1,int startX2,int startY2,int endX2, int endY2) {

		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

		Sequence zoomFinger1 = new Sequence(finger1, 0);
		Sequence zoomFinger2 = new Sequence(finger2, 0);

		// Move fingers closer initially
		zoomFinger1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX1, startY1));
		zoomFinger2.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX2, startY2));

		// Perform zoom gesture (move fingers apart)
		zoomFinger1.addAction(finger1.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX1, endY1));
		zoomFinger2.addAction(finger2.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX2, endY2));

		zoomFinger1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		zoomFinger2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(zoomFinger1, zoomFinger2));
		}

		
		public void moveToLeft(){
			//swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 500, 1500)); 
			//swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); 
		}
		public void moveToRight(){
			//swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 500, 500)); 
			//swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); driver.perform(Collections.singletonList(swipe));

		}
		
		
		//implementation files('libs\\java-client-7.6.0.jar')

//		https://mvnrepository.com/artifact/io.appium/java-client/7.6.0

}
