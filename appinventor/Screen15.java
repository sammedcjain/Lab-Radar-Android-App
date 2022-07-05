package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen15 extends Form implements HandlesEventDispatching {
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
    this.Title("Screen15");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(18);
    Label1.Text("12.  Write a program to find the largest element in a given doubly linked list.");
    Label2 = new Label(this);
    Label2.Text("#include<stdio.h>
    #include<string.h>
    #include<stdlib.h>
    struct node
    {
      struct node* next;
      struct node* prev;
      int data;
      };
      struct node* head=NULL;
      struct node* getnode()
      {
        struct node* p;
        p=(struct node*)malloc(sizeof(struct node));
        return p;
      }
      void append(int x)
      {
        struct node*p=head;
        struct node* q;
        q=getnode();
        if(head==NULL)
        {
          q->data=x;
          q->prev=NULL;
          q->next=NULL;
          head=q;
        }
        else
        {
          q->data=x;
          while(p->next!=NULL)
          {
            p=p->next;
          }
          p->next=q;
          q->prev=p;
          q->next=NULL;
        }
      }
      void display(struct node* head)
      {
        struct node* p=head;
        if(head==NULL)
        {
          printf('List is empty');
        }
        else
        {
          while(p!=NULL)
          {
            printf('%d ',p->data);
            p=p->next;
          }
        }
      }
      void largest(struct node* head)
      {
        int max=0;
        struct node* p=head;
        if(head->next==NULL)
        {
          max=head->data;
        }
        while(p!=NULL)
        {
          if(p->data >= max)
          {
            max=p->data;
          }
          p=p->next;
        }
        printf('\nLargerst node is %d',max);
      }
      int main()
      {
        int a;
        char ch[10];
        do
        {
          printf('Enter node value:');
          scanf('%d',&a);
          append(a);
          printf('Do you want to enter more?(Y or N)');
          scanf('%s',ch);
          }while(!strcmp(ch,'y'));
          printf('\nLinked list is ');
          display(head);
          largest(head);
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