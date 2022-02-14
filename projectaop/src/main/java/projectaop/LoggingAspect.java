package projectaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
//	@Before("execution(* projectaop.Customer.addCustomer(..))")
	@Before("execution(* projectaop.TestCustomer.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	@AfterThrowing(pointcut = "execution(* projectaop.Customer.addCustomerThrowException(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");
	}
	
	@After("execution(* projectaop.Customer.addCustomerAfter(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter() is running!");
		
	}
	
	@AfterReturning(
			pointcut = "execution(* projectaop.Customer.addCustomerReturnValue(..))",
			returning= "result")
			public void logAfterReturning(JoinPoint joinPoint, Object result) {
			System.out.println("logAfterReturning() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("Method returned value is : " + result);
			System.out.println("******");
			}


}
