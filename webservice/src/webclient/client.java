package webclient;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//包别导错了
import javax.xml.ws.WebServiceClient;

//导入两个命令生成的类

import client.Webservice;
import client.WebserviceService;

//注解@WebServiceClient需要加入
@WebServiceClient
public class client {

    public static void main(String[] args) {

       
    	Webservice myWebservice = new WebserviceService().getWebservicePort();
         
    	if(myWebservice.sendEmail("2734833376@qq.com", "hello"))
    	{
    		System.out.println("已发送");
    	}
    	List<String> _url =new ArrayList();
    	_url.add("2734833376@qq.com");
    	_url.add("2734833376@qq.com");
    	if(myWebservice.sendEmailBatch(_url, "hello"))
    	{
    		System.out.println("已发送");
    	}
         if(myWebservice.validateEmailAddress("2734833376@qq.com"))
         {
        	 System.out.println("验证邮箱正确");
         }
         
    }

}