package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
			//前置通知，使用 JoinPoin 口作为参数获得目标对象信息
			public void before(JoinPoint jp) {
				
				System.out.print("前置通知 ：模拟权限控制");
				System.out.println("目标类对象:"+jp.getTarget()+"被增强处 的方法"+ jp.getSignature().getName()); 
			}
			//后置返回通知
			public void afterReturning (JoinPoint jp) { 
				
				System.out.print("后置返回通 ： 拟删 临时 ");
				System.out.println(" ，被增强 理的方法："+ jp.getSignature().getName ()) ; 
				/** 
				＊环绕通知
				* ProceedingJoinPoint JoinPoint 的子接口 代表可以执行的目标方法
				＊返回值的类型必须是 Object
				＊必须一个参数是 ProceedingJoinPoint 类型
				＊必须 throws Throwable 
				*/ 
			}
			public Object around(ProceedingJoinPoint pjp ) throws Throwable{ 
			//开始 
				System.out.println("环绕开始"); 
				//执行目标方法前，模拟开启事务
				// 行当前目标方法
				Object obj=pjp.proceed() ; 
				//／／结束
				System.out.println ("环绕结束"); 
				//执行目标方法后，模拟关闭事务”）；
				return obj ;  
			}
			public void except(Throwable e) { 
				
				System.out.println ("异常通知： 程序执行异常"+ e.getMessage()); 
			}
			public void after() { 
				System.out.println("最终通知 模拟释放资源");
			}
}
