/** 
 * <pre>项目名称:ssm-shop-member-api 
 * 文件名称:PageParam.java 
 * 包名:com.fh.shop.api.common 
 * 创建日期:2018年5月8日下午4:33:42 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.common;

import java.io.Serializable;

/** 
 * <pre>项目名称：ssm-shop-member-api    
 * 类名称：PageParam    
 * 类描述：    
 * 创建人：于笑扬 yuxy123@gmail.com    
 * 创建时间：2018年5月8日 下午4:33:42    
 * 修改人：于笑扬 yuxy123@gmail.com     
 * 修改时间：2018年5月8日 下午4:33:42    
 * 修改备注：       
 * @version </pre>    
 */
public class PageParam implements Serializable{

	private static final long serialVersionUID = -817674055664107177L;

	private Long start;
	
	private Long length;

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	} 
}
