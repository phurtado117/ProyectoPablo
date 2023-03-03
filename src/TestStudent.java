public class TestStudent {
    public static void main(String[] args) {

        Student Pablo = new Student("22670093","Pablo","Alfonso","Informatica",
                "2","Tics",);
        System.out.println("Pablo = " + Pablo);
        Pablo.setName("Pablo");
        Pablo.setLastNme("alfonso");

        System.out.println("Alumno Numero de Control = " + Pablo.getControlNumber());
        System.out.println("Alumno Semestre = " + Pablo.getSemestre());
        System.out.println("Alumno Career = " + Pablo.getCareer());
        System.out.println("Alumno Average = " + Pablo.getAverage());
        System.out.println("El nombre es: " + Pablo.getName());
        System.out.println("El nombre es: " + Pablo.getLastNme());


    }


}
