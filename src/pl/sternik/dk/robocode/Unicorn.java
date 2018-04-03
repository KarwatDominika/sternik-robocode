package pl.sternik.dk.robocode;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Unicorn extends Robot{


    double move;

    public void run(){

        setBodyColor(Color.MAGENTA);
        setGunColor(Color.CYAN);
        setRadarColor(Color.BLUE);

        setScanColor(Color.YELLOW);
        setBulletColor(Color.ORANGE);

       move = Math.max(getBattleFieldWidth(),getBattleFieldHeight());


      turnLeft(getGunHeading() % 90);
      ahead(move);

      turnGunRight(90);
      turnRight(90);


        while(true){

          ahead(move);
          turnGunRight(360);
          back(move);
          turnGunRight(360);

        }
    }

    public void onScannedRobot(ScannedRobotEvent e){
        fireBullet(3);

    }


}

