package com.kenson.other.qeue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 使用队列实现自定义堆栈
 * 1. 弹栈
 * 2. 压栈
 * 3. 获取头
 * @author wuchun
 *
 */
public class MyStack<E> {
	//定义一个容器
	private Deque<E> container = new ArrayDeque<E>();
	//定义一个容量
	private int cap;
	
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	
	
	//压栈
	public boolean push(E e){
		if(container.size()+1 > cap){
			return false;
		}
		return container.offerLast(e);
	}
	
	
	//弹栈
	public E pop(){
		return container.pollLast();
	}
	
	//获取
	public E peek(){
		return container.peekLast();
	}
	
	//大小
	public int size(){
		return container.size();
	}
	
}
