package autocyn;

import java.net.MalformedURLException;
import java.net.URL;

import org.sikuli.api.*;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;

import static org.sikuli.api.API.*;

public class Main {

      public static void main(String[] args) throws MalformedURLException {

            // Open the main page of Google Code in the default web browser
            //browse(new URL("http://code.google.com"));

            // Create a screen region object that corresponds to the default monitor in full screen 
            ScreenRegion s = new DesktopScreenRegion();

            // Specify an image as the target to find on the screen
            URL imageURL = new URL("file:///F:/AutoCyn/Capture.PNG");
            Target imageTarget = new ImageTarget(imageURL);

            // Wait for the target to become visible on the screen for at most 5 seconds
            // Once the target is visible, it returns a screen region object corresponding
            // to the region occupied by this target
            ScreenRegion r = s.wait(imageTarget, 100000);

            // Display "Hello World" next to the found target for 3 seconds
            Canvas canvas = new DesktopCanvas();
            canvas.addLabel(r, "Hello World").display(3);

            // Click the center of the found target
            Mouse mouse = new DesktopMouse();
            mouse.click(r.getCenter());
      }
}