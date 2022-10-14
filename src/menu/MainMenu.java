package menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu {
    private final Map<String, MenuItem> menuItems;
    private Map<String, String> help;
    public MainMenu(){
        menuItems = new LinkedHashMap<>();
        menuItems.put("defineSet", new MenuDefineSet());
        menuItems.put("defineSum", new MenuDefineSum());
        menuItems.put("search", new MenuSearchTaxes());
        menuItems.put("sort", new MenuSortTaxes());

    }
    public void help(){
        help = new LinkedHashMap<>();
        help.put(" defineSet ", " This function define set of taxes for person\n");
        help.put("defineSum ", " This function define sum of taxes for person\n");
        help.put("search ", " This function search taxes for person\n");
        help.put("sort ", " This function sort taxes for person\n");
    }

    public void execute(String command){
        menuItems.getOrDefault(command, ()->
                        System.out.println("Incorrect input! Try again!"))
                .execute();

    }

    public void printAllCommands(){
        help();
        System.out.println(help);
    }
}
