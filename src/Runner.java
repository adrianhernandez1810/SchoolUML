public class Runner {

    public static void main(String[] args){

        School bhs = new School("Berkeley High");
        Teacher matt = new Teacher("Mr.Albinson", "Math");
        Teacher daniel = new Teacher("Mr.MB", "Science");
        Teacher victor = new Teacher("Mr.Aguillera", "TOK");
        Section math = new Section( matt, "Math");
        Section bio = new Section( daniel,"Biology");
        Section tok = new Section( victor,"TOK");
        Student adrian = new Student("Adrian Hernandez", 100);
        Student manny = new Student("Manny Hernandez", 95);
        Student mario = new Student("Mario Gonzalez", 97);
        Student loht = new Student("Dael Loht", 92);
        Student carlos = new Student("Carlos Rodriguez", 80);
        Student sammi = new Student("Sammi Chavez", 85);

        math.setTeacher(matt);
        bio.setTeacher(daniel);
        tok.setTeacher(victor);

    }

}
