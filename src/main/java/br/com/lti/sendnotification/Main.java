package br.com.lti.sendnotification;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String deviceToken = "Your Token here";
        
        String apiKey = "API KEY";
        String registrationId = deviceToken; 
        Sender sender = new Sender(apiKey);
        Message message = new Message.Builder()
                .addData("message", "Put here your messager")
                .build();
        Result result;
        try {
            result = sender.send(message, registrationId, 1);
            System.out.println("Result: " + result.getErrorCodeName());
        } catch (IOException ex) {
            
        }
    }
}
