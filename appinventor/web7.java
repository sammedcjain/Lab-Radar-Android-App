package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class web7 extends Form implements HandlesEventDispatching {
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
    this.Title("web7");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0x00FFFFFF);
    TextBox1.FontBold(true);
    TextBox1.FontSize(16);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Lab program7 :");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0x00FFFFFF);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.1//EN'
    'http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd'>
    <html xmlns='http://www.w3.org/1999/xhtml'>
    <head>
    <title>program 4-validate USN</title>
    </head>
    <body>
    <script type='text/javascript'>
    finder=function()
    {
      var a=document.getElementById('usn').value;
      if(a.length==0)
      {
        alert('USN is empty');
        return;
      }
      var b=a.toLowerCase();
      var str=b.search(/^[1-4][a-z][a-z][0-9][0-9][a-z][a-z][0-9][0-9][0-9]$/);
      if(str==0)
      alert('usn is valid');
      else
      alert('usn is invalid');
    }
    </script>
    <form onsubmit=finder()>
    Enter USN :<input id=usn type=text><br>
    <input type=submit value=submit>
    </form>
    </body>
    </html>
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