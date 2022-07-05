package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class web8 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("web8");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0x00FFFFFF);
    TextBox1.FontBold(true);
    TextBox1.FontSize(16);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Lab program8 : ");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0x00FFFFFF);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("{
      display: block; font-size: 20px;
    }
    USN {
      color: blue;
      font-size: 30px;
      margin-top: 20px;
    }
    NAME {
      color: red;
      font-size: 30px;
    }
    NOC {
      color: green;
      font-size: 30px;
    }
    BRANCH {
      color: purple;
      font-size: 30px;
    }
    YOJ {
      color: brown;
      font-size:30px;
    }
    EMAIL {
      color: darkblue;
      font-size: 30px;
    }
    ");
    Button2 = new Button(this);
    Button2.Text("Next >");
    Button3 = new Button(this);
    Button3.Text("< Previous ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}