package Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/Dao/ApplicationContext.xml");
		System.out.println("个人信息如下：");
		TestDao tc=(TestDao)appCon.getBean("Person");
		System.out.println("id:"+tc.getId()+"\n姓名："+tc.getName()+"\n出生日期："+tc.getBirth());
		System.out.println("账户信息：");
		System.out.println("id："+tc.getAcount().getId()+"\n类型："+tc.getAcount().getType()+"\n状态："+tc.getAcount().getStatus()+"\n余额："+tc.getAcount().getBanlance());
		System.out.println("欢迎进入在线课程网站：");
		tc.service();
	}

}
