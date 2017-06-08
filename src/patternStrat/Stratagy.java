package patternStrat;



public class Stratagy

{
    public static void main(String[] args) {
        Judicial myJudicial = new Judicial();
        myJudicial.setCurrentStratagy(new Military() );
        myJudicial.judge();
        myJudicial.setCurrentStratagy(new Arbitration() );
        myJudicial.judge();
        myJudicial.setCurrentStratagy(new MagistratesCourt() );
        myJudicial.judge();
        myJudicial.setCurrentStratagy(new DistrictCourt() );
        myJudicial.judge();





    }
}
