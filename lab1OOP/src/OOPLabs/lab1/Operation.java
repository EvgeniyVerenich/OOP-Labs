package OOPLabs.lab1;

public interface Operation<T, U> {

    T sum(U u);
    T difference(U u);
    T multiply(U u);
    T division(U u);

}
