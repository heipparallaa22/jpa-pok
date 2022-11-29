package com.example.jpapok;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

//@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringBootTestTest {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void contextLoads() {
		System.out.println("context loads");
	}

	@Test
	void hello() {
		webTestClient.get()
				.uri("/getit")
				.exchange()
				.expectBody()
				.consumeWith(response -> System.out.println("RESPONSE : " + response));
	}

	@Test
	void customerListTest() {
		webTestClient.get()
				.uri("/customerlist")
				.exchange()
				.expectBody()
				.consumeWith(entityExchangeResult -> System.out.println("CUSTOMER : " + entityExchangeResult));
	}



	@Test
	void customerTest() {
		webTestClient.get()
				.uri("/customer22")
				.exchange()
				.expectBody()
				.consumeWith(entityExchangeResult -> System.out.println("CUSTOMER : " + entityExchangeResult));
	}
}
