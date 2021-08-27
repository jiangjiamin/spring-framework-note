package cn.com.xiaocainiao.main;

import cn.com.xiaocainiao.config.AppConfig;
import cn.com.xiaocainiao.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 *
 * @Author: xiaocainiaoya
 * @Date: 2021/06/16 09:28:32
 **/
public class ApplicationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(UserService.class));
	}


}
