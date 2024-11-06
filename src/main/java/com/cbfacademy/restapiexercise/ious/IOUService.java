package com.cbfacademy.restapiexercise.ious;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class IOUService {
    @Autowired
    private final IOURepository iouRepository;

    public IOUService(IOURepository iouRepository) {
        this.iouRepository = iouRepository;
    }

    public List<IOU> getAllIOUs(){
        return iouRepository.findAll();
        // return repository.findAll(id); 
        // findAll() belongs in the ListCrudRespository
        // Not sure where to define repository 
        // Assume I need to make a findAll method in IOU class

    }
    public IOU getIOU(UUID id) throws NoSuchElementException{
        // returns an individual instance of IOU
        
        return iouRepository.findById(id).orElseThrow();
        // Set the exception if it doesn't find anything
        // orElseThrow() - is a method for exception
    }
    public IOU createIOU(IOU iou) throws IllegalArgumentException, OptimisticLockingFailureException{
        // This method allows us to put data in,so we can test retrieval of that data
        // creates an iou and saves then returns it back
        return iouRepository.save(iou);

    }
//    public ResponseEntity<IOU> updateIOU(UUID id, IOU updatedIOU) throws NoSuchElementException{
//        return this.iouRepository;
//
//    }
    void deleteIOU(UUID id){
        iouRepository.delete(getIOU(id));
        // 1) get an iou object through getIOU()
        // 2) Passing the object onto the delete method in the Repository
        
    }

}
