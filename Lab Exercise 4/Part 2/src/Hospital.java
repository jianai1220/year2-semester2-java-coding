import java.util.ArrayList;
public class Hospital {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        Patient patient1 = new Patient();
        patient1.setDisease("Fever");
        patient1.setDoctor("Dr. Salmi","Internal Medicine");
        patient1.setWard("101");

        Patient patient2 = new Patient();
        patient2.setDisease("Broken Leg");
        patient2.setDoctor("Dr. Koh","Orthopedics");
        patient2.setWard("201");

        patients.add(patient1);
        patients.add(patient2);

        for(int i = 0; i < patients.size(); i++){
            patients.get(i).print(i+1);
            System.out.println();
        }
    }
}
