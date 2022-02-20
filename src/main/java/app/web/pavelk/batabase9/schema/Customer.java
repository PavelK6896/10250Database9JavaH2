package app.web.pavelk.batabase9.schema;


import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Customer {

    private final Integer id;
    private final String name;
    private final String email;

}
