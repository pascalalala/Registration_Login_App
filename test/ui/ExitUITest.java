package ui;

import org.junit.Assert;
import org.junit.Test;

public class ExitUITest {



    @Test
    public void testGetMenuName(){
        System.out.println("testGetMenuName");
        UIMenuInterface exitMenu = new ExitUI();
        System.out.println(exitMenu.getClass().toString());
        Assert.assertTrue(exitMenu instanceof ExitUI);
        Assert.assertNotNull(exitMenu.getMenuName());
        Assert.assertEquals(exitMenu.getMenuName(), "Exit");
        exitMenu.getMenuName();
    }

    @Test
    public void testIsExit(){
        System.out.println("testIsExit");
        UIMenuInterface exitMenu = new ExitUI();
        Assert.assertTrue(exitMenu.isExit());
    }

}
