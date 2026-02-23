package org.codedifferently;

import java.util.ArrayList;

public class KennyPatient {

        private String species;

        private String name;

        private boolean checkedIn;

        private String ownersPhoneNumber;

        private int patientId;
        private int idCounter = 1;

        public KennyPatient(String species, String name, boolean checkedIn, String ownersPhoneNumber) {
            this.species = species;

            this.name = name;

            this.checkedIn = checkedIn;

            this.ownersPhoneNumber = ownersPhoneNumber;

            this.patientId = idCounter++;
        }

        public String getSpecies() {
            return species;
        }

        public String getName() {
            return name;
        }

        public boolean getCheckedIn() {
            return checkedIn;
        }

        public int getPatientId() {
            return patientId;
        }

        public String getOwnersPhoneNumber(){return ownersPhoneNumber;}

        public void setCheckedIn(Boolean checkedIn) {
            this.checkedIn = checkedIn;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setOwnersPhoneNumber(String ownersPhoneNumber){
         this.ownersPhoneNumber = ownersPhoneNumber;
        }

        public void setSpecies(String species){
        this.species = species;
        }

        public void displayInfo() {
            System.out.println("Patient ID: " + patientId);
            System.out.println("Pet Name: " + name);
            System.out.println("Species: " + species);
            System.out.println("Owner's Phone Number: " + ownersPhoneNumber);
            System.out.println("Checked In: " + checkedIn);
            System.out.println();
        }


}
