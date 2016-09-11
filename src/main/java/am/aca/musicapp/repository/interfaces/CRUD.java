package am.aca.musicapp.repository.interfaces;

/**
 * Created by Narek on 11.09.2016.
 */
public interface CRUD<T> {

    T create(T obj);

    T read(T obj);

    T update(T obj);

    void delete(T obj);

}
