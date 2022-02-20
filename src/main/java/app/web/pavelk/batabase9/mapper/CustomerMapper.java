package app.web.pavelk.batabase9.mapper;

import app.web.pavelk.batabase9.command.CommandUse;
import app.web.pavelk.batabase9.schema.Customer;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CustomerMapper extends CommandUse {

    @Insert("INSERT INTO customer (name, email ) VALUES(#{name}, #{email} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Customer customer);

    @Select("SELECT id, name, email from customer WHERE id = #{id}")
    Customer findById(long id);

    @Delete("DELETE from customer WHERE id = #{id}")
    Integer deleteById(long id);

}