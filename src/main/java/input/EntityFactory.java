package input;

public interface EntityFactory<T> {
    T create(String[] args);
}
