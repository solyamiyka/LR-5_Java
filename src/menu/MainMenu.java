package menu;

import taxes.Income;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MainMenu {
    private final Map<String, MenuItem> menuItems;

    public MainMenu(){
        menuItems = new LinkedHashMap<>();
        menuItems.put("defineSet", new MenuDefineSet());
        menuItems.put("defineSum", new MenuDefineSum());
        menuItems.put("search", new MenuSearchTaxes());
        menuItems.put("sort", new MenuSortTaxes());

    }
    public void help(String func){

        switch(func){
            case("defineSet")->
                    System.out.println(" defineSet - This function define set of taxes for person");
            case("defineSum")->
                    System.out.println(" defineSum - This function define sum of taxes for person");
            case("search")->
                    System.out.println(" search - This function search taxes for person");
            case("sort")->
                    System.out.println(" sort - This function sort taxes for person");
        }

    }

    public void execute(String command){
        menuItems.getOrDefault(command, ()->
                        System.out.println("Incorrect input! Try again!"))
                .execute();

    }

    public void printAllCommands(){

        for (Map.Entry<String, MenuItem> entry: menuItems.entrySet()) {
            String func = entry.getKey();
            help(func);
        }

    }
}
