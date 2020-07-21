package com.company.Adapter.Other;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SomeOutputStream extends FileOutputStream implements StringWriter  {

    public SomeOutputStream() throws FileNotFoundException {
        super("");

    }
    public SomeOutputStream(String name) throws FileNotFoundException {
        super(name);
    }


    @Override
    public void flush() throws IOException {

    }

    @Override
    public void writeString(String s) throws IOException {
        s.toUpperCase();
        System.out.println( s + "String from class that implements String Writer");
    }

    @Override
    public void close() throws IOException {

    }

}
