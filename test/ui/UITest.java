package ui;
import org.junit.Test;
import org.junit.Assert;

//to-do:setMenuName  -->wiederholende tests (redunanz) vermindern mit abstrakter Test- klasse (statt "Login" Variablen benutzen)
public abstract class UITest {

    protected abstract UIMenuInterface createMenuInstance();

    protected abstract String getExpectedMenuName();

    @Test
    public final void testGetMenuName() {
        System.out.println("testGetMenuName");
        UIMenuInterface menu = createMenuInstance();
        System.out.println(menu.getClass().toString());
        Assert.assertTrue(menu.getClass().getSimpleName().endsWith(getExpectedMenuName()));
        Assert.assertNotNull(menu.getMenuName());
        Assert.assertEquals(getExpectedMenuName(), menu.getMenuName());
    }

    @Test
    public final void testIsExit() {
        System.out.println("testIsExit");
        UIMenuInterface menu = createMenuInstance();
        Assert.assertFalse(menu.isExit());
    }
}



