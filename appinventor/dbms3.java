package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class dbms3 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button3;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("dbms3");
    Label1 = new Label(this);
    Button3 = new Button(this);
    Button3.Text("< Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("Exercise – 5 (Join SELECT Command)
    1. Display the name of each employee with his department name.
    2. Display a list of all departments with the employees in each department.
    3. Display all the departments with the manager for that department.
    4. Display the names of each employee with the name of his/her boss.
    5. Display the names of each employee where the manager is same as‘JONES’
    6. Display the employee number and name of each employee who manages other employees
    with the number of people he or she manages.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.Text("Solutions");
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0xFFFFC800);
    TextBox3.Width(LENGTH_FILL_PARENT);
    TextBox3.Hint("Hint for TextBox3");
    TextBox3.MultiLine(true);
    TextBox3.Text("1. Display the name of each employee with his department name
    select emp.emp_name,dept.dept_name
    -> from emp
    -> join dept
    -> on emp.dno=dept.dept_no;
    2. Display a list of all departments with the employees in eachdepartment.
    select dept.dept_name,emp_name
    -> from dept
    -> join emp
    -> on dept.dept_no=emp.dno;
    3. Display all the departments with the manager for that department.
    select dept.dept_name,emp.mgr from dept
    -> join emp
    -> on emp.dno=dept.dept_no
    -> group by dept.dept_name;
    4. Display the names of each employee with the name of his/her boss.
    select a.emp_name as EMP,b.emp_name as BOSS from emp b
    -> join emp a
    -> on b.emp_no=a.mgr;
    5. Display the names of each employee where the manager is same as‘JONES’
    select mgr from emp where emp_name='Jason';
    select emp_name from emp where mgr in (select mgr from emp where emp_name='Jason');
    6. Display the employee number and name of each employee who manages other employees with the number of people he or she manages.
    select emp_no,emp_name,count(*) as no_of_employees from emp group by mgr;
    ");
    Button1 = new Button(this);
    Button1.Text("< prev");
    Button2 = new Button(this);
    Button2.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}