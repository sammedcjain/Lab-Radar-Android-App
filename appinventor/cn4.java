package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class cn4 extends Form implements HandlesEventDispatching {
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("cn4");
    Button1 = new Button(this);
    Button1.Text("Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("4. Simulate the working of distance vector routing algorithm using Bellman-Ford’s algorithm.
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
      struct sockaddr_in client;
      int s;
      char flag[20];
      char buffer[20];
      s = socket(AF_INET, SOCK_STREAM, 0);
      client.sin_family = AF_INET;
      client.sin_port = 22;
      client.sin_addr.s_addr = inet_addr('192.168.13.6');
      connect(s, (struct sockaddr*)&client, sizeof client);
      for (;;) {
        printf('\nEnter a string to convert upper case\n');
        scanf('%s', buffer);
        // printf('\nmessage sent from Client: %s \n', buffer);
        send(s, buffer, sizeof(buffer), 0);
        recv(s, flag, sizeof(flag), 0);
        printf('reply from server server : %s',flag);
      }
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