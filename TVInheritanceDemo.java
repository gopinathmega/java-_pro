class Television {
    void powerOn() {
        System.out.println("Television is now ON");
    }
}

class SmartTV extends Television { // Single inheritance
    void streamContent() {
        System.out.println("Streaming online content");
    }
}

interface HDMIInput {
    void hdmiConnect();
}

interface USBInput {
    void usbConnect();
}

class AdvancedSmartTV extends SmartTV implements HDMIInput, USBInput {
    public void hdmiConnect() {
        System.out.println("HDMI device connected");
    }

    public void usbConnect() {
        System.out.println("USB device connected");
    }

    void voiceControl() {
        System.out.println("Voice control activated");
    }
}

public class TVInheritanceDemo {
    public static void main(String[] args) {
        
        // Single Inheritance Example
        System.out.println("=== Single Inheritance Example ===");
        SmartTV tv = new SmartTV();
        tv.powerOn();        // From Television
        tv.streamContent();  // From SmartTV

        // Multiple Inheritance Example
        System.out.println("\n=== Multiple Inheritance Example ===");
        AdvancedSmartTV advTv = new AdvancedSmartTV();
        advTv.powerOn();        // From Television via SmartTV
        advTv.streamContent();  // From SmartTV
        advTv.hdmiConnect();    // From HDMIInput
        advTv.usbConnect();     // From USBInput
        advTv.voiceControl();   // From AdvancedSmartTV
    }
}