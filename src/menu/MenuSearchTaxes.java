package menu;

import taxes.Income;
import taxes.Taxes;

import java.util.ArrayList;

public class MenuSearchTaxes implements MenuItem{

    @Override
    public void execute(){
        new Taxes().searchTaxes();
    }

}