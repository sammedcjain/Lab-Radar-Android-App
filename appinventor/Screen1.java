package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen1 extends Form implements HandlesEventDispatching {
  private Image Image2;
  private Image Image1;
  private Label Label2;
  private Button Button1;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Icon("lrlogo.jpg");
    this.Title("Screen1");
    Image2 = new Image(this);
    Image2.Height(-1018);
    Image2.Width(LENGTH_FILL_PARENT);
    Image2.Picture("NIE-Mysore-Logo.webp");
    Image1 = new Image(this);
    Image1.Width(LENGTH_FILL_PARENT);
    Image1.Picture("LabRadar-OrangeNoBG-1920x.png");
    Image1.ScalePictureToFit(true);
    Label2 = new Label(this);
    Label2.Height(-1004);
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFFFFFFFF);
    Button1.FontBold(true);
    Button1.FontTypeface(3);
    Button1.Height(-1007);
    Button1.Shape(1);
    Button1.Text("Let's get started > ");
    Button1.TextColor(0xFFFFC800);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}