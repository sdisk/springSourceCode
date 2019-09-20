package com.hq.aware;

import com.hq.bean.Hello;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-20 10:42
 **/
public class HelloBeanFactory implements BeanFactoryAware {

	private BeanFactory beanFactory;

	//声明bean的时候会自动注入beanFactory
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	public void testAware(){
		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.sayHello();
	}
}
