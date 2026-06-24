package main.ch02generics;

public class Container<T> {
    // <T> is the type parameter. <E> element, <R> return value, <K> key, <V> value. Just convention. They're all interchangeable. 
    // Can be used anywhere a regular typing would. Whatever is passed in during instantiation will be substituted with T.
    private T contents;
    public T unload() {
        return this.contents;
    }
    public void load(T contents){
        this.contents = contents;
    }

}
