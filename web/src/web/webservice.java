package web;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dm.model.v20151123.SingleSendMailRequest;
import com.aliyuncs.dm.model.v20151123.SingleSendMailResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@WebService
public class webservice {

	 @SuppressWarnings("static-access")
	 public  Boolean sendEmail(String _url,String _payload) //邮件地址为_url，内容为_payload 
	 {
	    IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIMKsTRQwGeh5H", "87HWt0ndgG0sGMz1dBg89P1AOL5Tvz");
	    IAcsClient client = new DefaultAcsClient(profile);
	    SingleSendMailRequest request = new SingleSendMailRequest();
	    try {
	        request.setAccountName("ljjch.club");
	        request.setFromAlias("Lin");
	        request.setAddressType(1);
	        request.setTagName("text");
	        request.setReplyToAddress(true);
	        request.setToAddress(_url);
	        //可以给多个收件人发送邮件，收件人之间用逗号分开，批量发信建议使用BatchSendMailRequest方式
	        //request.setToAddress("邮箱1,邮箱2");
	        request.setSubject("测试");//主题
	        request.setHtmlBody(_payload);//内容
	        SingleSendMailResponse httpResponse = client.getAcsResponse(request);
	        return true;
	    } catch (ServerException e) {
	        e.printStackTrace();
	    }
	    catch (ClientException e) {
	        e.printStackTrace();
	    }
		 return false;
	 } 
	 public  Boolean sendEmailBatch(List<String> _url,String _payload) //批量发送邮件  
	 {
		 IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIMKsTRQwGeh5H", "87HWt0ndgG0sGMz1dBg89P1AOL5Tvz");
		    IAcsClient client = new DefaultAcsClient(profile);
		    SingleSendMailRequest request = new SingleSendMailRequest();
		    try {
		        request.setAccountName("ljjch.club");
		        request.setFromAlias("Lin");
		        request.setAddressType(1);
		        request.setTagName("text");
		        request.setReplyToAddress(true);
		        String _urls=_url.get(0);
		        for(int i=1;i<_url.size();i++)
		        {
		        	_urls=_urls+","+_url.get(i);
		        }
		        request.setToAddress(_urls);
		        //可以给多个收件人发送邮件，收件人之间用逗号分开，批量发信建议使用BatchSendMailRequest方式
		        //request.setToAddress("邮箱1,邮箱2");
		        request.setSubject("测试");//主题
		        request.setHtmlBody(_payload);//内容
		        SingleSendMailResponse httpResponse = client.getAcsResponse(request);
		        return true;
		    } catch (ServerException e) {
		        e.printStackTrace();
		    }
		    catch (ClientException e) {
		        e.printStackTrace();
		    }
			 return false;
	 }
	 public  Boolean validateEmailAddress(String _url)
	 {
		
	      String pattern = "(\\w)(\\w*)(@)(\\w)(\\w*)(.)(\\w)(\\w*)";
	 
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);
	 
	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(_url);
	      if (m.find( )) {
	         
	      } else {
	         System.out.println("NO MATCH");
	      }
		 return true;
	 }
	    public static void main(String[] args) 
	    {
	        //第一个参数是访问时的url，9091是任意一个不占用的端口
	        Endpoint.publish("http://localhost:9092/Service/webservice", new webservice());
	        System.out.println("service success !");
	    }

}