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


}
