public class WineSampleBrowser{
    public static void main(String[]args){
        if(args.length == 0){
            args = new String[]{
                "resources/winequality-red.csv",
                "resources/winequality-white.csv",
                "resources/QueryList.txt"
            };
        }
        String redWineFile = args[0];
        String whiteWineFile = args[1];
        String queriesFile = args[2];

        WineSampleCellar cellar = new WineSampleCellar(redWineFile,whiteWineFile,queriesFile);
    }
}