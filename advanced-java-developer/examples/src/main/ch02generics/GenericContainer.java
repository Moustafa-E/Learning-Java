package main.ch02generics;

public class GenericContainer<T> {
    // <T> is the type parameter. <E> element, <R> return etc. 
    // Can be used anywhere a regular typing would. Whatever is passed in during instantiation will be substituted with T.
    private T contents;
    public T unload() {
        T temp = contents;
        return temp;
    }
    public void load(T contents){
        this.contents = contents;
    }

}
