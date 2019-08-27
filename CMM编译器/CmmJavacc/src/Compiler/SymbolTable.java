package Compiler;

import java.util.ArrayList;

/**
*@author    ���ߣ��콭Դ
*Data:�������ڣ�2018��12��25��
*Time:����ʱ�䣺����4:15:03
*Declartion: All Rights Reserved 
*/

public class SymbolTable {

    public ArrayList<Symbol> symbolList = new ArrayList<>();

    public void clearList(){
        symbolList.clear();
    }

    public void registerSymbol(Symbol symbol) throws ParseException{
        for(int i=0;i<symbolList.size();i++){
            if(symbolList.get(i).getName()==symbol.getName()
            && symbolList.get(i).getLevel()==symbol.getLevel()){
                throw new ParseException(symbol.getName()+" has been declared");
            }
        }
        symbolList.add(symbol);
    }


    public void deregisterSymbol(int level){
        while(!symbolList.isEmpty()&&symbolList.get(symbolList.size()-1).getLevel()==level)
            symbolList.remove(symbolList.size()-1);
    }

    public Symbol getSymbol(String name) throws ParseException{
        for(int i=symbolList.size()-1;i>=0;i--){
            Symbol tmp = symbolList.get(i);
            if(tmp.getName().equals(name))
                return tmp;
        }
        throw new ParseException(name+" has not been declared");
    }


}

