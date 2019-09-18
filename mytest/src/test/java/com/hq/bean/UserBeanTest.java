package com.hq.bean;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
		Object car2 =  beanFactory.getBean("&car");
		logger.info("name: {}" , car.getBrand());
		logger.info("class: {}", car.getClass());
		logger.info("car2: {}", car2.toString());
	}
}
