//package org.example.model;
//
//import org.example.model.Items;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main3 {
//    public static void main(String[] args) {
//        Items items = new Items("qwe", "zxc", 3);
//        Items items2 = new Items("qwe1", "asd1", 3);
//        Items items3 = new Items("qwe2", "asd2", 3);
//        Items items4 = new Items("qwe", "zxc", 4);
//
//        List<Items> itemsList = new ArrayList<>();
//        itemsList.add(items);
//        itemsList.add(items2);
//        itemsList.add(items3);
//        itemsList.add(items4);
//        System.out.println(itemsList);
//        String searchName = "qwe";
//        Integer sumVolume = 0 ;
//        List<String> country = new ArrayList<>();
//        for (int i = 0; i < itemsList.size(); i++) {
//            if(itemsList.get(i).getName().equals(searchName)){
//                sumVolume+=itemsList.get(i).getVolume();
//                boolean f = true;
//                for (int j = 0; j < country.size(); j++) {
//                    if(itemsList.get(i).getCountry().equals(country.get(j))){
//                        f = false;
//                    }
//                }
//                if(f){
//                    country.add(itemsList.get(i).getCountry());
//                }
//            }
//        }
//        System.out.println("c= " + country);
//        System.out.println("sumVolume=" + sumVolume);
//    }
//}