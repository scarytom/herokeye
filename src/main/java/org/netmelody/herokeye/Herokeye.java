package org.netmelody.herokeye;

import org.netmelody.cieye.CiEye;

public final class Herokeye {
    public static void main(String[] args) {
        try {
            CiEye.main(new String[] { System.getenv("PORT") });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
