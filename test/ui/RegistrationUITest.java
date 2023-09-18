package ui;

public class RegistrationUITest extends UITest{

    private static final String MenuName = "Registration";
    @Override
    protected UIMenuInterface createMenuInstance() {
        return new RegistrationUI();
    }

    @Override
    protected String getExpectedMenuName() {
        return RegistrationUITest.MenuName;
    }

}
