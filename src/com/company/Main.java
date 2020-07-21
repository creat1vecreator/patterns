package com.company;

import com.company.Adapter.Other.AdapterFileOutputStream;
import com.company.Adapter.Other.SomeOutputStream;
import com.company.Adapter.Table.TableAdapter;
import com.company.Adapter.Table.TableDemonstration;
import com.company.Singleton.*;
import com.company.Wrapper.Decorator.DecoratorMyRunnableImpl;
import com.company.Wrapper.Decorator.DecoratorRunnableImpl;
import com.company.Wrapper.Decorator.RunnableImpl;
import com.company.Wrapper.TabbleWrapper.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        String delimiter = "---------------------------------";


        System.out.println("Demonstration of singleton");
        System.out.println("first example: ");
        OurPresident expectedPresident = OurPresident.getOurPresident();
        System.out.println("creating the first entity");
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println("creating the second entity");
        System.out.println("checking the result");
        System.out.println(expectedPresident == ourPresident);
        System.out.println(delimiter);

        System.out.println("second example: ");
        IMF fund = IMF.getFund();
        System.out.println("created the first entity");
        IMF anotherFund = IMF.getFund();
        System.out.println("created the second entity");
        System.out.println("checking the result");
        System.out.println(fund == anotherFund);
        System.out.println(delimiter);

        System.out.println("Demonstration of wrapper using threads");
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
        System.out.println(delimiter);

        System.out.println("second example");
        TableWrapperDemonstration tableWrapperDemonstration = new TableWrapperDemonstration(new TableInterfaceWrapper());
        System.out.println(delimiter);

        System.out.println("Demonstration of adapter");
        System.out.println("first example");
        TableAdapter tableAdapter = new TableAdapter(new TableDemonstration());
        System.out.println("Method from BTable interface: ");
        System.out.println(tableAdapter.getHeaderText());
        System.out.println("Method from ATable interface: ");
        System.out.println(tableAdapter.aTable.getTableName());

    }
}


