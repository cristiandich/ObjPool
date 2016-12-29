package com.webs.infocristian;

public interface Pool<T> {
	
	T acquire();
	void release(T t);

}
