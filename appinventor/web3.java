package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class web3 extends Form implements HandlesEventDispatching {
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
    this.Title("web3");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0x00FFFFFF);
    TextBox1.FontBold(true);
    TextBox1.FontSize(16);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Lab program3 :");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0x00FFFFFF);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.MultiLine(true);
    TextBox2.Text("<?xml version='1.0' encoding='UTF-8'?>
    <!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.1//EN'
    'http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd'>
    <html xmlns='http://www.w3.org/1999/xhtml'>
    <head>
    <title>program 2b</title>
    </head>
    <body>
    <script type='text/javascript' >
    var sc=' ';
    var n=prompt('Enter a number');
    if(n>0 && n!=null){
      sc=sc+'The Number and it's square upto '+n+': \n'
      for(i=1;i<=n;i++)
      {
        sc=sc+'square of '+i+' is '+i*i+' \n'
      }
      alert(sc);
    }
    else{
      alert('Inavlid Input');
    }
    </script>
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