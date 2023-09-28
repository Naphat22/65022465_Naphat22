class Employee {
    private String name;
    private String position;
    private String empID;
    private String[] projects;

    public Employee(String name, String position, String empID, String[] projects) {
        this.name = name;
        this.position = position;
        this.empID = empID;
        this.projects = projects;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Employee ID: " + empID);
        System.out.println("Projects:");
        for (String project : projects) {
            System.out.println("   " + project);
        }
        System.out.println("**************");
    }
}

public class Main {
    public static void main(String[] args) {
        String[] tomProjects = {"Web A: Developing a web application", "Mobile app A: Developing a mobile app"};
        Employee tom = new Employee("Tom", "UX/UI", "0001", tomProjects);

        String[] timProjects = {"Web A: Developing a web application"};
        Employee tim = new Employee("Tim", "FrontEnd", "0002", timProjects);

        tom.displayInfo();
        tim.displayInfo();
    }
}

import java.util.ArrayList;
import java.util.List;


interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}


interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}


class Employee implements Person, Job {
    private String name;
    private int age;
    private String position;
    private String empID;
    private List<Project> myProjects;

    public Employee(String name, int age, String position, String empID) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
        this.myProjects = new ArrayList<>();
    }

    public void AddProject(Project project) {
        myProjects.add(project);
    }

    public void ShowDetails() {
        System.out.println("**************");
        System.out.println("Name : " + name);
        System.out.println("position : " + position);
        System.out.println("EmpID:" + empID);
        System.out.println("Projects");
        for (Project project : myProjects) {
            System.out.println("\t" + project.getProject());
        }
        System.out.println("**************");
    }

    
    public String getName() {
        return name;
    }

 
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

  public void setPosition(String position) {
        this.position = position;
    }

   public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
}


class Project {
    private String projectName;
    private String projectDescription;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public String getProject() {
        return projectName + " : " + projectDescription;
    }
}

public class Main {
    public static void main(String[] args) {
       
        Employee tom = new Employee("Tom", 30, "UX/UI", "0001");
        tom.AddProject(new Project("Web A", "Developing a web application"));
        tom.AddProject(new Project("Mobile app A", "Developing a mobile app"));

        
        tom.ShowDetails();

        
        Employee tim = new Employee("Tim", 25, "FontEnd", "0002");
        tim.AddProject(new Project("Web A", "Developing a web application"));

       
        tim.ShowDetails();
    }
}
