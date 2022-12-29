package lecture08.hw8.pharmacy_management_system.entity;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

// The 'Prescription' class represents a prescription with a list of drugs

public class Prescription {
    // The 'drugs' field stores a list of drugs in the prescription
    private Drug[] drugs = new Drug[10];

    // The 'index' field stores the number of drugs in the prescription
    private int index = 0;

    // A method to add a drug to the prescription
    public void add(Drug prescription) {
        // If the list of drugs is full, increase its size by 2
        if (index > drugs.length - 1) {
            drugs = Arrays.copyOf(drugs, drugs.length * 2);
        }
        // Add the drug to the list of drugs and increase the index
        drugs[index] = prescription;
        index++;
    }

    // A method to remove a drug from the prescription by its index
    public void remove(int id) {
        // If the index is within the list of drugs, set the drug at that index to null
        if (id < index) {
            drugs[id] = null;
        }
        // Shift the remaining drugs to the left by one index
        if (index - id >= 0) System.arraycopy(drugs, id + 1, drugs, id, index - id);
    }

    // A method to get the number of drugs in the prescription
    public int size() {
        return index;
    }

    public String getName(int index){
        return drugs[index].getName();
    }
    public boolean getConfirm(){
        return drugs[0].isConfirm();
    }
    public boolean getPay(){
        return drugs[0].isPay();
    }

    public boolean contains(String name){
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(name, drugs[i].getName())){
                return true;
            }
        }
        return false;
    }

    public void prescriptionPrice() {
        long prescriptionPrice = stream()
                .mapToLong(drug -> drug.getTotalPrice())
                .sum();
        System.out.println("Your total amount of bill is : " + prescriptionPrice);
    }

    public Stream<Drug> stream() {
        return Arrays.stream(drugs).filter(Objects::nonNull);
    }
}

// A method to check if the prescription contains a drug with the given

