package app.web.pavelk.batabase9.schema;


import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Product {

    private final Integer id;
    private final String name;
    private final Integer cost;

}
