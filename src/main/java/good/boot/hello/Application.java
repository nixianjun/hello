package good.boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;

@SpringBootApplication(exclude={MultipartAutoConfiguration.class})
//@EnableScheduling
@EnableDiscoveryClient
@EnableEurekaServer
public class Application {

//	@Bean
//	public EmbeddedServletContainerCustomizer containerCustomizer() {
//
//		return new EmbeddedServletContainerCustomizer() {
//			@Override
//			public void customize(ConfigurableEmbeddedServletContainer container) {
//
//				ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
//				ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
//				ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
//
//				container.addErrorPages(error401Page, error404Page, error500Page);
//			}
//		};
//	}



	@Bean
	@Order(0)
	public MultipartFilter multipartFilter() {
		MultipartFilter multipartFilter = new MultipartFilter();
		multipartFilter.setMultipartResolverBeanName("multipartResolver");
		return multipartFilter;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}




}
