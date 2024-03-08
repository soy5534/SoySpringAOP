package kr.co.ajoo.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LeaveWorkAdvice {

	@Pointcut("execution(* kr.co.ajoo..*Controller.*Logout(..))")
	public void controllerPointCut() {}
	
	@Before("controllerPointCut()")
	public void printLeaveWorkTime() {
		System.out.println("퇴근하였습니다.");
	}
	
}
