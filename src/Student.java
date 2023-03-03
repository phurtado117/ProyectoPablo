public class Student {

        private Long ControlNumber;
        private String name;
        private String LastNme;
        private String career;
        private Short Semestre;
        private Double Average;

    public Student(Long controlNumber, String name, String lastNme, String career, Short semestre, Double average) {
        ControlNumber = controlNumber;
        this.name = name;
        LastNme = lastNme;
        this.career = career;
        Semestre = semestre;
        Average = average;
    }

    public void Student(){

        }

        public Long getControlNumber() {
            return ControlNumber;
        }

        public void setControlNumber(Long controlNumber) {
            ControlNumber = controlNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastNme() {
            return LastNme;
        }

        public void setLastNme(String lastNme) {
            LastNme = lastNme;
        }

        public String getCareer() {
            return career;
        }

        public void setCareer(String career) {
            this.career = career;
        }

        public Short getSemestre() {
            return Semestre;
        }

        public void setSemestre(Short semestre) {
            Semestre = semestre;
        }

        public Double getAverage() {
            return Average;
        }

        public void setAverage(Double average) {

            Average = average;
        }

        public  double getGeneralAverage(Integer controlNumber){
            return 0.0;

        }

        public double getSemestreAverage(Integer semestre){
            return 0.0;
        }

        public double getSubGrade(Integer controlNumber, String subject){
            return 0.0;
        }


    }


