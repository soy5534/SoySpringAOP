package kr.co.ajoo.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class StopWatchAdvice {

	@Pointcut("execution(* kr.co.ajoo..*Controller.*(..))")
	public void allPointCut() {}
	
	@Around("allPointCut()")
	public Object methodEstimate(ProceedingJoinPoint pp) throws Throwable { // 메소드 실행되는 순간 잡아주는 인터페이스
		String methodName = pp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		// StopWatch Start
		stopWatch.start();
		Object obj = pp.proceed();
		// StopWatch Stop
		stopWatch.stop();
		System.out.println(methodName + " 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)");
		return obj;
		
	}	
}
