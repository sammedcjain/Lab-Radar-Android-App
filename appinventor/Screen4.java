package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
class Screen4 extends Form implements HandlesEventDispatching {
  private Label Label2;
  private TextBox TextBox2;
  private Button Button3;
  private Label Label1;
  private TextBox TextBox1;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("Screen4");
    Label2 = new Label(this);
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.FontSize(20);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Text("DATA STRUCTURES LAB:");
    Button3 = new Button(this);
    Button3.Shape(2);
    Button3.Text("< Back to main screen");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(18);
    Label1.Text("1. Reversed Array");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0x00FFFFFF);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.MultiLine(true);
    TextBox1.Text("
    #include<stdio.h>
    #include<stdlib.h>
    int main(void){
      int n; printf('Enter value of n\n');
      scanf('%d', &n);
      int *arr;
      arr = (int *)malloc(n * sizeof(int));
      printf('Enter n array elements\n');
      for(int i = 0; i < n; i++){
        scanf('%d', arr + i);
      }
      printf('Original Array = ');
      for(int i = 0; i < n; i++){
        printf('%d ', *(arr+i));
      }
      printf('\n');
      printf('Reverse Array = ');
      for(int i = 0; i < n; i++){
        printf('%d ', *(arr+n-i-1));
      }
      printf('\n');
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