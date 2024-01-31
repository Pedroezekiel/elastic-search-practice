package elasticsearch.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "employee")
@Getter
@Setter
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String department;


}
