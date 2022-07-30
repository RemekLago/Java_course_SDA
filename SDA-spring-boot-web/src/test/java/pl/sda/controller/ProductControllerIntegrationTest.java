package pl.sda.controller;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pl.sda.model.Product;
import pl.sda.service.ProductService;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ProductControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductService productService;

    @Test
    public void shouldSaveProduct() throws Exception{
        //given
        Product testProduct = new Product(3,"computer", 3214.95);

        //when
        mockMvc.perform(MockMvcRequestBuilders.post("/products/save")
                .param("id", testProduct.getId().toString())
                .param("name", testProduct.getName())
                .param("price", testProduct.getPrice().toString())
        ) //konczenie metody perform
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.view().name("redirect:/products/list"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/products/list"));

        Product productFromMemory = productService.getAll()
                .stream()
                .filter(p -> p.getId().equals(testProduct.getId()))
                .findFirst()
                .get();

        Assertions.assertEquals(testProduct.getId(), productFromMemory.getId());
        Assertions.assertEquals(testProduct.getName(), productFromMemory.getName());
        Assertions.assertEquals(testProduct.getPrice(), productFromMemory.getPrice());

        //then
    }

}