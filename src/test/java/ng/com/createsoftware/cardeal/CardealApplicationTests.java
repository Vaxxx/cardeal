package ng.com.createsoftware.cardeal;

import ng.com.createsoftware.cardeal.controller.CarController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class CardealApplicationTests {
    //to use the default database=>@AutoConfigureTestDatabase

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CarController controller;

    @Test
    @DisplayName("First Example Test Case")
    void contextLoads() {
        //check that there is something in the controller
        assertThat(controller).isNotNull();
    }

    @Test
    public void testAuthentication() throws Exception{
        //Testing authentication with correct credentials
        this.mockMvc.
                perform(post("/login").
                content("{\"username\":\"admin\",\"password\":\"Vakporize\"}")
                .header(HttpHeaders.CONTENT_TYPE, "application/json"))
                .andDo(print()).andExpect(status().isOk());
    }

}
