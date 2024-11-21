package in.ashokit.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
 @Bean
    public OpenAPI myOpenAPI() {

        final String securitySchemeName = "bearerAuth";

        Contact contact = new Contact();
        contact.setEmail("adityasuke.123@gmail.com");
        contact.setName("Aditya Suke");
        contact.setUrl("https://www.adityasuke.com");


        Info info = new Info()
                .title("Api Documentation")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage Tasks.").termsOfService("https://www.bdiplus.com/terms");

        return new OpenAPI().info(info).addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));

    }
}