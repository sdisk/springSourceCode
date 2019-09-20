package com.hq.bean;

import com.hq.aware.HelloBeanFactory;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-11 17:28
 **/
public class UserBeanTest {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void testSimpleBean(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/spring-test.xml"));
		UserBean userBean = (UserBean) beanFactory.getBean("myUserBean");
		logger.info("name: {}" , userBean.getName());
		logger.info("class: {}", userBean.getClass());
		Assert.assertEquals("username", userBean.getName());
	}

	@Test
	public void testCar(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/spring-test.xml"));
		Car car =  (Car) beanFactory.getBean("car");
		//获取实例
		//String FACTORY_BEAN_PREFIX = "&";
		CarFactoryBean carFactoryBean = (CarFactoryBean) beanFactory.getBean("&car");
		logger.info("name: {}" , car.getBrand());
		logger.info("class: {}", car.getClass());

		logger.info("carFactoryBean: {}", carFactoryBean.getClass());
	}
	//对于 “singleton” 作用域 bean，可以通过 “setAllowCircularReferences(false); ”来禁用循环引用。
	@Test
	public void testCircleByConstructor() throws Throwable {
		try {
			new ClassPathXmlApplicationContext("spring/spring-test.xml");
		} catch(Exception e) {
			System.out.println(e);
			// 因为要在创建testC时抛出
			Throwable el = e.getCause().getCause().getCause();
				throw el;
			}
	}

	@Test
	public void testAware(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-test.xml");
		HelloBeanFactory factory = (HelloBeanFactory) context.getBean("factory");
		factory.testAware();
	}

}
