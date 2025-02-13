package createAndValidate.factory;


public interface EntityFactory<T> {
    T create(String[] args);
}

