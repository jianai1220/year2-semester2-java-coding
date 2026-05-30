public class Patient {
    private String disease;
    private Doctor doctor;
    private Ward ward;

    Patient(){};

    public void setDisease(String d){
        this.disease = d;
    }

    public void setDoctor(String docName, String docDepart){
        this.doctor = new Doctor();
        this.doctor.setName(docName);
        this.doctor.setDepartment(docDepart);
    }

    public void setWard(String wardRoomNo){
        this.ward = new Ward();
        this.ward.setRoomNo(wardRoomNo);
    }

    public void print(){
        System.out.println("Patient Information:" + "\nDisease: " + disease);
        doctor.print();
        System.out.println("Ward Information: " + ward.getRoomNo());
    }

    public void print(int seqNo){
        System.out.println("Sequence Number: " + seqNo);
        print();
    }
}
