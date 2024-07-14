package WomanTestPackage;

import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {
    @Test(testName = "Validation woman")
    public void testWomanConstructor() {
        Woman Woman = new Woman("Jane", "Smith", 61, true);
        Assert.assertEquals(Woman.getFirstName(), "Jane");
        Assert.assertEquals(Woman.getLastName(), "Smith");
        Assert.assertEquals(Woman.getAge(), 61);
        Assert.assertTrue(Woman.hasLory());
    }

    @Test(testName = "Woman has a lory")
    public void testHasLory() {
        Woman Woman = new Woman("Jane", "Smith", 61, true);
        Assert.assertTrue(Woman.hasLory());

        Woman = new Woman("Jane", "Smith", 25, false);
        Assert.assertFalse(Woman.hasLory());
    }

    @Test(testName = "Test for setter Lory")
    public void testSetHasLory() {
        Woman Woman = new Woman("Jane", "Smith", 30, false);
        Assert.assertFalse(Woman.hasLory());

        Woman.setHasLory(true);
        Assert.assertTrue(Woman.hasLory());

        Woman.setHasLory(false);
        Assert.assertFalse(Woman.hasLory());
    }
    @Test(testName = "Woman is retired")
    public void testManRetired() {
        Woman woman = new Woman("Jane", "Smith", 63, false);
        Assert.assertTrue(woman.isRetired(), "Woman should be retired");
    }

    @Test(testName = "Woman is not retired")
    public void testManNotRetired() {
        Woman woman = new Woman("Jane", "Smith", 59, false);
        Assert.assertFalse(woman.isRetired(), "Woman should not be retired");
    }

    @Test(testName = "Test register partnership")
    public void testRegisterPartnership() {
        Person man = new Person("John", "Doe", 30);
        Woman woman = new Woman("Jane", "Smith", 25, true);

        man.registerPartnership(woman);
        Assert.assertEquals(man.getPartner(), woman);
        Assert.assertEquals(woman.getPartner(), man);
        Assert.assertEquals(woman.getLastName(), "Doe");
    }

    @Test (testName = "Test deregister partnership")
    public void testDeregisterPartnership() {
        Person man = new Person("John", "Doe", 30);
        Woman woman = new Woman("Jane", "Smith", 25, true);

        man.registerPartnership(woman);
        man.deregisterPartnership(true);

        Assert.assertNull(man.getPartner());
        Assert.assertNull(woman.getPartner());
        Assert.assertEquals(woman.getLastName(), "Smith");
    }
}
