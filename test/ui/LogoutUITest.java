package ui;
import org.junit.Test;  //<-- um backend zu testen, nix frontend. für anderen stuff: selnium (websiten)
import org.junit.Assert;

public class LogoutUITest{

    private static final String MenuName = "Logout";

    //überflüssig, gibt es schon?

    @Test
    public void testSetMenuName(){
        System.out.println("testSetMenuName");
        UIMenu menu = new LogoutUI();
        Assert.assertEquals(MenuName ,menu.getMenuName() );
        menu.setMenuName("Test");
        Assert.assertEquals("Test", menu.getMenuName());
    }

    @Test
    public void testGetMenuName(){
        System.out.println("testGetMenuName");
        UIMenuInterface menu = new LogoutUI();
        System.out.println(menu.getClass());
        Assert.assertTrue(menu instanceof LogoutUI);
        Assert.assertNotNull(menu.getMenuName());
        Assert.assertEquals( "Logout",menu.getMenuName());
        menu.getMenuName();
    }



}
