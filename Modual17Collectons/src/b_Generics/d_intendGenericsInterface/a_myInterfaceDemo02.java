package b_Generics.d_intendGenericsInterface;

import java.util.Arrays;

public class a_myInterfaceDemo02<E> implements a_myInterfaceDemo01<E>{

    Object[] obj = new Object[10];
    int size;

    public E get(int indext) {
        return (E) obj[indext];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

    @Override
    public boolean add(E e) {
        obj[size]=e;
        size++;
        return true;
    }
}

