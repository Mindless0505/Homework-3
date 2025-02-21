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

    public Patient removePatient(int num){
        Patient temp=patients.remove(num);
        return temp;
    }
    public void caffineAbsorbtion(){
        for (int i=0;i<patients.size();i++){
            patients.get(i).caffineLevel-=160;
         
            if (patients.get(i).caffineLevel<=0){
                patients.remove(i);
                i--;
            }

        }
    }
        
    @Override
    public String toString(){
        String ret="";
        for (int i=0;i<patients.size();i++){
            ret+= "ID: "+patients.get(i).IDNumber+"; Caffine: "+patients.get(i).caffineLevel+"\n";
        }
        if (ret==""){
        return "Empty";
        }
        return ret;
    }

    }

