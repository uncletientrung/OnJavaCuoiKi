class Employee implements IEmployee {
    private String id;
    private String name;
    private String phone;
    private String address;
    private String department;
    private String position;
    private EmployeeType employeeType;

    public Employee(String id, String name, String phone, String address, String department, String position, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.position = position;
        this.employeeType = employeeType;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "', phone='" + phone + "', address='" + address + "', department='" + department + "', position='" + position + "', " + employeeType.toString() + "}";
    }
}