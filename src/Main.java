import menu.*;
import taxes.Invoker;
import taxes.Taxes;

public class Main {
    public static void main(String[] args) {

        Taxes person = new Taxes();

        MenuItem defSet = new MenuDefineSet(person);
        MenuItem defSum = new MenuDefineSum(person);
        MenuItem search = new MenuSearchTaxes(person);
        MenuItem sort = new MenuSortTaxes(person);


        Invoker person1 = new Invoker(defSet,defSum,search,sort);

        person1.defineSetTaxes();
        person1.defineSumTaxes();

        person1.searchTaxes();
        person1.sortTaxes();

    }
}