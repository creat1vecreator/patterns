package com.company.Singleton;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized (OurPresident.class) {
            president = president == null ? new OurPresident() : getOurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
