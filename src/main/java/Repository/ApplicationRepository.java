package Repository;


import org.springframework.data.repository.CrudRepository;

import com.example.grupox.demo.entity.Application;


public interface ApplicationRepository extends CrudRepository<Application, Long>{

}