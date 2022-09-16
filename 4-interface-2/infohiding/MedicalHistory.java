package infohiding;

import java.util.List;

public class MedicalHistory implements Accountable {
    private String patientName;
    private String symptom;
    private String diagnosis;
    private List<String> labResult;
    private List<Medicine> medicines;

    @Override
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<String> getLabResult() {
        return labResult;
    }

    public void setLabResult(List<String> labResult) {
        this.labResult = labResult;
    }

    @Override
    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }
}
