package com.jnwanya;

import com.jnwanya.controllers.ConstructorInjectedController;
import com.jnwanya.controllers.MyController;
import com.jnwanya.controllers.PropertyInjectedController;
import com.jnwanya.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).greetUser());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayGreetingToUser());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).greetUser());
    }
}
