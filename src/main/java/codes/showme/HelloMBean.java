package codes.showme;

public interface HelloMBean {
    // operations

    void sayHello();

    int add(int x, int y);

    // attributes

    // a read-only attribute called Name of type String
    String getName();

    // a read-write attribute called CacheSize of type int
    int getCacheSize();

    void setCacheSize(int size);
}
