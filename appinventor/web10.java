package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class web10 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("web10");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0x00FFFFFF);
    TextBox1.FontBold(true);
    TextBox1.FontSize(16);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Lab program10 :");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0x00FFFFFF);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.MultiLine(true);
    TextBox2.Text("<?xml version='1.0' encoding='UTF-8'?>
    <?xml-stylesheet type='text/css' href='5a.css'?>
    <!DOCTYPE STUDENT SYSTEM '5a.dtd'>
    <STUDENT>
    <USN>4NI19IS083</USN>
    <NAME>SANJAY</NAME>
    <NOC>NIE</NOC>
    <BRANCH>ISE</BRANCH>
    <YOJ>2019</YOJ>
    <EMAIL>sanjay01@gmail.com</EMAIL>
    <USN>4NI19IS084</USN>
    <NAME>SAYED</NAME>
    <NOC>NIE</NOC>
    <BRANCH>ISE</BRANCH>
    <YOJ>2019</YOJ>
    <EMAIL>sayed05@gmail.com</EMAIL>
    <USN>4NI19IS085</USN>
    <NAME>SHASHNAK</NAME>
    <NOC>NIE</NOC>
    <BRANCH>ISE</BRANCH>
    <YOJ>2019</YOJ>
    <EMAIL>shank10@gmail.com</EMAIL>
    </STUDENT>
    ");
    Button3 = new Button(this);
    Button3.Text("< Previous");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}