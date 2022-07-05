package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class cn1 extends Form implements HandlesEventDispatching {
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("cn1");
    Button1 = new Button(this);
    Button1.Text("Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontSize(25);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("COMPUTER NETWORKS LAB");
    TextBox1.TextColor(0xFFFFFFFF);
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("1. Prepare a detailed report on different devices available in various layers of computer network
    architecture.");
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0xFFFFC800);
    TextBox3.Width(LENGTH_FILL_PARENT);
    TextBox3.Hint("Hint for TextBox3");
    TextBox3.MultiLine(true);
    TextBox3.Text("#include<stdio.h>
    #include<string.h>
    #include<stdlib.h>
    int main(){
      char a[14];
      printf('Enter IP4 address\n');
      scanf('%s',a);
      int i=0,x=0,j=0;
      int y[4];
      while(a[i]!='\0'){
        x=x*10 ;
        x+=a[i]-'0';
        i++;
        if(a[i]=='.'){
          if(j==3){
            printf('invalid IP address!!');
            return 0;
          }
          y[j]=x;
          j++;
          x=0;
          i++;
        }
      }
      y[3]=x;
      x=y[0];
      if(y[0]<0 || y[0]>255 || y[1]<0 || y[1]>255 || y[2]<0 || y[2]>255 || y[3]<0 || y[3]>255){
        printf('invalid IP address!!');
        return 0;
      }
      if(x>=0 && x<=127){
        printf('The given ip4 address is of class A\n');
        printf('its Network ID is %d\n',y[0]);
        printf('its Host Id is %d.%d.%d\n',y[1],y[2],y[3]);
      }
      else if(x>127 && x<192){
        printf('The given ip4 address is of class B\n');
        printf('its Network ID is %d.%d\n',y[0],y[1]);
        printf('its Host Id is %d.%d\n',y[2],y[3]);
      }
      else if(x>191 && x<224){
        printf('The given ip4 address is of class C\n');
        printf('its Network ID is %d.%d.%d\n',y[0],y[1],y[2]);
        printf('its Host Id is %d\n',y[3]);
      }
      else if(x>223 && x<240){
        printf('The given ip4 address is of class D\n');
        printf('This is multicast address\n');
        // printf('its Network ID is %d',y[0]);
        //  printf('its Host Id is %d.%d.%d',y[1],y[2],y[3]);
      }
      else if(x>239 && x<=255){
        printf('The given ip4 address is of class E\n');
        // printf('its Network ID is %d',y[0]);
        // printf('its Host Id is %d.%d.%d',y[1],y[2],y[3]);
      }
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