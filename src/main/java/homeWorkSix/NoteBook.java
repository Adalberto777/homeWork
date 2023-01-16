package homeWorkSix;

import java.util.Objects;

public class NoteBook {
    private String brand;
    private String model;
    private String display;
    private String processor;
    private String ram;
    private String memory;
    private String os;
    private String color;


    public NoteBook(
            String brand,
            String model,
            String display,
            String processor,
            String ram,
            String memory,
            String os,
            String color
    ) {
        this.brand = brand;
        this.model = model;
        this.display = display;
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Objects.equals(brand, noteBook.brand) && Objects.equals(model, noteBook.model) && Objects.equals(display, noteBook.display) && Objects.equals(processor, noteBook.processor) && Objects.equals(ram, noteBook.ram) && Objects.equals(memory, noteBook.memory) && Objects.equals(os, noteBook.os) && Objects.equals(color, noteBook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", display='" + display + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", memory='" + memory + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}