package com.laptop;

public class Test {
    public static void main(String[] args) {
        Laptop mouse = new Mouse();
        Laptop keyBoard = new KeyBoard();
      Laptop.Run();
      Laptop.UseUsb(mouse);
        KeyBoard keyBoard1 = new KeyBoard();
        Laptop.UseUsb(keyBoard1);
    }
}
