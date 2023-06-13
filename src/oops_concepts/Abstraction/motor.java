package oops_concepts.Abstraction;

public interface motor {

    //in interface; we cannot just declare a variable, we need to initialize it, and it is considered as final by default
    int speed =160;

    //this abstract method, is public by default,we cannot declare it otherwise
    void enginefuel();

    void engine();

    void enginesize();

}
