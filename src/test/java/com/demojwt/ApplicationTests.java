package com.demojwt;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

    @Before
    public void setup() {
      mockMvc = MockMvcBuilders
            .webAppContextSetup(context)
            .apply(springSecurity())
            .alwaysDo(print())
            .build();
    }
    

	@Test
	public void shouldNotAllowAccesToUnauthUsers() throws Exception {
		mvc.perform(get("/")).andExpect(status().isForbidden());
	}
		
}
