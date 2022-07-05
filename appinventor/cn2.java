package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class cn2 extends Form implements HandlesEventDispatching {
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("cn2");
    Button1 = new Button(this);
    Button1.Text("Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("2. Given a valid IPV4 address, separate the Network and Host ID part and determine the class of
    the given IPV4 address. (Using a C program)");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("#include<stdio.h>
    #include<stdlib.h>
    void main()
    {
      int i=1,p,a,w,nac,ack;
      printf('Enter the window size\n');
      scanf('%d',&w);
      printf('Enter the packet size:\n');
      scanf('%d',&a);
      printf('Transmission begins.Packet size is %d\n',a);
      while(i<=a)
      {
        printf('Sending packets from %d to %d\n',i,w+i-1);
        for(p=i;p<w+i;p++)
        printf('Transmitting packet %d\n',p);
        nac=i+rand()%w;
        if(nac==i)
        {
          printf('Ack=%d\n',w+i);
          i=i+w;
          continue;
        }
        printf('NAC=%d\n',nac);
        printf('Sending packet %d\n',nac);
        printf('Ack=%d\n',nac+1);
        printf('Ack=%d\n',i+w);
        i=i+w;
      }
      printf('End of packets so ack %d is discarded\n',i);
    }
    ");
    Button2 = new Button(this);
    Button2.Text("< prev");
    Button3 = new Button(this);
    Button3.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}