import java.awt.*;

public class AvoidScreenLock
{
    public static void main(String[] args)
    {
        Robot autoMouse = null;
        try {
            autoMouse = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        while(true)
        {
            autoMouse.mouseMove(50,50);
            autoMouse.delay(5000);
            autoMouse.mouseMove(500, 500);
            autoMouse.delay(5000);
        }
    }
}
