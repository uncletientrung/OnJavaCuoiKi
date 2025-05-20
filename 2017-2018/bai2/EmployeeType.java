class EmployeeType implements IEmployeeType {
    private String employeeType;

    public EmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String getEmployeeType() {
        return employeeType;
    }

    @Override
    public void setEmployeeType(String type) {
        this.employeeType = type;
    }

    @Override
    public String toString() {
        return "EmployeeType: " + employeeType;
    }
}
