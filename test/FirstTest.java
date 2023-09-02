import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import database.inMemoryDatabase;
import dao.User;
public class FirstTest {



    @Test
    public void testIfInitialDBisEmpty(){

        System.out.println("testMyFirstTest");
       // assertTrue, assertFalse, assertEquals(1==2);
        inMemoryDatabase db = new inMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);
    }

    @Test
    public void testIfDBContainsUser(){

        System.out.println("testIfDBContainsUser");
        // assertTrue, assertFalse, assertEquals(1==2);
        inMemoryDatabase db = new inMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);

        User user1 = new User();
        db.addUser(user1);
        int size2 = db.getAllUser().size();
        Assert.assertTrue(size2 == 1);
    }



}