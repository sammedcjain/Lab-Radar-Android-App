package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TextBox;
class dbms5 extends Form implements HandlesEventDispatching {
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
    this.Title("dbms5");
    Label1 = new Label(this);
    Button1 = new Button(this);
    Button1.Text("< Main Menu");
    TextBox1 = new TextBox(this);
    TextBox1.BackgroundColor(0xFFFFC800);
    TextBox1.FontBold(true);
    TextBox1.Width(LENGTH_FILL_PARENT);
    TextBox1.Hint("Hint for TextBox1");
    TextBox1.MultiLine(true);
    TextBox1.Text("Exercise – 7 (Aggregate function / subquery / join operation)
    Employee(Eno, Ename, Salary, Hiredate, JOB, Dnum)
    Department(Dnum, Dname, Location)
    Project(Pno, Pname, Dnum)
    Works_on( Eno, Pno, Hours)
    1. Display each employee name, hiredate and salary of Marketing department.
    2. Find the name of lowest paid employee for eachdepartment.
    3. Find the employees who earn the maximum salary in each job type. Sort in descending order
    ofsalary.
    4. Retrieve the names of the employees in department 5 who work more than 10hours/weekon
    the ‘Bhoomi’ project.
    5. Count the no. of employees working in each department.
    6. Display the details of those employees who earn more than average salary of their department.
    7. Update the salaries of the employees who are clerk and working in department 20 by 20%
    8. For each project, list the project name and the total hours per week (byall employees) spent on
    that project.
    9. Retrieve the name of the employees who works on every project.
    10. List the average salary of each job excludingManagers");
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
    TextBox3.Text("1. Display each employee name, hiredate and salary of Marketing department.
    select Ename,Dname,Hiredate,Salary from emp
    -> join dept
    -> on emp.Dnum=dept.Dnum
    -> where Dname=(select Dname from dept where Dname='Marketing');
    2. Find the name of lowest paid employee for eachdepartment.
    select Ename from emp where Salary in (select min(Salary) from emp group by Dnum);
    3. Find the employees who earn the maximum salary in each job type. Sort in descending order
    of salary.
    select Ename from emp where salary=(select min(salary) from emp);
    4. Retrieve the names of the employees in department 5 who work more than 10hours/weekon
    the ‘Bhoomi’ project.
    select Ename from emp
    -> join workson
    -> on emp.Eno=workson.Eno
    -> where Pno=3
    -> and Hours>10 and Dnum=3;
    5. Count the no. of employees working in each department.
    select Dname,count(*) from emp join dept on emp.Dnum=dept.Dnum group by dept.Dnum;
    6. Display the details of those employees who earn more than average salary of their department.
    select * from emp where Salary>(select avg(Salary) from emp) group by Dnum;
    7. Update the salaries of the employees who are clerk and working in department 20 by 20%
    update emp set salary=salary+(salary*0.2) where JOB='Clerk';
    8. For each project, list the project name and the total hours per week (byall employees) spent on
    that project.
    select Pname,sum(Hours) from project
    -> join workson
    -> on project.Pno=workson.Pno
    -> group by project.Pno;
    9. Retrieve the name of the employees who works on every project.
    select Ename from emp a where not exists (select Pno from project where Pno not in(select Pno from workson c where c.Eno=a.Eno));
    10. List the average salary of each job excluding Managers
    select avg(salary) from emp where JOB in (select JOB from emp where JOB!='Manager');");
    Button2 = new Button(this);
    Button2.Text("< prev");
    Button3 = new Button(this);
    Button3.Text("next >");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}