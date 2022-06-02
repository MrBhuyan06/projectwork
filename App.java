package projectwork;
import java.awt.Frame;
import java.awt.Label;
public class App {
	Frame frame;
  public App(){
	   frame=new Frame("Demo");
	   Label label= new Label("This is a message");
	   frame.add(label);
	   frame.setSize(1000,1000);
	   frame.setVisible(true);
	   
	   
	   
   }
  public static void main(String[] args) {
	App obj=new App();
}

}
