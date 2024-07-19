package app;
import data.DataRepository;
import view.AppMenu;

public class Main {
	
	public static DataRepository data = new DataRepository();

	public static void main(String[] args) {
		AppMenu.showMainMenu();

	}
}
