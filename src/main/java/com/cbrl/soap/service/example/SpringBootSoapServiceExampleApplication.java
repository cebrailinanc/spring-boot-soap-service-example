package com.cbrl.soap.service.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author cebrail
 * service wsdl : http://localhost:8080/ws/vehicleUrl.wsdl
 * 
 * Spring projesi oluşturulduğunda bu sınıf otomatik oluşturulur.
 * Spring Boot Uygulamasının giriş noktası, @SpringBootApplication annotation’ı içeren sınıftır. 
 * Spring Boot uygulamasını çalıştırmak için bu sınıfın ana metodu olmalı.
 * @SpringBootApplication annotation’ı Otomatik Yapılandırma, Bileşen Tarama ve Spring Boot yapılandırmasını içerir.
 * Sınıfa @SpringBootApplication annotation’ı eklediyseniz, 
 * @EnableAutoConfiguration, @ComponentScan ve @SpringBootConfiguration annotation’larını eklemeniz gerekmez.
 * @SpringBootApplication annotation’ı diğer tüm annotation’ları içerir.
 * 
 */

@SpringBootApplication
public class SpringBootSoapServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapServiceExampleApplication.class, args);
	}

}
