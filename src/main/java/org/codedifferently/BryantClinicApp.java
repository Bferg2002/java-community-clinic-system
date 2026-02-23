package org.codedifferently;

import java.util.Scanner;

public class BryantClinicApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner object called input
        BryantClinicSystem clinic = new BryantClinicSystem();   //instance of the BryantClinicSystem class called clinic
        int choice;

        do {
            displayClinicMenu();
            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                input.nextLine(); // clear bad input
                choice = -1; // force default case
            }

            //Actions based on the menu number the user selects
            switch (choice) {
                case 1:
                    System.out.print("Enter patient's species: ");
                    String species = input.nextLine();
                    System.out.print("Enter patient's name: ");
                    String name = input.nextLine();
                    System.out.print("Enter owner's phone number(no dashes): ");
                    String phone = input.nextLine();
                    KennyPatient newPatient = new KennyPatient(species, name, false, phone);
                    clinic.addPatient(newPatient);
                    break;

                case 2:
                    clinic.viewAllPatients();
                    break;

                case 3:
                    System.out.print("Enter patient ID to check in: ");
                    String checkInId = input.nextLine();
                    KennyPatient patient = clinic.getPatientById(Integer.parseInt(checkInId));
                    if (patient != null) {
                        clinic.checkInPatient(patient);
                        clinic.lookUpPatientById(Integer.parseInt(checkInId));

                    } else {
                        System.out.println("Patient not found.");
                        System.out.println("---------------------------");
                    }
                    break;

                case 4:
                    System.out.print("Enter patient ID: ");
                    String id = input.nextLine();
                    clinic.lookUpPatientById(Integer.parseInt(id));
                    break;

                case 5:
                    System.out.print("Enter patient's name: ");
                    name = input.nextLine();
                    System.out.println("Enter the owner's phone number (no dashes): ");
                    phone = input.nextLine();
                    clinic.lookUpPatient(name,phone);
                    break;

                case 6:
                    System.out.print("Enter the date of your appointment (MM/DD/YYYY): ");
                    String date = input.nextLine();
                    System.out.print("Enter the time you want to schedule the appointment: ");
                    String time = input.nextLine().toUpperCase();
                    System.out.print("Enter the reason for scheduling this appointment: ");
                    String reason = input.nextLine();
                    System.out.println("Enter the patient's id: ");
                    String patientID = input.nextLine();
                    clinic.scheduleAppointment(Integer.parseInt(patientID), date, time, reason);
                    break;

                case 7:
                    System.out.print("Enter the date of your appointment (MM/DD/YYYY): ");
                    String cancelDate = input.nextLine();
                    System.out.print("Enter the time of your appointment: ");
                    String cancelTime = input.nextLine().toUpperCase();
                    clinic.cancelAppointment(cancelDate, cancelTime);
                    break;

                case 8:
                    clinic.viewFullSchedule();
                    break;

                case 9:
                    System.out.print("Enter date for summary (MM/DD/YYYY): ");
                    String summaryDate = input.nextLine();

                    clinic.dailySummary(summaryDate);
                    break;

                case 10:
                    clinic.viewWaitList();
                    break;

                case 11:
                    System.out.print("Enter patient's species: ");
                    species = input.nextLine();
                    System.out.print("Enter patient's name: ");
                    name = input.nextLine();
                    System.out.print("Enter owner's phone number(no dashes): ");
                    phone = input.nextLine();
                    KennyPatient newPatient2 = new KennyPatient(species, name, false, phone);
                    clinic.addedToWaitingList(newPatient2);
                    break;

                case 12:
                    System.out.print("Enter appointment date (MM/DD/YYYY): ");
                    String compDate = input.nextLine();

                    System.out.print("Enter appointment time: ");
                    String compTime = input.nextLine().toUpperCase();

                    clinic.completeAppointment(compDate, compTime);
                    break;

                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        input.close();
    }

    //helper function to display the menu options
    public static void displayClinicMenu(){
        System.out.println("\n**** Welcome to the Community Clinic System! ****");
        System.out.println("Please select an option:");
        System.out.println("1. Add New Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Check In Patient");
        System.out.println("4. Search Patient by ID");
        System.out.println("5. Search Patient by Name and Phone Number");
        System.out.println("6. Schedule Appointment");
        System.out.println("7. Cancel Appointment");
        System.out.println("8. View Full Schedule");
        System.out.println("9. Daily Summary Report");
        System.out.println("10. View Waitlist");
        System.out.println("11. Add Patient to Waitlist");
        System.out.println("12. Mark an Appointment as Completed");
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("Enter choice: ");
    }
}// ends class
