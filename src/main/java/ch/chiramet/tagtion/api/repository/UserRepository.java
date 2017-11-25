package ch.chiramet.tagtion.api.repository;

import ch.chiramet.tagtion.api.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Integer>{
}
