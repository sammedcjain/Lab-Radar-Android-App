package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
class Sem4_menu extends Form implements HandlesEventDispatching {
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button1;
  private TextBox TextBox3;
  private Button Button2;
  private TextBox TextBox4;
  private Button Button3;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Title("Sem4_menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.FontSize(30);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Choose LAB:");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFFFFFFFF);
    Button1.FontBold(true);
    Button1.FontSize(20);
    Button1.Shape(1);
    Button1.Text("Data Base Management");
    Button1.TextColor(0xFF000000);
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0x00FFFFFF);
    Button2 = new Button(this);
    Button2.BackgroundColor(0xFFFFFFFF);
    Button2.FontBold(true);
    Button2.FontSize(20);
    Button2.Shape(1);
    Button2.Text("Analysis And Design Of Algorithms");
    TextBox4 = new TextBox(this);
    TextBox4.BackgroundColor(0xFFFFC800);
    Button3 = new Button(this);
    Button3.BackgroundColor(0xFFFFFFFF);
    Button3.FontSize(20);
    Button3.Shape(1);
    Button3.Text("< Main Menu");
    Button3.TextColor(0xFF000000);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}