package menu;

import taxes.Taxes;

public class MenuSortTaxes implements MenuItem{

    private Taxes taxes;

    public MenuSortTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    @Override
    public void execute(){
        taxes.sortTaxes();
    }
}
