package Compiler;


/**
*@author    作者：朱江源
*Data:创建日期：2018年12月25日
*Time:创建时间：下午4:14:45
*Declartion: All Rights Reserved 
*/

public class Symbol {
	private String name;
	private String value;
	private int level;
	private int type;
	
    public Symbol(int level,String name){
        this.name=name;
        this.level=level;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	

}

