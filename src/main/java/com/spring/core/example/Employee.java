package com.spring.core.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware, BeanNameAware{
	
	private int id;
	private String salary;
	private String name;
	
	/*public Employee(int id, String salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
	public void init(){
		System.out.println("Bean is initializing through custom init using bean.xml ");
	}
	
	public void destroyBean(){
		System.out.println("Bean is Destroying through custom method using bean.xml ");
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		Employee e =  arg0.getBean(Employee.class);
		//e.setName("Rama");
		System.out.println("Emp Benas "+e);
		
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("Name of bean" +arg0);
		
	}
	
	

}
