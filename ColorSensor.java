package org.firstinspires.ftc.robotcontroller.external.samples;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;


import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.SwitchableLight;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by Randall Delafuente on 9/21/2017.
 */
@TeleOp(name = "Sensor: Color", group = "Color")
@Disabled
public class ColorSensor extends LinearOpMode{

    NormalizedColorSensor colorSensor;
    View relativeLayout;


    @Override
    public void runOpMode() throws InterruptedException {
        int relativeLayoutId = hardwareMap.appContext.getResources().getIdentifier ("Relative Layout", "id", hardwareMap.appContext.getPackageName());
        relativeLayout = ((Activity) hardwareMap.appContext).findViewById(relativeLayoutId);

    try {
        runSample();
        }
        finally {
            relativeLayout.post(new Runnable() {
                public void run() {
                    relativeLayout.setBackgroundColor(Color.WHITE);
                }
            });

                }
            }

    private void runSample() {
    }

    protected void runSample    }

    }
}
