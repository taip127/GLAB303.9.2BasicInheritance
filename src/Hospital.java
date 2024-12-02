// Parent class: Doctor
class Doctor {
    String DoctorName;
    String Department;

    // Method to display doctor details
    public void Doctor_Details() {
        System.out.println("Doctor Details...");
    }
}

// Child class: Surgeon
class Surgeon extends Doctor {
    // Method to display surgeon-specific details
    void Surgeon_Details() {
        System.out.println("Surgeon Detail...");
        System.out.println(Department = "Cardio");
    }
}

// Main class: Hospital
public class Hospital {
    public static void main(String[] args) {
        // Creating an object of the child class (Surgeon)
        Surgeon s = new Surgeon();

        // Calling methods from the parent class and the child class
        s.Doctor_Details();  // Accessing parent class method
        s.Surgeon_Details(); // Accessing child class method
    }
}
