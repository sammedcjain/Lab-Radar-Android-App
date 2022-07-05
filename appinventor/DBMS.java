package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
class DBMS extends Form implements HandlesEventDispatching {
  private TextBox TextBox1;
  private Button Button2;
  private TextBox TextBox2;
  private TextBox TextBox3;
  private TextBox TextBox4;
  private Button Button1;
  protected void $define() {
    this.AppName("LabRadar");
    this.BackgroundColor(0xFFFFC800);
    this.Scrollable(true);
    this.Title("DBMS");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.FontSize(30);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.Text("Data Base LAB");
    Button2 = new Button(this);
    Button2.Text("< Main menu");
    TextBox2 = new TextBox(this);
    TextBox2.BackgroundColor(0xFFFFC800);
    TextBox2.FontBold(true);
    TextBox2.Width(LENGTH_FILL_PARENT);
    TextBox2.Hint("Hint for TextBox2");
    TextBox2.MultiLine(true);
    TextBox2.Text("Exercise – 3 (Simple SELECT Command)
    Give the SQL commands for the following:
    1. Display all information in the tables EMP and DEPT.
    2. Display only the join date and employee name for eachemployee.
    3. Display the join date, name and department number for all clerks.
    4. Display the names and salaries of all employees with a salary greater than 20000.
    5. Display the names of all employees with an `A' in their name.
    6. Display the names of all employees with exactly 5 letters in theirname.
    7. Display the names and join dates of all employees joined in 2000 or 2005
    8. Display the names and dates of employees with the column headers \Name' and \Start Date'
    9. Display the department numbers of all departments employing a clerk.
    10. Display the names and salaries of all employees in reverse salaryorder.");
    TextBox3 = new TextBox(this);
    TextBox3.BackgroundColor(0xFFFFC800);
    TextBox3.FontSize(20);
    TextBox3.Text("Solution :");
    TextBox4 = new TextBox(this);
    TextBox4.BackgroundColor(0xFFFFC800);
    TextBox4.Width(LENGTH_FILL_PARENT);
    TextBox4.Hint("Hint for TextBox4");
    TextBox4.MultiLine(true);
    TextBox4.Text("1.select designation from emp_ivis150 where emp_name like 'a%' or emp_name like 'b%' or emp_name like 'd%';
    2.select emp_name from emp_ivis150 where dno=3 or dno=4 and year(date_of_join) in (2002,2003,2010);
    select emp_name from emp_ivis150 where dno in (3,4) and year(date_of_join) in (2002,2003,2010);
    3.select emp_no,mgr from emp_ivis150 where designation in ('Junior','Associate');
    4.select date_of_join from emp_ivis150 where salary BETWEEN 80000 AND 200000;
    5.select emp_no AS ID,date_of_join AS DOJ from emp_ivis150 where salary>100000;
    6. select designation from emp_ivis150 where designation like '%ro%';
    7.select emp_name from emp_ivis150 where emp_name like '_____' AND year(date_of_join) BETWEEN 2002 AND 2010;
    8.select emp_name,emp_no,dno from emp_ivis150 order by dno asc;
    9.select emp_name,mgr from emp_ivis150 where designation!='Junior' and designation!='Analyst';");
    Button1 = new Button(this);
    Button1.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}