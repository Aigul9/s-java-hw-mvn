package app.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String name;

    public Car() {
        name = "Volvo";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
