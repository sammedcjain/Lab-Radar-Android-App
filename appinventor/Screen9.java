package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen9 extends Form implements HandlesEventDispatching {
  private Label Label3;
  private Button Button1;
  private Label Label1;
  private Label Label2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("Screen9");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(18);
    Label1.Text("6. INFIX TO POSTFIX CONVERSION");
    Label2 = new Label(this);
    Label2.Text("#include<stdio.h>
    #include<ctype.h>
    char stack[100];
    int top = -1;
    void push(char x)
    {
      stack[++top] = x;
    }
    char pop()
    {
      if(top == -1)
      return -1;
      else
      return stack[top--];
    }
    int priority(char x)
    {
      if(x == '(')
      return 0;
      if(x == '+' || x == '-')
      return 1;
      if(x == '*' || x == '/')
      return 2;
      return 0;
    }
    int main()
    {
      char exp[100];
      char *e, x;
      printf('Enter an expression in infix form:\n');
      scanf('%s',exp);
      printf('The postfix expression is:\n');
      e = exp;
      while(*e != '\0')
      {
        if(isalnum(*e))
        printf('%c',*e);
        else if(*e == '(')
        push(*e);
        else if(*e == ')')
        {
          while((x = pop()) != '(')
          printf('%c', x);
        }
        else
        {
          while(priority(stack[top]) >= priority(*e))
          printf('%c',pop());
          push(*e);
        }
        e++;
      }
      while(top != -1)
      {
        printf('%c',pop());
        }return 0;
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