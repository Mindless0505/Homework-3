import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patients;

    public PatientManager(){
        this.patients=new ArrayList<Patient>(10);
    }

    public int Add(Patient patient){
        patients.add(patient);
        return patients.indexOf(patient);
        }

    public Patient Remove(int num){
        patients.remove(num);
        return patients.get(num);
    }
    public void caffineAbsorbtion(){
        for (int i=0;i<patients.size();i++){
            patients.get(i).caffineLevel-=160;
         
            if (patients.get(i).caffineLevel<=0){
                patients.remove(i);
            }

        }
    }
        
    public String toString(){
        for (int i=0;i<patients.size();i++){
            return "ID: "+patients.get(i).IDNumber+"; Caffine: "+patients.get(i).caffineLevel;
        }
        return "Empty";
    }

    }

