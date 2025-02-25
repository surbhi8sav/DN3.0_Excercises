interface Notifier {
 
    void send();
}
class EmailNotifier implements Notifier {
	 
    // Overriding the method
    @Override public void send()
    {
        System.out.println("Send Email");
    }}
abstract class NotifierDecorator implements Notifier{
	 
    // Protected variable
    protected Notifier notiRef;
    public NotifierDecorator(Notifier NotiRef)
    {
        // This keyword refers to current object itself
        this.notiRef = NotiRef;
    }
    public void send() { notiRef.send(); }
}
class SMSNotifierDecorator extends NotifierDecorator {
	 
    public SMSNotifierDecorator(Notifier notiRef)
    {
        super(notiRef);
    }
 
    @Override public void send()
    {
        notiRef.send();
        //setRedBorder(decoratedShape);
        System.out.println("This is an SMS notification");
    }
 
   
}
class SlackNotifierDecorator extends NotifierDecorator {
	 
    public SlackNotifierDecorator(Notifier notiRef)
    {
        super(notiRef);
    }
 
    @Override public void send()
    {
        notiRef.send();
        //setRedBorder(decoratedShape);
        System.out.println("This is an Slack notification");
    }

}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Notifier noti=new SMSNotifierDecorator(new EmailNotifier());
        noti.send();
        Notifier notify=new SlackNotifierDecorator(new EmailNotifier());
        notify.send();
	}

}
