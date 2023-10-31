public class Main {
    public static void main(String[] args) {
        final int PROGRAMMERS = 5;
        final int TESTERS_FOR_ONE_PROGRAMMER = 1;
        final int SUPPORT = 2;

        final int NECESSARY_TESTERS = TESTERS_FOR_ONE_PROGRAMMER * PROGRAMMERS;
        final int NECESSARY_SUPPORT = SUPPORT * PROGRAMMERS;
        final int ALL_SPECIALISTS = PROGRAMMERS + NECESSARY_TESTERS + NECESSARY_SUPPORT;

        System.out.println("Тестировщики, требуемые на проекте: " + NECESSARY_TESTERS);
        System.out.println("Специалисты поддержки, требуемые на проекте: " + NECESSARY_SUPPORT);
        System.out.println("Общее кол-во специалистов на проекте: " + ALL_SPECIALISTS);
    }
}