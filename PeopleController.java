package com.example.homeworkspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {
    ArrayList<String> names= new ArrayList<>();

@GetMapping("/names")
    public ArrayList<String> getname(){
    return names;
}
@PostMapping("/names")
    public String addname(@RequestBody String namess){
    names.add(namess);
    return "add names list";
}
@PutMapping("/names/{index}")
    public String EditName(@RequestBody int index,@PathVariable  String name){
    names.set(index,name);
return "updates name";

}
@DeleteMapping("/names")
    public String delName(@PathVariable int index ){
    names.remove(index);
    return "deletes name";
}


}
