package org.sec.vwa;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.sec.vwa")
public class VWAApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(VWAApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}
}
