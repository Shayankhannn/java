package AdvanceOOP.AbstractConcreteInterface;

public class Main {
    public static void main(String[] args){
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("abc@sfds");
        sendButton.setMessage("hello world");
        sendButton.buttonPress();
    }
}
