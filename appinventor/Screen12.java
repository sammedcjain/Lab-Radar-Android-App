package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen12 extends Form implements HandlesEventDispatching {
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
    this.Title("Screen12");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.Text("9.
    Design, Develop and Implement a menu driven Program in C for the following operations on Singly Linked List (SLL) of Student Data with the fields: USN, Name, Branch, Sem, PhNo
    a. Create a SLL of N Students Data by using front insertion.
    b. Display the status of SLL and count the number of nodes in it.
    c. Perform Insertion and Deletion at End of SLL.
    d. Perform Insertion and Deletion at Front of SLL.
    e. Demonstrate how this SLL can be used as STACK and QUEUE.
    f. Exit.
    Use the following functions for different choices
    a. create()
    b. display()
    c. insert()
    d. del()
    e. stack()
    f. queue()
    g. exit()
    ");
    Label2 = new Label(this);
    Label2.Text("Program :
    #include<stdio.h>
    #include<stdlib.h>
    struct node
    {
      char usn[25],name[25],branch[25];
      int sem;
      char phone[25];
      struct node *link;
      };
      typedef struct node * NODE;
      NODE start = NULL;
      int count=0;
      NODE create()
      {
        NODE snode;
        snode = (NODE)malloc(sizeof(struct node));
        if(snode == NULL)
        {
          printf('\nMemory is not available');
          exit(1);
        }
        printf('Enter USN\n');
        scanf('%s',snode->usn);
        printf('Enter Name\n');
        scanf('%s',snode->name);
        printf('Enter Branch\n');
        scanf('%s',snode->branch);
        printf('Enter Phone number\n');
        scanf('%s',snode->phone);
        printf('Enter Sem\n');
        scanf('%d',&snode->sem);
        snode->link=NULL;
        count++;
        return snode;
      }
      NODE create2()
      {
        NODE snode;
        snode = (NODE)malloc(sizeof(struct node));
        if(snode == NULL)
        {
          printf('\nMemory is not available');
          exit(1);
        }
        printf('Enter USN\n');
        scanf('%s',snode->usn);
        printf('Enter Name\n');
        scanf('%s',snode->name);
        printf('Enter Branch\n');
        scanf('%s',snode->branch);
        printf('Enter Sem\n');
        scanf('%d',&snode->sem);
        printf('Enter Ph.No');
        scanf('%s',snode->phone);
        snode->link=NULL;
        count++;
        return snode;
      }
      NODE insertfront2()
      {
        NODE temp;
        temp = create2();
        if(start == NULL)
        {
          return temp;
        }
        temp->link = start;
        return temp;
      }
      NODE insertfront()
      {
        NODE temp;
        temp = create();
        if(start == NULL)
        {
          return temp;
        }
        temp->link = start;
        return temp;
      }
      NODE deletefront()
      {
        NODE temp;
        if(start == NULL)
        {
          printf('Linked list is empty\n');
          return NULL;
        }
        if(start->link == NULL)
        {
          printf('Front(first) node is deleted\n');
          count--;
          free(start);
          return NULL;
        }
        temp = start;
        start = start->link;
        printf('Front(first) node is deleted');
        count--;
        free(temp);
        return start;
      }
      NODE insertend2()
      {
        NODE cur,temp;
        temp = create2();
        if(start == NULL)
        {
          return temp;
        }
        cur = start;
        while(cur->link !=NULL)
        {
          cur = cur->link;
        }
        cur->link = temp;
        return start;
      }
      NODE insertend()
      {
        NODE cur,temp;
        temp = create();
        if(start == NULL)
        {
          return temp;
        }
        cur = start;
        while(cur->link !=NULL)
        {
          cur = cur->link;
        }
        cur->link = temp;
        return start;
      }
      NODE deleteend()
      {
        NODE cur,prev;
        if(start == NULL)
        {
          printf('Linked List is empty\n');
          return NULL;
        }
        if(start->link == NULL)
        {
          printf('Last (end) node is deleted\n');
          free(start);
          count--;
          return NULL;
        }
        prev = NULL;
        cur = start;
        while(cur->link!=NULL)
        {
          prev = cur;
          cur = cur->link;
        }
        printf('Last (end) node is deleted\n');
        free(cur);
        prev->link = NULL;
        count--;
        return start;
      }
      void display()
      {
        NODE cur;
        int num=1;
        if(start == NULL)
        {
          printf('\nNo Contents to display in SLL \n');
          return;
        }
        printf('STUDENT Details\n');
        cur = start;
        printf('USN NAME BRANCH SEM Ph.NO.\n');
        while(cur!=0)
        {
          printf('%s %s %s %d ',cur->usn, cur->name,cur->branch, cur->sem);
          printf('%s\n',cur->phone);
          cur = cur->link;
          num++;
        }
        printf('The no.of nodes in list is %d',count);
      }
      void stackdemo()
      {
        int ch;
        while(1)
        {
          printf('\nSSL used as Stack');
          printf('\n1.Insert at Front(PUSH)\n2.Delete from Front(POP)\n3.Exit\n');
          printf('\nEnter your choice:\n');
          scanf('%d',&ch);
          switch(ch)
          {
            case 1: start = insertfront2();
            display();
            break;
            case 2: start = deletefront();
            display();
            break;
            case 3: printf('exit');
            return;
            break;
            default : return;
          }
        }
        return;
      }
      void INSERT()
      {
        int ch;
        while(1)
        {
          printf('\n1.Insert at Front(First)');
          printf('\n2.Insert at End(Rear/Last)');
          printf('\n3.Exit\n');
          printf('\nEnter your choice');
          scanf('%d',&ch);
          switch(ch)
          {
            case 1: start = insertfront2();
            display();
            break;
            case 2: start = insertend2();
            display();
            break;
            case 3: printf('exit'); return;
            break;
            default: return;
          }
        }
      }
      void DELETE()
      {
        int ch;
        while(1)
        {
          printf('\n1.Delete from Front(First)');
          printf('\n2.Delete from End(Rear/last)');
          printf('\n3.Exit\n');
          printf('\nEnter your choice');
          scanf('%d',&ch);
          switch(ch)
          {
            case 1: start = deletefront();
            display();
            break;
            case 2: start = deleteend();
            display();
            break;
            case 3: printf('Exit'); return;
            break;
            default: return;
          }
        }
      }
      void queuedemo()
      {
        int ch;
        while(1)
        {
          printf('\nSSL used as Queue\n');
          printf('1.Insert at Rear(INSERT)\n');
          printf('2.Delete from Front(DELETE)\n');
          printf('3.Exit\n');
          printf('Enter your choice:\n');
          scanf('%d',&ch);
          switch(ch)
          {
            case 1: start = insertfront2();
            display();
            break;
            case 2: start = deletefront();
            display();
            break;
            case 3: printf('Exit'); return;
            break;
            default: return;
          }
        }
      }
      int main()
      {
        int ch,i,n;
        printf('\nStudendts Details\n');
        while(1)
        {
          printf('\n1 Create\n');
          printf('2 Display\n');
          printf('3 Insert\n');
          printf('4 Delete\n');
          printf('5 Stack\n');
          printf('6 Queue\n');
          printf('7 Exit\n');
          printf('Enter your choice\n');
          scanf('%d',&ch);
          switch(ch)
          {
            case 1 : printf('\nHow many student data you want to create\n');
            scanf('%d',&n);
            for(i=1;i<=n;i++)
            start = insertend();
            break;
            case 2: display();
            break;
            case 3: INSERT();
            break;
            case 4: DELETE();
            break;
            case 5: stackdemo();
            break;
            case 6: queuedemo();
            break;
            case 7: printf('exit');
            exit(0);
            break;
            default: printf('\nPlease enter the valid choice');
          }
        }
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