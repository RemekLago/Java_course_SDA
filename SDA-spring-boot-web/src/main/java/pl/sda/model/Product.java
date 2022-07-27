package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;

    @Size(min = 3, max = 10, message = "Name size must have 3-10 characters")
    private String name;

    @DecimalMin(value = "0.0", message = "Price must be positive", inclusive = false)
    private Double price;

}
