package chap_08;

import chap_07.*;
import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution = "FHD" // default 해당 클래스 내에서만 가능
        // b1.price = 200000; // private 해당 클래스 네에서만 가능
        // b1. color = "블랙"; // protected 해당 클래스 내에서만 가능



    }
}
