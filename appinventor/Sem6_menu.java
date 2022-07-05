package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Sem6_menu extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Label Label2;
  private Button Button1;
  private Label Label3;
  private Button Button2;
  private Label Label4;
  private Button Button3;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Title("Sem6_menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(25);
    Label1.Text("Choose Lab:");
    Label2 = new Label(this);
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFFFFFFFF);
    Button1.FontSize(25);
    Button1.Shape(1);
    Button1.Text("Web Technologies");
    Label3 = new Label(this);
    Button2 = new Button(this);
    Button2.BackgroundColor(0xFFFFFFFF);
    Button2.FontSize(25);
    Button2.Shape(1);
    Button2.Text("Computer Networks Lab");
    Label4 = new Label(this);
    Button3 = new Button(this);
    Button3.BackgroundColor(0xFFFFFFFF);
    Button3.Shape(1);
    Button3.Text("< Main menu");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}