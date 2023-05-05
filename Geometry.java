class Geometry extends Physics{

    void accessingPi(){
        System.out.println(getPy());
        System.out.println(getPy());
    }

    double potentialEnergy(double mass, double height){
        return mass * getG() * height;
    }
}
