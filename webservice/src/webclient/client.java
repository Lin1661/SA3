package webclient;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//���𵼴���
import javax.xml.ws.WebServiceClient;

//���������������ɵ���

import client.Webservice;
import client.WebserviceService;

//ע��@WebServiceClient��Ҫ����
@WebServiceClient
public class client {

    public static void main(String[] args) {

       
    	Webservice myWebservice = new WebserviceService().getWebservicePort();
         
    	if(myWebservice.sendEmail("2734833376@qq.com", "hello"))
    	{
    		System.out.println("�ѷ���");
    	}
    	List<String> _url =new ArrayList();
    	_url.add("2734833376@qq.com");
    	_url.add("2734833376@qq.com");
    	if(myWebservice.sendEmailBatch(_url, "hello"))
    	{
    		System.out.println("�ѷ���");
    	}
         if(myWebservice.validateEmailAddress("2734833376@qq.com"))
         {
        	 System.out.println("��֤������ȷ");
         }
         
    }

}