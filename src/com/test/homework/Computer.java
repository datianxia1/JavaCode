package com.test.homework;

public class Computer {
    private String cpu;
    private String ram;
    private String disk;

    public Computer(String cpu, String ram, String disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public Computer() {
    }

    public void getDetails() {
        System.out.println("cpu:" + cpu + " ram:" + ram + " disk:" + disk);
    }
}

class PC extends  Computer {
    private String brand;

    public PC(String cpu, String ram, String disk, String brand) {
        super(cpu, ram, disk);
        this.brand = brand;
    }

    public PC(String brand) {
        this.brand = brand;
    }

    public void getDetails() {
        System.out.println("brand:" + brand + " ");
        super.getDetails();
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, String ram, String disk, String color) {
        super(cpu, ram, disk);
        this.color = color;
    }

    public NotePad(String color) {
        this.color = color;
    }

    public void getDetails() {
        System.out.println("color:" + color + " ");
        super.getDetails();
    }
}

class Test {
    public static void main(String[] args) {

        PC pc = new PC("corei7", "18G", "1T", "ROG");
        pc.getDetails();
        NotePad pad = new NotePad("corei11", "32G", "5T", "black");
        pad.getDetails();
    }
}