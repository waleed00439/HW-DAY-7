package com.example.homeworkspring;

import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {

    ArrayList<String> Grade = new ArrayList<>();
    @GetMapping("/grade")
    public ArrayList<String> getgrade(){
return Grade;
    }
    @PostMapping("/grade")
    public String addgrade(@RequestBody String grade){
        Grade.add(grade);
return "posts new grade";
    }
    @PutMapping("/grade/{index}")
    public String Putgrade(@PathVariable int index , @RequestBody String grade ){
        Grade.set(index,grade);
        return "updates grade";
    }
    @DeleteMapping("/grade/{index}")
    public String delgrade(@PathVariable int index , @RequestBody String grade){
Grade.remove(index);
return "deletes grade";
    }

}
