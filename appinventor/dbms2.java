package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class dbms2 extends Form implements HandlesEventDispatching {
  private Label Label1;
  private Button Button1;
  private TextBox TextBox1;
  private TextBox TextBox2;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("dbms2");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.FontBold(true);
    Button1.Text("< Main menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("Exercise – 4 (Group SELECT Command)
    1. Display the maximum, minimum and average salary and commission earned.
    2. Display the department number, total salary payout and total commission payout for each
    department.
    3. Display the department number, total salary and total commission payout for eachdepartment
    that pays at least one employee commission.
    4. Display the department number and number of clerks in each department.
    5. Display the department number and total salary of employees in each department with four or
    more people.
    6. Display the employee number of each employee who manages other employees withthe
    number of people he or she manages.");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("1. Display the maximum, minimum and average salary and commission earned.
    select sum(salary),max(salary),min(salary),avg(salary) from emp_ivis150;
    2. Display the department number, total salary payout and total commission payout for each department.
    select sum(salary),dno from emp_ivis150 group by dno;
    3. Display the department number, total salary and total commission payout for eachdepartment that pays at least one employee commission.
    select dno,sum(salary),sum(comm) from emp where comm>0 group by dno;
    4. Display the department number and number of clerks in eachdepartment.
    select dno,count(designation) from emp where designation='Associate' group by dno;
    5. Display the department number and total salary of employees in each department with four or more people.
    select dno,sum(salary) from emp group by dno having count(dno)>4;
    6. Display the employee number of each employee who manages other employees with the number of people he or she manages.
    select mgr,emp_name,count(mgr) from emp group by mgr;
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