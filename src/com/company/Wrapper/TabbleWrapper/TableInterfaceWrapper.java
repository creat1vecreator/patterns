package com.company.Wrapper.TabbleWrapper;

import java.util.List;

public class TableInterfaceWrapper implements TableInterface {
    private TableInterface tableInterface;

    public TableInterfaceWrapper() {

    }

    public TableInterfaceWrapper(TableInterface tableInterface) {
        this.tableInterface = tableInterface;
    }

    @Override
    public void setModel(List rows) {
        System.out.println(rows.size());
        tableInterface.setModel(rows);
    }

    @Override
    public String getHeaderText() {
        return tableInterface.getHeaderText().toUpperCase();
    }

    @Override
    public void setHeaderText(String newHeaderText) {
        tableInterface.setHeaderText(newHeaderText);
    }
}
