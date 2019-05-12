package lesson4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LargestCity {



    public  static Map<String, String> getState(Collection<City> cities){

        return cities.stream().collect(Collectors.groupingBy(City::getState), Collectors.groupingBy(City::getState));
    }

    public static void main(String[] args) {
        Collection <City> cities = new ArrayList<>();
        cities.add(new City("New York", 100500));
        System.out.println(getState(cities));
    }

}


