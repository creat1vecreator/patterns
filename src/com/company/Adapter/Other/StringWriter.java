package com.company.Adapter.Other;

import java.io.IOException;

public interface StringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}

