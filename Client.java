package Design_Pattern_Prototype_Registry;

public class Client {
    public static void main(String[] args) {
        //Prototype1
        Student studentApril23Proto = new Student();
        studentApril23Proto.setBatchName("Apr23");
        studentApril23Proto.setAvgBatchPsp(80);
        studentApril23Proto.setInstructorName("Naman Bhalla");
        studentApril23Proto.setMonthOfEnrollment("0423");
        studentApril23Proto.setCurrentModule("DSA");

        //Prototype2
        Student studentMarch23Proto = new Student();
        studentMarch23Proto.setBatchName("Match23");
        studentMarch23Proto.setAvgBatchPsp(70);
        studentMarch23Proto.setInstructorName("Sandeep Sinha");
        studentMarch23Proto.setMonthOfEnrollment("0323");
        studentMarch23Proto.setCurrentModule("LLD");


        //Register in Student registry
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("Apr23",studentApril23Proto );
        studentRegistry.register("March23",studentMarch23Proto );



        //Objects copied from -Prototype1
        Student dhmsApr23 = studentApril23Proto.copy();
        dhmsApr23.setName("Dharmesh");
        dhmsApr23.setEmail("dhms@gmail.com");
        dhmsApr23.setPhoneNumber("8849491265");


        //Objects copied from -Prototype1 but geting prototype from regstry from key
        Student prateekApr23 = studentRegistry.get("Apr23").copy();
        prateekApr23.setName("Parteek");
        prateekApr23.setEmail("prateek@gmail.com");
        prateekApr23.setPhoneNumber("9911991199");

        //Objects copied from -Prototype1 but geting prototype from regstry with different key
        Student purabMarch23 = studentRegistry.get("March23").copy();
        purabMarch23.setName("Purab");
        purabMarch23.setEmail("purab@hotmail.com");
        purabMarch23.setPhoneNumber("4545656565");

        //_____________________________________________________
        //In case of child of Student class

        Student st = new IntelStudent("Jan23", 98);
        Student stCopy = st.copy();


    }

}
