package org.roy.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@RestController
	@EnableAutoConfiguration
	public class FileUploadController {

		@RequestMapping("/test")
		String test(HttpServletRequest request){
			//System.out.println(request.getRemoteAddr());
			return request.getRemoteAddr();
		}

	}
}
