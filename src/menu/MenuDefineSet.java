package menu;

import taxes.Taxes;

import java.util.ArrayList;

public class MenuDefineSet implements MenuItem {

    @Override
    public void execute(){
        new Taxes().defineSetTaxes();
    }
}
