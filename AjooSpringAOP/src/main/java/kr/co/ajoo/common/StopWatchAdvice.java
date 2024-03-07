package kr.co.ajoo.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class StopWatchAdvice {

	public Object methodEstimate(ProceedingJoinPoint pp) throws Throwable { // 메소드 실행되는 순간 잡아주는 인터페이스
		String methodName = pp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		// StopWatch Start
		stopWatch.start();
		Object obj = pp.proceed();
		// StopWatch Stop
		stopWatch.stop();
		System.out.println(methodName + "()); 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)");
		return obj;
		
	}	
}
