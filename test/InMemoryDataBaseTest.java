import dao.User;
import database.inMemoryDatabase;
import org.junit.Assert;
import org.junit.Test;

public class InMemoryDataBaseTest {

    @Test
    public void testIfInitialDBIsEmpty() {
        System.out.println("testIfInitialDBIsEmpty");
        inMemoryDatabase db = new inMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);
    }


    @Test
    public void testIfDBContainsOneUser() {
        System.out.println("testIfDBContainsOneUser");
        inMemoryDatabase db = new inMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);

        User user1 = new User();
        db.addUser(user1);
        int size2 = db.getAllUser().size();
        Assert.assertTrue(size2 == 1);
    }

    @Test
    public void testGetUserById() {
        System.out.println("testGetUserById");
        inMemoryDatabase db = new inMemoryDatabase();
        //User #1
        User user1 = new User();
        user1.setId(1);
        db.addUser(user1);

        System.out.println("");
        User userT1 = db.getUser(1);
        Assert.assertNotNull(userT1);
        Assert.assertEquals(user1.getId(), userT1.getId());

        System.out.println("");
        User userT2 = db.getUser(2);
        Assert.assertNull(userT2);
    }

    @Test
    public void testGetUserByEmail() {
        System.out.println("testGetUserByEmail");
        inMemoryDatabase db = new inMemoryDatabase();
        //User #1
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("social@solovyov.de");
        db.addUser(user1);

        System.out.println("");
        User userT1 = db.getUser("social@solovyov.de");
        Assert.assertNotNull(userT1);
        Assert.assertEquals(user1.getEmail(), userT1.getEmail());

        System.out.println("");
        User userT2 = db.getUser("test@solovyov.de");
        Assert.assertNull(userT2);
    }


}
