public class Program {
    public static void main(String[] args) {
        Input input = new Input("input.txt");
        Finder finder = new Finder(input);

        System.out.printf("Количество слов: %s", finder.findLength());
        System.out.printf("Самое длинное слово: %s", finder.findLongest());
        finder.wordAmount();
    }
}
