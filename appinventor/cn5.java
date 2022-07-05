package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class cn5 extends Form implements HandlesEventDispatching {
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("cn5");
    Button1 = new Button(this);
    Button1.Text("Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("5. Write a client-server program in TCP / IP in which the server-side code listens for connect
    requests, and whatever message the client sends the server converts it to uppercase and sends it
    back.
    ");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("#include <arpa/inet.h>
    #include <netinet/in.h>
    #include <stdio.h>
    #include <string.h>
    #include <sys/socket.h>
    #include <sys/stat.h>
    #include <sys/types.h>
    main()
    {
      struct sockaddr_in client, server;
      int s, n, sock, g, j, left, right, flag;
      char b1[20], b2[10], b3[10], b4[10];
      s = socket(AF_INET, SOCK_STREAM, 0);
      server.sin_family = AF_INET;
      server.sin_port = 22;
      server.sin_addr.s_addr = inet_addr('192.168.13.6');
      bind(s, (struct sockaddr*)&server, sizeof server);
      listen(s, 1);
      n = sizeof client;
      sock = accept(s, (struct sockaddr*)&client, &n);
      for (;;) {
        recv(sock, b1, sizeof(b1), 0);
        printf('\nThe string received is:%s\n', b1);
        int i=0;
        while(b1[i]!='\0'){
          if(b1[i] >= 'a' && b1[i] <= 'z') {
            b1[i] = b1[i] - 32;
          }
          i++;
        }
        send(sock, b1, sizeof(b1), 0);
        break;
      }
      close(sock);
      close(s);
    }
    ");
    Button2 = new Button(this);
    Button2.Text("< prev");
    Button3 = new Button(this);
    Button3.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}