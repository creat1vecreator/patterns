package com.company.Wrapper.TabbleWrapper;

import java.util.List;

public interface TableInterface {
    void setModel(List rows);

    String getHeaderText();

    void setHeaderText(String newHeaderText);
}
