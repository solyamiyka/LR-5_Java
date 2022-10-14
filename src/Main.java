import menu.*;
import taxes.Taxes;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Taxes person = new Taxes();

        Scanner sc = new Scanner(System.in);
        MainMenu menu = new MainMenu();

        while(true){
            System.out.println("\n Available commands: ");
            menu.printAllCommands();
            System.out.println(" Input your command(if you want to exit - print 'quit'): ");
            String command = sc.next();
            if(Objects.equals(command, "quit")){
                break;
            }
            menu.execute(command);
        }

    }

}
