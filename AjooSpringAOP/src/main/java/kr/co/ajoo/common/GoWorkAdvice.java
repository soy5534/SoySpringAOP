package kr.co.ajoo.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // 
@Component // Bean 등록
public class GoWorkAdvice {
	
	@Pointcut("execution(* kr.co.ajoo..*ServiceImpl.*Login(..))")
	public void implPointCut() {}
	
	@After("implPointCut()")
	public void printGoWorkTime() {
		System.out.println("출근하였습니다!");
	}
	
}
