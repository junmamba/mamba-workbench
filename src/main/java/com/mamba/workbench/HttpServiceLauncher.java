package com.mamba.workbench;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = { "com.mamba.workbench" })
@EnableCaching
public class HttpServiceLauncher {
	public static void main(String[] args) {
		SpringApplication.run(HttpServiceLauncher.class, args);
	}
}