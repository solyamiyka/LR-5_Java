package menu;

import taxes.Taxes;

public class MenuSortTaxes implements MenuItem{

    @Override
    public void execute(){
        new Taxes().sortTaxes();
    }
}
