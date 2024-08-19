package com.cbfacademy.restapiexercise;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.dao.OptimisticLockingFailureException;

import com.cbfacademy.restapiexercise.ious.IOU;

public class IOUService {
    
    List<IOU> getAllIOUs(){
        return null;

    }
IOU getIOU(UUID id) throws NoSuchElementException{
    return null;

}
IOU createIOU(IOU iou) throws IllegalArgumentException, OptimisticLockingFailureException{
    return iou;

}
IOU updateIOU(UUID id, IOU updatedIOU) throws NoSuchElementException{
    return updatedIOU;

}
void deleteIOU(UUID id){
    
}

}
