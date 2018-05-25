/** 
 * <pre>项目名称:ssm-shop-api 
 * 文件名称:ResponseEnum.java 
 * 包名:com.fh.shop.api.common 
 * 创建日期:2018年5月4日下午5:11:44 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.common;

/** 
 * <pre>项目名称：ssm-shop-api    
 * 类名称：ResponseEnum    
 * 类描述：    
 * 创建人：于笑扬 yuxy123@gmail.com    
 * 创建时间：2018年5月4日 下午5:11:44    
 * 修改人：于笑扬 yuxy123@gmail.com     
 * 修改时间：2018年5月4日 下午5:11:44    
 * 修改备注：       
 * @version </pre>    
 */
public enum ResponseEnum {
	SUCCESS(200, "ok"),
	ERROR(-1, "error");

	private int code;
	
	private String msg;
	
	private ResponseEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
