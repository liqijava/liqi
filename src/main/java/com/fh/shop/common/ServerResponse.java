/** 
 * <pre>项目名称:ssm-shop-api 
 * 文件名称:ServerResponse.java 
 * 包名:com.fh.shop.api.common 
 * 创建日期:2018年5月4日下午5:03:26 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.common;

import java.io.Serializable;

/** 
 * <pre>项目名称：ssm-shop-api    
 * 类名称：ServerResponse    
 * 类描述：    
 * 创建人：于笑扬 yuxy123@gmail.com    
 * 创建时间：2018年5月4日 下午5:03:26    
 * 修改人：于笑扬 yuxy123@gmail.com     
 * 修改时间：2018年5月4日 下午5:03:26    
 * 修改备注：       
 * @version </pre>    
 */
public class ServerResponse<T> implements Serializable{

	private static final long serialVersionUID = -4572937496561604699L;

	private int code;
	
	private String msg;
	
	private T data;
	
	private ServerResponse(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static <T> ServerResponse<T> success(T data) {
		return new ServerResponse<T>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
	}
	
	public static <T> ServerResponse<T> success() {
		return new ServerResponse<T>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), null);
	}
	
	public static ServerResponse fail() {
		return new ServerResponse(ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getMsg(), null);
	}
	
	public static ServerResponse fail(int code, String msg) {
		return new ServerResponse(code, msg, null);
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}

	

	
}
