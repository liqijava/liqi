/** 
 * <pre>项目名称:member-api 
 * 文件名称:Product.java 
 * 包名:com.fh.shop.product.po 
 * 创建日期:2018年5月31日下午11:53:19 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.product.po;

/** 
 * <pre>项目名称：member-api    
 * 类名称：Product    
 * 类描述：    
 * 创建人：于笑扬 yuxy123@gmail.com    
 * 创建时间：2018年5月31日 下午11:53:19    
 * 修改人：于笑扬 yuxy123@gmail.com     
 * 修改时间：2018年5月31日 下午11:53:19    
 * 修改备注：       
 * @version </pre>    
 */
public class Product {
	
	private Integer id;
	
	private String productName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
