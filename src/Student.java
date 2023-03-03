public class Student {

        private long controlNumber;
        private String name;
        private String LastNme;
        private String career;
        private int Semestre;

    public Student(long controlNumber, String name, String lastNme, String career, int semestre) {
        this.controlNumber = controlNumber;
        this.name = name;
        LastNme = lastNme;
        this.career = career;
        Semestre = semestre;
    }


    //metodos getter

    public long getcontrolNumber(){
        return this.controlNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getLastNme(){
        return this.LastNme;
    }

    public String getCareer(){
        return this.career;
    }

    public int getSemestre(){
        return this.Semestre;
    }

    //metodo setter

    public void setControlNumber(long controlNumber){
        this.controlNumber=controlNumber;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setLastNme(String lastNme) {
        LastNme = lastNme;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    public void setSemestre(int semestre){
        this.Semestre=semestre;
    }

    public String toString(){
        System.out.println("nombre:"+getName());
        System.out.println("apellido:"+getLastNme());
        System.out.println("numero de control:"+getcontrolNumber());
        System.out.println("semestre:"+getSemestre());
        System.out.println("career"+getCareer());
         return "";

    }
}




