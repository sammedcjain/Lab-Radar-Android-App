package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class cn6 extends Form implements HandlesEventDispatching {
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("cn6");
    Button1 = new Button(this);
    Button1.Text("Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("6. Write a program to generate a Hamming Code for a four-bit data. The program should also
    detect and correct error for the received data.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("#include<stdio.h>
    int main()
    {
      int a[4], b[4], r[3], s[3], i, q[3];
      printf('Enter 4 bit data word:\n');
      for(i=3; i>=0; i--)
      scanf('%d',&a[i]);
      r[0]=(a[2]+a[1]+a[0])%2;
      r[1]=(a[2]+a[1]+a[3])%2;
      r[2]=(a[0]+a[1]+a[3])%2;
      printf('The 7-bit hamming code word is: ');
      for(i=3; i>=0; i--)
      printf('%d ',a[i]);
      for(i=2;i>=0;i--)
      printf('%d ',r[i]);
      printf('\nEnter the 4-bit recieved word:\n');
      for(i=3; i>=0; i--)
      scanf('%d',&b[i]);
      s[0]= (b[2]+b[1]+b[0]+r[0])%2;
      s[1]= (b[3]+b[2]+b[1]+r[1])%2;
      s[2]= (b[0]+b[1]+b[3]+r[2])%2;
      printf('Syndrome is: \n');
      for(i=2; i>=0; i--)
      printf('%d ',s[i]);
      if((s[2]==0) && (s[1]==0) && (s[0]==0))
      printf('\nThe received word is error free... \n');
      if((s[2]==1) && (s[1]==0) && (s[0]==1))
      printf('\nReceived word has error in first-bit(b0) position from right\n');
      if((s[2]==1) && (s[1]==1) && (s[0]==1))
      printf('\nReceived word has error in second-bit(b1) position from right\n');
      if((s[2]==0) && (s[1]==1) && (s[0]==1))
      printf('\nReceived word has error in third-bit(b2) position from right\n');
      if((s[2]==1) && (s[1]==1) && (s[0]==0))
      printf('\nReceived word has error in fourth-bit(b3) position from right\n');
      return 0;
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