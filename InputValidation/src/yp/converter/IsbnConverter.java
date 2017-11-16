package yp.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import yp.vo.Isbn;

public class IsbnConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO Auto-generated method stub
  		    Isbn isbn=new Isbn();
  			 String[] str=arg1[0].split("-");
 			isbn.setBook(str[0]);//�鼮
			isbn.setCountry(str[1]); //��������
  			isbn.setPublish(str[2]);//������
 			isbn.setBooknum(str[3]);// ��Ǳ��
  		   int n= Integer.parseInt(str[4]);
  		   if(n!=5)
  		   {
  			   String s="ISBNERROR";
   			   return s;
   		   }
 		    return isbn;
	}
 	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		Isbn isbn=(Isbn)arg1;
		String sReturn="[";
 		sReturn+="<"+isbn.getBook()+"-"+isbn.getCountry()+"-"+isbn.getPublish()+"-"+isbn.getBooknum()+"-"+isbn.getCheckNum()+">";
 		sReturn+="]";
		return sReturn;
	}

}
