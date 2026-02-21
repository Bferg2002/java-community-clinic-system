package org.codedifferently;

    public class KennyPatient {

        private int id;

        private String name;

        private boolean checkedIn;


        public KennyPatient(int id, String name) {
            this.id = id;

            this.name = name;

            this.checkedIn = false;
        }


        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public boolean isCheckedIn() {
            return checkedIn;
        }


        public void checkIn() {
            this.checkedIn = true;

        }


        public void setName(String name) {
            this.name = name;

        }


        @Override
        public String toString() {
            return "KennyPatient{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", checkedIn=" + checkedIn +
                    '}';
        }
    }
