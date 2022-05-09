package components;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public final String ACCOUNT_SID = "ACa62d80ccf30ff7c979aac415cebad1ba";
    public final String AUTH_TOKEN = "acf87143f04aeb1a5412678a2185441c";
    private final String MyNumber = "+12042262638";
    private final String HughNumber = "+14313385825";
    public void sendMessage(String text){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new PhoneNumber(HughNumber),
                        new PhoneNumber("+12897688677"),
                        "Hello name2, This is a test message from name1." +
                        "These items needs to be restocked " + text)
                .create();
        System.out.println(message.getSid());
    }
}

