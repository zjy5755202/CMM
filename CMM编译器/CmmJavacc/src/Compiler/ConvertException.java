package Compiler;

public class ConvertException extends Exception {
	/*
	 * ���������������У�
	 * 1.�ظ���������
	 * 2.ʹ��δ�����ı���
	 * 3.�����͸�ֵ���Ͳ�����
	 * 4.����Խ��
	 * 5.��0
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
