package com.company.Singleton;

public class IMF {
    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class) {
            imf = imf == null ? new IMF() : imf;
        }
        return imf;
    }

    private IMF() {

    }
}

