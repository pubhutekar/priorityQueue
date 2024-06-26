package PriorityQueue;

import java.util.PriorityQueue;

public class EmergencyRoom {
	private PriorityQueue<Patient> patientQueue;

	public EmergencyRoom() {
		patientQueue = new PriorityQueue<>();
	}

	public void addPatient(String name, int priority) {
		Patient patient = new Patient(name, priority);
		patientQueue.add(patient);
		System.out.println("Added: " + patient);
	}

	public void treatNextPatient() {
		if (patientQueue.isEmpty()) {
			System.out.println("No patients to treat.");
		} else {
			Patient nextPatient = patientQueue.poll();
			System.out.println("Treating: " + nextPatient);
		}
	}

	public void displayQueue() {
		if (patientQueue.isEmpty()) {
			System.out.println("No patients in the queue.");
		} else {
			System.out.println("Patients in the queue:");
			for (Patient patient : patientQueue) {
				System.out.println(patient);
			}
		}
	}

	public static void main(String[] args) {
		EmergencyRoom er = new EmergencyRoom();
		er.addPatient("sagar kale", 5);
		er.addPatient("rajesh jadhav", 3);
		er.addPatient("vilas more", 4);
		er.addPatient("sachin more", 2);

		er.displayQueue();
		er.treatNextPatient();
		er.displayQueue();
		er.treatNextPatient();
		er.displayQueue();
	}
}
