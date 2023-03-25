import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ThemeTest {

    @Test
    void ClassicThemeButtonColorTest()
    {
        Theme classic=new Classic();
        Assertions.assertEquals( Color.WHITE,classic.buttonColor());

    }

    @Test
    void ForestThemeButtonColorTest()
    {
        Theme forest=new Forest();
        Assertions.assertEquals( new Color(102, 255, 102),forest.buttonColor());
    }

    @Test
    void ContrastThemeButtonColorTest()
    {
        Theme contrast= new Contrast();
        Assertions.assertEquals( new Color(82, 80, 80),contrast.buttonColor());
    }
}