package Design_Pattern_Prototype_Registry;

import L3_Constructor_Super_etc.IntelligentStudent;

public class IntelStudent extends Student{
    private int iq;

    public IntelStudent(String batchName, int iq){
            super(batchName);
            this.iq = iq;
    }

    public IntelStudent(){

    }
    public IntelStudent(String batchName, double avgBatchPsp, String instructorName, String monthOfEnrollment, String currentModule, String name, String phoneNumber, String email, int iq) {
        super(batchName, avgBatchPsp, instructorName, monthOfEnrollment, currentModule, name, phoneNumber, email);
        this.iq = iq;
    }

    public IntelStudent copy(){
        IntelStudent intelStudent =new IntelStudent();
        intelStudent.setBatchName(this.getBatchName());
        intelStudent.iq = this.iq;
        return intelStudent;
    }
}
