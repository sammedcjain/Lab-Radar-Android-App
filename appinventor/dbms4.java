package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class dbms4 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("dbms4");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("Exercise – 6 (SELECT with Sub-queries)
    1. Display the names and job titles of all employees with the same job as Jones.
    2. Display the names and department name of all employees working in the same city as Jones.
    3. Display the name of the employee whose salary isthe lowest.
    4. Display the names of all employees except the lowest paid.
    5. Display the names of all employees whose job title isthe same as anyone in the sales dept.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.Text("Solutions");
    TextBox2.TextColor(0xFFFFFFFF);
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0xFFFFC800);
    TextBox3.Width(LENGTH_FILL_PARENT);
    TextBox3.Hint("Hint for TextBox3");
    TextBox3.MultiLine(true);
    TextBox3.Text("1. Display the names and job titles of all employees with the same job as Euron.
    select designation from emp where emp_name='Euron';
    select emp_name,designation from emp where designation=(select designation from emp where emp_name='Euron');
    2. Display the names and department name of all employees working in the same city as Jason.
    select dept.dept_location from dept
    -> join emp
    -> on dept.dept_no=emp.dno
    -> where emp_name='Jason';
    select emp.emp_name,dept.dept_location
    -> from dept
    -> join emp
    -> on dept.dept_no=emp.dno
    -> where dept_location=(select dept.dept_location from dept
    -> join emp
    -> on dept.dept_no=emp.dno
    -> where emp_name='Jason');
    3. Display the name of the employee whose salary is the lowest.
    select min(salary) from emp;
    select emp_name from emp where salary=(select min(salary) from emp);
    4. Display the names of all employees except the lowest paid.
    select min(salary) from emp;
    select emp_name,salary from emp where salary!=(select min(salary) from emp);
    5. Display the names of all employees whose jobtitle is the same as anyone in the webdevelopment dept.
    select designation from emp where dno=4;
    select emp_name from emp where designation in (select designation from emp where dno=4);");
    Button2 = new Button(this);
    Button2.Text("< prev");
    Button3 = new Button(this);
    Button3.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}