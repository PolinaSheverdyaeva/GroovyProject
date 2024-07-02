package in.at.constructor

class ParametrizedConstructorDemo {

    def empName
    def empId

    ParametrizedConstructorDemo(empName, empId){
//        eName = empName
//        eId = empId

        this.empName = empName
        this.empId = empId

        println "The Employee Name is : " + empName
        println "The Employee Id is : " + empId
    }

    static main(args){
        ParametrizedConstructorDemo object1 = new ParametrizedConstructorDemo("Tom", 101)
        ParametrizedConstructorDemo object2 = new ParametrizedConstructorDemo("Jerry", 102)
    }
}
