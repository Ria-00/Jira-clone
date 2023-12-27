package org.ncu.Jiro.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspectss {
	
	@Before("execution(* org.ncu.Jiro.dao.daoAdmin.insert*(..))")
	public void beforeInsert() {
		System.out.println("Insertion method Called -->");
	};
	
	@Before("execution(* org.ncu.Jiro.dao.daoAdmin.update*(..))")
	public void beforeUpdate() {
		System.out.println("Updation method Called -->");
		
	};
	
	@Before("execution(* org.ncu.Jiro.dao.daoAdmin.delete*(..))")
	public void beforeDelete() {
		System.out.println("Deletion method Called -->");
	};
	
	@Before("execution(* org.ncu.Jiro.controller.Admincontroller.login*(..))")
	public void beforelogin(JoinPoint jp) {
		System.out.println("Login Called -->");
		System.out.println(jp.getSignature());
	};
	
	@Before("execution(* org.ncu.Jiro.controller.Admincontroller.logOut*(..))")
	public void beforelogout(JoinPoint jp) {
		System.out.println("Logout Called -->");
		System.out.println(jp.getSignature());
	};
	
}
