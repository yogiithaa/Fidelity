package assessmentProg2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class empFilter{
    public static void main(String[] args) {
        List<emp> empList = new ArrayList<>();
        empList.add(new emp("1","Sneha"));
        empList.add(new emp("2","Anika"));
        empList.add(new emp("3","Yogitha"));
        empList.add(new emp("4","Erika"));
        empList.add(new emp("5","Anand"));
        empList.add(new emp("6","Yusuf"));
        empList.add(new emp("7","Akshay"));
        empList.add(new emp("8","Manav"));


        List<emp> filteredList = empList.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());

        System.out.println("Employees whose name starts with A: ");
        for(emp emp: filteredList){
            System.out.println("ID: "+emp.getID()+",name: "+emp.getName());
        }
    }
}