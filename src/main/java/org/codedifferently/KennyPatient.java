package org.codedifferently;

import java.util.ArrayList;

public class KennyPatient {

        private String species;

        private String name;

        private boolean checkedIn;

        private String ownersPhoneNumber;


        public KennyPatient(String species, String name, boolean checkedIn, String ownersPhoneNumber) {
            this.species = species;

            this.name = name;

            this.checkedIn = checkedIn;

            this.ownersPhoneNumber = ownersPhoneNumber;

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

    @Override
        public String toString() {
            return "KennyPatient{" +
                    "id=" + species +
                    ", name='" + name + '\'' +
                    ", checkedIn=" + checkedIn +
                    '}';
        }
    }
