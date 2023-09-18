package ui;

import org.junit.Assert;
import org.junit.Test;

public class LoginUITest {

    //to-do:setMenuName  -->wiederholende tests (redunanz) vermindern mit abstrakter Test- klasse (statt "Login" Variablen benutzen)
    private static final String MenuName = "Login";
    @Test
    public void testGetMenuName(){
        System.out.println("testGetMenuName");
        UIMenuInterface loginMenu = new LoginUI();
        System.out.println(loginMenu.getClass().toString());
        Assert.assertTrue(loginMenu instanceof LoginUI);
        Assert.assertNotNull(loginMenu.getMenuName());
        Assert.assertEquals(MenuName,loginMenu.getMenuName());
        loginMenu.getMenuName();
    }

    @Test
    public void testIsLogin(){
        System.out.println("testIsLogin");
        UIMenuInterface loginMenu = new LoginUI();
        Assert.assertFalse(loginMenu.isExit());
    }

}
