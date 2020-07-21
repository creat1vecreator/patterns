package com.company.Adapter.Table;

public class TableDemonstration implements ATable {
    @Override
    public String getCurrentUserName() {
        return "This table was implemented by ATable";
    }

    @Override
    public String getTableName() {
        return "TableDemonstration part";
    }
}
