class SignalRunner{

public static void main(String[] sg){


String stopSignal =  Signal.getStopColor();
System.out.println("the color to stop for vechiles " + stopSignal);


String readySignal =  Signal.getReadyColor();
System.out.println("the color to ready for vechiles " + readySignal);


String goSignal =  Signal.getGoColor();
System.out.println("the color to go for vechiles " + goSignal);


int sec =  Signal.getSeconds();
System.out.println("the vechile should wait for : " + sec);


boolean cam =  Signal.getCamAttached();
System.out.println("the cam is attached or no : " + cam);

boolean alert =  Signal.getSoundAlert();
System.out.println("if vechile broke any rules sound alert : " + alert);


int id =  Signal.getId();
System.out.println("the signal is  : " + id);


String road =  Signal.getRoad();
System.out.println("the signal available in the place " + road);

}
}