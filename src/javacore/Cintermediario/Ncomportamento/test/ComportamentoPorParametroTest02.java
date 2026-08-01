package javacore.Cintermediario.Ncomportamento.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Cintermediario.Ncomportamento.dominio.Car;
import javacore.Cintermediario.Ncomportamento.interfaces.CarPredicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        /* List<Car> grennCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car){
                return car.getColor().equals("Green");
            }
        });
        System.out.println(grennCars); */

        List<Car> grennCars = filter(cars, car ->  car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car ->  car.getColor().equals("Green"));
        List<Car> yearBeforeCars = filter(cars, car ->  car.getYear() < 2015);
        
        System.out.println(grennCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }

        }
        return filteredCar;
    }

}