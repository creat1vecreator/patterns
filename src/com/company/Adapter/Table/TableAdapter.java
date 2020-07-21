package com.company.Adapter.Table;

import com.company.Adapter.Table.ATable;
import com.company.Adapter.Table.BTable;

public class TableAdapter implements BTable {

    public ATable aTable;

    public TableAdapter(ATable aTable) {
        this.aTable = aTable;
    }


    @Override
    public String getHeaderText() {
        return '[' + aTable.getCurrentUserName() + ']' + " : " + aTable.getTableName();
    }
}
