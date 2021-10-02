package miniExercisesWarmups;

class Employee extends Person {
    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
        return department;

//        // ...
//        public String getDepartment() {
//            if (this.belongsToADepartment) {
//                return this.department;
//            } else {
//                throw new DepartmentNotFoundException("No department found for " + this.name);
//            }
//        }
//        // ...
    }
}