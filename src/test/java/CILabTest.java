import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
       myString.setString("Word");
       assertEquals(true, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("HELLO");
        assertEquals(true, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("smelly");
        assertEquals(true, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("SMELLY Cat smelly CAT");
        assertEquals(true, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest5() {
        myString.setString("WhaT");
        assertEquals(false, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest6() {
        myString.setString("are They FEeding you");
        assertEquals(false, myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest7() {
        myString.setString("");
        assertEquals(true, myString.detectCapitalUse());
    }

}
