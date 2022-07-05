package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen8 extends Form implements HandlesEventDispatching {
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
    this.Title("Screen8");
    Label3 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.FontSize(18);
    Label1.Text("5.  String Palindrome checker using a Stack.");
    Label2 = new Label(this);
    Label2.BackgroundColor(0xFFFFC800);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("#include <malloc.h>
    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    char* stack;
    int top = -1;
    // push function
    void push(char ele)
    {
      stack[++top] = ele;
    }
    // pop function
    char pop()
    {
      return stack[top--];
    }
    // Function that returns 1
    // if str is a palindrome
    int isPalindrome(char str[])
    {
      int length = strlen(str);
      // Allocating the memory for the stack
      stack = (char*)malloc(length * sizeof(char));
      // Finding the mid
      int i, mid = length / 2;
      for (i = 0; i < mid; i++) {
        push(str[i]);
      }
      // Checking if the length of the string
      // is odd, if odd then neglect the
      // middle character
      if (length % 2 != 0) {
        i++;
      }
      // While not the end of the string
      while (str[i] != '\0') {
        char ele = pop();
        // If the characters differ then the
        // given string is not a palindrome
        if (ele != str[i])
        return 0;
        i++;
      }
      return 1;
    }
    // Driver code
    int main()
    {
      printf('Enter string to check it is palindrome or not :\n');
      char str[100];
      scanf('%s', str);
      if (isPalindrome(str)) {
        printf('%s is a Palindrome string\n', str);
      }
      else {
        printf('%s is not a Palindrome string\n', str);
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