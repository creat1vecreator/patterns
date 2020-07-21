package com.company.Adapter.Other;

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements StringWriter {

    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) {

    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();

    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());

    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

