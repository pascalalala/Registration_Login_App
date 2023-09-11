package ui;


public abstract class UIMenu implements UIMenuInterface {

    private String menuName = "Menu";


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    @Override
    public void showDialog() {
        System.out.println("Menu: " + this.getMenuName());
        System.out.println("Exiting...");
    }

    public boolean isExi(){
        return false;
}







    @Override
    public boolean isExit() {
        return true;
    }





}
