package ua.com.threedob.config;

import org.hibernate.dialect.Dialect;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Yurij on 17.08.2017.
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@EnableJpaRepositories("ua.com.threedob.dao")
public class DataConfig {

    @Bean

    public DataSource dataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost/myspringmvcproj");
        source.setUsername("root");
        source.setPassword("root");
        return source;

    }
    @Bean
    public JpaVendorAdapter vendorAdapter(){
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setShowSql(true);
        return vendorAdapter;
    }

    @Bean("entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setJpaVendorAdapter(vendorAdapter());
        factoryBean.setPackagesToScan("ua.com.threedob.entity");

        Properties properties = new Properties();
        properties.put("hibernate.hbm2ddl.auto", "update");
        factoryBean.setJpaProperties(properties);
        return factoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

























    /*@Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource());
        localSessionFactoryBean.setAnnotatedPackages("ua.com.threedob.entity");
//        localSessionFactoryBean.setAnnotatedClasses("");
        Properties properties = new Properties();
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.show_sql","true");
        localSessionFactoryBean.setHibernateProperties(properties);
        return  localSessionFactoryBean;
    }*/

}
