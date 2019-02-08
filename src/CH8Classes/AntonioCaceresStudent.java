package CH8Classes;

public class AntonioCaceresStudent {
        private String name;
        private int grade;
        private String school;
        private int studID;
        private double gpa;
        private int dob;
        private String[] schedule;
        private String address;
        private String counselor;
        private char gender;

        //constructor
        public AntonioCaceresStudent(String name, int grade, int dob, String address, char gender, double gpa) {
            this.name = name;
            this.grade = grade;
            this.dob = dob;
            this.address = address;
            this.gender = gender;
            this.gpa = gpa;
        }

        //indicators
        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }
        public double getGpa() {
            return gpa;
        }
        public String getSchool() {
            return school;
        }

        public int getDob() {
            return dob;
        }

        public String getAddress() {
            return address;
        }

        public String getCounselor() {
            return counselor;
        }
        public String[] getSchedule() {
            return schedule;
         }
        public char getGender() {
            return gender;
        }

        //mutators
        public void setName(String name) {
            this.name = name;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public void setSchedule(String[] schedule) {
            this.schedule = schedule;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCounselor(String counselor) {
            this.counselor = counselor;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }
        @Override
        public String toString(){
            return "This is " + name + "'s student profile. They currently attend"
                    + school + ". Their current schedule is " + schedule + "and they current have a" +
                    gpa + ("gpa on a 4.0 scale.");
        }
    }

