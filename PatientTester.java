public class PatientTester{

public static void main(String[] args){

    PatientManager pManager= new PatientManager();
    System.out.println(pManager);
    Patient p1=new Patient(1,200);
    Patient p2=new Patient(2,400);
    Patient p3=new Patient(3,600);
    Patient p4=new Patient(4,800);
    pManager.Add(p1);
    pManager.Add(p2);
    pManager.Add(p3);
    pManager.Add(p4);
    System.out.println(pManager);
    pManager.caffineAbsorbtion();
    pManager.caffineAbsorbtion();
    System.out.println(pManager);
    pManager.removePatient(2);
    System.out.println(pManager);

    }


}


