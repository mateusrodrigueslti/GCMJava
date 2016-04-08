package br.com.lti.sendnotification;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String deviceToken = "APA91bE6xQZh7dV9S5kg2TLsykVA7WhCjNREuQAJbQytXyNXCarypxLp-xrOR_ELnUjys796mwHdTwp5teFQSJGTJReNohORy9JD1S_pWegdE0Vy0xKFttO3oni4omj3EYeMUXFzox4y";
        
        String apiKey = "AIzaSyDmV3M7wjVe4I2RwohOk3G2i6GduIaLNSI";
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
