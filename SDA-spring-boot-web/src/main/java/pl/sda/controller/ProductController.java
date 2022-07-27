package pl.sda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.model.Product;
import pl.sda.service.ProductService;

import javax.validation.Valid;

@Slf4j
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/list")
    public String showProductList(ModelMap modelMap) {
        modelMap.addAttribute("products", productService.getAll());
        return "product-list";
    }

    @GetMapping("/products/create")
    public String showProductForm(ModelMap modelMap) {
        modelMap.addAttribute("emptyProduct", new Product());
        return "product-create";
    }

    @PostMapping("/products/save")
    public String handleNewProduct(@Valid @ModelAttribute("emptyProduct") Product product, Errors errors) {
        log.info("Handle new product:  " + product);

        if (errors.hasErrors()) {
            log.error("Errors from frontend: " + errors.getFieldError());
            return "product-create";
        }

        productService.save(product);
        return "redirect:/products/list";
    }
}
