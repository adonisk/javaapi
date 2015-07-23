import java.util.Date;

import com.eze.client.APIResult;
import com.eze.client.JavaAPI;
import com.eze.client.PaymentOptions;
import com.eze.client.PaymentType;

public class JavaClient {

	public static void main(String[] args) {
		JavaAPI api = null;
		
		try {
			api = JavaAPI.getInstance();

			// login + prepare device
			api.login("9535161418", "11demo").prepareDevice();
			
			//card transaction..
			APIResult result = api.takePayment(PaymentType.CARD, 20.0, null);
			System.out.println("CardPayment Result="+result);
				
			//cash transaction..
			result = api.takePayment(PaymentType.CASH, 25.0, null);
			System.out.println("CashPayment Result="+result);
					
			//cheque transaction..
			PaymentOptions options = PaymentOptions.build()
					.setBankCode("HDFC")
					.setChequeDate(new Date())
					.setChequeNo("1234");
			
			result = api.takePayment(PaymentType.CHEQUE, 30.0, options);
			System.out.println("ChequePayment Result="+result);
			
			//quit
			api.quit();
			System.out.println("Quit Result="+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (null != api) api.destroy();
	}
}
