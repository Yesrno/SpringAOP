package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
			//ǰ��֪ͨ��ʹ�� JoinPoin ����Ϊ�������Ŀ�������Ϣ
			public void before(JoinPoint jp) {
				
				System.out.print("ǰ��֪ͨ ��ģ��Ȩ�޿���");
				System.out.println("Ŀ�������:"+jp.getTarget()+"����ǿ�� �ķ���"+ jp.getSignature().getName()); 
			}
			//���÷���֪ͨ
			public void afterReturning (JoinPoint jp) { 
				
				System.out.print("���÷���ͨ �� ��ɾ ��ʱ ");
				System.out.println(" ������ǿ ��ķ�����"+ jp.getSignature().getName ()) ; 
				/** 
				������֪ͨ
				* ProceedingJoinPoint JoinPoint ���ӽӿ� �������ִ�е�Ŀ�귽��
				������ֵ�����ͱ����� Object
				������һ�������� ProceedingJoinPoint ����
				������ throws Throwable 
				*/ 
			}
			public Object around(ProceedingJoinPoint pjp ) throws Throwable{ 
			//��ʼ 
				System.out.println("���ƿ�ʼ"); 
				//ִ��Ŀ�귽��ǰ��ģ�⿪������
				// �е�ǰĿ�귽��
				Object obj=pjp.proceed() ; 
				//��������
				System.out.println ("���ƽ���"); 
				//ִ��Ŀ�귽����ģ��ر����񡱣���
				return obj ;  
			}
			public void except(Throwable e) { 
				
				System.out.println ("�쳣֪ͨ�� ����ִ���쳣"+ e.getMessage()); 
			}
			public void after() { 
				System.out.println("����֪ͨ ģ���ͷ���Դ");
			}
}
