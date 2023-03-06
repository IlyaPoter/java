package org.example.modelLaptop;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> criteriaMap = Criterion.getCriteria();
        System.out.println("Здесь Вы можете выбрать ноутбук. Выберите фильтры, нажав цифру от 1 до 6.");

        for (Map.Entry<Integer, String> entry : criteriaMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getResult();
    }

    public static Map getUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбрав фильтры, нажмите 666 для отображения результатов.");

        Map<Integer, Integer> userFilter = new HashMap<>();
        Map<Integer, String> models = Criterion.colorMap();
        Map<Integer, String> operSystem = Criterion.getOS();

        Integer criteria = -1;
        do {
            System.out.print("Какой критерий: ");
            criteria = sc.nextInt();
            if (criteria == 1) {
                System.out.print("Выберите цвет: ");
                System.out.println(models);
                Integer criteria1 = sc.nextInt();
                userFilter.putIfAbsent(criteria, criteria1);
            } else if (criteria == 2) {
                System.out.print("Размер HDD: ");
                System.out.println(Criterion.getHDD());
                Integer criteriaHDD = sc.nextInt();
                userFilter.putIfAbsent(criteria, criteriaHDD);
            } else if (criteria == 3) {
                System.out.print("Объем оперативной памяти: ");
                System.out.println(Criterion.getMemory());
                Integer criteriaMemory = sc.nextInt();
                userFilter.putIfAbsent(criteria, criteriaMemory);
            } else if (criteria == 4) {
                System.out.print("Операционная система: ");
                System.out.println(operSystem);
                Integer criteriaOS = sc.nextInt();
                userFilter.put(criteria, criteriaOS);
            } else if (criteria == 5) {
                System.out.print("Диагнональ экрана: ");
                System.out.println(Criterion.getDiagonal());
                Integer criteriaDiag = sc.nextInt();
                userFilter.put(criteria, criteriaDiag);
            } else if (criteria == 6) {
                System.out.print("Максимальная цена, тыс. руб.: ");
                System.out.println(Criterion.getCash());
                Integer criteriMaxCash = sc.nextInt();
                userFilter.put(criteria, criteriMaxCash);
            } else {
                if (criteria != 666) {
                    System.out.println("Выбрали не верный фильтр");
                }
            }
        } while (criteria != 666);
        sc.close();
        return userFilter;
    }

    public static void getResult() {
        List<Loptop> computersList = Loptop.getList();
        Map<Integer, Integer> userChoiceMap = getUserChoice();
        Integer count = 0;
        for (int i = 0; i < computersList.size(); i++) {
            Map<Integer, Integer> notebook = new HashMap<>();
            if (computersList.get(i).getColor().equals(Criterion.colorMap().get(1))) {
                notebook.put(1, 1);
            } else if (computersList.get(i).getColor().equals(Criterion.colorMap().get(2))) {
                notebook.put(1, 2);
            } else if (computersList.get(i).getColor().equals(Criterion.colorMap().get(3))) {
                notebook.put(1, 3);
            } else
                notebook.put(1, 4);

            notebook.put(2, computersList.get(i).getVolumeHDD());
            notebook.put(3, computersList.get(i).getMemory());

            if (computersList.get(i).getOs().equals(Criterion.getOS().get(1))) {
                notebook.put(4, 1);
            } else if (computersList.get(i).getOs().equals(Criterion.getOS().get(2))) {
                notebook.put(4, 2);
            } else
                notebook.put(4, 3);

            notebook.put(5, computersList.get(i).getDiagonal());
            notebook.put(6, computersList.get(i).getCash());

            Map<Integer, Integer> result = new HashMap(notebook);
            result.entrySet().retainAll(userChoiceMap.entrySet());
            if (result.size() == userChoiceMap.size()) {
                System.out.println();
                System.out.println(computersList.get(i));
            } else
                count--;
        }

        if (count <= -8)
            System.out.println("\nПо указанным фильтрам ноутбук отсутствует!");
    }

}