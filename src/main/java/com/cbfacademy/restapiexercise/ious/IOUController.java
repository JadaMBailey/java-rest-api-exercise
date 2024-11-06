package com.cbfacademy.restapiexercise.ious;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ious")
//  so everything inside of this class will inherit 
// choose "api/ious" because all the endpoints contains 
public class IOUController {
   private IOUService iouService;

    public IOUController(IOUService iouService) {
        this.iouService = iouService;
    }

    @GetMapping(produces = "application/json")
    public List<IOU> getAllIOUs(){
        return iouService.getAllIOUs();
    }

    @PostMapping(produces = "application/json")
    public IOU createIou(@RequestBody IOU iou){
        return iouService.createIOU(iou);
    }

   
   
    // @RequestMapping("/") - Defining end points

    // public String greet(){
    //     return "This is the home page";
    // }

    // @RequestMapping("/about")
    // public String about(){
    //     return "This is my web application, please join me on my journey in tech";
    // }
}
