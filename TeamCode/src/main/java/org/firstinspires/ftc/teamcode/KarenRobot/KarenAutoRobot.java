package org.firstinspires.ftc.teamcode.KarenRobot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.KarenRobot.RobotSubSystems.VisionSystem;
import org.firstinspires.ftc.teamcode.KarenRobot.RobotSubSystems.VuforiaSystem;
import org.firstinspires.ftc.teamcode.KarenUtil.SimpleColor;

/**
 * Created by Seb on 2/1/18.
 */

public class KarenAutoRobot extends Karen {
    public KarenAutoRobot(OpMode opMode, SimpleColor alliance, Boolean twoDrivers) {
        super(opMode, alliance, twoDrivers);
        putSubSystem("vuforia", new VuforiaSystem(this));
        putSubSystem("vision", new VisionSystem(this));
    }
}
