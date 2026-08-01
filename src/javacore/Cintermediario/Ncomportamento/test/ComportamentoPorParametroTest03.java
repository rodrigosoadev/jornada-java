package javacore.Cintermediario.Ncomportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javacore.Cintermediario.Ncomportamento.dominio.Car;
import javacore.Cintermediario.Ncomportamento.interfaces.CarPredicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
       
        List<Car> grennCars = filter(cars, car ->  car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car ->  car.getColor().equals("Green"));
        List<Car> yearBeforeCars = filter(cars, car ->  car.getYear() < 2015);
        
        System.out.println(grennCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0 ));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if ((predicate.test(e))) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }

   

}