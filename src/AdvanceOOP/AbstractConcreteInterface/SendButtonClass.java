package AdvanceOOP.AbstractConcreteInterface;

class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Sending" + this.message + " to "+ this.sendTo);
    }
    @Override
    public void onButtonHover() {
        System.out.println("send button was hovered");

    }
    public void setSendTo(String sendTo){
        this.sendTo=sendTo;
    }
    public void setMessage(String message){
        this.message=message;
    }
}

