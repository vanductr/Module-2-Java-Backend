package ra.demo.service;

import java.util.List;

public interface GenericService<T, U> {
    List<T> fillAll();

    T findById(U id);

    void save(T t);

    void deleteById(U id);
}
