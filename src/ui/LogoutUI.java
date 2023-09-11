package ui;

public class LogoutUI extends UIMenu {

    public LogoutUI() {
        this.setMenuName("Logout");
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
