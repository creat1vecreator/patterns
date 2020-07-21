package com.company.Wrapper.TabbleWrapper;

import java.util.List;

public class TableWrapperDemonstration implements TableInterface {
    TableInterface tableInterface;

    public TableWrapperDemonstration(TableInterface tableInterface) {
        this.tableInterface = tableInterface;
    }
    @Override
    public void setModel(List rows) {

    }

    @Override
    public String getHeaderText() {
        return null;
    }

    @Override
    public void setHeaderText(String newHeaderText) {

    }
}
