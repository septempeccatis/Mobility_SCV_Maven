package com.example.mobility_scv_maven;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import javax.bluetooth.*;
import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.*;

public class Data_Controller {

    public static final Vector/*<RemoteDevice>*/ devicesDiscovered = new Vector();

    @FXML
    private Text ad,na = new Text();

    @FXML
    private void click_btn(MouseEvent event) throws IOException, InterruptedException {
        RemoteDeviceDiscovery();
    }


    private void RemoteDeviceDiscovery() throws IOException {
        LocalDevice device = LocalDevice.getLocalDevice();
        RemoteDevice[] remoteDevices = device.getDiscoveryAgent().retrieveDevices(DiscoveryAgent.PREKNOWN);
        for(RemoteDevice d: remoteDevices){
/*            a.setText(d.getFriendlyName(false));
            b.setText(d.getBluetoothAddress());*/
        }


/*        final Object inquiryCompletedEvent = new Object();

        devicesDiscovered.clear();
        DiscoveryListener listener = new DiscoveryListener() {
            @Override
            public void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
                a.setText("Device " + remoteDevice.getBluetoothAddress() + "found");
                devicesDiscovered.addElement(remoteDevice);
                try {
                    b.setText("    name " + remoteDevice.getFriendlyName(false));
                } catch (IOException cantGetDeviceName) {
                }
            }

            @Override
            public void inquiryCompleted(int i) {
                System.out.println("Device Inquiry completed!");
                synchronized (inquiryCompletedEvent) {
                    inquiryCompletedEvent.notify();
                }
            }

            @Override
            public void servicesDiscovered(int i, ServiceRecord[] serviceRecords) {

            }

            @Override
            public void serviceSearchCompleted(int i, int i1) {

            }
        };

        synchronized (inquiryCompletedEvent) {
            boolean started = LocalDevice.getLocalDevice().getDiscoveryAgent().startInquiry(DiscoveryAgent.GIAC, listener);
            if(started){
                System.out.println("wait for device inquiry to complete .....");
                inquiryCompletedEvent.wait();
                System.out.println(devicesDiscovered.size() + "   device(s) found");
            }
        }*/

    }
}
