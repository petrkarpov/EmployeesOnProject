public class Main {
    public static void main(String[] args) {
        final int programmers = 5;
        final int testersForOneProgrammer = 1;
        final int support = 2;
        final int necessaryTesters = testersForOneProgrammer * programmers;
        final int necessarySupport = support * programmers;
        final int allSpecialists = programmers + necessaryTesters + necessarySupport;

        System.out.println("Тестировщики, требуемые на проекте: " + necessaryTesters);
        System.out.println("Специалисты поддержки, требуемые на проекте: " + necessarySupport);
        System.out.println("Общее кол-во специалистов на проекте: " + allSpecialists);
    }
}