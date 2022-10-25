package taxes;

import java.util.*;
import java.util.stream.Collectors;


public class Taxes extends Income {
    public Taxes(){}

    Scanner sc = new Scanner(System.in);
   public ArrayList<Income> createListOfTax(){

        ArrayList<Income> taxes = new ArrayList<>();

        Income income1 = new Income("award", 1970.00);
        Income income2 = new Income("main income", 65200.00);
        Income income3 = new Income("financial aid", 2460);

        addIncome(taxes, income1);
        addIncome(taxes, income2);
        addIncome(taxes, income3);

        return taxes;
    }
    public void addIncome(ArrayList<Income> taxes, Income income){
        income.getPercentageOfTax();
        income.getSizeOfTax();
        taxes.add(income);

    }
    public ArrayList<Income> taxes = createListOfTax();

    public void defineSetTaxes(){

        if (taxes.isEmpty()) {
            return;
        }

        Set<Double> taxesSet = new HashSet<>();
        for(Income tax: taxes){
            taxesSet.add(tax.getSizeOfTax());
        }
        System.out.println("Set of taxes:");
        for (Double obj : taxesSet)
            System.out.println(obj);
    }

    public void defineSumTaxes(){

        if (taxes.isEmpty()) {
            return;
        }

        double total = 0.0;
        for(Income tax: taxes){
            total += tax.getSizeOfTax();
        }
        System.out.println("Sum of taxes: " + total);

    }
    public void sortTaxes(){

        ArrayList<Income> sortedTaxes = new ArrayList<>(taxes);

        System.out.println("\n Input how to sort: 1 - by ascending or 2 - by descending: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            sortedTaxes.sort(new ComparatorSortAsc());
        } else {
            sortedTaxes.sort(new ComparatorSortDes());
        }
        System.out.println("Sorted taxes:");
        info(sortedTaxes);

    }
    public void searchTaxes(){
        taxes = filterTaxes();
        info(taxes);
    }
    public ArrayList<Income> filterTaxes(){

        System.out.println("\n Input what parameters to filter by: 1 - size of income or 2 - size of tax: ");
        int choice = sc.nextInt();
        System.out.println("Enter a range for searching: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Taxes searched by given parameters:");
        if (choice == 1){
            return taxes.stream().filter(k -> k.getSizeOfIncome() > a && k.getSizeOfIncome() < b).collect(Collectors.toCollection(ArrayList::new));
        }
        else{
            return taxes.stream().filter(k -> k.getSizeOfTax() > a && k.getSizeOfTax() < b ).collect(Collectors.toCollection(ArrayList::new));
        }

    }

    public void info(ArrayList<Income> taxes){
        for(int i = 0; i < taxes.size(); i++) {
        System.out.print((i + 1) + ". " + taxes.get(i).toString() + "\n");
        }
    }

}
