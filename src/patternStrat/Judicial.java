package patternStrat;



public class Judicial {
    private Constitutional currentStratagy;

    public void setCurrentStratagy(Constitutional newStratagy) {
        this.currentStratagy = newStratagy;

    }public void judge(){
        currentStratagy.judge();
    }


}
