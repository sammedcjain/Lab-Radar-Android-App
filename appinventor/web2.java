package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class web2 extends Form implements HandlesEventDispatching {
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
    this.Title("web2");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0x00FFFFFF);
    TextBox1.FontBold(true);
    TextBox1.FontSize(16);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Lab program 2 :");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0x00FFFFFF);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("<?xml version='1.0' encoding='UTF-8'?>
    <!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.1//EN'
    'http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd'>
    <html xmlns='http://www.w3.org/1999/xhtml'>
    <head>
    <title>program 1</title>
    <link rel='stylesheet' type='text/css'  href='1.css'> </link>
    </head>
    <body>
    <div class='first'>
    <h1>this is program 1</h1>
    <p>this inculdes the following concepts:(shown in ordered list)</p>
    <br />
    <ol>
    <li>Ordered List</li>
    <li>tables</li>
    <li>borders</li>
    <li>padding</li>
    <li>color</li>
    <li>span tag</li>
    </ol>
    </div>
    <div class='sec'>
    <p>hello</p>
    <table>
    <caption>this is a <span style='color:rgb(255, 21, 0);background-color:black;'>table</span> of mobile model and its price</caption>
    <tr>
    <th>brand</th>
    <th>model name</th>
    <th>price</th>
    </tr>
    <tr>
    <td>redmi</td>
    <td>k20</td>
    <td>22000</td>
    </tr>
    <tr>
    <td>samsung</td>
    <td>s20</td>
    <td>50000</td>
    </tr>
    <tr>
    <td>realme</td>
    <td>note 4</td>
    <td>10000</td>
    </tr>
    </table>
    </div>
    </body>
    </html>
    ");
    Button2 = new Button(this);
    Button2.Text("Next >");
    Button3 = new Button(this);
    Button3.Text("< Previous");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}