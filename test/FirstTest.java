import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import database.inMemoryDatabase;
public class FirstTest {



    @Test
    public void testIfInitialDBisEmpty(){

        System.out.println("testMyFirstTest");
       // assertTrue, assertFalse, assertEquals(1==2);
        inMemoryDatabase db = new inMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);
    }


}