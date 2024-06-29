package staticdemo

class staticDemo {

    static main(args){

        EmployeeData employee1 = new EmployeeData()
        employee1.empId = 101
        employee1.empName = "Tom"


        println "The ID of the Employee 1 is: " + employee1.empId
        println "The name of the Employee 1 is: " + employee1.empName
        println "The company of the Employee 1 is: " + EmployeeData.companyName

        EmployeeData employee2 = new EmployeeData()
        employee2.empId = 202
        employee2.empName = "Jerry"
        employee2.companyName = "Test2"

        println "The ID of the Employee 2 is: " + employee2.empId
        println "The name of the Employee 2 is: " + employee2.empName
        println "The company of the Employee 2 is: " + employee2.companyName


    }
}
