package app.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        LOGGER.info(beanName);
        if (beanName.equals("car")) {
            LOGGER.info("before");
            Car car = (Car) bean;
            LOGGER.info(car.getName());
            car.setName("Mercedes");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("car")) {
            LOGGER.info("after");
            Car car = (Car) bean;
            LOGGER.info(car.getName());
            car.setName("BMW");
        }
        return bean;
    }
}
