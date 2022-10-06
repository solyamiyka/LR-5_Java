package menu;

import taxes.Taxes;

public class MenuDefineSet implements MenuItem {

    private Taxes taxes;

    public MenuDefineSet(Taxes taxes) {
        this.taxes = taxes;
    }

    @Override
    public void execute(){
        taxes.defineSetTaxes();
    }
}
