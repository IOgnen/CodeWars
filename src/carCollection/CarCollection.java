package carCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarCollection {

    public Collection<Car> cars;

    public void addCar(Car car) {
        cars.add(car);
    }

    public void sortByPrice(boolean ascending) {

        if(ascending) {
            cars.stream().sorted(Comparator.comparing(Car::getPrice).thenComparing(Comparator.comparing(Car::getPower))).collect(Collectors.toList());
        } else {
            cars.stream().sorted(Comparator.comparing(Car::getPrice).reversed().thenComparing(Comparator.comparing(Car::getPower))).collect(Collectors.toList());

        }
    }

    public List<Car> filterByManufacturer(String manufacturer) {

        return cars.stream().filter(car -> car.getManufacturer().equalsIgnoreCase(manufacturer))
                .sorted(Comparator.comparing(Car::getModel))
                .collect(Collectors.toList());
    }

    public List<Car> getList() {
        return new ArrayList<>(cars);
    }
}
