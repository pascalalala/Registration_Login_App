package ui;

public class LogoutUI extends UIMenu {

    private static final String menuName = "Logout";

    public LogoutUI() {
        this.setMenuName(menuName);
    }

    @Override
    public boolean isExit() {
        return false;
    }


}
