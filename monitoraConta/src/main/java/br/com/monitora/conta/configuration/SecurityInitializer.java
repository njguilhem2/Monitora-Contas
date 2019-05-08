package br.com.monitora.conta.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
		public SecurityInitializer() {
			super(SecurityConfiguration.class);
		}
}
