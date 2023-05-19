package CommandTemplate;

import java.util.ArrayList;
import java.util.Arrays;

// Template Design Pattern
public abstract class UserRequest {
    Boolean validRequest = false;
    String input;
    String status;
    ArrayList<String> options = new ArrayList<String>(
            Arrays.asList("make a call", "send an email", "play music", "set reminder"));

    final void fullfillRequest(String newUserInput){
        status = "Incomplete";
        validateInput(newUserInput);

        if(validRequest) {
            if (userWantsToMakeACall() && input.equalsIgnoreCase(options.get(0))) {
                makeCall();
                status = "Complete";
            }
            else if (userWantsToSendAnEmail() && input.equalsIgnoreCase(options.get(1))) {
                sendEmail();
                status = "Complete";
            }
            else if (userWantsToPlayMusic() && input.equalsIgnoreCase(options.get(2))) {
                playMusic();
                status = "Complete";
            }
            else if (userWantsToSetReminder() && input.equalsIgnoreCase(options.get(3))) {
                setReminder();
                status = "Complete";
            }
            else{
                System.out.println("cannot complete request");
            }

            logRequest();
            notifyRequestStatus();
        }
    }

    public void validateInput(String userInput){
        if(options.contains(userInput.toLowerCase())){
            validRequest = true;
            input = userInput;
            System.out.println("User Request: " + userInput);
        }
        else {
            System.out.print("Bad input. \nPlease choose from the following: ");
            for(String option : options){
                System.out.print("<" + option + "> ");
            }
        }
    }
    abstract void makeCall();
    abstract void sendEmail();
    abstract void playMusic();
    abstract void setReminder();

    boolean userWantsToMakeACall(){return false;}
    boolean userWantsToSendAnEmail(){return false;}
    boolean userWantsToPlayMusic(){return false;}
    boolean userWantsToSetReminder(){return false;}

    public void logRequest(){
        // an array of requests
        System.out.println("Logging request...");
    }

    public void notifyRequestStatus(){
        System.out.println("Status: " + status  + "\n");
    }
}
