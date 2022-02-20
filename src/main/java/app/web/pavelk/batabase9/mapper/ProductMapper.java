package app.web.pavelk.batabase9.mapper;

import app.web.pavelk.batabase9.command.CommandUse;
import app.web.pavelk.batabase9.schema.Product;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ProductMapper extends CommandUse {

    @Insert("INSERT INTO product (name, cost ) VALUES(#{name}, #{cost} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Product product);

    @Select("SELECT id, name, cost from product WHERE id = #{id}")
    Product findById(long id);

    @Delete("DELETE from product WHERE id = #{id}")
    Integer deleteById(long id);

}