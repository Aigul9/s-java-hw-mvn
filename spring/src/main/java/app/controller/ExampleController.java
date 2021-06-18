package app.controller;

import app.dto.RequestDto;
import app.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    
    @GetMapping("/hello/{age}")
    public ResponseEntity<ResponseDto> hello(@RequestParam(value = "name", required = false, defaultValue = "default") String name,
                                             @PathVariable(value = "age") Integer age) {
        return new ResponseEntity<>(new ResponseDto(name, String.format("Hello, %s!", name)), HttpStatus.OK);
//        return String.format("Hello, %s!", name);
    }

    @PostMapping("/data")
    public String data(@RequestBody RequestDto request) {
        if (request != null && request.getLogin().equals("pw")) {
            return "Success!";
        } else {
            return "Error!";
        }
    }
}
