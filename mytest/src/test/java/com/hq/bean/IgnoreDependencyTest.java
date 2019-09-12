package com.hq.bean;


import com.hq.service.impl.IgnoreInterfaceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-12 15:18
 **/
public class IgnoreDependencyTest {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring/spring-ignoreDependency.xml"));
		IgnoreInterfaceImpl bean = (IgnoreInterfaceImpl) beanFactory.getBean("IgnoreInterfaceImpl");

	}
}
