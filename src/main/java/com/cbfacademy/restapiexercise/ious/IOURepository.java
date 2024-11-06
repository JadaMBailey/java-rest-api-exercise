package com.cbfacademy.restapiexercise.ious;
import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;


public interface IOURepository extends ListCrudRepository<IOU, UUID>{
// I believe that you are making objects of IOU and UUID, for when different borrowers provide values.
}