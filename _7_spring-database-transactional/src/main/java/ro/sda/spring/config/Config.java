package ro.sda.spring.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
@Configuration
@ComponentScan(basePackages = {"ro.sda.spring.repository", "ro.sda.spring.service"})
public class Config {
    @Bean
    public DataSource dataSource(){
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("root");
        dataSource.setPassword("pass");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource source){
        return new JdbcTemplate(source);
    }
}