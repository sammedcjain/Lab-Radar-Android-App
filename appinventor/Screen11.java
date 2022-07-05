package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen11 extends Form implements HandlesEventDispatching {
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
    this.Title("Screen11");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(18);
    Label1.Text("8.Write a C program to simulate the working of circular queues with item as strings provide the following operations:
    (a) insert, (b) delete, and (c) display.
    ");
    Label2 = new Label(this);
    Label2.Text("#include<stdio.h>
    #include<stdlib.h>
    #include<string.h>
    #define maxsize 6
    struct queue
    {
      int rear,front;
      char items[maxsize][10];
      }q;
      void insertion()
      {
        q.rear++;
        if((q.rear)%maxsize==q.front)
        {
          q.rear--;
          printf('Queue is full\n');
        }
        else
        {
          q.rear=(q.rear)%maxsize;
          printf('Enter the string to be inserted = \n');
          scanf('%s ',q.items[q.rear]);
        }
      }
      char*deletion()
      {
        if(q.rear==q.front)
        return(char*)(-1000);
        else
        {
          q.front++;
          q.front=(q.front)%maxsize;
          return q.items[q.front];
        }
      }
      void display()
      {
        int i=((q.front+1))%maxsize;
        if(q.rear==q.front)
        printf('The contents of the queue are{}\n');
        else
        {
          printf('The contents of the queue are ');
          while(i!=q.rear)
          {
            printf('%s ',q.items[i]);
            i=(i+1)%maxsize;
          }
          printf('%s\n',q.items[q.rear]);
        }
      }
      int main()
      {
        char *k;
        int choice;
        q.front=maxsize-1;
        q.rear=maxsize-1;
        while(1)
        {
          printf('Choice 1 : Enter element into Queue\nChoice 2 : Delete element from Queue\n');
          printf('Choice 3 : Display\nAny other choice : Exit\n');
          printf('Enter your choice\n');
          scanf('%d',&choice);
          switch(choice)
          {
            case 1:insertion();
            break;
            case 2:if((k=deletion())==(char*)(-1000))
            printf('Queue is empty\n');
            else
            printf('The deleted element is %s\n',k);
            break;
            case 3:display();
            break;
            default:return 0;
          }
        }
        return 0;
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