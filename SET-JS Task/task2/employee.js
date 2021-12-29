export const employees=[
    {name:'Thomas Edwin',empid:'E111',salary:10000},
    {name:'Gregory Mathew',empid:'E555',salary:12000},
    {name:'Thomas Edison',empid:'E444',salary:8000},
    {name:'GregoryEdwin',empid:'E222',salary:6000},
    {name:'Isac Newton',empid:'E666',salary:20000},
    {name:'Thomas Gibson',empid:'E333',salary:4000}
]

const getEmployeesByName = (name) => {
    const result = []
    for(var employee of employees) {
        if(employee.name.includes(name))
            result.push(employee)
    }
    return result
}

const getEmployeeIds = () => {
    const result = []
    employees.forEach((employee, i) => {
       result.push(employee.empid)
    });
    return result
}

const getTotalSalary = () => {
    let salary = 0
    for(var i=0;i<employees.length;i++)
        salary+=employees[i].salary
    return salary
}

console.log(getTotalSalary())