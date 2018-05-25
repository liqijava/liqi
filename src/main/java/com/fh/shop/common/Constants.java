/** 
 * <pre>项目名称:ssm-shop-api 
 * 文件名称:Constants.java 
 * 包名:com.fh.shop.api.common 
 * 创建日期:2018年5月4日下午5:52:30 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.common;

/** 
 * <pre>项目名称：ssm-shop-api    
 * 类名称：Constants    
 * 类描述：    
 * 创建人：于笑扬 yuxy123@gmail.com    
 * 创建时间：2018年5月4日 下午5:52:30    
 * 修改人：于笑扬 yuxy123@gmail.com     
 * 修改时间：2018年5月4日 下午5:52:30    
 * 修改备注：       
 * @version </pre>    
 */
public class Constants {

	public static final String IMAGE_URL = "http://192.168.0.115";
	
	public enum TokenEnum {
		
		HEADER_MISS(420, "bad header"),
		EXPIRE_TIME(421, "token expire time"),
		BAD_APPKEY(422, "appkey is bad"),
		BAD_SIGN(423, "sign is error");

		private int code;
		
		private String msg;
		
		private TokenEnum(int code, String msg) {
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
}
