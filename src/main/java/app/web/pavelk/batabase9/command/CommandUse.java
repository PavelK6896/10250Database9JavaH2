package app.web.pavelk.batabase9.command;

public interface CommandUse {

    void insert(Object o);

    Object findById(long id);

    Integer deleteById(long id);

}
