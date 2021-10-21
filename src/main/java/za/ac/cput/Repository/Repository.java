package za.ac.cput.Repository;
/**
 * Mziyanda Mwanda
 * 215133765
 * ADP3
 * Cap stone
 * */
public interface Repository<T, ID> {

    T create(T t);

    T read(ID id);

    T update(T t);

    void delete(ID id);
}
