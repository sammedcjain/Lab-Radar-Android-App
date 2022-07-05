package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen5 extends Form implements HandlesEventDispatching {
  private Label Label3;
  private Button Button3;
  private Label Label2;
  private Label Label1;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("Screen5");
    Label3 = new Label(this);
    Button3 = new Button(this);
    Button3.Text("<main screen");
    Label2 = new Label(this);
    Label2.FontBold(true);
    Label2.FontSize(18);
    Label2.Text("2. Sum of Array Elements");
    Label1 = new Label(this);
    Label1.Text("
    #include<stdio.h>
    #include<stdlib.h>
    int main(void){
      int r, c;
      printf('Enter number of rows\n');
      scanf('%d', &r);
      printf('Enter number of columns\n');
      scanf('%d', &c);
      int *ptr;
      ptr = (int *)malloc((r*c)*sizeof(int));
      printf('Enter array elements\n');
      int sum = 0;
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
          scanf('%d', ptr+i*c + j);
        }
      }
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
          sum += *(ptr + i*c + j);
        }
      }
      printf('Sum of the elements of the array=%d', sum);
      return 0;
    }
    ");
    Button1 = new Button(this);
    Button1.Text("next >");
    Button2 = new Button(this);
    Button2.Text("< previous");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}