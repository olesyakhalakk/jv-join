package mate.jdbc.dao;

import java.util.List;
import java.util.Optional;
import mate.jdbc.model.Car;

public interface CarDao {
    Car create(Car car);

    Optional<Car> get(Long id);

    List<Car> getAll();

    Car update(Car car);

    boolean delete(Long id);

    Car addDriverToCar(Car car);

    boolean removeDriverFromCar(Car car);

    List<Car> getAllByDriver(Long driverId);
}