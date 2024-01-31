package elasticsearch.repository;

import elasticsearch.models.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
}
