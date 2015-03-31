package org.model;
 
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
 
/**
  * Spring IOC�����Ĺ�����
  * 
  * @author Ryan Shaw
  * 
  */
 public class SpringUtil implements ApplicationContextAware {
 
     /**
     * ��ǰIOC
      */
     private static ApplicationContext applicationContext;
 
     /**
      * ���õ�ǰ�����Ļ������˷�����spring�Զ�װ��
      */
     @Override
     public void setApplicationContext(ApplicationContext arg0)
             throws BeansException {
         applicationContext = arg0;
     }
 
     /**
      * �ӵ�ǰIOC��ȡbean
      * 
      * @param id
      *            bean��id
      * @return
      */
     public static Object getBean(String beanId) {
         Object bean = null;
         bean = applicationContext.getBean(beanId);
         return bean;
     }
 
 }