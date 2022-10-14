package menu;

import taxes.Taxes;

public class MenuSearchTaxes implements MenuItem{

    @Override
    public void execute(){
        new Taxes().searchTaxes();
    }

}