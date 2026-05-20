package AdvanceOOP.AbstractConcreteInterface;

public class ForwardButtonClass extends AbstractButtonClass implements ButtonPress {
    String forwardTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Forwarding " + message + " To " + forwardTo);
    }

    @Override
    public void onButtonHover() {
        System.out.println("forward button was hovered");

    }

    public void setForwardTo(String forwardTo){
        this.forwardTo=forwardTo;
    }
    public void setMessage(String message){
        this.message=message;
    }


}
