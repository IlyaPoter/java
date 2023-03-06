package org.example.modelLaptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Loptop {
    String color;
    Integer volumeHDD;
    Integer memory;
    String os;
    Integer diagonal;
    Integer cash;

    @Override
    public String toString() {
        return String.format("Цвет: %s\n" +
                "Размер HDD, Гб: %d\n" +
                "Объем оперативной памяти, Гб: %d\n" +
                "OS: %s\n" +
                "Размер дисплея, дюймов: %d\n" +
                "Цена, тыс. руб.: %d\n", color, volumeHDD, memory, os, diagonal, cash);
    }
    public static List getList() {
        Loptop lt1 = new Loptop("Белый", 125, 4, "Windows", 15, 15);
        Loptop lt2 = new Loptop("Белый", 125, 4, "Windows", 15, 15);
        Loptop lt3 = new Loptop("Белый", 125, 4, "Windows", 15, 20);
        Loptop lt4 = new Loptop("Черный", 256, 8, "Windows", 17, 20);
        Loptop lt5 = new Loptop("Черный", 256, 8, "Windows", 17, 30);
        Loptop lt6 = new Loptop("Черный", 256, 8, "Linux", 17, 30);
        Loptop lt7 = new Loptop("Цветной", 512, 16, "Linux", 21, 40);
        Loptop lt8 = new Loptop("Цветной", 512, 16, "Windows", 21, 40);
        Loptop lt9 = new Loptop("Цветной", 512, 16, "Windows", 21, 40);
        List<Loptop> loptopslist = new ArrayList<>();
        loptopslist.add(lt1);
        loptopslist.add(lt2);
        loptopslist.add(lt3);
        loptopslist.add(lt4);
        loptopslist.add(lt5);
        loptopslist.add(lt6);
        loptopslist.add(lt7);
        loptopslist.add(lt8);
        loptopslist.add(lt9);
        return loptopslist;
    }
}