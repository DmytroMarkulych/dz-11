package ManTestPackage;

import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {

    @Test(testName = "Validation man")
    public void testManConstructor() {
        Man man = new Man("John", "Doe", 30, true);
        Assert.assertEquals(man.getFirstName(), "John");
        Assert.assertEquals(man.getLastName(), "Doe");
        Assert.assertEquals(man.getAge(), 30);
        Assert.assertTrue(man.hasBike());
    }

    @Test(testName = "Man has a bike")
    public void testHasBike() {
        Man man = new Man("John", "Doe", 30, true);
        Assert.assertTrue(man.hasBike());

        man = new Man("Jane", "Doe", 25, false);
        Assert.assertFalse(man.hasBike());
    }

    @Test(testName = "Test setter for man")
    public void testSetHasBike() {
        Man man = new Man("John", "Doe", 30, false);
        Assert.assertFalse(man.hasBike());

        man.setHasBike(true);
        Assert.assertTrue(man.hasBike());

        man.setHasBike(false);
        Assert.assertFalse(man.hasBike());
    }

    @Test(testName = "Man is retired")
    public void testManRetired() {
        Man man = new Man("John", "Doe", 66, true);
        Assert.assertTrue(man.isRetired(), "Man should be retired");
    }

    @Test(testName = "Man is not retired")
    public void testManNotRetired() {
        Man man = new Man("John", "Doe", 60, true);
        Assert.assertFalse(man.isRetired(), "Man should not be retired");
    }
}
