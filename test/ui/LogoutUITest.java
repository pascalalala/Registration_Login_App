package ui;
import org.junit.Test;  //<-- um backend zu testen, nix frontend. für anderen stuff: selnium (websiten)
import org.junit.Assert;

public class LogoutUITest extends UIMenu{

    private static final String MenuName = "Logout";

    //überflüssig, gibt es schon?

    @Test
    public void testSetMenuName(){
        System.out.println("testSetMenuName");
        UIMenu menu = new LogoutUI();
        Assert.assertEquals(menu.getMenuName(), MenuName);
        menu.setMenuName("Test");
        Assert.assertEquals(menu.getMenuName(), "Test");
    }

    @Test
    public void getGetMenuName(){
        System.out.println("testGetMenuName");
        UIMenuInterface menu = new LogoutUI();
        System.out.println(menu.getClass());

    }
}
