package com.example.cfg;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//當有多個DataSource時，設定可參考以下註解部份
//其它DataSource比照此份設定方式，另外設定一份即可，但不可標註@Primary

//@Configuration
//@EnableJpaRepositories(
//		basePackages = { "repo1 package" },
//		entityManagerFactoryRef = "entityManagerFactory1", 
//		transactionManagerRef = "transactionManager1")
//@EnableTransactionManagement //啟用交易管理
public class MultipleDataSourceConfigSample {

//	@Bean @Primary
//	@ConfigurationProperties(prefix="mydatasource1")
//	//mydatasource1.url,driverClassName,...etc. settings in application.properties
//	public DataSource dataSource1(){
//	    return DataSourceBuilder
//	      .create()
//	      .build();
//	}
//	
//	@Bean @Primary
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory1(){ //設定Entity管理者
//	    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//	    emf.setDataSource(dataSource1()); //設定dataSource
//	    emf.setPackagesToScan("entity1 package"); //設定Entity的basepackage
//	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//	    Properties props = new Properties() ;
//	    props.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect") ;
//	    emf.setJpaVendorAdapter(vendorAdapter);
//	    emf.setJpaProperties(props);
//	    return emf ;
//	} 
//
//	
//	@Bean @Primary
//	public PlatformTransactionManager transactionManager1() {
//	    JpaTransactionManager tm = new JpaTransactionManager() ;
//	    //設定EntityManager搭配的交易管理者
//	    tm.setEntityManagerFactory(
//	        entityManagerFactory1().getObject()
//	    );
//	    return tm ;
//	}
	
}
