package Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/Dao/ApplicationContext.xml");
		System.out.println("������Ϣ���£�");
		TestDao tc=(TestDao)appCon.getBean("Person");
		System.out.println("id:"+tc.getId()+"\n������"+tc.getName()+"\n�������ڣ�"+tc.getBirth());
		System.out.println("�˻���Ϣ��");
		System.out.println("id��"+tc.getAcount().getId()+"\n���ͣ�"+tc.getAcount().getType()+"\n״̬��"+tc.getAcount().getStatus()+"\n��"+tc.getAcount().getBanlance());
		System.out.println("��ӭ�������߿γ���վ��");
		tc.service();
	}

}
