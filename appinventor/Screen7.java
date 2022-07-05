package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen7 extends Form implements HandlesEventDispatching {
  private Label Label4;
  private Button Button1;
  private Label Label2;
  private Label Label3;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("Screen7");
    Label4 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label2 = new Label(this);
    Label2.FontBold(true);
    Label2.FontSize(18);
    Label2.Text("4. Consider implementing a fixed size stack of maximum size 5 using an array.");
    Label3 = new Label(this);
    Label3.Text("#include<stdio.h>
    #include<malloc.h>
    #include<string.h>
    struct student
    {
      int id;
      char name[50];
      float points;
      };
      int main()
      {
        int i,n;
        struct student *ptr,s1;
        ptr = &s1;
        printf('Enter value of n\n');
        scanf('%d\n', &n);
        ptr = (struct student*)malloc(n*sizeof(struct student));
        for(i=0;i<n;i++)
        {
          printf('Enter detail of student %d\n',i+1);
          printf('Enter ID:\n');
          scanf('%d\n',&(ptr+i)->id);
          printf('Enter name:\n');
          scanf('%[^\n]%*c\n',(ptr+i)->name);
          printf('Enter Points:\n');
          scanf('%f\n',&(ptr+i)->points);
        }
        for(i=0;i<n;i++)
        {
          printf('\nDetail of student %d\n',i+1);
          printf('ID: %d\n',(ptr+i)->id);
          printf('First Name: %s\n',(ptr+i)->name);
          printf('Points: %.2f\n',(ptr+i)->points);
        }
        return 0;
      }
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