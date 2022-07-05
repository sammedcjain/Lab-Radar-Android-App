package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
class dbms6 extends Form implements HandlesEventDispatching {
  private TextBox TextBox1;
  private Button Button3;
  private Label Label1;
  private TextBox TextBox2;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("dbms6");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    Button3 = new Button(this);
    Button3.Text("< Main menu");
    Label1 = new Label(this);
    Label1.FontBold(true);
    Label1.Text("Exercise 7 : VIEWS:");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("1.Create a view called VIEWEMP which gives the same displays as Emp
    create view VIEWEMP as
    -> select * from emp;
    select * from VIEWEMP;
    2. Create a view called DEPTSUM with two columns called DEPARTMENT and SUMSAL containing the name of each department and the sum of the salaries
    for all employees in the department.
    Look at it using a SELECT command
    create view DEPTSUM as
    -> select dept.dept_name as DEPARTMENT,sum(emp.salary) as SUMSAL
    -> from dept
    -> join emp
    -> on dept.dept_no=emp.dno
    -> group by dept.dept_name;
    select * from DEPTSUM;");
    Button1 = new Button(this);
    Button1.Text("< prev");
    Button2 = new Button(this);
    Button2.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}