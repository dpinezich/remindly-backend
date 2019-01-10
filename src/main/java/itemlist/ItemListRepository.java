package itemlist;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "itemlist", path = "itemlist")
public interface ItemListRepository extends PagingAndSortingRepository<ItemList, Long> {

    List<ItemList> findByItemlist(@Param("name") String name);

}