public class Main {
    public static void main(String[] args) {
        CherryPie myPie = new CherryPie();
        CherryPie momPie = new CherryPie();

        myPie.numberOfLayers = 4;
        momPie.numberOfLayers = 10;

        System.out.println("Number of Layers " + myPie.numberOfLayers);
        System.out.println("Number of Layers " + momPie.numberOfLayers);

    }
}
