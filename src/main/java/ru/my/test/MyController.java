package ru.my.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class MyController {

    @GetMapping("/hello")
    @Operation(summary = "Получить информацию о работе контроллера")
    public String getHello(){
        log.info("Process message started");

        return "Hello Test Spring";
    }
}
