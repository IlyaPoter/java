package org.example.modelLaptop;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class Criterion {
    public static Map getCriteria() {
        Map<Integer, String> mapCriteria = new HashMap<>();
        mapCriteria.put(1, "Цвет");
        mapCriteria.put(2, "Размер HDD, Гб");
        mapCriteria.put(3, "Объем оперативной памяти, Гб");
        mapCriteria.put(4, "Операционная система");
        mapCriteria.put(5, "Размер дисплея, дюймов");
        mapCriteria.put(6, "Стоимость, тыс. руб.");
        return mapCriteria;
    }
    public static Map colorMap() {
        Map<Integer, String> modelsMap = new HashMap<>();
        modelsMap.put(1, "Белый");
        modelsMap.put(2, "Черный");
        modelsMap.put(3, "Цветной");
        return modelsMap;
    }
    public static Map getOS() {
        Map<Integer, String> operSystemMap = new HashMap<>();
        operSystemMap.put(1, "Windows");
        operSystemMap.put(2, "Linux");
        return operSystemMap;
    }
    public static List getHDD() {
        ArrayList<String> hardDiskVolumeList = new ArrayList<>(Arrays.asList("125", "256", "512"));
        return hardDiskVolumeList;
    }
    public static List getMemory() {
        ArrayList<String> operMemoryList = new ArrayList<>(Arrays.asList("4", "8", "16"));
        return operMemoryList;
    }
    public static List getDiagonal() {
        ArrayList<String> diagonalList = new ArrayList<>(
                Arrays.asList("15", "17", "21"));
        return diagonalList;
    }
    public static List getCash() {
        ArrayList<String> cashList = new ArrayList<>(
                Arrays.asList("15", "20", "30", "40"));
        return cashList;
    }
}