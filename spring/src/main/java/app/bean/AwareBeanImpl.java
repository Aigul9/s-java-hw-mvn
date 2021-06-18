package app.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AwareBeanImpl implements BeanFactoryAware, BeanNameAware, ApplicationContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(AwareBeanImpl.class);

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // BeanFactory - контейнер всех бинов приложения
//        LOGGER.info(beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        LOGGER.info(s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info(applicationContext.toString());
    }
}
