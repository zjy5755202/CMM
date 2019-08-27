package Compiler;

public class ConvertException extends Exception {
	/*
	 * 语义分析出错误会有：
	 * 1.重复声明变量
	 * 2.使用未声明的变量
	 * 3.变量和赋值类型不符合
	 * 4.数组越界
	 * 5.除0
	 */
	
	
//    private int ErrorLine;
//    private int ErrorColumn;
//	public ConvertException(int errorLine,int errorColumn) {
//        super();
//        ErrorLine=errorLine;
//        ErrorColumn=errorColumn;
//        
//    }
//
//    public ConvertException(int errorLine,int errorColumn,String s) {
//        super(s);
//        ErrorLine=errorLine;
//        ErrorColumn=errorColumn;
//    }
    
    public ConvertException(String s) {
        super(s);
      
    }
    
//    @Override
//    public String toString() {    	
//    	 String s = getClass().getName();
//         String message = getLocalizedMessage();
//         return (message != null) ? ("ErrorLine : "+ErrorLine+" "+"ErrorColumn : "+ErrorColumn+" "+s + ": " + message) : s;
//    }
}
