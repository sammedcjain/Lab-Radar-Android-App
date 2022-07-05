package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen10 extends Form implements HandlesEventDispatching {
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
    this.Title("Screen10");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(18);
    Label1.Text("7.  Evaluate an expression entered in postfix form");
    Label2 = new Label(this);
    Label2.Text("#include<stdio.h>
    #include<stdlib.h>
    #include<string.h>
    #include<ctype.h>
    struct postfix
    {
      int stack[50];
      char *s;
      int nn;
      int top;
      };
      void initpostfix(struct postfix*);
      void setexpr(struct postfix *,char*);
      void push(struct postfix*,int);
      int pop(struct postfix*);
      void calculate(struct postfix*);
      void show(struct postfix);
      int main()
      {
        char string[50];
        struct postfix st;
        initpostfix(&st);
        printf('Enter postfix expression to be evaluated:\n');
        scanf('%s',string);
        setexpr(&st,string);
        calculate(&st);
        pop(&st);
        show(st);
        return 0;
        };
        void initpostfix(struct postfix*st)
        {
          st->top=-1;
        }
        void setexpr(struct postfix*st,char*inp)
        {
          st->s=inp;
        }
        void push(struct postfix*st,int item)
        {
          if(st->top==49)
          printf('Stack overflow!\n');
          else
          {
            st->top++;
            st->stack[st->top]=item;
          }
        }
        int pop(struct postfix*st)
        {
          if(st->top==-1)
          {
            printf('Stack Underflow!\n');
            return -1000;
          }
          else
          {
            st ->nn=st->stack[st->top];
            st->top--;
            return st->nn;
          }
        }
        void calculate(struct postfix*st)
        {
          int tcs,result,o1,o2;
          while(*(st->s)!='\0')
          {
            if(isdigit(*(st->s)))
            {
              tcs=*(st->s)-48;
              push(st,tcs);
            }
            else
            {
              o2=pop(st);
              o1=pop(st);
              switch(*(st->s))
              {
                case '+':result=o1+o2;
                break;
                case '-':result=o1-o2;
                break;
                case'*':result=o1*o2;
                break;
                case'/':if(o2!=0)
                result=o1/o2;
                break;
                default:exit(0);
              }
              push(st,result);
            }
            (st->s)++;
          }
        }
        void show(struct postfix st)
        {
          printf('Result is: %d',st.nn);
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